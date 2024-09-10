(ns партнерский-api-маркета.specs.order-delivery-address-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.gps-dto :refer :all]
            )
  (:import (java.io File)))


(def order-delivery-address-dto-data
  {
   (ds/opt :country) string?
   (ds/opt :postcode) string?
   (ds/opt :city) string?
   (ds/opt :district) string?
   (ds/opt :subway) string?
   (ds/opt :street) string?
   (ds/opt :house) string?
   (ds/opt :block) string?
   (ds/opt :entrance) string?
   (ds/opt :entryphone) string?
   (ds/opt :floor) string?
   (ds/opt :apartment) string?
   (ds/opt :phone) string?
   (ds/opt :recipient) string?
   (ds/opt :gps) gps-dto-spec
   })

(def order-delivery-address-dto-spec
  (ds/spec
    {:name ::order-delivery-address-dto
     :spec order-delivery-address-dto-data}))
