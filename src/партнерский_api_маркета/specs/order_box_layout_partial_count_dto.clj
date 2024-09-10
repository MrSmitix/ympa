(ns партнерский-api-маркета.specs.order-box-layout-partial-count-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-box-layout-partial-count-dto-data
  {
   (ds/req :current) int?
   (ds/req :total) int?
   })

(def order-box-layout-partial-count-dto-spec
  (ds/spec
    {:name ::order-box-layout-partial-count-dto
     :spec order-box-layout-partial-count-dto-data}))
