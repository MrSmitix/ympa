(ns партнерский-api-маркета.specs.pickup-address-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pickup-address-dto-data
  {
   (ds/opt :country) string?
   (ds/opt :city) string?
   (ds/opt :street) string?
   (ds/opt :house) string?
   (ds/opt :postcode) string?
   })

(def pickup-address-dto-spec
  (ds/spec
    {:name ::pickup-address-dto
     :spec pickup-address-dto-data}))
