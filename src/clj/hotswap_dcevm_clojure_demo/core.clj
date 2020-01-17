(ns hotswap-dcevm-clojure-demo.core
  (:import Mjao)
  (:gen-class))

(defn disp-version []
  (println "Java version: " (System/getProperty "java.version")))

(disp-version)

(def x 3)

(println (str "Mjao result (" x "): " (Mjao/magicOp x)))

(defn -main [& args]
  (disp-version))
