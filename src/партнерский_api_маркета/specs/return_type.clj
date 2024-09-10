(ns партнерский-api-маркета.specs.return-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-type-data
  {
   })

(def return-type-spec
  (ds/spec
    {:name ::return-type
     :spec return-type-data}))
