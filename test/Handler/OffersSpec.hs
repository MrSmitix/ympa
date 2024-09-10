{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OffersSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64OffersDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersDeleteR 789
            statusIs 501

    describe "getCampaignsByInt64OffersAllR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OffersAllR 789
            statusIs 501

    describe "postCampaignsByInt64OffersR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersR 789
            statusIs 501

    describe "postBusinessesByInt64OffersRecommendationsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OffersRecommendationsR 789
            statusIs 501

    describe "getCampaignsByInt64OffersR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OffersR 789
            statusIs 501

    describe "postCampaignsByInt64OffersUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersUpdateR 789
            statusIs 501
