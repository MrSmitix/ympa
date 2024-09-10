(ns партнерский-api-маркета.specs.promo-period-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-period-dto-data
  {
   (ds/req :dateTimeFrom) inst?
   (ds/req :dateTimeTo) inst?
   })

(def promo-period-dto-spec
  (ds/spec
    {:name ::promo-period-dto
     :spec promo-period-dto-data}))
