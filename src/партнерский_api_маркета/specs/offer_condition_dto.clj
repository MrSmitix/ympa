(ns партнерский-api-маркета.specs.offer-condition-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-condition-type :refer :all]
            [партнерский-api-маркета.specs.offer-condition-quality-type :refer :all]
            )
  (:import (java.io File)))


(def offer-condition-dto-data
  {
   (ds/opt :type) offer-condition-type-spec
   (ds/opt :quality) offer-condition-quality-type-spec
   (ds/opt :reason) string?
   })

(def offer-condition-dto-spec
  (ds/spec
    {:name ::offer-condition-dto
     :spec offer-condition-dto-data}))
