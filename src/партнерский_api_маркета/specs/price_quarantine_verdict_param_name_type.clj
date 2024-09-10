(ns партнерский-api-маркета.specs.price-quarantine-verdict-param-name-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-quarantine-verdict-param-name-type-data
  {
   })

(def price-quarantine-verdict-param-name-type-spec
  (ds/spec
    {:name ::price-quarantine-verdict-param-name-type
     :spec price-quarantine-verdict-param-name-type-data}))
