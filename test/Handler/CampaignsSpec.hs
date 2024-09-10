{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CampaignsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64R 789
            statusIs 501

    describe "getCampaignsByInt64LoginsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64LoginsR 789
            statusIs 501

    describe "getCampaignsByInt64RegionR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64RegionR 789
            statusIs 501

    describe "getCampaignsByInt64SettingsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64SettingsR 789
            statusIs 501

    describe "getCampaignsR" $
        it "returns 501 Not Implemented" $ do
            get CampaignsR
            statusIs 501

    describe "getCampaignsByLoginByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByLoginByTextR "login_example"
            statusIs 501
