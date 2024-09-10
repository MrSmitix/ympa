(ns партнерский-api-маркета.specs.update-offer-mapping-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-offer-dto :refer :all]
            [партнерский-api-маркета.specs.update-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-mapping-dto-data
  {
   (ds/req :offer) update-offer-dto-spec
   (ds/opt :mapping) update-mapping-dto-spec
   })

(def update-offer-mapping-dto-spec
  (ds/spec
    {:name ::update-offer-mapping-dto
     :spec update-offer-mapping-dto-data}))
