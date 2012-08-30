(ns fizzbuzz.core)

(defn divisible-by? [divisor number]
  "Checks that the `number` can be cleanly divided by `divisor`; i.e. the
  division has no remainder."
  (= 0 (mod number divisor)))

(defn wordify [n]
  "Takes a whole number and returns it's fizzbuzz form. The fizzbuzz case may
  be expressed as `(divisible-by? 15 n)` but has not been for clarity's sake."
  (cond
    (and (divisible-by? 3 n) (divisible-by? 5 n)) "fizzbuzz"
    (divisible-by? 3 n) "fizz"
    (divisible-by? 5 n) "buzz"
    :else n))

(defn print-range [lower-bound upper-bound]
  "Prints the fizzbuzz form of all numbers between `lower-bound` and
  `upper-bound` inclusive."
  (dorun (map (comp println wordify)
              (range lower-bound (+ upper-bound 1)))))

