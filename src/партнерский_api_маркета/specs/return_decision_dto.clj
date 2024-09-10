(ns партнерский-api-маркета.specs.return-decision-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.return-decision-reason-type :refer :all]
            [партнерский-api-маркета.specs.return-decision-subreason-type :refer :all]
            [партнерский-api-маркета.specs.return-decision-type :refer :all]
            )
  (:import (java.io File)))


(def return-decision-dto-data
  {
   (ds/opt :returnItemId) int?
   (ds/opt :count) int?
   (ds/opt :comment) string?
   (ds/opt :reasonType) return-decision-reason-type-spec
   (ds/opt :subreasonType) return-decision-subreason-type-spec
   (ds/opt :decisionType) return-decision-type-spec
   (ds/opt :refundAmount) int?
   (ds/opt :partnerCompensation) int?
   (ds/opt :images) (s/coll-of string?)
   })

(def return-decision-dto-spec
  (ds/spec
    {:name ::return-decision-dto
     :spec return-decision-dto-data}))
