{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ChatsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64ChatsNewR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsNewR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsHistoryR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsHistoryR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsFileSendR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsFileSendR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsMessageR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsMessageR 789
            statusIs 501
