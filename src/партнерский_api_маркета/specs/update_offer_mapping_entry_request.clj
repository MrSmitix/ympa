(ns партнерский-api-маркета.specs.update-offer-mapping-entry-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-offer-mapping-entry-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-mapping-entry-request-data
  {
   (ds/req :offerMappingEntries) (s/coll-of update-offer-mapping-entry-dto-spec)
   })

(def update-offer-mapping-entry-request-spec
  (ds/spec
    {:name ::update-offer-mapping-entry-request
     :spec update-offer-mapping-entry-request-data}))
