(ns simple )
(defn hello
	([] "hello world!")
	([name] (str "hello " name "!")))

(defn addem
  "Add stuff"
  ([] 0)
  ([n] n)
  ([n m] (+ n m))
  ([n m & more] (reduce + (flatten (list n m more))))
)
