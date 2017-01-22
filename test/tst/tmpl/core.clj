;   Copyright (c) Alan Thompson. All rights reserved.
;   The use and distribution terms for this software are covered by the Eclipse Public License 1.0
;   (http://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at
;   the root of this distribution.  By using this software in any fashion, you are agreeing to be
;   bound by the terms of this license.  You must not remove this notice, or any other, from this
;   software.
(ns tst.tmpl.core
  (:use tmpl.core clojure.test tupelo.test )
  (:require
;   [clojure.spec :as sp]
;   [clojure.spec.gen :as sp.gen]
;   [clojure.spec.test :as sp.test]
    [clojure.string :as str]
;   [clojure.test.check.clojure-test :as tst]
;   [clojure.test.check.generators :as gen]
;   [clojure.test.check.properties :as prop]
    [schema.core :as s]
    [tupelo.core :as t]
  ))
(t/refer-tupelo)

(deftest t-nope
  (is= true )
)
