(require '[clojure.string :as str])

(do
  (println "Insira o conjunto 1, com elementos separados por espaco:")
  (let [conjunto1 (str/split (read-line) #" ")]
    ;; Lucas Breur, added set1 definition
    (def set1 conjunto1)
    (println "Insira o conjunto 2, com elementos separados por espaco:")
    (let [conjunto2 (str/split (read-line) #" ")]
    (println (str "Conjunto 1: " (str conjunto1)))
    ;; Lucas Breur, added set2 definition
    (def set2 conjunto2)
    (println (str "Conjunto 2: " (str conjunto2))))
  
    ;; Lucas Breur, main
    (do

      ;; Recursive function which prints out the pairs composed by one digit from the first vector (a) while iterating over the second vector (setB)
      (defn printPair [a setB] 
        ;; Checks if the vector is empty. If not, it prints the first set and calls itself again
        (if (nil? (first setB)) () (do
          (print "("a(first setB)")")
          (printPair a (rest setB))
        ))
      )
      ;; Function which iterates over Set1
      (defn iterateSet1 [x y] 
          (if (nil? (first x)) () (do
            (printPair (first x) y)
            (iterateSet1 (rest x) y)
          ))
      )

      (print "Conjunto1 x Conjunto2 = {")
      (iterateSet1 set1 set2)
      (print "}")
    
    )
  )
)

;; (def set1 [4 2 5])
;; (def set2 [9 8 6])
;; ;;(println (first lista1))

;; (defn printPair [a setB] 
;;     (if (nil? (first setB)) () (do
;;       (print "("a(first setB)")")
;;       (printPair a (rest setB))
;;     ))
;; )

;; (defn iterateSet1 [x y] 
;;     (if (nil? (first x)) () (do
;;       (printPair (first x) y)
;;       (iterateSet1 (rest x) y)
;;     ))
;; )

;; (print "Set1 x Set2 = {")
;; (iterateSet1 set1 set2)
;; (print "}")

