{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.FeedbacksSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCampaignsByInt64FeedbackUpdatesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedbackUpdatesR 789
            statusIs 501
