(ns партнерский-api-маркета.specs.offer-manual-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-manual-dto-data
  {
   (ds/req :url) string?
   (ds/opt :title) string?
   })

(def offer-manual-dto-spec
  (ds/spec
    {:name ::offer-manual-dto
     :spec offer-manual-dto-data}))
