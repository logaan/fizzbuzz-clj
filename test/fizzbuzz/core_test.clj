(ns fizzbuzz.core-test
  (:use midje.sweet
        fizzbuzz.core))

(tabular
  (fact (wordify ?input) => ?result)
  ?input ?result
  -50    "buzz"
  -33    "fizz"
  0      "fizzbuzz"
  3      "fizz"
  5      "buzz"
  15     "fizzbuzz"
  50     "buzz") 

;; I've not tested the side-effecty print-range function as it's a pretty
;; straightforward composition of more interesting functions and testing output
;; like that be hard.

