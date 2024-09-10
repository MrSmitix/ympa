(ns партнерский-api-маркета.specs.rejected-promo-offer-delete-reason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def rejected-promo-offer-delete-reason-type-data
  {
   })

(def rejected-promo-offer-delete-reason-type-spec
  (ds/spec
    {:name ::rejected-promo-offer-delete-reason-type
     :spec rejected-promo-offer-delete-reason-type-data}))
