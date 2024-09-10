(ns партнерский-api-маркета.specs.feedback-author-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            )
  (:import (java.io File)))


(def feedback-author-dto-data
  {
   (ds/opt :name) string?
   (ds/opt :region) region-dto-spec
   })

(def feedback-author-dto-spec
  (ds/spec
    {:name ::feedback-author-dto
     :spec feedback-author-dto-data}))
