{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OrdersSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "putCampaignsByInt64OrdersByInt64CancellationAcceptR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64CancellationAcceptR 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64R 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersR 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64DeliverDigitalGoodsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64DeliverDigitalGoodsR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64IdentifiersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64IdentifiersR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64BoxesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64BoxesR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64DeliveryShipmentsByInt64BoxesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64DeliveryShipmentsByInt64BoxesR 789 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64ItemsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64ItemsR 789 789
            statusIs 501

    describe "putCampaignsByInt64OrdersByInt64StatusR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64OrdersByInt64StatusR 789 789
            statusIs 501

    describe "postCampaignsByInt64OrdersStatusUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersStatusUpdateR 789
            statusIs 501
