(ns партнерский-api-маркета.specs.order-buyer-basic-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-buyer-type :refer :all]
            )
  (:import (java.io File)))


(def order-buyer-basic-info-dto-data
  {
   (ds/opt :id) string?
   (ds/opt :lastName) string?
   (ds/opt :firstName) string?
   (ds/opt :middleName) string?
   (ds/opt :type) order-buyer-type-spec
   })

(def order-buyer-basic-info-dto-spec
  (ds/spec
    {:name ::order-buyer-basic-info-dto
     :spec order-buyer-basic-info-dto-data}))
