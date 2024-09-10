(ns партнерский-api-маркета.specs.get-promos-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.get-promo-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promos-result-dto-data
  {
   (ds/req :promos) (s/coll-of get-promo-dto-spec)
   })

(def get-promos-result-dto-spec
  (ds/spec
    {:name ::get-promos-result-dto
     :spec get-promos-result-dto-data}))
