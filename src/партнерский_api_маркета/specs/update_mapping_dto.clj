(ns партнерский-api-маркета.specs.update-mapping-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-mapping-dto-data
  {
   (ds/opt :marketSku) int?
   })

(def update-mapping-dto-spec
  (ds/spec
    {:name ::update-mapping-dto
     :spec update-mapping-dto-data}))
