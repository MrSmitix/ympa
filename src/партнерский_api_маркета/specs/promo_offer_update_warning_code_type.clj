(ns партнерский-api-маркета.specs.promo-offer-update-warning-code-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-offer-update-warning-code-type-data
  {
   })

(def promo-offer-update-warning-code-type-spec
  (ds/spec
    {:name ::promo-offer-update-warning-code-type
     :spec promo-offer-update-warning-code-type-data}))
