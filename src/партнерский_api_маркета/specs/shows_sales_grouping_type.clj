(ns партнерский-api-маркета.specs.shows-sales-grouping-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shows-sales-grouping-type-data
  {
   })

(def shows-sales-grouping-type-spec
  (ds/spec
    {:name ::shows-sales-grouping-type
     :spec shows-sales-grouping-type-data}))
