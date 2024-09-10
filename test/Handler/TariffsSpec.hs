{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.TariffsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postTariffsCalculateR" $
        it "returns 501 Not Implemented" $ do
            post TariffsCalculateR
            statusIs 501
