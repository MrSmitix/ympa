(ns партнерский-api-маркета.specs.eac-verification-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.eac-verification-status-type :refer :all]
            )
  (:import (java.io File)))


(def eac-verification-result-dto-data
  {
   (ds/opt :verificationResult) eac-verification-status-type-spec
   (ds/opt :attemptsLeft) int?
   })

(def eac-verification-result-dto-spec
  (ds/spec
    {:name ::eac-verification-result-dto
     :spec eac-verification-result-dto-data}))
