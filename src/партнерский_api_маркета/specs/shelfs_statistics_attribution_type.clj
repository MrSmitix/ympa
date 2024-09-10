(ns партнерский-api-маркета.specs.shelfs-statistics-attribution-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shelfs-statistics-attribution-type-data
  {
   })

(def shelfs-statistics-attribution-type-spec
  (ds/spec
    {:name ::shelfs-statistics-attribution-type
     :spec shelfs-statistics-attribution-type-data}))
