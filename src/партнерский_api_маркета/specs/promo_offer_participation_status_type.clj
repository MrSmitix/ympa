(ns партнерский-api-маркета.specs.promo-offer-participation-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-offer-participation-status-type-data
  {
   })

(def promo-offer-participation-status-type-spec
  (ds/spec
    {:name ::promo-offer-participation-status-type
     :spec promo-offer-participation-status-type-data}))
