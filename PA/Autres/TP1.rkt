(define (puiss2 x)
  (* x x))

(define (puiss4 x)
  (puiss2 (puiss2 x)))

(define (divisible? a b )
  (= (modulo a b) 0))

(define (f1 x)
  (cond
    [(= x 5) 3]
    [(>= x 8) (* x x)]
    [(= x 6) 'toto]
    [(= x 7) #t]
    [() #f]))

; 4) Les conditions
; Exo 7
(define (monabs x)
  (if (< x 0)
      (- 0 x)
      x))

; Exo 8
(define (care-div a b)
  (if (= b 0)
      (display "Erreur : Division par 0 interdit")
      (/ a b)))

; Exo 9
(define (s t)
  (cond
    [(or (< t (- 0 3)) (and (>= t (- 0 1)) (< t 2)) (>= t 4)) 0]
    [(and (>= t (- 0 3)) (< t (- 0 1))) 1]
    [(and (>= t 2) (< t 4)) 2]))

; 5) Calcul de taux d'intérêt
; Exo 10
(define (placement c t n)
  (expt (+ c t) n))

; 6) La tortue
(require (lib "turtles.ss" "graphics"))
; Exo 11
; Exo 12
(turtles #t)
(define (carré lgr)
  (draw lgr)
  (turn 90)
  (draw lgr)
  (turn 90)
  (draw lgr)
  (turn 90)
  (draw lgr))
  