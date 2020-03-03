#lang scheme

(define a 2)

(define b 5)

;; TD1

;; Exercice 8

(define (abs x) ; Renvoie |x|
  (if (> x 0) x (- 0 x)))

(define (care-div x y) ; Renvoie x/y (message d'erreur si division par 0) 
  (if (= y 0)
      (display "Impossible de divisier par 0")
      (/ x y)))

;; Exercice 9

(define (cel->fah c) ; Converti celsius en fahrenheit
  (- (* (/ 9 5) (+ c 40)) 40))

(define (fah->cel f) ; Converti fahrenheit en celsius
  (- (* (/ 5 9) (+ f 40)) 40))

(define (liquide-cel? c) ; Vérifie si la température en celsius correspond à un état de l'eau liquide
  (and (> c 0) (< c 100)))

(define (liquide-fah? f) ; Vérifie si la température en fahrenheit correspond à un état de l'eau liquide
  (liquide-cel? (fah->cel f)))

;; Exercice 10

(define (puiss2 x) ; Calcule x^2
  (* x x))

(define (puiss4 x) ; Calcule x^4
  (puiss2 (puiss2 x)))

(define (puiss6 x) ; Calcule x^6
  (puiss2 (* x (puiss2 x))))

(define (puisse9 x) ; Calcule x^9 
  (* (puiss2 (puiss4 x)) x))

(define (puiss3 x) ; Calcule x^3
  (* (* x x) x))

(define (puiss9-v2 x) ; Calcule x^9 (en utilisant puiss3)
  (puiss3 (puiss3 x)))
