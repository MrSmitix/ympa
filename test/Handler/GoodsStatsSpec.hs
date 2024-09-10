{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GoodsStatsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64StatsSkusR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64StatsSkusR 789
            statusIs 501
