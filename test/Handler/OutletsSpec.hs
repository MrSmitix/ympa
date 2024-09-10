{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OutletsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64OutletsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OutletsR 789
            statusIs 501

    describe "deleteCampaignsByInt64OutletsByInt64R" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ CampaignsByInt64OutletsByInt64R 789 789
            statusIs 501

    describe "getCampaignsByInt64OutletsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OutletsByInt64R 789 789
            statusIs 501

    describe "getCampaignsByInt64OutletsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OutletsR 789
            statusIs 501

    describe "putCampaignsByInt64OutletsByInt64R" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OutletsByInt64R 789 789
            statusIs 501
