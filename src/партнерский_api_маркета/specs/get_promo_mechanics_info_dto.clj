(ns партнерский-api-маркета.specs.get-promo-mechanics-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.mechanics-type :refer :all]
            [партнерский-api-маркета.specs.get-promo-promocode-info-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promo-mechanics-info-dto-data
  {
   (ds/req :type) mechanics-type-spec
   (ds/opt :promocodeInfo) get-promo-promocode-info-dto-spec
   })

(def get-promo-mechanics-info-dto-spec
  (ds/spec
    {:name ::get-promo-mechanics-info-dto
     :spec get-promo-mechanics-info-dto-data}))
