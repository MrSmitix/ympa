{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.FbySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCampaignsByInt64HiddenOffersR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64HiddenOffersR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsArchiveR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsArchiveR 789
            statusIs 501

    describe "postTariffsCalculateR" $
        it "returns 501 Not Implemented" $ do
            post TariffsCalculateR
            statusIs 501

    describe "postBusinessesByInt64PriceQuarantineConfirmR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PriceQuarantineConfirmR 789
            statusIs 501

    describe "postCampaignsByInt64PriceQuarantineConfirmR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64PriceQuarantineConfirmR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsNewR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsNewR 789
            statusIs 501

    describe "postCampaignsByInt64OffersDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersDeleteR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackCommentsDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackCommentsDeleteR 789
            statusIs 501

    describe "postCampaignsByInt64HiddenOffersDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64HiddenOffersDeleteR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsDeleteR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsUnarchiveR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsUnarchiveR 789
            statusIs 501

    describe "postBusinessesByInt64PromosOffersDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosOffersDeleteR 789
            statusIs 501

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

    describe "postReportsPricesGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsPricesGenerateR
            statusIs 501

    describe "postReportsShelfStatisticsGenerateR" $
        it "returns 501 Not Implemented" $ do
            post ReportsShelfStatisticsGenerateR
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

    describe "getCampaignsByInt64OffersAllR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OffersAllR 789
            statusIs 501

    describe "postBusinessesByInt64BidsInfoR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64BidsInfoR 789
            statusIs 501

    describe "postBusinessesByInt64BidsRecommendationsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64BidsRecommendationsR 789
            statusIs 501

    describe "postBusinessesByInt64PriceQuarantineR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PriceQuarantineR 789
            statusIs 501

    describe "postBusinessesByInt64SettingsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64SettingsR 789
            statusIs 501

    describe "getCampaignsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64R 789
            statusIs 501

    describe "getCampaignsByInt64LoginsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64LoginsR 789
            statusIs 501

    describe "postCampaignsByInt64OffersR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersR 789
            statusIs 501

    describe "postCampaignsByInt64PriceQuarantineR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64PriceQuarantineR 789
            statusIs 501

    describe "getCampaignsByInt64RegionR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64RegionR 789
            statusIs 501

    describe "getCampaignsByInt64SettingsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64SettingsR 789
            statusIs 501

    describe "getCampaignsR" $
        it "returns 501 Not Implemented" $ do
            get CampaignsR
            statusIs 501

    describe "getCampaignsByLoginByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByLoginByTextR "login_example"
            statusIs 501

    describe "postCategoriesMaxSaleQuantumR" $
        it "returns 501 Not Implemented" $ do
            post CategoriesMaxSaleQuantumR
            statusIs 501

    describe "postCategoriesTreeR" $
        it "returns 501 Not Implemented" $ do
            post CategoriesTreeR
            statusIs 501

    describe "postCategoryByInt64ParametersR" $
        it "returns 501 Not Implemented" $ do
            post $ CategoryByInt64ParametersR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsHistoryR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsHistoryR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsR 789
            statusIs 501

    describe "getCampaignsByInt64FeedsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedsByInt64R 789 789
            statusIs 501

    describe "getCampaignsByInt64FeedsByInt64IndexLogsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedsByInt64IndexLogsR 789 789
            statusIs 501

    describe "getCampaignsByInt64FeedbackUpdatesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedbackUpdatesR 789
            statusIs 501

    describe "getCampaignsByInt64FeedsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64FeedsR 789
            statusIs 501

    describe "getWarehousesR" $
        it "returns 501 Not Implemented" $ do
            get WarehousesR
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackCommentsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackCommentsR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackR 789
            statusIs 501

    describe "postCampaignsByInt64StatsSkusR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64StatsSkusR 789
            statusIs 501

    describe "getCampaignsByInt64HiddenOffersR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64HiddenOffersR 789
            statusIs 501

    describe "postBusinessesByInt64OfferCardsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferCardsR 789
            statusIs 501

    describe "getCampaignsByInt64OfferMappingEntriesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OfferMappingEntriesR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsR 789
            statusIs 501

    describe "postBusinessesByInt64OffersRecommendationsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OffersRecommendationsR 789
            statusIs 501

    describe "getCampaignsByInt64OffersR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OffersR 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64R 789 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64BusinessBuyerR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64BusinessBuyerR 789 789
            statusIs 501

    describe "postCampaignsByInt64OrdersByInt64DocumentsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OrdersByInt64DocumentsR 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersR 789
            statusIs 501

    describe "postCampaignsByInt64StatsOrdersR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64StatsOrdersR 789
            statusIs 501

    describe "getCampaignsByInt64OfferPricesR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OfferPricesR 789
            statusIs 501

    describe "postCampaignsByInt64OfferPricesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferPricesR 789
            statusIs 501

    describe "postBusinessesByInt64PromosOffersR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosOffersR 789
            statusIs 501

    describe "postBusinessesByInt64PromosR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosR 789
            statusIs 501

    describe "postBusinessesByInt64RatingsQualityR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64RatingsQualityR 789
            statusIs 501

    describe "getReportsInfoByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ReportsInfoByTextR "reportId_example"
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64ReturnsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64ReturnsByInt64R 789 789 789
            statusIs 501

    describe "getCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionByInt64ImageByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64OrdersByInt64ReturnsByInt64DecisionByInt64ImageByTextR 789 789 789 789 "imageHash_example"
            statusIs 501

    describe "getCampaignsByInt64ReturnsR" $
        it "returns 501 Not Implemented" $ do
            get $ CampaignsByInt64ReturnsR 789
            statusIs 501

    describe "postCampaignsByInt64OffersStocksR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersStocksR 789
            statusIs 501

    describe "postCampaignsByInt64OfferMappingEntriesSuggestionsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferMappingEntriesSuggestionsR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsSuggestionsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsSuggestionsR 789
            statusIs 501

    describe "postCampaignsByInt64OfferPricesSuggestionsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferPricesSuggestionsR 789
            statusIs 501

    describe "putBusinessesByInt64BidsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ BusinessesByInt64BidsR 789
            statusIs 501

    describe "putCampaignsByInt64BidsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PUT" $ CampaignsByInt64BidsR 789
            statusIs 501

    describe "postCampaignsByInt64FeedsByInt64RefreshR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64FeedsByInt64RefreshR 789 789
            statusIs 501

    describe "getRegionsByInt64ChildrenR" $
        it "returns 501 Not Implemented" $ do
            get $ RegionsByInt64ChildrenR 789
            statusIs 501

    describe "getRegionsByInt64R" $
        it "returns 501 Not Implemented" $ do
            get $ RegionsByInt64R 789
            statusIs 501

    describe "getRegionsR" $
        it "returns 501 Not Implemented" $ do
            get RegionsR
            statusIs 501

    describe "postBusinessesByInt64ChatsFileSendR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsFileSendR 789
            statusIs 501

    describe "postBusinessesByInt64ChatsMessageR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64ChatsMessageR 789
            statusIs 501

    describe "postCampaignsByInt64FeedsByInt64ParamsR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64FeedsByInt64ParamsR 789 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackSkipReactionR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackSkipReactionR 789
            statusIs 501

    describe "postBusinessesByInt64OfferPricesUpdatesR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferPricesUpdatesR 789
            statusIs 501

    describe "postCampaignsByInt64OffersUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OffersUpdateR 789
            statusIs 501

    describe "postBusinessesByInt64GoodsFeedbackCommentsUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64GoodsFeedbackCommentsUpdateR 789
            statusIs 501

    describe "postBusinessesByInt64OfferCardsUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferCardsUpdateR 789
            statusIs 501

    describe "postCampaignsByInt64OfferMappingEntriesUpdatesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferMappingEntriesUpdatesR 789
            statusIs 501

    describe "postBusinessesByInt64OfferMappingsUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64OfferMappingsUpdateR 789
            statusIs 501

    describe "postCampaignsByInt64OfferPricesUpdatesR" $
        it "returns 501 Not Implemented" $ do
            post $ CampaignsByInt64OfferPricesUpdatesR 789
            statusIs 501

    describe "postBusinessesByInt64PromosOffersUpdateR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByInt64PromosOffersUpdateR 789
            statusIs 501
