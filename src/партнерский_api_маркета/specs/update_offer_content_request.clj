(ns партнерский-api-маркета.specs.update-offer-content-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-content-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-content-request-data
  {
   (ds/req :offersContent) (s/coll-of offer-content-dto-spec)
   })

(def update-offer-content-request-spec
  (ds/spec
    {:name ::update-offer-content-request
     :spec update-offer-content-request-data}))
