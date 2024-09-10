{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OutletLicensesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteCampaignsByInt64OutletsLicensesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ CampaignsByInt64OutletsLicensesR 789
            statusIs 501

    describe "getCampaignsByInt64OutletsLicensesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OutletsLicensesR 789
            statusIs 501

    describe "postCampaignsByInt64OutletsLicensesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OutletsLicensesR 789
            statusIs 501
