(ns партнерский-api-маркета.specs.price-quarantine-verdict-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-quarantine-verdict-type-data
  {
   })

(def price-quarantine-verdict-type-spec
  (ds/spec
    {:name ::price-quarantine-verdict-type
     :spec price-quarantine-verdict-type-data}))
