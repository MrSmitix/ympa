{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.HiddenOffersSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64HiddenOffersR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64HiddenOffersR 789
            statusIs 501

    describe "postCampaignsByInt64HiddenOffersDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64HiddenOffersDeleteR 789
            statusIs 501

    describe "getCampaignsByInt64HiddenOffersR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64HiddenOffersR 789
            statusIs 501
