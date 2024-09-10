package api

import model.AcceptOrderCancellationRequest
import model.AddHiddenOffersRequest
import model.AddOffersToArchiveRequest
import model.AddOffersToArchiveResponse
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CalculateTariffsRequest
import model.CalculateTariffsResponse
import model.ChangeOutletRequest
import model.ConfirmPricesRequest
import model.CreateChatRequest
import model.CreateChatResponse
import model.CreateOutletResponse
import model.CurrencyType
import model.DeleteCampaignOffersRequest
import model.DeleteCampaignOffersResponse
import model.DeleteGoodsFeedbackCommentRequest
import model.DeleteHiddenOffersRequest
import model.DeleteOffersFromArchiveRequest
import model.DeleteOffersFromArchiveResponse
import model.DeleteOffersRequest
import model.DeleteOffersResponse
import model.DeletePromoOffersRequest
import model.DeletePromoOffersResponse
import model.EmptyApiResponse
import model.FeedIndexLogsStatusType
import model.GenerateBoostConsolidatedRequest
import model.GenerateCompetitorsPositionReportRequest
import model.GenerateGoodsFeedbackRequest
import model.GenerateMassOrderLabelsRequest
import model.GeneratePricesReportRequest
import model.GenerateReportResponse
import model.GenerateShelfsStatisticsRequest
import model.GenerateShowsSalesReportRequest
import model.GenerateStocksOnWarehousesReportRequest
import model.GenerateUnitedMarketplaceServicesReportRequest
import model.GenerateUnitedNettingReportRequest
import model.GenerateUnitedOrdersRequest
import model.GetAllOffersResponse
import model.GetBidsInfoRequest
import model.GetBidsInfoResponse
import model.GetBidsRecommendationsRequest
import model.GetBidsRecommendationsResponse
import model.GetBusinessBuyerInfoResponse
import model.GetBusinessDocumentsInfoResponse
import model.GetBusinessSettingsResponse
import model.GetCampaignLoginsResponse
import model.GetCampaignOffersRequest
import model.GetCampaignOffersResponse
import model.GetCampaignRegionResponse
import model.GetCampaignResponse
import model.GetCampaignSettingsResponse
import model.GetCampaignsResponse
import model.GetCategoriesMaxSaleQuantumRequest
import model.GetCategoriesMaxSaleQuantumResponse
import model.GetCategoriesRequest
import model.GetCategoriesResponse
import model.GetCategoryContentParametersResponse
import model.GetChatHistoryRequest
import model.GetChatHistoryResponse
import model.GetChatsRequest
import model.GetChatsResponse
import model.GetDeliveryServicesResponse
import model.GetFeedIndexLogsResponse
import model.GetFeedResponse
import model.GetFeedbackListResponse
import model.GetFeedsResponse
import model.GetGoodsFeedbackCommentsRequest
import model.GetGoodsFeedbackCommentsResponse
import model.GetGoodsFeedbackRequest
import model.GetGoodsFeedbackResponse
import model.GetGoodsStatsRequest
import model.GetGoodsStatsResponse
import model.GetHiddenOffersResponse
import model.GetModelsOffersResponse
import model.GetModelsRequest
import model.GetModelsResponse
import model.GetOfferCardsContentStatusRequest
import model.GetOfferCardsContentStatusResponse
import model.GetOfferMappingEntriesResponse
import model.GetOfferMappingsRequest
import model.GetOfferMappingsResponse
import model.GetOfferRecommendationsRequest
import model.GetOfferRecommendationsResponse
import model.GetOffersResponse
import model.GetOrderBuyerInfoResponse
import model.GetOrderLabelsDataResponse
import model.GetOrderResponse
import model.GetOrdersResponse
import model.GetOrdersStatsRequest
import model.GetOrdersStatsResponse
import model.GetOutletLicensesResponse
import model.GetOutletResponse
import model.GetOutletsResponse
import model.GetPricesByOfferIdsRequest
import model.GetPricesByOfferIdsResponse
import model.GetPricesResponse
import model.GetPromoOffersRequest
import model.GetPromoOffersResponse
import model.GetPromosRequest
import model.GetPromosResponse
import model.GetQualityRatingDetailsResponse
import model.GetQualityRatingRequest
import model.GetQualityRatingResponse
import model.GetQuarantineOffersRequest
import model.GetQuarantineOffersResponse
import model.GetRegionWithChildrenResponse
import model.GetRegionsResponse
import model.GetReportInfoResponse
import model.GetReturnResponse
import model.GetReturnsResponse
import model.GetSuggestedOfferMappingEntriesRequest
import model.GetSuggestedOfferMappingEntriesResponse
import model.GetSuggestedOfferMappingsRequest
import model.GetSuggestedOfferMappingsResponse
import model.GetWarehouseStocksRequest
import model.GetWarehouseStocksResponse
import model.GetWarehousesResponse
import java.time.LocalDate
import model.OfferAvailabilityStatusType
import model.OfferMappingKindType
import model.OfferProcessingStatusType
import java.time.OffsetDateTime
import model.OrderBuyerType
import model.OrderDeliveryDispatchType
import model.OrderStatusType
import model.OrderSubstatusType
import model.PageFormatType
import model.ProvideOrderDigitalCodesRequest
import model.ProvideOrderItemIdentifiersRequest
import model.ProvideOrderItemIdentifiersResponse
import model.PutSkuBidsRequest
import model.RefundStatusType
import model.ReportFormatType
import model.ReturnType
import model.SearchModelsResponse
import model.SendMessageToChatRequest
import scala.collection.immutable.Set
import model.SetFeedParamsRequest
import model.SetOrderBoxLayoutRequest
import model.SetOrderBoxLayoutResponse
import model.SetOrderDeliveryDateRequest
import model.SetOrderDeliveryTrackCodeRequest
import model.SetOrderShipmentBoxesRequest
import model.SetOrderShipmentBoxesResponse
import model.SetReturnDecisionRequest
import model.SkipGoodsFeedbackReactionRequest
import model.SortOrderType
import model.SuggestPricesRequest
import model.SuggestPricesResponse
import play.api.libs.Files.TemporaryFile
import model.UpdateBusinessPricesRequest
import model.UpdateCampaignOffersRequest
import model.UpdateGoodsFeedbackCommentRequest
import model.UpdateGoodsFeedbackCommentResponse
import model.UpdateOfferContentRequest
import model.UpdateOfferContentResponse
import model.UpdateOfferMappingEntryRequest
import model.UpdateOfferMappingsRequest
import model.UpdateOfferMappingsResponse
import model.UpdateOrderItemRequest
import model.UpdateOrderStatusRequest
import model.UpdateOrderStatusResponse
import model.UpdateOrderStatusesRequest
import model.UpdateOrderStatusesResponse
import model.UpdateOrderStorageLimitRequest
import model.UpdateOutletLicenseRequest
import model.UpdatePricesRequest
import model.UpdatePromoOffersRequest
import model.UpdatePromoOffersResponse
import model.UpdateStocksRequest

