(ns партнерский-api-маркета.specs.get-promos-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-participation-type :refer :all]
            [партнерский-api-маркета.specs.mechanics-type :refer :all]
            )
  (:import (java.io File)))


(def get-promos-request-data
  {
   (ds/opt :participation) promo-participation-type-spec
   (ds/opt :mechanics) mechanics-type-spec
   })

(def get-promos-request-spec
  (ds/spec
    {:name ::get-promos-request
     :spec get-promos-request-data}))
