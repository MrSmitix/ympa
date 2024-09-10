(ns партнерский-api-маркета.specs.get-bids-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-bids-info-response-dto :refer :all]
            )
  (:import (java.io File)))


(def get-bids-info-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-bids-info-response-dto-spec
   })

(def get-bids-info-response-spec
  (ds/spec
    {:name ::get-bids-info-response
     :spec get-bids-info-response-data}))
