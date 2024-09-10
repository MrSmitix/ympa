{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ReturnsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64OrdersByInt64ReturnsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64ReturnsByInt64R 789 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64ReturnsByInt64ApplicationR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64ReturnsByInt64ApplicationR 789 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionByInt64ImageByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64ReturnsByInt64DecisionByInt64ImageByTextR 789 789 789 789 "imageHash_example"
            statusIs 501

    describe "getCampaignsByInt64ReturnsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64ReturnsR 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64ReturnsByInt64DecisionR 789 789 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionSubmitR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64ReturnsByInt64DecisionSubmitR 789 789 789
            statusIs 501
