(ns партнерский-api-маркета.specs.get-offer-mappings-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.get-offer-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offer-mappings-result-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :offerMappings) (s/coll-of get-offer-mapping-dto-spec)
   })

(def get-offer-mappings-result-dto-spec
  (ds/spec
    {:name ::get-offer-mappings-result-dto
     :spec get-offer-mappings-result-dto-data}))
