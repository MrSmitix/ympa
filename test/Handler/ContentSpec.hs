{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ContentSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCategoryByInt64ParametersR" $
        it "returns 501 Not Implemented" $ do
            post $ CategoryByInt64ParametersR 789
            statusIs 501

    describe "postBusinessesByInt64OfferCardsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferCardsR 789
            statusIs 501

    describe "postBusinessesByInt64OfferCardsUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferCardsUpdateR 789
            statusIs 501
