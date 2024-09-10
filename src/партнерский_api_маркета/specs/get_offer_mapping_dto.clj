(ns партнерский-api-маркета.specs.get-offer-mapping-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.get-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offer-mapping-dto-data
  {
   (ds/opt :offer) get-offer-dto-spec
   (ds/opt :mapping) get-mapping-dto-spec
   })

(def get-offer-mapping-dto-spec
  (ds/spec
    {:name ::get-offer-mapping-dto
     :spec get-offer-mapping-dto-data}))
