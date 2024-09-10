(ns партнерский-api-маркета.specs.order-business-buyer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-business-buyer-dto-data
  {
   (ds/opt :inn) string?
   (ds/opt :kpp) string?
   (ds/opt :organizationName) string?
   (ds/opt :organizationJurAddress) string?
   })

(def order-business-buyer-dto-spec
  (ds/spec
    {:name ::order-business-buyer-dto
     :spec order-business-buyer-dto-data}))
