(ns партнерский-api-маркета.specs.outlet-licenses-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.full-outlet-license-dto :refer :all]
            )
  (:import (java.io File)))


(def outlet-licenses-response-dto-data
  {
   (ds/req :licenses) (s/coll-of full-outlet-license-dto-spec)
   })

(def outlet-licenses-response-dto-spec
  (ds/spec
    {:name ::outlet-licenses-response-dto
     :spec outlet-licenses-response-dto-data}))
