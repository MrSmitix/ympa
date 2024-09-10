(ns партнерский-api-маркета.specs.affected-order-quality-rating-component-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def affected-order-quality-rating-component-type-data
  {
   })

(def affected-order-quality-rating-component-type-spec
  (ds/spec
    {:name ::affected-order-quality-rating-component-type
     :spec affected-order-quality-rating-component-type-data}))
