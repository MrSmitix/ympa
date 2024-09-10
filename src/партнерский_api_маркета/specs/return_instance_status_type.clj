(ns партнерский-api-маркета.specs.return-instance-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-instance-status-type-data
  {
   })

(def return-instance-status-type-spec
  (ds/spec
    {:name ::return-instance-status-type
     :spec return-instance-status-type-data}))
