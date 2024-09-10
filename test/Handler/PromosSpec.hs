{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PromosSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64PromosOffersDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosOffersDeleteR 789
            statusIs 501

    describe "postBusinessesByInt64PromosOffersR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosOffersR 789
            statusIs 501

    describe "postBusinessesByInt64PromosR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosR 789
            statusIs 501

    describe "postBusinessesByInt64PromosOffersUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosOffersUpdateR 789
            statusIs 501
