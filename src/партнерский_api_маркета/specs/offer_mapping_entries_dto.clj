(ns партнерский-api-маркета.specs.offer-mapping-entries-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-entry-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-mapping-entries-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :offerMappingEntries) (s/coll-of offer-mapping-entry-dto-spec)
   })

(def offer-mapping-entries-dto-spec
  (ds/spec
    {:name ::offer-mapping-entries-dto
     :spec offer-mapping-entries-dto-data}))
