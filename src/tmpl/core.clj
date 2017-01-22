;   Copyright (c) Alan Thompson. All rights reserved.
;   The use and distribution terms for this software are covered by the Eclipse Public License 1.0
;   (http://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at
;   the root of this distribution.  By using this software in any fashion, you are agreeing to be
;   bound by the terms of this license.  You must not remove this notice, or any other, from this
;   software.
(ns tmpl.core
  "Some Clojure project"
  (:require 
    [clojure.core.match :as ccm]
    [clojure.pprint :as pprint]
    [clojure.string :as str]
    [clojure.set :as set]
    [clojure.test]
    [cheshire.core :as cc]
    [schema.core :as s]
    [tupelo.string :as tstr]
    [tupelo.types :as types]
    [tupelo.schema :as ts]
  )
  (:refer-clojure :exclude [seqable?] )
  (:import [java.io BufferedReader StringReader]))
;[clojure.spec :as sp]
;[clojure.spec.gen :as sp.gen]

; Prismatic Schema type definitions
; #todo add to Schema docs
(s/set-fn-validation! true) ; enforce fn schemas

(defn -main [& args]
  (println "-main"))
