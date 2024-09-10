(ns партнерский-api-маркета.specs.update-stocks-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-stock-dto :refer :all]
            )
  (:import (java.io File)))


(def update-stocks-request-data
  {
   (ds/req :skus) (s/coll-of update-stock-dto-spec)
   })

(def update-stocks-request-spec
  (ds/spec
    {:name ::update-stocks-request
     :spec update-stocks-request-data}))
