{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessOfferMappingsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64OfferMappingsArchiveR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsArchiveR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsDeleteR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsUnarchiveR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsUnarchiveR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsSuggestionsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsSuggestionsR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsUpdateR 789
            statusIs 501
