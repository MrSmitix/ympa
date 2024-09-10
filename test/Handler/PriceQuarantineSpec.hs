{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PriceQuarantineSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64PriceQuarantineConfirmR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PriceQuarantineConfirmR 789
            statusIs 501

    describe "postCampaignsByInt64PriceQuarantineConfirmR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64PriceQuarantineConfirmR 789
            statusIs 501

    describe "postBusinessesByInt64PriceQuarantineR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PriceQuarantineR 789
            statusIs 501

    describe "postCampaignsByInt64PriceQuarantineR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64PriceQuarantineR 789
            statusIs 501
