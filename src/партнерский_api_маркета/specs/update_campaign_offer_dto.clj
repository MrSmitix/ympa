(ns партнерский-api-маркета.specs.update-campaign-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quantum-dto :refer :all]
            )
  (:import (java.io File)))


(def update-campaign-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :quantum) quantum-dto-spec
   (ds/opt :available) boolean?
   (ds/opt :vat) int?
   })

(def update-campaign-offer-dto-spec
  (ds/spec
    {:name ::update-campaign-offer-dto
     :spec update-campaign-offer-dto-data}))
