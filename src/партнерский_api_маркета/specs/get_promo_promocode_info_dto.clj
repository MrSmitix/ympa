(ns партнерский-api-маркета.specs.get-promo-promocode-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-promo-promocode-info-dto-data
  {
   (ds/req :promocode) string?
   (ds/req :discount) int?
   })

(def get-promo-promocode-info-dto-spec
  (ds/spec
    {:name ::get-promo-promocode-info-dto
     :spec get-promo-promocode-info-dto-data}))
