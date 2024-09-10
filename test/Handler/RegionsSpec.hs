{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.RegionsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getRegionsByInt64ChildrenR" $
        it "returns 501 Not Implemented" $ do
            get $ RegionsByInt64ChildrenR 789
            statusIs 501

    describe "getRegionsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ RegionsByInt64R 789
            statusIs 501

    describe "getRegionsR" $
        it "returns 501 Not Implemented" $ do
            get RegionsR
            statusIs 501
