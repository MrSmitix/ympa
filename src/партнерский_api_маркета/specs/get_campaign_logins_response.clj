(ns партнерский-api-маркета.specs.get-campaign-logins-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-campaign-logins-response-data
  {
   (ds/req :logins) (s/coll-of string?)
   })

(def get-campaign-logins-response-spec
  (ds/spec
    {:name ::get-campaign-logins-response
     :spec get-campaign-logins-response-data}))
