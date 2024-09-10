{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OrdersStatsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64StatsOrdersR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64StatsOrdersR 789
            statusIs 501
