#lang racket

; CC
; Vérification de vos fonctions

;Q0 : Donnez le nombre de connecteurs de la formule (a ∧ b)
(display "\n=>q0\n")
(nbc '(^ a b)) ; ou (display "NON FAIT\n")

;Q1 : Définissez la formule G = (((a ↔ b) ∧ c) ∨ ¬b) → ¬a, puis évaluez la (taper G)
(display "\n=>q1\n")


;Q2 : Vérifiez que G est bien formé à l’aide de votre fonction fbf?
(display "\n=>q2\n")


;Q3 : Donnez l’ensemble des symboles propositionnels de G
(display "\n=>q3\n")


;Q4 : Appliquez votre fonction afficher sur G
(display "\n=>q4\n")


;Q5 : Définissez les deux interprétations suivantes et évaluez les (taper J1 puis J2)
;     J 1 (a) = J 1 (b) = 0, J 1 (c) = 1
;     J 2 (a) = J 2 (c) = 1, J 2 (b) = 0
(display "\n=>q5\n")


;Q6 : Calculez la valeur de vérité de G dans l’interprétation J1
(display "\n=>q6\n")


;Q7 : Et dans l’interprétation J2
(display "\n=>q7\n")


;Q8 : Testez la satisfiabilité de G
(display "\n=>q8\n")


;Q9 : Et celle de (p ∧ q) ↔ (p → ¬q)
(display "\n=>q9\n")


;Q10 : Testez la validité de G
(display "\n=>q10\n")


;Q11 : Et la validité de p → (q → p)
(display "\n=>q11\n")


;Q12 : Dites si les formules suivantes sont équivalentes : a ∨ (b ∧ ¬b) et a ∨ (c ∧ ¬c)
(display "\n=>q12\n")


;Q13 : Idem avec p ∧ q et p ∨ q
(display "\n=>q13\n")


;Q14 : Idem avec T et a → a
(display "\n=>q14\n")


;Q15 : Dites si la conséquence logique suivante est établie : {(a ∧ b) ∨ c} |= ¬a → c
(display "\n=>q15\n")


;Q16 : Dites si la conséquence logique suivante est établie : {a → b, b → c} |= a → c
(display "\n=>q16\n")


;Q17 : Même question avec : {a, a ∨ b, b → c} |= b
(display "\n=>q17\n")


;Q18 : Même question avec : {p, a ∨ b, ¬p} |= q
(display "\n=>q18\n")


;Q19 : Calculez (distOu '(^ (v (^ (^ (v (^ a b) c) a) b) c) (v a b)))
(display "\n=>q19\n")


;Q20 : Calculez la forme conjonctive de (p → q) → p
(display "\n=>q20\n")


;Q21 : Calculez la forme clausale de ¬(q ∧ ¬r) ∧ (p → q ∨ (r ∧ ¬p))
(display "\n=>q21\n")


;Q22 : Simplifiez la forme clausale suivante :
; ((a (! b) c) (a c (! d) e) (d e) ((! d) (! a) b d) (c a) ((! b) f e) (d))
(display "\n=>q22\n")


;Q23 : Dites à l’aide de la méthode de résolution si la formule F 1 du TP est satisfiable
(display "\n=>q23\n")


;Q24 : Dites à l’aide de la méthode de résolution si la conséquence logique suivante est établie
; {F 1, F 2, F 3} |= F 4 où F 1, F 2, F 3 et F 4 sont les formules du TP
(display "\n=>q24\n")


;Cluedo

;Q25 : Si vous avez fait la modélisation du Cluedo, donnez les commandes permettant d’obtenir
; la réponse aux 2 questions :
;  — Noemie a-t-elle raison ?
;  — Arthur a-t-il raison ?
(display "\n=>q25\n")


;Programmation d’une fonction supplémentaire

;Q26 : Ecrivez une fonction ssFbf qui étant donné une formule bien formée retourne l’ensemble
; des sous-formules de cette formule.
(display "\n=>q26\n")


;Q27 : Appliquez-la à la formule G précédente
(display "\n=>q27\n")


;Q28 :  Puis appliquez à la formule ((p → q) ∧ (p → q))
(display "\n=>q28\n")


