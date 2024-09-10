(ns партнерский-api-маркета.specs.get-region-with-children-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            )
  (:import (java.io File)))


(def get-region-with-children-response-data
  {
   (ds/opt :pager) flipping-pager-dto-spec
   (ds/opt :regions) region-dto-spec
   })

(def get-region-with-children-response-spec
  (ds/spec
    {:name ::get-region-with-children-response
     :spec get-region-with-children-response-data}))
