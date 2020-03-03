#lang racket

;; TD2

;; Exercice 1 : Triangles

(define (median a b c) ; Etant donnés trois nombres, donne le nombre médian
  (- (+ a b c)
     (+ (min a b c)
        (max a b c))))

(define (triangle? a b c) ;  Vérifie si trois nombres peuvent être les longueurs des cotés d'un triangle
  (and (> (min a b c) 0)
       (> (+ (min a b c) (median a b c))
          (max a b c))))

(define (equilateral? a b c) ; Idem pour un triangle équilatéral
  (and (= a b c) (> a 0)))

(define (isocele? a b c) ; Idem pour un triangle isocele
  (and (or (= a b)
           (= a c)
           (= b c))
       (triangle? a b c)))

(define (puiss2 x) ; Calcule x^2 (importé du TD1)
  (* x x))

(define (rectangle? a b c) ; Idem pour un triangle rectangle
  (and (triangle? a b c)
       (= (puiss2 (max a b c))
          (+ (puiss2 (min a b c))
             (puiss2 (median a b c))))))

;; Exercice 2 : Caractères

(define (exo2 c) ; Vérifie que c est un caractère, minuscule et avant la lettre m dans l'alphabet
  (if (and (char-alphabetic? c)
           (char-lower-case? c)
           (char<? c #\m))
      (char-upcase c)
      #f))

;; Exercice 3 : Chaîne de caractères

(define (exo3 s n) ; Si s est une chaîne de caractères, renvoie son élément d'indice n
  (if (and (string? s)
           (> (string-length s) n))
      (string-ref s n)
      #f))

;; Exercice 4 : Heures/Minutes/Secondes

(define (hms-vers-s h m s) ; Converti heures/minutes/secondes en secondes
  (+ s (* m 60) (* h 3600)))

;; Exercice 5 : Tonneau dans une voiture

(define (voiture? h r) ; Vérifie qu'un cylindre de hauteur h et de rayon r peut rentrer dans la voiture
  (if (and (< h 1)
           (< r 0.80)
           (< (* pi (* r r) h) 1))
      #t
      #f))

;; Exercice 6 : Viticulture

(define (commande q prix) ; Calcule la somme à facturer
  (if (and (< (* q prix) 600)
           (> (+ (* q prix) (* (* q prix) 0.10)) 600))
      600
      (if (>= (* q prix) 600)
          (* q prix)
          (+ (* q prix) (* (* q prix) 0.10)))))

;; Exercice 7 : Calcul de la date de Pâques

(define (numjour annee)
  (+ 22
     (modulo (+ (* 29 (modulo annee 19)) 24) 30)
     (modulo (+ (* 2 (modulo annee 4)) (* 4 (modulo annee 7)) (* 6 (modulo (+ (* 19 (modulo annee 19)) 24) 30)) 5) 7)))

(define (traduit annee)
  (if (> (numjour annee) 31)
      (list (- (numjour annee) 31) 4)
      (list (numjour annee) 3)))
  