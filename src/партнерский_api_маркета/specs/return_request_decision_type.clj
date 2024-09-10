(ns партнерский-api-маркета.specs.return-request-decision-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-request-decision-type-data
  {
   })

(def return-request-decision-type-spec
  (ds/spec
    {:name ::return-request-decision-type
     :spec return-request-decision-type-data}))
