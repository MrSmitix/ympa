(ns партнерский-api-маркета.specs.update-order-storage-limit-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-order-storage-limit-request-data
  {
   (ds/req :newDate) inst?
   })

(def update-order-storage-limit-request-spec
  (ds/spec
    {:name ::update-order-storage-limit-request
     :spec update-order-storage-limit-request-data}))
