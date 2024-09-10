(ns партнерский-api-маркета.specs.campaign-settings-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-settings-local-region-dto :refer :all]
            )
  (:import (java.io File)))


(def campaign-settings-dto-data
  {
   (ds/opt :countryRegion) int?
   (ds/opt :shopName) string?
   (ds/opt :showInContext) boolean?
   (ds/opt :showInPremium) boolean?
   (ds/opt :useOpenStat) boolean?
   (ds/opt :localRegion) campaign-settings-local-region-dto-spec
   })

(def campaign-settings-dto-spec
  (ds/spec
    {:name ::campaign-settings-dto
     :spec campaign-settings-dto-data}))
