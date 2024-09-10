(ns партнерский-api-маркета.specs.language-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def language-type-data
  {
   })

(def language-type-spec
  (ds/spec
    {:name ::language-type
     :spec language-type-data}))
