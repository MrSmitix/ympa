(ns партнерский-api-маркета.specs.bid-recommendation-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-recommendation-item-dto-data
  {
   (ds/req :bid) int?
   (ds/req :showPercent) int?
   })

(def bid-recommendation-item-dto-spec
  (ds/spec
    {:name ::bid-recommendation-item-dto
     :spec bid-recommendation-item-dto-data}))
