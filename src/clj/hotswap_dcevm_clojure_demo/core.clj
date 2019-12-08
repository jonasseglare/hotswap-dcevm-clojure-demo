(ns hotswap-dcevm-clojure-demo.core
  (:import Mjao))

(def x 3)

(println (str "Mjao result (" x "): " (Mjao/magicOp x)))
