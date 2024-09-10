(ns партнерский-api-маркета.specs.generate-goods-turnover-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-goods-turnover-request-data
  {
   (ds/req :campaignId) int?
   (ds/opt :date) inst?
   })

(def generate-goods-turnover-request-spec
  (ds/spec
    {:name ::generate-goods-turnover-request
     :spec generate-goods-turnover-request-data}))
