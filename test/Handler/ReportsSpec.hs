{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ReportsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postReportsBoostConsolidatedGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsBoostConsolidatedGenerateR
            statusIs 501

    describe "postReportsCompetitorsPositionGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsCompetitorsPositionGenerateR
            statusIs 501

    describe "postReportsGoodsFeedbackGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsGoodsFeedbackGenerateR
            statusIs 501

    describe "postReportsGoodsMovementGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsGoodsMovementGenerateR
            statusIs 501

    describe "postReportsGoodsRealizationGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsGoodsRealizationGenerateR
            statusIs 501

    describe "postReportsGoodsTurnoverGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsGoodsTurnoverGenerateR
            statusIs 501

    describe "postReportsDocumentsLabelsGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsDocumentsLabelsGenerateR
            statusIs 501

    describe "postReportsPricesGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsPricesGenerateR
            statusIs 501

    describe "postReportsShelfStatisticsGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsShelfStatisticsGenerateR
            statusIs 501

    describe "postReportsDocumentsShipmentListGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsDocumentsShipmentListGenerateR
            statusIs 501

    describe "postReportsShowsSalesGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsShowsSalesGenerateR
            statusIs 501

    describe "postReportsStocksOnWarehousesGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsStocksOnWarehousesGenerateR
            statusIs 501

    describe "postReportsUnitedMarketplaceServicesGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsUnitedMarketplaceServicesGenerateR
            statusIs 501

    describe "postReportsUnitedNettingGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsUnitedNettingGenerateR
            statusIs 501

    describe "postReportsUnitedOrdersGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsUnitedOrdersGenerateR
            statusIs 501

    describe "getReportsInfoByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ReportsInfoByTextR "reportId_example"
            statusIs 501
