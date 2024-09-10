(ns партнерский-api-маркета.specs.return-decision-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-decision-type-data
  {
   })

(def return-decision-type-spec
  (ds/spec
    {:name ::return-decision-type
     :spec return-decision-type-data}))
