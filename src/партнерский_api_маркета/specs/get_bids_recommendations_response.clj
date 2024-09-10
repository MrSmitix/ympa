(ns партнерский-api-маркета.specs.get-bids-recommendations-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-bids-recommendations-response-dto :refer :all]
            )
  (:import (java.io File)))


(def get-bids-recommendations-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-bids-recommendations-response-dto-spec
   })

(def get-bids-recommendations-response-spec
  (ds/spec
    {:name ::get-bids-recommendations-response
     :spec get-bids-recommendations-response-data}))
