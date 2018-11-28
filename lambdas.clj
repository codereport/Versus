;; code_report 
;; 

(def a ["bear", "cat", "elephant", "mouse"])
(def b [1, 2, 3, 4, 5])

(defn sum     [vals] (reduce + vals))
(defn product [vals] (reduce * vals))

(println (sort-by count a))
(println (sum b))
(println (product b))
