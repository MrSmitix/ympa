(ns партнерский-api-маркета.specs.day-of-week-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def day-of-week-type-data
  {
   })

(def day-of-week-type-spec
  (ds/spec
    {:name ::day-of-week-type
     :spec day-of-week-type-data}))
