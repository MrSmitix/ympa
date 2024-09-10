(ns партнерский-api-маркета.specs.base-campaign-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quantum-dto :refer :all]
            )
  (:import (java.io File)))


(def base-campaign-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :quantum) quantum-dto-spec
   (ds/opt :available) boolean?
   })

(def base-campaign-offer-dto-spec
  (ds/spec
    {:name ::base-campaign-offer-dto
     :spec base-campaign-offer-dto-data}))
