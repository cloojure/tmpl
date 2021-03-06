;   Copyright (c) Alan Thompson. All rights reserved.
;   The use and distribution terms for this software are covered by the Eclipse Public License 1.0
;   (http://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at
;   the root of this distribution.  By using this software in any fashion, you are agreeing to be
;   bound by the terms of this license.  You must not remove this notice, or any other, from this
;   software.
(ns tst.tmpl._bootstrap
  "This namespace is used to perform one-time tasks during testing, such as printing the
  Clojure version."
  (:use clojure.test )
  (:require [schema.core :as s]
            [tupelo.core :as t] ))

(deftest t-bootstrap
  (t/print-versions))
