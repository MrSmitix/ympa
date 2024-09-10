(ns партнерский-api-маркета.specs.promo-participation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-participation-type-data
  {
   })

(def promo-participation-type-spec
  (ds/spec
    {:name ::promo-participation-type
     :spec promo-participation-type-data}))
