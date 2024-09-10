(ns партнерский-api-маркета.specs.update-offer-mappings-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-offer-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-mappings-request-data
  {
   (ds/req :offerMappings) (s/coll-of update-offer-mapping-dto-spec)
   (ds/opt :onlyPartnerMediaContent) boolean?
   })

(def update-offer-mappings-request-spec
  (ds/spec
    {:name ::update-offer-mappings-request
     :spec update-offer-mappings-request-data}))
