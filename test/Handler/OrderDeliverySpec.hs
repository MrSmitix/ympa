{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OrderDeliverySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64OrdersByInt64BuyerR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64BuyerR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64DeliveryDateR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64DeliveryDateR 789 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64DeliveryTrackR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64DeliveryTrackR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64DeliveryStorageLimitR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64DeliveryStorageLimitR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64VerifyEacR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64VerifyEacR 789 789
            statusIs 501
