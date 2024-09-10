{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.WarehousesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getWarehousesR" $
        it "returns 501 Not Implemented" $ do
            get WarehousesR
            statusIs 501

    describe "getBusinessesByInt64WarehousesR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByInt64WarehousesR 789
            statusIs 501
