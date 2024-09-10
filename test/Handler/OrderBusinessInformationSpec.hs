{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OrderBusinessInformationSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64OrdersByInt64BusinessBuyerR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64BusinessBuyerR 789 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64DocumentsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64DocumentsR 789 789
            statusIs 501
