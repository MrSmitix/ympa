{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByInt64SettingsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64SettingsR 789
            statusIs 501
