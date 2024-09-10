(ns партнерский-api-маркета.specs.return-decision-reason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-decision-reason-type-data
  {
   })

(def return-decision-reason-type-spec
  (ds/spec
    {:name ::return-decision-reason-type
     :spec return-decision-reason-type-data}))
