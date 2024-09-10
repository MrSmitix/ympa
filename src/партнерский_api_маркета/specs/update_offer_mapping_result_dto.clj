(ns партнерский-api-маркета.specs.update-offer-mapping-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-mapping-error-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-error-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-mapping-result-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :errors) (s/coll-of offer-mapping-error-dto-spec)
   (ds/opt :warnings) (s/coll-of offer-mapping-error-dto-spec)
   })

(def update-offer-mapping-result-dto-spec
  (ds/spec
    {:name ::update-offer-mapping-result-dto
     :spec update-offer-mapping-result-dto-data}))
