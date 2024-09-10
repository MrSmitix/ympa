(ns партнерский-api-маркета.specs.delivery-services-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.delivery-service-info-dto :refer :all]
            )
  (:import (java.io File)))


(def delivery-services-dto-data
  {
   (ds/req :deliveryService) (s/coll-of delivery-service-info-dto-spec)
   })

(def delivery-services-dto-spec
  (ds/spec
    {:name ::delivery-services-dto
     :spec delivery-services-dto-data}))
