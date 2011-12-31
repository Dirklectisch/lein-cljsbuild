(defproject cljsbuild-example-advanced "0.0.1"
  :description "An advanced example of how to use lein-cljsbuild"
  :source-path "src-clj"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "0.6.5"] 
                 [hiccup "0.3.7"]]
  :dev-dependencies [[emezeske/lein-cljsbuild "0.0.1"]
                     [lein-ring "0.5.0"]]
  :cljsbuild {:source-dir "src-cljs"
              :crossovers [{:from-dir "src-clj/example/crossover"
                            :to-dir "src-cljs/example/crossover"}] 
              :output-file "resources/public/js/main.js"
              :optimizations :whitespace
              :pretty-print true}
  :ring {:handler example.routes/app})
