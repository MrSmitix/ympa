{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PricesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64OfferPricesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OfferPricesR 789
            statusIs 501

    describe "postCampaignsByInt64OfferPricesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferPricesR 789
            statusIs 501

    describe "postCampaignsByInt64OfferPricesSuggestionsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferPricesSuggestionsR 789
            statusIs 501

    describe "postBusinessesByInt64OfferPricesUpdatesR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferPricesUpdatesR 789
            statusIs 501

    describe "postCampaignsByInt64OfferPricesUpdatesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferPricesUpdatesR 789
            statusIs 501
