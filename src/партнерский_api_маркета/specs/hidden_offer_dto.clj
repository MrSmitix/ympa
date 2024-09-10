(ns партнерский-api-маркета.specs.hidden-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hidden-offer-dto-data
  {
   (ds/req :offerId) string?
   })

(def hidden-offer-dto-spec
  (ds/spec
    {:name ::hidden-offer-dto
     :spec hidden-offer-dto-data}))
