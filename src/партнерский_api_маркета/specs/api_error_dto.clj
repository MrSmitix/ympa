(ns партнерский-api-маркета.specs.api-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def api-error-dto-data
  {
   (ds/req :code) string?
   (ds/opt :message) string?
   })

(def api-error-dto-spec
  (ds/spec
    {:name ::api-error-dto
     :spec api-error-dto-data}))
