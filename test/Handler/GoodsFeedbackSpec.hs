{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GoodsFeedbackSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64GoodsFeedbackCommentsDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackCommentsDeleteR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackCommentsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackCommentsR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackSkipReactionR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackSkipReactionR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackCommentsUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackCommentsUpdateR 789
            statusIs 501
