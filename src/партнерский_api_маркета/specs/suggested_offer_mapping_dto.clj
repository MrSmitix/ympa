(ns партнерский-api-маркета.specs.suggested-offer-mapping-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.suggested-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def suggested-offer-mapping-dto-data
  {
   (ds/opt :offer) suggested-offer-dto-spec
   (ds/opt :mapping) get-mapping-dto-spec
   })

(def suggested-offer-mapping-dto-spec
  (ds/spec
    {:name ::suggested-offer-mapping-dto
     :spec suggested-offer-mapping-dto-data}))
