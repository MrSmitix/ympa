(ns партнерский-api-маркета.specs.business-settings-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def business-settings-dto-data
  {
   (ds/opt :onlyDefaultPrice) boolean?
   (ds/opt :currency) currency-type-spec
   })

(def business-settings-dto-spec
  (ds/spec
    {:name ::business-settings-dto
     :spec business-settings-dto-data}))
