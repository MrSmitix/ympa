{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.FeedsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64FeedsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedsByInt64R 789 789
            statusIs 501

    describe "getCampaignsByInt64FeedsByInt64IndexLogsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedsByInt64IndexLogsR 789 789
            statusIs 501

    describe "getCampaignsByInt64FeedsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedsR 789
            statusIs 501

    describe "postCampaignsByInt64FeedsByInt64RefreshR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64FeedsByInt64RefreshR 789 789
            statusIs 501

    describe "postCampaignsByInt64FeedsByInt64ParamsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64FeedsByInt64ParamsR 789 789
            statusIs 501
