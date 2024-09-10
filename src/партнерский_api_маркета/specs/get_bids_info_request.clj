(ns партнерский-api-маркета.specs.get-bids-info-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-bids-info-request-data
  {
   (ds/opt :skus) (s/coll-of string?)
   })

(def get-bids-info-request-spec
  (ds/spec
    {:name ::get-bids-info-request
     :spec get-bids-info-request-data}))
