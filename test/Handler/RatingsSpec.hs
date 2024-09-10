{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.RatingsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64RatingsQualityDetailsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64RatingsQualityDetailsR 789
            statusIs 501

    describe "postBusinessesByInt64RatingsQualityR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64RatingsQualityR 789
            statusIs 501
