{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OfferMappingsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64OfferMappingEntriesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OfferMappingEntriesR 789
            statusIs 501

    describe "postCampaignsByInt64OfferMappingEntriesSuggestionsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferMappingEntriesSuggestionsR 789
            statusIs 501

    describe "postCampaignsByInt64OfferMappingEntriesUpdatesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferMappingEntriesUpdatesR 789
            statusIs 501
