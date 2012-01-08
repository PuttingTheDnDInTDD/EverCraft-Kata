(ns simple-test
  (:use clojure.test)
  (:use simple))

(deftest simple-test
  (is (= (hello) "hello world!"))
  (is (= (hello "test") "hello test!")))

(deftest addem-test
  (is (= (addem) 0))
  (is (= (addem 5) 5))
  (is (= (addem 3 4) 7)))
