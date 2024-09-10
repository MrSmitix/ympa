(ns партнерский-api-маркета.specs.update-outlet-license-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.outlet-license-dto :refer :all]
            )
  (:import (java.io File)))


(def update-outlet-license-request-data
  {
   (ds/req :licenses) (s/coll-of outlet-license-dto-spec)
   })

(def update-outlet-license-request-spec
  (ds/spec
    {:name ::update-outlet-license-request
     :spec update-outlet-license-request-data}))
