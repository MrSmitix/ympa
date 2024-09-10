(ns партнерский-api-маркета.specs.get-outlet-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.full-outlet-dto :refer :all]
            )
  (:import (java.io File)))


(def get-outlet-response-data
  {
   (ds/opt :outlet) full-outlet-dto-spec
   })

(def get-outlet-response-spec
  (ds/spec
    {:name ::get-outlet-response
     :spec get-outlet-response-data}))
