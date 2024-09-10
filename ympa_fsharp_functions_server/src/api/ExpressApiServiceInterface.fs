namespace ympa_fsharp_functions_server
open ExpressApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ExpressApiServiceInterface =

    //#region Service interface
    type IExpressApiService =
      abstract member AddHiddenOffers : AddHiddenOffersBodyParams -> AddHiddenOffersResult
      abstract member AddOffersToArchive : AddOffersToArchiveBodyParams -> AddOffersToArchiveResult
      abstract member CalculateTariffs : CalculateTariffsBodyParams -> CalculateTariffsResult
      abstract member ConfirmBusinessPrices : ConfirmBusinessPricesBodyParams -> ConfirmBusinessPricesResult
      abstract member ConfirmCampaignPrices : ConfirmCampaignPricesBodyParams -> ConfirmCampaignPricesResult
      abstract member CreateChat : CreateChatBodyParams -> CreateChatResult
      abstract member DeleteCampaignOffers : DeleteCampaignOffersBodyParams -> DeleteCampaignOffersResult
      abstract member DeleteGoodsFeedbackComment : DeleteGoodsFeedbackCommentBodyParams -> DeleteGoodsFeedbackCommentResult
      abstract member DeleteHiddenOffers : DeleteHiddenOffersBodyParams -> DeleteHiddenOffersResult
      abstract member DeleteOffers : DeleteOffersBodyParams -> DeleteOffersResult
      abstract member DeleteOffersFromArchive : DeleteOffersFromArchiveBodyParams -> DeleteOffersFromArchiveResult
      abstract member DeletePromoOffers : DeletePromoOffersBodyParams -> DeletePromoOffersResult
      abstract member GenerateBoostConsolidatedReport : GenerateBoostConsolidatedReportBodyParams -> GenerateBoostConsolidatedReportResult
      abstract member GenerateCompetitorsPositionReport : GenerateCompetitorsPositionReportBodyParams -> GenerateCompetitorsPositionReportResult
      abstract member GenerateGoodsFeedbackReport : GenerateGoodsFeedbackReportBodyParams -> GenerateGoodsFeedbackReportResult
      abstract member GenerateGoodsRealizationReport : GenerateGoodsRealizationReportBodyParams -> GenerateGoodsRealizationReportResult
      abstract member GenerateMassOrderLabelsReport : GenerateMassOrderLabelsReportBodyParams -> GenerateMassOrderLabelsReportResult
      abstract member GenerateOrderLabel : unit -> GenerateOrderLabelResult
      abstract member GenerateOrderLabels : unit -> GenerateOrderLabelsResult
      abstract member GeneratePricesReport : GeneratePricesReportBodyParams -> GeneratePricesReportResult
      abstract member GenerateShelfsStatisticsReport : GenerateShelfsStatisticsReportBodyParams -> GenerateShelfsStatisticsReportResult
      abstract member GenerateShowsSalesReport : GenerateShowsSalesReportBodyParams -> GenerateShowsSalesReportResult
      abstract member GenerateStocksOnWarehousesReport : GenerateStocksOnWarehousesReportBodyParams -> GenerateStocksOnWarehousesReportResult
      abstract member GenerateUnitedMarketplaceServicesReport : GenerateUnitedMarketplaceServicesReportBodyParams -> GenerateUnitedMarketplaceServicesReportResult
      abstract member GenerateUnitedNettingReport : GenerateUnitedNettingReportBodyParams -> GenerateUnitedNettingReportResult
      abstract member GenerateUnitedOrdersReport : GenerateUnitedOrdersReportBodyParams -> GenerateUnitedOrdersReportResult
      abstract member GetAllOffers : unit -> GetAllOffersResult
      abstract member GetBidsInfoForBusiness : GetBidsInfoForBusinessBodyParams -> GetBidsInfoForBusinessResult
      abstract member GetBidsRecommendations : GetBidsRecommendationsBodyParams -> GetBidsRecommendationsResult
      abstract member GetBusinessQuarantineOffers : GetBusinessQuarantineOffersBodyParams -> GetBusinessQuarantineOffersResult
      abstract member GetBusinessSettings : unit -> GetBusinessSettingsResult
      abstract member GetCampaign : unit -> GetCampaignResult
      abstract member GetCampaignLogins : unit -> GetCampaignLoginsResult
      abstract member GetCampaignOffers : GetCampaignOffersBodyParams -> GetCampaignOffersResult
      abstract member GetCampaignQuarantineOffers : GetCampaignQuarantineOffersBodyParams -> GetCampaignQuarantineOffersResult
      abstract member GetCampaignRegion : unit -> GetCampaignRegionResult
      abstract member GetCampaignSettings : unit -> GetCampaignSettingsResult
      abstract member GetCampaigns : unit -> GetCampaignsResult
      abstract member GetCampaignsByLogin : unit -> GetCampaignsByLoginResult
      abstract member GetCategoriesMaxSaleQuantum : GetCategoriesMaxSaleQuantumBodyParams -> GetCategoriesMaxSaleQuantumResult
      abstract member GetCategoriesTree : GetCategoriesTreeBodyParams -> GetCategoriesTreeResult
      abstract member GetCategoryContentParameters : unit -> GetCategoryContentParametersResult
      abstract member GetChatHistory : GetChatHistoryBodyParams -> GetChatHistoryResult
      abstract member GetChats : GetChatsBodyParams -> GetChatsResult
      abstract member GetDeliveryServices : unit -> GetDeliveryServicesResult
      abstract member GetFeed : unit -> GetFeedResult
      abstract member GetFeedIndexLogs : unit -> GetFeedIndexLogsResult
      abstract member GetFeedbackAndCommentUpdates : unit -> GetFeedbackAndCommentUpdatesResult
      abstract member GetFeeds : unit -> GetFeedsResult
      abstract member GetGoodsFeedbackComments : GetGoodsFeedbackCommentsBodyParams -> GetGoodsFeedbackCommentsResult
      abstract member GetGoodsFeedbacks : GetGoodsFeedbacksBodyParams -> GetGoodsFeedbacksResult
      abstract member GetGoodsStats : GetGoodsStatsBodyParams -> GetGoodsStatsResult
      abstract member GetHiddenOffers : unit -> GetHiddenOffersResult
      abstract member GetOfferCardsContentStatus : GetOfferCardsContentStatusBodyParams -> GetOfferCardsContentStatusResult
      abstract member GetOfferMappingEntries : unit -> GetOfferMappingEntriesResult
      abstract member GetOfferMappings : GetOfferMappingsBodyParams -> GetOfferMappingsResult
      abstract member GetOfferRecommendations : GetOfferRecommendationsBodyParams -> GetOfferRecommendationsResult
      abstract member GetOffers : unit -> GetOffersResult
      abstract member GetOrder : unit -> GetOrderResult
      abstract member GetOrderBusinessBuyerInfo : unit -> GetOrderBusinessBuyerInfoResult
      abstract member GetOrderBusinessDocumentsInfo : unit -> GetOrderBusinessDocumentsInfoResult
      abstract member GetOrderLabelsData : unit -> GetOrderLabelsDataResult
      abstract member GetOrders : unit -> GetOrdersResult
      abstract member GetOrdersStats : GetOrdersStatsBodyParams -> GetOrdersStatsResult
      abstract member GetPrices : unit -> GetPricesResult
      abstract member GetPricesByOfferIds : GetPricesByOfferIdsBodyParams -> GetPricesByOfferIdsResult
      abstract member GetPromoOffers : GetPromoOffersBodyParams -> GetPromoOffersResult
      abstract member GetPromos : GetPromosBodyParams -> GetPromosResult
      abstract member GetQualityRatingDetails : unit -> GetQualityRatingDetailsResult
      abstract member GetQualityRatings : GetQualityRatingsBodyParams -> GetQualityRatingsResult
      abstract member GetReportInfo : unit -> GetReportInfoResult
      abstract member GetReturn : unit -> GetReturnResult
      abstract member GetReturnApplication : unit -> GetReturnApplicationResult
      abstract member GetReturnPhoto : unit -> GetReturnPhotoResult
      abstract member GetReturns : unit -> GetReturnsResult
      abstract member GetStocks : GetStocksBodyParams -> GetStocksResult
      abstract member GetSuggestedOfferMappingEntries : GetSuggestedOfferMappingEntriesBodyParams -> GetSuggestedOfferMappingEntriesResult
      abstract member GetSuggestedOfferMappings : GetSuggestedOfferMappingsBodyParams -> GetSuggestedOfferMappingsResult
      abstract member GetSuggestedPrices : GetSuggestedPricesBodyParams -> GetSuggestedPricesResult
      abstract member GetWarehouses : unit -> GetWarehousesResult
      abstract member ProvideOrderItemIdentifiers : ProvideOrderItemIdentifiersBodyParams -> ProvideOrderItemIdentifiersResult
      abstract member PutBidsForBusiness : PutBidsForBusinessBodyParams -> PutBidsForBusinessResult
      abstract member PutBidsForCampaign : PutBidsForCampaignBodyParams -> PutBidsForCampaignResult
      abstract member RefreshFeed : unit -> RefreshFeedResult
      abstract member SearchRegionChildren : unit -> SearchRegionChildrenResult
      abstract member SearchRegionsById : unit -> SearchRegionsByIdResult
      abstract member SearchRegionsByName : unit -> SearchRegionsByNameResult
      abstract member SendFileToChat : unit -> SendFileToChatResult
      abstract member SendMessageToChat : SendMessageToChatBodyParams -> SendMessageToChatResult
      abstract member SetFeedParams : SetFeedParamsBodyParams -> SetFeedParamsResult
      abstract member SetOrderBoxLayout : SetOrderBoxLayoutBodyParams -> SetOrderBoxLayoutResult
      abstract member SetOrderShipmentBoxes : SetOrderShipmentBoxesBodyParams -> SetOrderShipmentBoxesResult
      abstract member SkipGoodsFeedbacksReaction : SkipGoodsFeedbacksReactionBodyParams -> SkipGoodsFeedbacksReactionResult
      abstract member UpdateBusinessPrices : UpdateBusinessPricesBodyParams -> UpdateBusinessPricesResult
      abstract member UpdateCampaignOffers : UpdateCampaignOffersBodyParams -> UpdateCampaignOffersResult
      abstract member UpdateGoodsFeedbackComment : UpdateGoodsFeedbackCommentBodyParams -> UpdateGoodsFeedbackCommentResult
      abstract member UpdateOfferContent : UpdateOfferContentBodyParams -> UpdateOfferContentResult
      abstract member UpdateOfferMappingEntries : UpdateOfferMappingEntriesBodyParams -> UpdateOfferMappingEntriesResult
      abstract member UpdateOfferMappings : UpdateOfferMappingsBodyParams -> UpdateOfferMappingsResult
      abstract member UpdateOrderItems : UpdateOrderItemsBodyParams -> UpdateOrderItemsResult
      abstract member UpdateOrderStatus : UpdateOrderStatusBodyParams -> UpdateOrderStatusResult
      abstract member UpdateOrderStatuses : UpdateOrderStatusesBodyParams -> UpdateOrderStatusesResult
      abstract member UpdatePrices : UpdatePricesBodyParams -> UpdatePricesResult
      abstract member UpdatePromoOffers : UpdatePromoOffersBodyParams -> UpdatePromoOffersResult
      abstract member UpdateStocks : UpdateStocksBodyParams -> UpdateStocksResult
      abstract member VerifyOrderEac : VerifyOrderEacBodyParams -> VerifyOrderEacResult
    //#endregion