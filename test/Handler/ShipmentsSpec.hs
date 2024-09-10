{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ShipmentsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64FirstMileShipmentsByInt64ConfirmR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64FirstMileShipmentsByInt64ConfirmR 789 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64ActR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64ActR 789 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64DiscrepancyActR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64DiscrepancyActR 789 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64InboundActR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64InboundActR 789 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64PalletLabelsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64PalletLabelsR 789 789
            statusIs 501

    describe "getCampaignsByInt64ShipmentsReceptionTransferActR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64ShipmentsReceptionTransferActR 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64TransportationWaybillR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64TransportationWaybillR 789 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64R 789 789
            statusIs 501

    describe "getCampaignsByInt64FirstMileShipmentsByInt64OrdersInfoR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FirstMileShipmentsByInt64OrdersInfoR 789 789
            statusIs 501

    describe "putCampaignsByInt64FirstMileShipmentsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64FirstMileShipmentsR 789
            statusIs 501

    describe "putCampaignsByInt64FirstMileShipmentsByInt64PalletsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64FirstMileShipmentsByInt64PalletsR 789 789
            statusIs 501

    describe "postCampaignsByInt64FirstMileShipmentsByInt64OrdersTransferR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64FirstMileShipmentsByInt64OrdersTransferR 789 789
            statusIs 501
