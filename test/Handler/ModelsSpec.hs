{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ModelsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getModelsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ ModelsByInt64R 789
            statusIs 501

    describe "getModelsByInt64OffersR" $
        it "returns 501 Not Implemented" $ do
            get $ ModelsByInt64OffersR 789
            statusIs 501

    describe "postModelsR" $
        it "returns 501 Not Implemented" $ do
            post ModelsR
            statusIs 501

    describe "postModelsOffersR" $
        it "returns 501 Not Implemented" $ do
            post ModelsOffersR
            statusIs 501

    describe "getModelsR" $
        it "returns 501 Not Implemented" $ do
            get ModelsR
            statusIs 501
