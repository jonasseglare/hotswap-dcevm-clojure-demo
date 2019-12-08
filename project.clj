(defproject hotswap-dcevm-clojure-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :java-source-paths ["src/java"]
  :jvm-opts ["-Xdebug" "-javaagent:/home/jonas/local/dcevm-11.0.5+4/lib/hotswap/hotswap-agent.jar=autoHotswap=true"]
  :source-paths ["src/clj"]
  :repl-options {:init-ns hotswap-dcevm-clojure-demo.core})
