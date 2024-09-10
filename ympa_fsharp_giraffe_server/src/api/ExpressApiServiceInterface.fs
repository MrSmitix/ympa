namespace ympa_fsharp_giraffe_server
open ExpressApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ExpressApiServiceInterface =

    //#region Service interface
    type IExpressApiService =
      abstract member AddHiddenOffers:HttpContext -> AddHiddenOffersArgs->AddHiddenOffersResult
      abstract member AddOffersToArchive:HttpContext -> AddOffersToArchiveArgs->AddOffersToArchiveResult
      abstract member CalculateTariffs:HttpContext -> CalculateTariffsArgs->CalculateTariffsResult
      abstract member ConfirmBusinessPrices:HttpContext -> ConfirmBusinessPricesArgs->ConfirmBusinessPricesResult
      abstract member ConfirmCampaignPrices:HttpContext -> ConfirmCampaignPricesArgs->ConfirmCampaignPricesResult
      abstract member CreateChat:HttpContext -> CreateChatArgs->CreateChatResult
      abstract member DeleteCampaignOffers:HttpContext -> DeleteCampaignOffersArgs->DeleteCampaignOffersResult
      abstract member DeleteGoodsFeedbackComment:HttpContext -> DeleteGoodsFeedbackCommentArgs->DeleteGoodsFeedbackCommentResult
      abstract member DeleteHiddenOffers:HttpContext -> DeleteHiddenOffersArgs->DeleteHiddenOffersResult
      abstract member DeleteOffers:HttpContext -> DeleteOffersArgs->DeleteOffersResult
      abstract member DeleteOffersFromArchive:HttpContext -> DeleteOffersFromArchiveArgs->DeleteOffersFromArchiveResult
      abstract member DeletePromoOffers:HttpContext -> DeletePromoOffersArgs->DeletePromoOffersResult
      abstract member GenerateBoostConsolidatedReport:HttpContext -> GenerateBoostConsolidatedReportArgs->GenerateBoostConsolidatedReportResult
      abstract member GenerateCompetitorsPositionReport:HttpContext -> GenerateCompetitorsPositionReportArgs->GenerateCompetitorsPositionReportResult
      abstract member GenerateGoodsFeedbackReport:HttpContext -> GenerateGoodsFeedbackReportArgs->GenerateGoodsFeedbackReportResult
      abstract member GenerateGoodsRealizationReport:HttpContext -> GenerateGoodsRealizationReportArgs->GenerateGoodsRealizationReportResult
      abstract member GenerateMassOrderLabelsReport:HttpContext -> GenerateMassOrderLabelsReportArgs->GenerateMassOrderLabelsReportResult
      abstract member GenerateOrderLabel:HttpContext -> GenerateOrderLabelArgs->GenerateOrderLabelResult
      abstract member GenerateOrderLabels:HttpContext -> GenerateOrderLabelsArgs->GenerateOrderLabelsResult
      abstract member GeneratePricesReport:HttpContext -> GeneratePricesReportArgs->GeneratePricesReportResult
      abstract member GenerateShelfsStatisticsReport:HttpContext -> GenerateShelfsStatisticsReportArgs->GenerateShelfsStatisticsReportResult
      abstract member GenerateShowsSalesReport:HttpContext -> GenerateShowsSalesReportArgs->GenerateShowsSalesReportResult
      abstract member GenerateStocksOnWarehousesReport:HttpContext -> GenerateStocksOnWarehousesReportArgs->GenerateStocksOnWarehousesReportResult
      abstract member GenerateUnitedMarketplaceServicesReport:HttpContext -> GenerateUnitedMarketplaceServicesReportArgs->GenerateUnitedMarketplaceServicesReportResult
      abstract member GenerateUnitedNettingReport:HttpContext -> GenerateUnitedNettingReportArgs->GenerateUnitedNettingReportResult
      abstract member GenerateUnitedOrdersReport:HttpContext -> GenerateUnitedOrdersReportArgs->GenerateUnitedOrdersReportResult
      abstract member GetAllOffers:HttpContext -> GetAllOffersArgs->GetAllOffersResult
      abstract member GetBidsInfoForBusiness:HttpContext -> GetBidsInfoForBusinessArgs->GetBidsInfoForBusinessResult
      abstract member GetBidsRecommendations:HttpContext -> GetBidsRecommendationsArgs->GetBidsRecommendationsResult
      abstract member GetBusinessQuarantineOffers:HttpContext -> GetBusinessQuarantineOffersArgs->GetBusinessQuarantineOffersResult
      abstract member GetBusinessSettings:HttpContext -> GetBusinessSettingsArgs->GetBusinessSettingsResult
      abstract member GetCampaign:HttpContext -> GetCampaignArgs->GetCampaignResult
      abstract member GetCampaignLogins:HttpContext -> GetCampaignLoginsArgs->GetCampaignLoginsResult
      abstract member GetCampaignOffers:HttpContext -> GetCampaignOffersArgs->GetCampaignOffersResult
      abstract member GetCampaignQuarantineOffers:HttpContext -> GetCampaignQuarantineOffersArgs->GetCampaignQuarantineOffersResult
      abstract member GetCampaignRegion:HttpContext -> GetCampaignRegionArgs->GetCampaignRegionResult
      abstract member GetCampaignSettings:HttpContext -> GetCampaignSettingsArgs->GetCampaignSettingsResult
      abstract member GetCampaigns:HttpContext -> GetCampaignsArgs->GetCampaignsResult
      abstract member GetCampaignsByLogin:HttpContext -> GetCampaignsByLoginArgs->GetCampaignsByLoginResult
      abstract member GetCategoriesMaxSaleQuantum:HttpContext -> GetCategoriesMaxSaleQuantumArgs->GetCategoriesMaxSaleQuantumResult
      abstract member GetCategoriesTree:HttpContext -> GetCategoriesTreeArgs->GetCategoriesTreeResult
      abstract member GetCategoryContentParameters:HttpContext -> GetCategoryContentParametersArgs->GetCategoryContentParametersResult
      abstract member GetChatHistory:HttpContext -> GetChatHistoryArgs->GetChatHistoryResult
      abstract member GetChats:HttpContext -> GetChatsArgs->GetChatsResult
      abstract member GetDeliveryServices:HttpContext ->GetDeliveryServicesResult
      abstract member GetFeed:HttpContext -> GetFeedArgs->GetFeedResult
      abstract member GetFeedIndexLogs:HttpContext -> GetFeedIndexLogsArgs->GetFeedIndexLogsResult
      abstract member GetFeedbackAndCommentUpdates:HttpContext -> GetFeedbackAndCommentUpdatesArgs->GetFeedbackAndCommentUpdatesResult
      abstract member GetFeeds:HttpContext -> GetFeedsArgs->GetFeedsResult
      abstract member GetGoodsFeedbackComments:HttpContext -> GetGoodsFeedbackCommentsArgs->GetGoodsFeedbackCommentsResult
      abstract member GetGoodsFeedbacks:HttpContext -> GetGoodsFeedbacksArgs->GetGoodsFeedbacksResult
      abstract member GetGoodsStats:HttpContext -> GetGoodsStatsArgs->GetGoodsStatsResult
      abstract member GetHiddenOffers:HttpContext -> GetHiddenOffersArgs->GetHiddenOffersResult
      abstract member GetOfferCardsContentStatus:HttpContext -> GetOfferCardsContentStatusArgs->GetOfferCardsContentStatusResult
      abstract member GetOfferMappingEntries:HttpContext -> GetOfferMappingEntriesArgs->GetOfferMappingEntriesResult
      abstract member GetOfferMappings:HttpContext -> GetOfferMappingsArgs->GetOfferMappingsResult
      abstract member GetOfferRecommendations:HttpContext -> GetOfferRecommendationsArgs->GetOfferRecommendationsResult
      abstract member GetOffers:HttpContext -> GetOffersArgs->GetOffersResult
      abstract member GetOrder:HttpContext -> GetOrderArgs->GetOrderResult
      abstract member GetOrderBusinessBuyerInfo:HttpContext -> GetOrderBusinessBuyerInfoArgs->GetOrderBusinessBuyerInfoResult
      abstract member GetOrderBusinessDocumentsInfo:HttpContext -> GetOrderBusinessDocumentsInfoArgs->GetOrderBusinessDocumentsInfoResult
      abstract member GetOrderLabelsData:HttpContext -> GetOrderLabelsDataArgs->GetOrderLabelsDataResult
      abstract member GetOrders:HttpContext -> GetOrdersArgs->GetOrdersResult
      abstract member GetOrdersStats:HttpContext -> GetOrdersStatsArgs->GetOrdersStatsResult
      abstract member GetPrices:HttpContext -> GetPricesArgs->GetPricesResult
      abstract member GetPricesByOfferIds:HttpContext -> GetPricesByOfferIdsArgs->GetPricesByOfferIdsResult
      abstract member GetPromoOffers:HttpContext -> GetPromoOffersArgs->GetPromoOffersResult
      abstract member GetPromos:HttpContext -> GetPromosArgs->GetPromosResult
      abstract member GetQualityRatingDetails:HttpContext -> GetQualityRatingDetailsArgs->GetQualityRatingDetailsResult
      abstract member GetQualityRatings:HttpContext -> GetQualityRatingsArgs->GetQualityRatingsResult
      abstract member GetReportInfo:HttpContext -> GetReportInfoArgs->GetReportInfoResult
      abstract member GetReturn:HttpContext -> GetReturnArgs->GetReturnResult
      abstract member GetReturnApplication:HttpContext -> GetReturnApplicationArgs->GetReturnApplicationResult
      abstract member GetReturnPhoto:HttpContext -> GetReturnPhotoArgs->GetReturnPhotoResult
      abstract member GetReturns:HttpContext -> GetReturnsArgs->GetReturnsResult
      abstract member GetStocks:HttpContext -> GetStocksArgs->GetStocksResult
      abstract member GetSuggestedOfferMappingEntries:HttpContext -> GetSuggestedOfferMappingEntriesArgs->GetSuggestedOfferMappingEntriesResult
      abstract member GetSuggestedOfferMappings:HttpContext -> GetSuggestedOfferMappingsArgs->GetSuggestedOfferMappingsResult
      abstract member GetSuggestedPrices:HttpContext -> GetSuggestedPricesArgs->GetSuggestedPricesResult
      abstract member GetWarehouses:HttpContext -> GetWarehousesArgs->GetWarehousesResult
      abstract member ProvideOrderItemIdentifiers:HttpContext -> ProvideOrderItemIdentifiersArgs->ProvideOrderItemIdentifiersResult
      abstract member PutBidsForBusiness:HttpContext -> PutBidsForBusinessArgs->PutBidsForBusinessResult
      abstract member PutBidsForCampaign:HttpContext -> PutBidsForCampaignArgs->PutBidsForCampaignResult
      abstract member RefreshFeed:HttpContext -> RefreshFeedArgs->RefreshFeedResult
      abstract member SearchRegionChildren:HttpContext -> SearchRegionChildrenArgs->SearchRegionChildrenResult
      abstract member SearchRegionsById:HttpContext -> SearchRegionsByIdArgs->SearchRegionsByIdResult
      abstract member SearchRegionsByName:HttpContext -> SearchRegionsByNameArgs->SearchRegionsByNameResult
      abstract member SendFileToChat:HttpContext -> SendFileToChatArgs->SendFileToChatResult
      abstract member SendMessageToChat:HttpContext -> SendMessageToChatArgs->SendMessageToChatResult
      abstract member SetFeedParams:HttpContext -> SetFeedParamsArgs->SetFeedParamsResult
      abstract member SetOrderBoxLayout:HttpContext -> SetOrderBoxLayoutArgs->SetOrderBoxLayoutResult
      abstract member SetOrderShipmentBoxes:HttpContext -> SetOrderShipmentBoxesArgs->SetOrderShipmentBoxesResult
      abstract member SkipGoodsFeedbacksReaction:HttpContext -> SkipGoodsFeedbacksReactionArgs->SkipGoodsFeedbacksReactionResult
      abstract member UpdateBusinessPrices:HttpContext -> UpdateBusinessPricesArgs->UpdateBusinessPricesResult
      abstract member UpdateCampaignOffers:HttpContext -> UpdateCampaignOffersArgs->UpdateCampaignOffersResult
      abstract member UpdateGoodsFeedbackComment:HttpContext -> UpdateGoodsFeedbackCommentArgs->UpdateGoodsFeedbackCommentResult
      abstract member UpdateOfferContent:HttpContext -> UpdateOfferContentArgs->UpdateOfferContentResult
      abstract member UpdateOfferMappingEntries:HttpContext -> UpdateOfferMappingEntriesArgs->UpdateOfferMappingEntriesResult
      abstract member UpdateOfferMappings:HttpContext -> UpdateOfferMappingsArgs->UpdateOfferMappingsResult
      abstract member UpdateOrderItems:HttpContext -> UpdateOrderItemsArgs->UpdateOrderItemsResult
      abstract member UpdateOrderStatus:HttpContext -> UpdateOrderStatusArgs->UpdateOrderStatusResult
      abstract member UpdateOrderStatuses:HttpContext -> UpdateOrderStatusesArgs->UpdateOrderStatusesResult
      abstract member UpdatePrices:HttpContext -> UpdatePricesArgs->UpdatePricesResult
      abstract member UpdatePromoOffers:HttpContext -> UpdatePromoOffersArgs->UpdatePromoOffersResult
      abstract member UpdateStocks:HttpContext -> UpdateStocksArgs->UpdateStocksResult
      abstract member VerifyOrderEac:HttpContext -> VerifyOrderEacArgs->VerifyOrderEacResult
    //#endregion