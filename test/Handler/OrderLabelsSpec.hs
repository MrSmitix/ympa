{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OrderLabelsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64OrdersByInt64DeliveryShipmentsByInt64BoxesByInt64LabelR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64DeliveryShipmentsByInt64BoxesByInt64LabelR 789 789 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64DeliveryLabelsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64DeliveryLabelsR 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64DeliveryLabelsDataR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64DeliveryLabelsDataR 789 789
            statusIs 501
