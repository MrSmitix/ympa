{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.StocksSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64OffersStocksR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersStocksR 789
            statusIs 501

    describe "putCampaignsByInt64OffersStocksR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OffersStocksR 789
            statusIs 501
