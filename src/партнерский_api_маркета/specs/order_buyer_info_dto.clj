(ns партнерский-api-маркета.specs.order-buyer-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-buyer-type :refer :all]
            )
  (:import (java.io File)))


(def order-buyer-info-dto-data
  {
   (ds/opt :id) string?
   (ds/opt :lastName) string?
   (ds/opt :firstName) string?
   (ds/opt :middleName) string?
   (ds/opt :type) order-buyer-type-spec
   (ds/opt :phone) string?
   })

(def order-buyer-info-dto-spec
  (ds/spec
    {:name ::order-buyer-info-dto
     :spec order-buyer-info-dto-data}))
