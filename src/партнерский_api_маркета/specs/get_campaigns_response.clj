(ns партнерский-api-маркета.specs.get-campaigns-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-dto :refer :all]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaigns-response-data
  {
   (ds/req :campaigns) (s/coll-of campaign-dto-spec)
   (ds/opt :pager) flipping-pager-dto-spec
   })

(def get-campaigns-response-spec
  (ds/spec
    {:name ::get-campaigns-response
     :spec get-campaigns-response-data}))
