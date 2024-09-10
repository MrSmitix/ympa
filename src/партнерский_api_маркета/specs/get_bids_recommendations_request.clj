(ns партнерский-api-маркета.specs.get-bids-recommendations-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-bids-recommendations-request-data
  {
   (ds/req :skus) (s/coll-of string?)
   })

(def get-bids-recommendations-request-spec
  (ds/spec
    {:name ::get-bids-recommendations-request
     :spec get-bids-recommendations-request-data}))
