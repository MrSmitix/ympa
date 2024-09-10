{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CategoriesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCategoriesMaxSaleQuantumR" $
        it "returns 501 Not Implemented" $ do
            post CategoriesMaxSaleQuantumR
            statusIs 501

    describe "postCategoriesTreeR" $
        it "returns 501 Not Implemented" $ do
            post CategoriesTreeR
            statusIs 501
