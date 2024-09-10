(ns партнерский-api-маркета.specs.get-categories-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.language-type :refer :all]
            )
  (:import (java.io File)))


(def get-categories-request-data
  {
   (ds/opt :language) language-type-spec
   })

(def get-categories-request-spec
  (ds/spec
    {:name ::get-categories-request
     :spec get-categories-request-data}))
