(ns партнерский-api-маркета.specs.rejected-promo-offer-update-reason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def rejected-promo-offer-update-reason-type-data
  {
   })

(def rejected-promo-offer-update-reason-type-spec
  (ds/spec
    {:name ::rejected-promo-offer-update-reason-type
     :spec rejected-promo-offer-update-reason-type-data}))
