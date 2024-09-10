{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BidsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64BidsInfoR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64BidsInfoR 789
            statusIs 501

    describe "postBusinessesByInt64BidsRecommendationsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64BidsRecommendationsR 789
            statusIs 501

    describe "putBusinessesByInt64BidsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ BusinessesByInt64BidsR 789
            statusIs 501

    describe "putCampaignsByInt64BidsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64BidsR 789
            statusIs 501
