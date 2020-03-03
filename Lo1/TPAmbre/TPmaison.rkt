#lang racket

; 1 Représentation des propositions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define F '(<-> (^ a c) (v (! b) (-> c (^ B T)))))

; Q1
(define F1 '(<-> (^ a b) (v (! a) b)))
(define F2 '(v (! (^ a b) ) (! (-> a b) )))
(define F3 '(^ (! (! (^ a (^ b (! c))))) (! (-> a (v a b)))))


; Q2
(define (neg? f) (eq? f '!))
(define (and? f) (eq? f '^))
(define (or? f) (eq? f 'v))
(define (imp? f) (eq? f '->))
(define (equ? f) (eq? f '<->))
(define (top? f) (eq? f 'T))
(define (bot? f) (eq? f 'B))
(define (symbLog? f) (or (top? f) (bot? f) (and? f) (or? f) (neg? f) (imp? f) (equ? f)))
(define (symbProp? f) (and (symbol? f) (not (symbLog? f))))
(define (atomicFbf? f) (or (symbProp? f) (top? f) (bot? f)))
(define (conBin? f) (or (and? f) (or? f) (imp? f) (equ? f)))

; Q2
;(define (fbf? f)
;  (cond ((atomicFbf? f) #t)
;        ((list? f) (cond ((and (= (length f) 2) (neg? (car f)) (fbf? (cdr f)) #t)
;                         ((and (= (length f) 3) (conBin? (car f))) (and (fbf? (cdr f)) (fbf? (caddr f))))
;                         (else #f)))
;        (else #f)))

(define (fbf? f)
  (cond ((atomicFbf? f) #t)
        ((list? f) (cond ((and (= (length f) 2) (neg? (car f))) (fbf? (cadr f)) )
                         ((and (= (length f) 3) (conBin? (car f))) (and (fbf? (cadr f)) (fbf? (caddr f))))
                         (else #f)))
        (else #f)))
; 2 Syntaxe des propositions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define (conRac f) (car f))
(define (fils f) (cadr f))
(define (filsG f) (cadr f))
(define (filsD f) (caddr f))
(define (negFbf? f) (and (not (atomicFbf? f)) (neg? (conRac f))))

; Q3
(define (nbc f)
  (cond ((atomicFbf? f) 0 )
        ((negFbf? f)    (+ 1 (nbc (fils f))) )
        (#t 		(+ 1 (nbc (filsG f)) (nbc (filsD f)) ))))


; Q4 
(define (prof f)
  (cond ((atomicFbf? f) 0)
        ((negFbf? f) (+ 1 (prof (fils f))))
        (else (max (+ 1 (prof (filsG f))) (+ 1 (prof (filsD f)))))
        ))

;Q5
(define (ensSP f)
    (cond ((atomicFbf? f) (if (symbProp? f) (list f) '() ))
        ((negFbf? f) (ensSP (fils f)))
        (else 	     (set-union (ensSP (filsG f)) (ensSP (filsD f))))))

;Q7
(define I1 '((a . 1) (b . 0) (c . 1)))
(define I2 '((a . 0) (b . 0) (c . 0)) )
(define I3 '((a . 1) (b . 1) (c . 1)) )

;Q8
(define (intSymb s I)
  (if (eq? s (caar I)) (cdar I) (intSymb s (cdr I) )))

;Q9
(define (intNeg a)
  (if (eq? a 0) 1 0))
(define (intAnd a b)
  (if (and (eq? a 1) (eq? b 1)) 1 0))
(define (intOr a b)
  (if (or (eq? a 1) (eq? b 1)) 1 0))
(define (intImp a b)
  (intOr (intNeg a) b))
(define (intEqu a b)
  (if (eq? a b) 1 0))
(define (intTop ) 1)
(define (intBot ) 0)

;Q10
(define (valV f I)
  (cond [(symbProp? f) (intSymb f I)]
        [(top? f) (intTop )]
        [(bot? f) (intBot )]
        [else (cond [(neg? (conRac f)) (intNeg (valV (fils f) I))]
                    [(and? (conRac f)) (intAnd (valV (filsG f) I) (valV (filsD f) I))]
                    [(or? (conRac f)) (intOr (valV (filsG f) I) (valV (filsD f) I))]
                    [(imp? (conRac f)) (intImp (valV (filsG f) I) (valV (filsD f) I))]
                    [(equ? (conRac f)) (intEqu (valV (filsG f) I) (valV (filsD f) I))]
                    )]))
(define (modele? f I)
  (eq? (valV f I) 1))

;Q12
(define ETpq '(((p . 0) (q . 0))
               ((p . 0) (q . 1))
               ((p . 1) (q . 0))
               ((p . 1) (q . 1))))

;Q13
