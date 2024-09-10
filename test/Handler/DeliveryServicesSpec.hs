{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DeliveryServicesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getDeliveryServicesR" $
        it "returns 501 Not Implemented" $ do
            get DeliveryServicesR
            statusIs 501