/**
  * Provides a default implementation for [[DbsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class DbsApiImpl extends DbsApi {
  /**
    * @inheritdoc
    */
  override def acceptOrderCancellation(campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): AddOffersToArchiveResponse = {
    // TODO: Implement better logic

    AddOffersToArchiveResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): CalculateTariffsResponse = {
    // TODO: Implement better logic

    CalculateTariffsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def createChat(businessId: Long, createChatRequest: CreateChatRequest): CreateChatResponse = {
    // TODO: Implement better logic

    CreateChatResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def createOutlet(campaignId: Long, changeOutletRequest: ChangeOutletRequest): CreateOutletResponse = {
    // TODO: Implement better logic

    CreateOutletResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): DeleteCampaignOffersResponse = {
    // TODO: Implement better logic

    DeleteCampaignOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): DeleteOffersResponse = {
    // TODO: Implement better logic

    DeleteOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): DeleteOffersFromArchiveResponse = {
    // TODO: Implement better logic

    DeleteOffersFromArchiveResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOutlet(campaignId: Long, outletId: Long): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOutletLicenses(campaignId: Long, ids: Option[Set[Long]]): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): DeletePromoOffersResponse = {
    // TODO: Implement better logic

    DeletePromoOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): GenerateReportResponse = {
    // TODO: Implement better logic

    GenerateReportResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): GetAllOffersResponse = {
    // TODO: Implement better logic

    GetAllOffersResponse(List.empty[OfferDTO], Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: Option[GetBidsInfoRequest]): GetBidsInfoResponse = {
    // TODO: Implement better logic

    GetBidsInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): GetBidsRecommendationsResponse = {
    // TODO: Implement better logic

    GetBidsRecommendationsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): GetQuarantineOffersResponse = {
    // TODO: Implement better logic

    GetQuarantineOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessSettings(businessId: Long): GetBusinessSettingsResponse = {
    // TODO: Implement better logic

    GetBusinessSettingsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCampaign(campaignId: Long): GetCampaignResponse = {
    // TODO: Implement better logic

    GetCampaignResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignLogins(campaignId: Long): GetCampaignLoginsResponse = {
    // TODO: Implement better logic

    GetCampaignLoginsResponse(List.empty[String])
  }

  /**
    * @inheritdoc
    */
  override def getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): GetCampaignOffersResponse = {
    // TODO: Implement better logic

    GetCampaignOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): GetQuarantineOffersResponse = {
    // TODO: Implement better logic

    GetQuarantineOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignRegion(campaignId: Long): GetCampaignRegionResponse = {
    // TODO: Implement better logic

    GetCampaignRegionResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignSettings(campaignId: Long): GetCampaignSettingsResponse = {
    // TODO: Implement better logic

    GetCampaignSettingsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaigns(page: Option[Int], pageSize: Option[Int]): GetCampaignsResponse = {
    // TODO: Implement better logic

    GetCampaignsResponse(List.empty[CampaignDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): GetCampaignsResponse = {
    // TODO: Implement better logic

    GetCampaignsResponse(List.empty[CampaignDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): GetCategoriesMaxSaleQuantumResponse = {
    // TODO: Implement better logic

    GetCategoriesMaxSaleQuantumResponse(None, List.empty[MaxSaleQuantumDTO], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCategoriesTree(getCategoriesRequest: Option[GetCategoriesRequest]): GetCategoriesResponse = {
    // TODO: Implement better logic

    GetCategoriesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCategoryContentParameters(categoryId: Long): GetCategoryContentParametersResponse = {
    // TODO: Implement better logic

    GetCategoryContentParametersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): GetChatHistoryResponse = {
    // TODO: Implement better logic

    GetChatHistoryResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): GetChatsResponse = {
    // TODO: Implement better logic

    GetChatsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getDeliveryServices(): GetDeliveryServicesResponse = {
    // TODO: Implement better logic

    GetDeliveryServicesResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getFeed(campaignId: Long, feedId: Long): GetFeedResponse = {
    // TODO: Implement better logic

    GetFeedResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[OffsetDateTime], publishedTimeTo: Option[OffsetDateTime], status: Option[FeedIndexLogsStatusType]): GetFeedIndexLogsResponse = {
    // TODO: Implement better logic

    GetFeedIndexLogsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDate]): GetFeedbackListResponse = {
    // TODO: Implement better logic

    GetFeedbackListResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getFeeds(campaignId: Long): GetFeedsResponse = {
    // TODO: Implement better logic

    GetFeedsResponse(List.empty[FeedDTO])
  }

  /**
    * @inheritdoc
    */
  override def getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): GetGoodsFeedbackCommentsResponse = {
    // TODO: Implement better logic

    GetGoodsFeedbackCommentsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: Option[GetGoodsFeedbackRequest]): GetGoodsFeedbackResponse = {
    // TODO: Implement better logic

    GetGoodsFeedbackResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): GetGoodsStatsResponse = {
    // TODO: Implement better logic

    GetGoodsStatsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getHiddenOffers(campaignId: Long, offerId: Option[List[String]], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): GetHiddenOffersResponse = {
    // TODO: Implement better logic

    GetHiddenOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModel(modelId: Long, regionId: Long, currency: Option[CurrencyType]): GetModelsResponse = {
    // TODO: Implement better logic

    GetModelsResponse(List.empty[ModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModelOffers(modelId: Long, regionId: Long, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType], count: Option[Int], page: Option[Int]): GetModelsOffersResponse = {
    // TODO: Implement better logic

    GetModelsOffersResponse(List.empty[EnrichedModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModels(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType]): GetModelsResponse = {
    // TODO: Implement better logic

    GetModelsResponse(List.empty[ModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModelsOffers(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType]): GetModelsOffersResponse = {
    // TODO: Implement better logic

    GetModelsOffersResponse(List.empty[EnrichedModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: Option[GetOfferCardsContentStatusRequest]): GetOfferCardsContentStatusResponse = {
    // TODO: Implement better logic

    GetOfferCardsContentStatusResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferMappingEntries(campaignId: Long, offerId: Option[List[String]], shopSku: Option[List[String]], mappingKind: Option[OfferMappingKindType], status: Option[List[OfferProcessingStatusType]], availability: Option[List[OfferAvailabilityStatusType]], categoryId: Option[List[Int]], vendor: Option[List[String]], pageToken: Option[String], limit: Option[Int]): GetOfferMappingEntriesResponse = {
    // TODO: Implement better logic

    GetOfferMappingEntriesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: Option[GetOfferMappingsRequest]): GetOfferMappingsResponse = {
    // TODO: Implement better logic

    GetOfferMappingsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): GetOfferRecommendationsResponse = {
    // TODO: Implement better logic

    GetOfferRecommendationsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): GetOffersResponse = {
    // TODO: Implement better logic

    GetOffersResponse(List.empty[OfferDTO], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrder(campaignId: Long, orderId: Long): GetOrderResponse = {
    // TODO: Implement better logic

    GetOrderResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): GetBusinessBuyerInfoResponse = {
    // TODO: Implement better logic

    GetBusinessBuyerInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): GetBusinessDocumentsInfoResponse = {
    // TODO: Implement better logic

    GetBusinessDocumentsInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrderBuyerInfo(campaignId: Long, orderId: Long): GetOrderBuyerInfoResponse = {
    // TODO: Implement better logic

    GetOrderBuyerInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrderLabelsData(campaignId: Long, orderId: Long): GetOrderLabelsDataResponse = {
    // TODO: Implement better logic

    GetOrderLabelsDataResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrders(campaignId: Long, orderIds: Option[List[Long]], status: Option[Set[OrderStatusType]], substatus: Option[Set[OrderSubstatusType]], fromDate: Option[LocalDate], toDate: Option[LocalDate], supplierShipmentDateFrom: Option[LocalDate], supplierShipmentDateTo: Option[LocalDate], updatedAtFrom: Option[OffsetDateTime], updatedAtTo: Option[OffsetDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): GetOrdersResponse = {
    // TODO: Implement better logic

    GetOrdersResponse(None, List.empty[OrderDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: Option[GetOrdersStatsRequest]): GetOrdersStatsResponse = {
    // TODO: Implement better logic

    GetOrdersStatsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOutlet(campaignId: Long, outletId: Long): GetOutletResponse = {
    // TODO: Implement better logic

    GetOutletResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getOutletLicenses(campaignId: Long, outletIds: Option[Set[Long]], ids: Option[Set[Long]]): GetOutletLicensesResponse = {
    // TODO: Implement better logic

    GetOutletLicensesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOutlets(campaignId: Long, pageToken: Option[String], regionId: Option[Long], shopOutletCode: Option[String], regionId2: Option[Long]): GetOutletsResponse = {
    // TODO: Implement better logic

    GetOutletsResponse(List.empty[FullOutletDTO], None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): GetPricesResponse = {
    // TODO: Implement better logic

    GetPricesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: Option[GetPricesByOfferIdsRequest]): GetPricesByOfferIdsResponse = {
    // TODO: Implement better logic

    GetPricesByOfferIdsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): GetPromoOffersResponse = {
    // TODO: Implement better logic

    GetPromoOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getPromos(businessId: Long, getPromosRequest: Option[GetPromosRequest]): GetPromosResponse = {
    // TODO: Implement better logic

    GetPromosResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getQualityRatingDetails(campaignId: Long): GetQualityRatingDetailsResponse = {
    // TODO: Implement better logic

    GetQualityRatingDetailsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): GetQualityRatingResponse = {
    // TODO: Implement better logic

    GetQualityRatingResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getReportInfo(reportId: String): GetReportInfoResponse = {
    // TODO: Implement better logic

    GetReportInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getReturn(campaignId: Long, orderId: Long, returnId: Long): GetReturnResponse = {
    // TODO: Implement better logic

    GetReturnResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Option[List[Long]], statuses: Option[List[RefundStatusType]], `type`: Option[ReturnType], fromDate: Option[LocalDate], toDate: Option[LocalDate], fromDate2: Option[LocalDate], toDate2: Option[LocalDate]): GetReturnsResponse = {
    // TODO: Implement better logic

    GetReturnsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: Option[GetWarehouseStocksRequest]): GetWarehouseStocksResponse = {
    // TODO: Implement better logic

    GetWarehouseStocksResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): GetSuggestedOfferMappingEntriesResponse = {
    // TODO: Implement better logic

    GetSuggestedOfferMappingEntriesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: Option[GetSuggestedOfferMappingsRequest]): GetSuggestedOfferMappingsResponse = {
    // TODO: Implement better logic

    GetSuggestedOfferMappingsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): SuggestPricesResponse = {
    // TODO: Implement better logic

    SuggestPricesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getWarehouses(businessId: Long): GetWarehousesResponse = {
    // TODO: Implement better logic

    GetWarehousesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def provideOrderDigitalCodes(campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): ProvideOrderItemIdentifiersResponse = {
    // TODO: Implement better logic

    ProvideOrderItemIdentifiersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def refreshFeed(campaignId: Long, feedId: Long): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def searchModels(query: String, regionId: Long, currency: Option[CurrencyType], page: Option[Int], pageSize: Option[Int]): SearchModelsResponse = {
    // TODO: Implement better logic

    SearchModelsResponse(List.empty[ModelDTO], None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): GetRegionWithChildrenResponse = {
    // TODO: Implement better logic

    GetRegionWithChildrenResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRegionsById(regionId: Long): GetRegionsResponse = {
    // TODO: Implement better logic

    GetRegionsResponse(List.empty[RegionDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): GetRegionsResponse = {
    // TODO: Implement better logic

    GetRegionsResponse(List.empty[RegionDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def sendFileToChat(businessId: Long, chatId: Long, file: TemporaryFile): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): SetOrderBoxLayoutResponse = {
    // TODO: Implement better logic

    SetOrderBoxLayoutResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderDeliveryDate(campaignId: Long, orderId: Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderDeliveryTrackCode(campaignId: Long, orderId: Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): SetOrderShipmentBoxesResponse = {
    // TODO: Implement better logic

    SetOrderShipmentBoxesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setReturnDecision(campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): UpdateGoodsFeedbackCommentResponse = {
    // TODO: Implement better logic

    UpdateGoodsFeedbackCommentResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): UpdateOfferContentResponse = {
    // TODO: Implement better logic

    UpdateOfferContentResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): UpdateOfferMappingsResponse = {
    // TODO: Implement better logic

    UpdateOfferMappingsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): UpdateOrderStatusResponse = {
    // TODO: Implement better logic

    UpdateOrderStatusResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): UpdateOrderStatusesResponse = {
    // TODO: Implement better logic

    UpdateOrderStatusesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOrderStorageLimit(campaignId: Long, orderId: Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOutlet(campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOutletLicenses(campaignId: Long, updateOutletLicenseRequest: UpdateOutletLicenseRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): UpdatePromoOffersResponse = {
    // TODO: Implement better logic

    UpdatePromoOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
