(ns партнерский-api-маркета.specs.update-offer-content-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-content-error-dto :refer :all]
            [партнерский-api-маркета.specs.offer-content-error-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-content-result-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :errors) (s/coll-of offer-content-error-dto-spec)
   (ds/opt :warnings) (s/coll-of offer-content-error-dto-spec)
   })

(def update-offer-content-result-dto-spec
  (ds/spec
    {:name ::update-offer-content-result-dto
     :spec update-offer-content-result-dto-data}))
