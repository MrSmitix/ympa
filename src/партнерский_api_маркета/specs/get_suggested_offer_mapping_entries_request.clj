(ns партнерский-api-маркета.specs.get-suggested-offer-mapping-entries-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.mappings-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-suggested-offer-mapping-entries-request-data
  {
   (ds/req :offers) (s/coll-of mappings-offer-dto-spec)
   })

(def get-suggested-offer-mapping-entries-request-spec
  (ds/spec
    {:name ::get-suggested-offer-mapping-entries-request
     :spec get-suggested-offer-mapping-entries-request-data}))
