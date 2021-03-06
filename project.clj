(defproject tmpl "0.1.0"
  :description "A Clojure project template"
  :url "http://github.com/cloojure/tmpl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [ 
    [org.clojure/clojure              "1.9.0-alpha14"]
   ;[org.clojure/clojure              "1.8.0"]
    [org.clojure/core.async           "0.2.395"]
    [org.clojure/core.match           "0.3.0-alpha4"]
    [org.clojure/math.combinatorics   "0.1.4"]
    [org.clojure/tools.analyzer       "0.6.9"]
    [clojure-csv/clojure-csv          "2.0.2"]
    [tupelo                           "0.9.20"]
    [clj-time                         "0.13.0"]
    [cheshire                         "5.7.0"]
  ; [expectations                     "2.1.8"]
    [prismatic/schema                 "1.1.3"]
  ]
  :profiles { :dev      {:dependencies [[org.clojure/test.check "0.9.0"]] }
              :uberjar  {:aot :all}}
  :global-vars { *warn-on-reflection* false }

  :deploy-repositories {  "snapshots" :clojars
                          "releases"  :clojars 
                          :sign-releases false }
  :update :daily  ; :always  
  :main ^:skip-aot tmpl.core
  :target-path      "target/%s"
  :clean-targets  [ "target" ]

  ; "lein test"         will not  run tests marked with the ":slow" metadata
  ; "lein test :slow"   will only run tests marked with the ":slow" metadata
  ; "lein test :all"    will run all  tests (built-in)
  :test-selectors { :default    (complement :slow)
                    :slow       :slow }

  :jvm-opts ^:replace ["-Xms1g" "-Xmx4g" ]
)
