(ns партнерский-api-маркета.specs.get-promo-bestseller-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-promo-bestseller-info-dto-data
  {
   (ds/req :bestseller) boolean?
   (ds/opt :entryDeadline) inst?
   })

(def get-promo-bestseller-info-dto-spec
  (ds/spec
    {:name ::get-promo-bestseller-info-dto
     :spec get-promo-bestseller-info-dto-data}))
