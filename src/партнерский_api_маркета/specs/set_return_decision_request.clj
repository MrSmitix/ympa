(ns партнерский-api-маркета.specs.set-return-decision-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.return-request-decision-type :refer :all]
            )
  (:import (java.io File)))


(def set-return-decision-request-data
  {
   (ds/req :returnItemId) int?
   (ds/req :decisionType) return-request-decision-type-spec
   (ds/opt :comment) string?
   })

(def set-return-decision-request-spec
  (ds/spec
    {:name ::set-return-decision-request
     :spec set-return-decision-request-data}))
