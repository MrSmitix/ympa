(ns партнерский-api-маркета.specs.return-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.return-decision-dto :refer :all]
            [партнерский-api-маркета.specs.return-instance-dto :refer :all]
            [партнерский-api-маркета.specs.track-dto :refer :all]
            )
  (:import (java.io File)))


(def return-item-dto-data
  {
   (ds/opt :marketSku) int?
   (ds/req :shopSku) string?
   (ds/req :count) int?
   (ds/opt :decisions) (s/coll-of return-decision-dto-spec)
   (ds/opt :instances) (s/coll-of return-instance-dto-spec)
   (ds/opt :tracks) (s/coll-of track-dto-spec)
   })

(def return-item-dto-spec
  (ds/spec
    {:name ::return-item-dto
     :spec return-item-dto-data}))
