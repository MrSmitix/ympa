(ns партнерский-api-маркета.specs.return-decision-subreason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-decision-subreason-type-data
  {
   })

(def return-decision-subreason-type-spec
  (ds/spec
    {:name ::return-decision-subreason-type
     :spec return-decision-subreason-type-data}))
