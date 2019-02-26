(defn Factorial [n]
  (println (format "Factorial of %d is %d" n (apply * (range 1 (+ 1 n))))))

; Example
(Factorial 10)
(Factorial 5)
(Factorial 12)