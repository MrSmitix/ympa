package ympa_scala_finch_server

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A GetBidsInfoResponse
        */
        def Bids_getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest): Either[CommonError,GetBidsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsRecommendationsResponse
        */
        def Bids_getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Either[CommonError,GetBidsRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Bids_putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Bids_putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A AddOffersToArchiveResponse
        */
        def BusinessOfferMappings_addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Either[CommonError,AddOffersToArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersResponse
        */
        def BusinessOfferMappings_deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Either[CommonError,DeleteOffersResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersFromArchiveResponse
        */
        def BusinessOfferMappings_deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Either[CommonError,DeleteOffersFromArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingsResponse
        */
        def BusinessOfferMappings_getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest): Either[CommonError,GetOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingsResponse
        */
        def BusinessOfferMappings_getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Either[CommonError,GetSuggestedOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferMappingsResponse
        */
        def BusinessOfferMappings_updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Either[CommonError,UpdateOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessSettingsResponse
        */
        def Businesses_getBusinessSettings(businessId: Long): Either[CommonError,GetBusinessSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignResponse
        */
        def Campaigns_getCampaign(campaignId: Long): Either[CommonError,GetCampaignResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignLoginsResponse
        */
        def Campaigns_getCampaignLogins(campaignId: Long): Either[CommonError,GetCampaignLoginsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignRegionResponse
        */
        def Campaigns_getCampaignRegion(campaignId: Long): Either[CommonError,GetCampaignRegionResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignSettingsResponse
        */
        def Campaigns_getCampaignSettings(campaignId: Long): Either[CommonError,GetCampaignSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Campaigns_getCampaigns(page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Campaigns_getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesMaxSaleQuantumResponse
        */
        def Categories_getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Either[CommonError,GetCategoriesMaxSaleQuantumResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesResponse
        */
        def Categories_getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Either[CommonError,GetCategoriesResponse] = Left(TODO)

        /**
        * 
        * @return A CreateChatResponse
        */
        def Chats_createChat(businessId: Long, createChatRequest: CreateChatRequest): Either[CommonError,CreateChatResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatHistoryResponse
        */
        def Chats_getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatsResponse
        */
        def Chats_getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Chats_sendFileToChat(businessId: Long, chatId: Long, file: FileUpload): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Chats_sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoryContentParametersResponse
        */
        def Content_getCategoryContentParameters(categoryId: Long): Either[CommonError,GetCategoryContentParametersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferCardsContentStatusResponse
        */
        def Content_getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest): Either[CommonError,GetOfferCardsContentStatusResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferContentResponse
        */
        def Content_updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Either[CommonError,UpdateOfferContentResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_acceptOrderCancellation(campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A AddOffersToArchiveResponse
        */
        def Dbs_addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Either[CommonError,AddOffersToArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A CalculateTariffsResponse
        */
        def Dbs_calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): Either[CommonError,CalculateTariffsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A CreateChatResponse
        */
        def Dbs_createChat(businessId: Long, createChatRequest: CreateChatRequest): Either[CommonError,CreateChatResponse] = Left(TODO)

        /**
        * 
        * @return A CreateOutletResponse
        */
        def Dbs_createOutlet(campaignId: Long, changeOutletRequest: ChangeOutletRequest): Either[CommonError,CreateOutletResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteCampaignOffersResponse
        */
        def Dbs_deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Either[CommonError,DeleteCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersResponse
        */
        def Dbs_deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Either[CommonError,DeleteOffersResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersFromArchiveResponse
        */
        def Dbs_deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Either[CommonError,DeleteOffersFromArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_deleteOutlet(campaignId: Long, outletId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_deleteOutletLicenses(campaignId: Long, ids: Seq[Long]): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeletePromoOffersResponse
        */
        def Dbs_deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Either[CommonError,DeletePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Dbs_generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Dbs_generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Dbs_generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GetAllOffersResponse
        */
        def Dbs_getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): Either[CommonError,GetAllOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsInfoResponse
        */
        def Dbs_getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest): Either[CommonError,GetBidsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsRecommendationsResponse
        */
        def Dbs_getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Either[CommonError,GetBidsRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Dbs_getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessSettingsResponse
        */
        def Dbs_getBusinessSettings(businessId: Long): Either[CommonError,GetBusinessSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignResponse
        */
        def Dbs_getCampaign(campaignId: Long): Either[CommonError,GetCampaignResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignLoginsResponse
        */
        def Dbs_getCampaignLogins(campaignId: Long): Either[CommonError,GetCampaignLoginsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignOffersResponse
        */
        def Dbs_getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Dbs_getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignRegionResponse
        */
        def Dbs_getCampaignRegion(campaignId: Long): Either[CommonError,GetCampaignRegionResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignSettingsResponse
        */
        def Dbs_getCampaignSettings(campaignId: Long): Either[CommonError,GetCampaignSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Dbs_getCampaigns(page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Dbs_getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesMaxSaleQuantumResponse
        */
        def Dbs_getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Either[CommonError,GetCategoriesMaxSaleQuantumResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesResponse
        */
        def Dbs_getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Either[CommonError,GetCategoriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoryContentParametersResponse
        */
        def Dbs_getCategoryContentParameters(categoryId: Long): Either[CommonError,GetCategoryContentParametersResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatHistoryResponse
        */
        def Dbs_getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatsResponse
        */
        def Dbs_getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetDeliveryServicesResponse
        */
        def Dbs_getDeliveryServices(): Either[CommonError,GetDeliveryServicesResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedResponse
        */
        def Dbs_getFeed(campaignId: Long, feedId: Long): Either[CommonError,GetFeedResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedIndexLogsResponse
        */
        def Dbs_getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]): Either[CommonError,GetFeedIndexLogsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedbackListResponse
        */
        def Dbs_getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDateTime]): Either[CommonError,GetFeedbackListResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedsResponse
        */
        def Dbs_getFeeds(campaignId: Long): Either[CommonError,GetFeedsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackCommentsResponse
        */
        def Dbs_getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetGoodsFeedbackCommentsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackResponse
        */
        def Dbs_getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest): Either[CommonError,GetGoodsFeedbackResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsStatsResponse
        */
        def Dbs_getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Either[CommonError,GetGoodsStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetHiddenOffersResponse
        */
        def Dbs_getHiddenOffers(campaignId: Long, offerId: Seq[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetHiddenOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsResponse
        */
        def Dbs_getModel(modelId: Long, regionId: Long, currency: Option[CurrencyType]): Either[CommonError,GetModelsResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsOffersResponse
        */
        def Dbs_getModelOffers(modelId: Long, regionId: Long, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType], count: Option[Int], page: Option[Int]): Either[CommonError,GetModelsOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsResponse
        */
        def Dbs_getModels(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType]): Either[CommonError,GetModelsResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsOffersResponse
        */
        def Dbs_getModelsOffers(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType]): Either[CommonError,GetModelsOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferCardsContentStatusResponse
        */
        def Dbs_getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest): Either[CommonError,GetOfferCardsContentStatusResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingEntriesResponse
        */
        def Dbs_getOfferMappingEntries(campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingsResponse
        */
        def Dbs_getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest): Either[CommonError,GetOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferRecommendationsResponse
        */
        def Dbs_getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOffersResponse
        */
        def Dbs_getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderResponse
        */
        def Dbs_getOrder(campaignId: Long, orderId: Long): Either[CommonError,GetOrderResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessBuyerInfoResponse
        */
        def Dbs_getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessDocumentsInfoResponse
        */
        def Dbs_getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessDocumentsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderBuyerInfoResponse
        */
        def Dbs_getOrderBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetOrderBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderLabelsDataResponse
        */
        def Dbs_getOrderLabelsData(campaignId: Long, orderId: Long): Either[CommonError,GetOrderLabelsDataResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersResponse
        */
        def Dbs_getOrders(campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOrdersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersStatsResponse
        */
        def Dbs_getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: GetOrdersStatsRequest): Either[CommonError,GetOrdersStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOutletResponse
        */
        def Dbs_getOutlet(campaignId: Long, outletId: Long): Either[CommonError,GetOutletResponse] = Left(TODO)

        /**
        * 
        * @return A GetOutletLicensesResponse
        */
        def Dbs_getOutletLicenses(campaignId: Long, outletIds: Seq[Long], ids: Seq[Long]): Either[CommonError,GetOutletLicensesResponse] = Left(TODO)

        /**
        * 
        * @return A GetOutletsResponse
        */
        def Dbs_getOutlets(campaignId: Long, pageToken: Option[String], regionId: Option[Long], shopOutletCode: Option[String], regionId2: Option[Long]): Either[CommonError,GetOutletsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesResponse
        */
        def Dbs_getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): Either[CommonError,GetPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesByOfferIdsResponse
        */
        def Dbs_getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest): Either[CommonError,GetPricesByOfferIdsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromoOffersResponse
        */
        def Dbs_getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetPromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromosResponse
        */
        def Dbs_getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Either[CommonError,GetPromosResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingDetailsResponse
        */
        def Dbs_getQualityRatingDetails(campaignId: Long): Either[CommonError,GetQualityRatingDetailsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingResponse
        */
        def Dbs_getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Either[CommonError,GetQualityRatingResponse] = Left(TODO)

        /**
        * 
        * @return A GetReportInfoResponse
        */
        def Dbs_getReportInfo(reportId: String): Either[CommonError,GetReportInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetReturnResponse
        */
        def Dbs_getReturn(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,GetReturnResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Dbs_getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Dbs_getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetReturnsResponse
        */
        def Dbs_getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]): Either[CommonError,GetReturnsResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehouseStocksResponse
        */
        def Dbs_getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: GetWarehouseStocksRequest): Either[CommonError,GetWarehouseStocksResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingEntriesResponse
        */
        def Dbs_getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Either[CommonError,GetSuggestedOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingsResponse
        */
        def Dbs_getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Either[CommonError,GetSuggestedOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A SuggestPricesResponse
        */
        def Dbs_getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Either[CommonError,SuggestPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehousesResponse
        */
        def Dbs_getWarehouses(businessId: Long): Either[CommonError,GetWarehousesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_provideOrderDigitalCodes(campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A ProvideOrderItemIdentifiersResponse
        */
        def Dbs_provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): Either[CommonError,ProvideOrderItemIdentifiersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_refreshFeed(campaignId: Long, feedId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A SearchModelsResponse
        */
        def Dbs_searchModels(query: String, regionId: Long, currency: Option[CurrencyType], page: Option[Int], pageSize: Option[Int]): Either[CommonError,SearchModelsResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionWithChildrenResponse
        */
        def Dbs_searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetRegionWithChildrenResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Dbs_searchRegionsById(regionId: Long): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Dbs_searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_sendFileToChat(businessId: Long, chatId: Long, file: FileUpload): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderBoxLayoutResponse
        */
        def Dbs_setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): Either[CommonError,SetOrderBoxLayoutResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_setOrderDeliveryDate(campaignId: Long, orderId: Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_setOrderDeliveryTrackCode(campaignId: Long, orderId: Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderShipmentBoxesResponse
        */
        def Dbs_setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): Either[CommonError,SetOrderShipmentBoxesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_setReturnDecision(campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateGoodsFeedbackCommentResponse
        */
        def Dbs_updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Either[CommonError,UpdateGoodsFeedbackCommentResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferContentResponse
        */
        def Dbs_updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Either[CommonError,UpdateOfferContentResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferMappingsResponse
        */
        def Dbs_updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Either[CommonError,UpdateOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Dbs_updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusResponse
        */
        def Dbs_updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): Either[CommonError,UpdateOrderStatusResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusesResponse
        */
        def Dbs_updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): Either[CommonError,UpdateOrderStatusesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateOrderStorageLimit(campaignId: Long, orderId: Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateOutlet(campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateOutletLicenses(campaignId: Long, updateOutletLicenseRequest: UpdateOutletLicenseRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdatePromoOffersResponse
        */
        def Dbs_updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Either[CommonError,UpdatePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Dbs_updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetDeliveryServicesResponse
        */
        def DeliveryServices_getDeliveryServices(): Either[CommonError,GetDeliveryServicesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A AddOffersToArchiveResponse
        */
        def Express_addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Either[CommonError,AddOffersToArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A CalculateTariffsResponse
        */
        def Express_calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): Either[CommonError,CalculateTariffsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A CreateChatResponse
        */
        def Express_createChat(businessId: Long, createChatRequest: CreateChatRequest): Either[CommonError,CreateChatResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteCampaignOffersResponse
        */
        def Express_deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Either[CommonError,DeleteCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersResponse
        */
        def Express_deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Either[CommonError,DeleteOffersResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersFromArchiveResponse
        */
        def Express_deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Either[CommonError,DeleteOffersFromArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A DeletePromoOffersResponse
        */
        def Express_deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Either[CommonError,DeletePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Express_generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Express_generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Express_generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GetAllOffersResponse
        */
        def Express_getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): Either[CommonError,GetAllOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsInfoResponse
        */
        def Express_getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest): Either[CommonError,GetBidsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsRecommendationsResponse
        */
        def Express_getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Either[CommonError,GetBidsRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Express_getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessSettingsResponse
        */
        def Express_getBusinessSettings(businessId: Long): Either[CommonError,GetBusinessSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignResponse
        */
        def Express_getCampaign(campaignId: Long): Either[CommonError,GetCampaignResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignLoginsResponse
        */
        def Express_getCampaignLogins(campaignId: Long): Either[CommonError,GetCampaignLoginsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignOffersResponse
        */
        def Express_getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Express_getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignRegionResponse
        */
        def Express_getCampaignRegion(campaignId: Long): Either[CommonError,GetCampaignRegionResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignSettingsResponse
        */
        def Express_getCampaignSettings(campaignId: Long): Either[CommonError,GetCampaignSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Express_getCampaigns(page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Express_getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesMaxSaleQuantumResponse
        */
        def Express_getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Either[CommonError,GetCategoriesMaxSaleQuantumResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesResponse
        */
        def Express_getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Either[CommonError,GetCategoriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoryContentParametersResponse
        */
        def Express_getCategoryContentParameters(categoryId: Long): Either[CommonError,GetCategoryContentParametersResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatHistoryResponse
        */
        def Express_getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatsResponse
        */
        def Express_getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetDeliveryServicesResponse
        */
        def Express_getDeliveryServices(): Either[CommonError,GetDeliveryServicesResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedResponse
        */
        def Express_getFeed(campaignId: Long, feedId: Long): Either[CommonError,GetFeedResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedIndexLogsResponse
        */
        def Express_getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]): Either[CommonError,GetFeedIndexLogsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedbackListResponse
        */
        def Express_getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDateTime]): Either[CommonError,GetFeedbackListResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedsResponse
        */
        def Express_getFeeds(campaignId: Long): Either[CommonError,GetFeedsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackCommentsResponse
        */
        def Express_getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetGoodsFeedbackCommentsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackResponse
        */
        def Express_getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest): Either[CommonError,GetGoodsFeedbackResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsStatsResponse
        */
        def Express_getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Either[CommonError,GetGoodsStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetHiddenOffersResponse
        */
        def Express_getHiddenOffers(campaignId: Long, offerId: Seq[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetHiddenOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferCardsContentStatusResponse
        */
        def Express_getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest): Either[CommonError,GetOfferCardsContentStatusResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingEntriesResponse
        */
        def Express_getOfferMappingEntries(campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingsResponse
        */
        def Express_getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest): Either[CommonError,GetOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferRecommendationsResponse
        */
        def Express_getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOffersResponse
        */
        def Express_getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderResponse
        */
        def Express_getOrder(campaignId: Long, orderId: Long): Either[CommonError,GetOrderResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessBuyerInfoResponse
        */
        def Express_getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessDocumentsInfoResponse
        */
        def Express_getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessDocumentsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderLabelsDataResponse
        */
        def Express_getOrderLabelsData(campaignId: Long, orderId: Long): Either[CommonError,GetOrderLabelsDataResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersResponse
        */
        def Express_getOrders(campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOrdersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersStatsResponse
        */
        def Express_getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: GetOrdersStatsRequest): Either[CommonError,GetOrdersStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesResponse
        */
        def Express_getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): Either[CommonError,GetPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesByOfferIdsResponse
        */
        def Express_getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest): Either[CommonError,GetPricesByOfferIdsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromoOffersResponse
        */
        def Express_getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetPromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromosResponse
        */
        def Express_getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Either[CommonError,GetPromosResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingDetailsResponse
        */
        def Express_getQualityRatingDetails(campaignId: Long): Either[CommonError,GetQualityRatingDetailsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingResponse
        */
        def Express_getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Either[CommonError,GetQualityRatingResponse] = Left(TODO)

        /**
        * 
        * @return A GetReportInfoResponse
        */
        def Express_getReportInfo(reportId: String): Either[CommonError,GetReportInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetReturnResponse
        */
        def Express_getReturn(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,GetReturnResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Express_getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Express_getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetReturnsResponse
        */
        def Express_getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]): Either[CommonError,GetReturnsResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehouseStocksResponse
        */
        def Express_getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: GetWarehouseStocksRequest): Either[CommonError,GetWarehouseStocksResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingEntriesResponse
        */
        def Express_getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Either[CommonError,GetSuggestedOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingsResponse
        */
        def Express_getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Either[CommonError,GetSuggestedOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A SuggestPricesResponse
        */
        def Express_getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Either[CommonError,SuggestPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehousesResponse
        */
        def Express_getWarehouses(businessId: Long): Either[CommonError,GetWarehousesResponse] = Left(TODO)

        /**
        * 
        * @return A ProvideOrderItemIdentifiersResponse
        */
        def Express_provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): Either[CommonError,ProvideOrderItemIdentifiersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_refreshFeed(campaignId: Long, feedId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionWithChildrenResponse
        */
        def Express_searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetRegionWithChildrenResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Express_searchRegionsById(regionId: Long): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Express_searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_sendFileToChat(businessId: Long, chatId: Long, file: FileUpload): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderBoxLayoutResponse
        */
        def Express_setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): Either[CommonError,SetOrderBoxLayoutResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderShipmentBoxesResponse
        */
        def Express_setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): Either[CommonError,SetOrderShipmentBoxesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateGoodsFeedbackCommentResponse
        */
        def Express_updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Either[CommonError,UpdateGoodsFeedbackCommentResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferContentResponse
        */
        def Express_updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Either[CommonError,UpdateOfferContentResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferMappingsResponse
        */
        def Express_updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Either[CommonError,UpdateOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Express_updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusResponse
        */
        def Express_updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): Either[CommonError,UpdateOrderStatusResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusesResponse
        */
        def Express_updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): Either[CommonError,UpdateOrderStatusesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdatePromoOffersResponse
        */
        def Express_updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Either[CommonError,UpdatePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Express_updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A VerifyOrderEacResponse
        */
        def Express_verifyOrderEac(campaignId: Long, orderId: Long, verifyOrderEacRequest: VerifyOrderEacRequest): Either[CommonError,VerifyOrderEacResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A AddOffersToArchiveResponse
        */
        def Fbs_addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Either[CommonError,AddOffersToArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A CalculateTariffsResponse
        */
        def Fbs_calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): Either[CommonError,CalculateTariffsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_confirmShipment(campaignId: Long, shipmentId: Long, confirmShipmentRequest: ConfirmShipmentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A CreateChatResponse
        */
        def Fbs_createChat(businessId: Long, createChatRequest: CreateChatRequest): Either[CommonError,CreateChatResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteCampaignOffersResponse
        */
        def Fbs_deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Either[CommonError,DeleteCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersResponse
        */
        def Fbs_deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Either[CommonError,DeleteOffersResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersFromArchiveResponse
        */
        def Fbs_deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Either[CommonError,DeleteOffersFromArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A DeletePromoOffersResponse
        */
        def Fbs_deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Either[CommonError,DeletePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_downloadShipmentAct(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_downloadShipmentDiscrepancyAct(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_downloadShipmentInboundAct(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_downloadShipmentPalletLabels(campaignId: Long, shipmentId: Long, format: Option[ShipmentPalletLabelPageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_downloadShipmentReceptionTransferAct(campaignId: Long, warehouseId: Option[Int]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_downloadShipmentTransportationWaybill(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fbs_generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GetAllOffersResponse
        */
        def Fbs_getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): Either[CommonError,GetAllOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsInfoResponse
        */
        def Fbs_getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest): Either[CommonError,GetBidsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsRecommendationsResponse
        */
        def Fbs_getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Either[CommonError,GetBidsRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Fbs_getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessSettingsResponse
        */
        def Fbs_getBusinessSettings(businessId: Long): Either[CommonError,GetBusinessSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignResponse
        */
        def Fbs_getCampaign(campaignId: Long): Either[CommonError,GetCampaignResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignLoginsResponse
        */
        def Fbs_getCampaignLogins(campaignId: Long): Either[CommonError,GetCampaignLoginsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignOffersResponse
        */
        def Fbs_getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Fbs_getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignRegionResponse
        */
        def Fbs_getCampaignRegion(campaignId: Long): Either[CommonError,GetCampaignRegionResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignSettingsResponse
        */
        def Fbs_getCampaignSettings(campaignId: Long): Either[CommonError,GetCampaignSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Fbs_getCampaigns(page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Fbs_getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesMaxSaleQuantumResponse
        */
        def Fbs_getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Either[CommonError,GetCategoriesMaxSaleQuantumResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesResponse
        */
        def Fbs_getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Either[CommonError,GetCategoriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoryContentParametersResponse
        */
        def Fbs_getCategoryContentParameters(categoryId: Long): Either[CommonError,GetCategoryContentParametersResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatHistoryResponse
        */
        def Fbs_getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatsResponse
        */
        def Fbs_getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetDeliveryServicesResponse
        */
        def Fbs_getDeliveryServices(): Either[CommonError,GetDeliveryServicesResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedResponse
        */
        def Fbs_getFeed(campaignId: Long, feedId: Long): Either[CommonError,GetFeedResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedIndexLogsResponse
        */
        def Fbs_getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]): Either[CommonError,GetFeedIndexLogsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedbackListResponse
        */
        def Fbs_getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDateTime]): Either[CommonError,GetFeedbackListResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedsResponse
        */
        def Fbs_getFeeds(campaignId: Long): Either[CommonError,GetFeedsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackCommentsResponse
        */
        def Fbs_getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetGoodsFeedbackCommentsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackResponse
        */
        def Fbs_getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest): Either[CommonError,GetGoodsFeedbackResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsStatsResponse
        */
        def Fbs_getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Either[CommonError,GetGoodsStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetHiddenOffersResponse
        */
        def Fbs_getHiddenOffers(campaignId: Long, offerId: Seq[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetHiddenOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferCardsContentStatusResponse
        */
        def Fbs_getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest): Either[CommonError,GetOfferCardsContentStatusResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingEntriesResponse
        */
        def Fbs_getOfferMappingEntries(campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingsResponse
        */
        def Fbs_getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest): Either[CommonError,GetOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferRecommendationsResponse
        */
        def Fbs_getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOffersResponse
        */
        def Fbs_getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderResponse
        */
        def Fbs_getOrder(campaignId: Long, orderId: Long): Either[CommonError,GetOrderResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessBuyerInfoResponse
        */
        def Fbs_getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessDocumentsInfoResponse
        */
        def Fbs_getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessDocumentsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderLabelsDataResponse
        */
        def Fbs_getOrderLabelsData(campaignId: Long, orderId: Long): Either[CommonError,GetOrderLabelsDataResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersResponse
        */
        def Fbs_getOrders(campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOrdersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersStatsResponse
        */
        def Fbs_getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: GetOrdersStatsRequest): Either[CommonError,GetOrdersStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesResponse
        */
        def Fbs_getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): Either[CommonError,GetPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesByOfferIdsResponse
        */
        def Fbs_getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest): Either[CommonError,GetPricesByOfferIdsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromoOffersResponse
        */
        def Fbs_getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetPromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromosResponse
        */
        def Fbs_getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Either[CommonError,GetPromosResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingDetailsResponse
        */
        def Fbs_getQualityRatingDetails(campaignId: Long): Either[CommonError,GetQualityRatingDetailsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingResponse
        */
        def Fbs_getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Either[CommonError,GetQualityRatingResponse] = Left(TODO)

        /**
        * 
        * @return A GetReportInfoResponse
        */
        def Fbs_getReportInfo(reportId: String): Either[CommonError,GetReportInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetReturnResponse
        */
        def Fbs_getReturn(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,GetReturnResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fbs_getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetReturnsResponse
        */
        def Fbs_getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]): Either[CommonError,GetReturnsResponse] = Left(TODO)

        /**
        * 
        * @return A GetShipmentResponse
        */
        def Fbs_getShipment(campaignId: Long, shipmentId: Long, cancelledOrders: Option[Boolean]): Either[CommonError,GetShipmentResponse] = Left(TODO)

        /**
        * 
        * @return A GetShipmentOrdersInfoResponse
        */
        def Fbs_getShipmentOrdersInfo(campaignId: Long, shipmentId: Long): Either[CommonError,GetShipmentOrdersInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehouseStocksResponse
        */
        def Fbs_getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: GetWarehouseStocksRequest): Either[CommonError,GetWarehouseStocksResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingEntriesResponse
        */
        def Fbs_getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Either[CommonError,GetSuggestedOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingsResponse
        */
        def Fbs_getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Either[CommonError,GetSuggestedOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A SuggestPricesResponse
        */
        def Fbs_getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Either[CommonError,SuggestPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehousesResponse
        */
        def Fbs_getWarehouses(businessId: Long): Either[CommonError,GetWarehousesResponse] = Left(TODO)

        /**
        * 
        * @return A ProvideOrderItemIdentifiersResponse
        */
        def Fbs_provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): Either[CommonError,ProvideOrderItemIdentifiersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_refreshFeed(campaignId: Long, feedId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionWithChildrenResponse
        */
        def Fbs_searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetRegionWithChildrenResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Fbs_searchRegionsById(regionId: Long): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Fbs_searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A SearchShipmentsResponse
        */
        def Fbs_searchShipments(campaignId: Long, searchShipmentsRequest: SearchShipmentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,SearchShipmentsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_sendFileToChat(businessId: Long, chatId: Long, file: FileUpload): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderBoxLayoutResponse
        */
        def Fbs_setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): Either[CommonError,SetOrderBoxLayoutResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderShipmentBoxesResponse
        */
        def Fbs_setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): Either[CommonError,SetOrderShipmentBoxesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_setShipmentPalletsCount(campaignId: Long, shipmentId: Long, setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_transferOrdersFromShipment(campaignId: Long, shipmentId: Long, transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateGoodsFeedbackCommentResponse
        */
        def Fbs_updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Either[CommonError,UpdateGoodsFeedbackCommentResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferContentResponse
        */
        def Fbs_updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Either[CommonError,UpdateOfferContentResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferMappingsResponse
        */
        def Fbs_updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Either[CommonError,UpdateOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Fbs_updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusResponse
        */
        def Fbs_updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): Either[CommonError,UpdateOrderStatusResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusesResponse
        */
        def Fbs_updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): Either[CommonError,UpdateOrderStatusesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdatePromoOffersResponse
        */
        def Fbs_updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Either[CommonError,UpdatePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fbs_updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A AddOffersToArchiveResponse
        */
        def Fby_addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Either[CommonError,AddOffersToArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A CalculateTariffsResponse
        */
        def Fby_calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): Either[CommonError,CalculateTariffsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A CreateChatResponse
        */
        def Fby_createChat(businessId: Long, createChatRequest: CreateChatRequest): Either[CommonError,CreateChatResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteCampaignOffersResponse
        */
        def Fby_deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Either[CommonError,DeleteCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersResponse
        */
        def Fby_deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Either[CommonError,DeleteOffersResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteOffersFromArchiveResponse
        */
        def Fby_deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Either[CommonError,DeleteOffersFromArchiveResponse] = Left(TODO)

        /**
        * 
        * @return A DeletePromoOffersResponse
        */
        def Fby_deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Either[CommonError,DeletePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateGoodsMovementReport(generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateGoodsTurnoverReport(generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Fby_generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GetAllOffersResponse
        */
        def Fby_getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): Either[CommonError,GetAllOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsInfoResponse
        */
        def Fby_getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest): Either[CommonError,GetBidsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBidsRecommendationsResponse
        */
        def Fby_getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Either[CommonError,GetBidsRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Fby_getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessSettingsResponse
        */
        def Fby_getBusinessSettings(businessId: Long): Either[CommonError,GetBusinessSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignResponse
        */
        def Fby_getCampaign(campaignId: Long): Either[CommonError,GetCampaignResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignLoginsResponse
        */
        def Fby_getCampaignLogins(campaignId: Long): Either[CommonError,GetCampaignLoginsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignOffersResponse
        */
        def Fby_getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def Fby_getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignRegionResponse
        */
        def Fby_getCampaignRegion(campaignId: Long): Either[CommonError,GetCampaignRegionResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignSettingsResponse
        */
        def Fby_getCampaignSettings(campaignId: Long): Either[CommonError,GetCampaignSettingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Fby_getCampaigns(page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignsResponse
        */
        def Fby_getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetCampaignsResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesMaxSaleQuantumResponse
        */
        def Fby_getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Either[CommonError,GetCategoriesMaxSaleQuantumResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoriesResponse
        */
        def Fby_getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Either[CommonError,GetCategoriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetCategoryContentParametersResponse
        */
        def Fby_getCategoryContentParameters(categoryId: Long): Either[CommonError,GetCategoryContentParametersResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatHistoryResponse
        */
        def Fby_getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatHistoryResponse] = Left(TODO)

        /**
        * 
        * @return A GetChatsResponse
        */
        def Fby_getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetChatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedResponse
        */
        def Fby_getFeed(campaignId: Long, feedId: Long): Either[CommonError,GetFeedResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedIndexLogsResponse
        */
        def Fby_getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]): Either[CommonError,GetFeedIndexLogsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedbackListResponse
        */
        def Fby_getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDateTime]): Either[CommonError,GetFeedbackListResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedsResponse
        */
        def Fby_getFeeds(campaignId: Long): Either[CommonError,GetFeedsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFulfillmentWarehousesResponse
        */
        def Fby_getFulfillmentWarehouses(): Either[CommonError,GetFulfillmentWarehousesResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackCommentsResponse
        */
        def Fby_getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetGoodsFeedbackCommentsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackResponse
        */
        def Fby_getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest): Either[CommonError,GetGoodsFeedbackResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsStatsResponse
        */
        def Fby_getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Either[CommonError,GetGoodsStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetHiddenOffersResponse
        */
        def Fby_getHiddenOffers(campaignId: Long, offerId: Seq[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetHiddenOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferCardsContentStatusResponse
        */
        def Fby_getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest): Either[CommonError,GetOfferCardsContentStatusResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingEntriesResponse
        */
        def Fby_getOfferMappingEntries(campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingsResponse
        */
        def Fby_getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest): Either[CommonError,GetOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferRecommendationsResponse
        */
        def Fby_getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOffersResponse
        */
        def Fby_getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderResponse
        */
        def Fby_getOrder(campaignId: Long, orderId: Long): Either[CommonError,GetOrderResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessBuyerInfoResponse
        */
        def Fby_getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessDocumentsInfoResponse
        */
        def Fby_getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessDocumentsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersResponse
        */
        def Fby_getOrders(campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOrdersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersStatsResponse
        */
        def Fby_getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: GetOrdersStatsRequest): Either[CommonError,GetOrdersStatsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesResponse
        */
        def Fby_getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): Either[CommonError,GetPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesByOfferIdsResponse
        */
        def Fby_getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest): Either[CommonError,GetPricesByOfferIdsResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromoOffersResponse
        */
        def Fby_getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetPromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromosResponse
        */
        def Fby_getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Either[CommonError,GetPromosResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingResponse
        */
        def Fby_getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Either[CommonError,GetQualityRatingResponse] = Left(TODO)

        /**
        * 
        * @return A GetReportInfoResponse
        */
        def Fby_getReportInfo(reportId: String): Either[CommonError,GetReportInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetReturnResponse
        */
        def Fby_getReturn(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,GetReturnResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Fby_getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetReturnsResponse
        */
        def Fby_getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]): Either[CommonError,GetReturnsResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehouseStocksResponse
        */
        def Fby_getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: GetWarehouseStocksRequest): Either[CommonError,GetWarehouseStocksResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingEntriesResponse
        */
        def Fby_getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Either[CommonError,GetSuggestedOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingsResponse
        */
        def Fby_getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Either[CommonError,GetSuggestedOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A SuggestPricesResponse
        */
        def Fby_getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Either[CommonError,SuggestPricesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_refreshFeed(campaignId: Long, feedId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionWithChildrenResponse
        */
        def Fby_searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetRegionWithChildrenResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Fby_searchRegionsById(regionId: Long): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Fby_searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_sendFileToChat(businessId: Long, chatId: Long, file: FileUpload): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateGoodsFeedbackCommentResponse
        */
        def Fby_updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Either[CommonError,UpdateGoodsFeedbackCommentResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferContentResponse
        */
        def Fby_updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Either[CommonError,UpdateOfferContentResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOfferMappingsResponse
        */
        def Fby_updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Either[CommonError,UpdateOfferMappingsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Fby_updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdatePromoOffersResponse
        */
        def Fby_updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Either[CommonError,UpdatePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedbackListResponse
        */
        def Feedbacks_getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDateTime]): Either[CommonError,GetFeedbackListResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedResponse
        */
        def Feeds_getFeed(campaignId: Long, feedId: Long): Either[CommonError,GetFeedResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedIndexLogsResponse
        */
        def Feeds_getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]): Either[CommonError,GetFeedIndexLogsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFeedsResponse
        */
        def Feeds_getFeeds(campaignId: Long): Either[CommonError,GetFeedsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Feeds_refreshFeed(campaignId: Long, feedId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Feeds_setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def GoodsFeedback_deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackCommentsResponse
        */
        def GoodsFeedback_getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetGoodsFeedbackCommentsResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsFeedbackResponse
        */
        def GoodsFeedback_getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest): Either[CommonError,GetGoodsFeedbackResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def GoodsFeedback_skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateGoodsFeedbackCommentResponse
        */
        def GoodsFeedback_updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Either[CommonError,UpdateGoodsFeedbackCommentResponse] = Left(TODO)

        /**
        * 
        * @return A GetGoodsStatsResponse
        */
        def GoodsStats_getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Either[CommonError,GetGoodsStatsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def HiddenOffers_addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def HiddenOffers_deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetHiddenOffersResponse
        */
        def HiddenOffers_getHiddenOffers(campaignId: Long, offerId: Seq[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetHiddenOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsResponse
        */
        def Models_getModel(modelId: Long, regionId: Long, currency: Option[CurrencyType]): Either[CommonError,GetModelsResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsOffersResponse
        */
        def Models_getModelOffers(modelId: Long, regionId: Long, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType], count: Option[Int], page: Option[Int]): Either[CommonError,GetModelsOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsResponse
        */
        def Models_getModels(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType]): Either[CommonError,GetModelsResponse] = Left(TODO)

        /**
        * 
        * @return A GetModelsOffersResponse
        */
        def Models_getModelsOffers(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType]): Either[CommonError,GetModelsOffersResponse] = Left(TODO)

        /**
        * 
        * @return A SearchModelsResponse
        */
        def Models_searchModels(query: String, regionId: Long, currency: Option[CurrencyType], page: Option[Int], pageSize: Option[Int]): Either[CommonError,SearchModelsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferMappingEntriesResponse
        */
        def OfferMappings_getOfferMappingEntries(campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A GetSuggestedOfferMappingEntriesResponse
        */
        def OfferMappings_getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Either[CommonError,GetSuggestedOfferMappingEntriesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def OfferMappings_updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteCampaignOffersResponse
        */
        def Offers_deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Either[CommonError,DeleteCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetAllOffersResponse
        */
        def Offers_getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): Either[CommonError,GetAllOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetCampaignOffersResponse
        */
        def Offers_getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetCampaignOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetOfferRecommendationsResponse
        */
        def Offers_getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOfferRecommendationsResponse] = Left(TODO)

        /**
        * 
        * @return A GetOffersResponse
        */
        def Offers_getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetOffersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Offers_updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessBuyerInfoResponse
        */
        def OrderBusinessInformation_getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessDocumentsInfoResponse
        */
        def OrderBusinessInformation_getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Either[CommonError,GetBusinessDocumentsInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderBuyerInfoResponse
        */
        def OrderDelivery_getOrderBuyerInfo(campaignId: Long, orderId: Long): Either[CommonError,GetOrderBuyerInfoResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def OrderDelivery_setOrderDeliveryDate(campaignId: Long, orderId: Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def OrderDelivery_setOrderDeliveryTrackCode(campaignId: Long, orderId: Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def OrderDelivery_updateOrderStorageLimit(campaignId: Long, orderId: Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A VerifyOrderEacResponse
        */
        def OrderDelivery_verifyOrderEac(campaignId: Long, orderId: Long, verifyOrderEacRequest: VerifyOrderEacRequest): Either[CommonError,VerifyOrderEacResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def OrderLabels_generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def OrderLabels_generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetOrderLabelsDataResponse
        */
        def OrderLabels_getOrderLabelsData(campaignId: Long, orderId: Long): Either[CommonError,GetOrderLabelsDataResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Orders_acceptOrderCancellation(campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrderResponse
        */
        def Orders_getOrder(campaignId: Long, orderId: Long): Either[CommonError,GetOrderResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersResponse
        */
        def Orders_getOrders(campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetOrdersResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Orders_provideOrderDigitalCodes(campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A ProvideOrderItemIdentifiersResponse
        */
        def Orders_provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): Either[CommonError,ProvideOrderItemIdentifiersResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderBoxLayoutResponse
        */
        def Orders_setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): Either[CommonError,SetOrderBoxLayoutResponse] = Left(TODO)

        /**
        * 
        * @return A SetOrderShipmentBoxesResponse
        */
        def Orders_setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): Either[CommonError,SetOrderShipmentBoxesResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Orders_updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusResponse
        */
        def Orders_updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): Either[CommonError,UpdateOrderStatusResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateOrderStatusesResponse
        */
        def Orders_updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): Either[CommonError,UpdateOrderStatusesResponse] = Left(TODO)

        /**
        * 
        * @return A GetOrdersStatsResponse
        */
        def OrdersStats_getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: GetOrdersStatsRequest): Either[CommonError,GetOrdersStatsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def OutletLicenses_deleteOutletLicenses(campaignId: Long, ids: Seq[Long]): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetOutletLicensesResponse
        */
        def OutletLicenses_getOutletLicenses(campaignId: Long, outletIds: Seq[Long], ids: Seq[Long]): Either[CommonError,GetOutletLicensesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def OutletLicenses_updateOutletLicenses(campaignId: Long, updateOutletLicenseRequest: UpdateOutletLicenseRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A CreateOutletResponse
        */
        def Outlets_createOutlet(campaignId: Long, changeOutletRequest: ChangeOutletRequest): Either[CommonError,CreateOutletResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Outlets_deleteOutlet(campaignId: Long, outletId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetOutletResponse
        */
        def Outlets_getOutlet(campaignId: Long, outletId: Long): Either[CommonError,GetOutletResponse] = Left(TODO)

        /**
        * 
        * @return A GetOutletsResponse
        */
        def Outlets_getOutlets(campaignId: Long, pageToken: Option[String], regionId: Option[Long], shopOutletCode: Option[String], regionId2: Option[Long]): Either[CommonError,GetOutletsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Outlets_updateOutlet(campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def PriceQuarantine_confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def PriceQuarantine_confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def PriceQuarantine_getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetQuarantineOffersResponse
        */
        def PriceQuarantine_getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetQuarantineOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesResponse
        */
        def Prices_getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): Either[CommonError,GetPricesResponse] = Left(TODO)

        /**
        * 
        * @return A GetPricesByOfferIdsResponse
        */
        def Prices_getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest): Either[CommonError,GetPricesByOfferIdsResponse] = Left(TODO)

        /**
        * 
        * @return A SuggestPricesResponse
        */
        def Prices_getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Either[CommonError,SuggestPricesResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Prices_updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Prices_updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A DeletePromoOffersResponse
        */
        def Promos_deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Either[CommonError,DeletePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromoOffersResponse
        */
        def Promos_getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetPromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetPromosResponse
        */
        def Promos_getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Either[CommonError,GetPromosResponse] = Left(TODO)

        /**
        * 
        * @return A UpdatePromoOffersResponse
        */
        def Promos_updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Either[CommonError,UpdatePromoOffersResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingDetailsResponse
        */
        def Ratings_getQualityRatingDetails(campaignId: Long): Either[CommonError,GetQualityRatingDetailsResponse] = Left(TODO)

        /**
        * 
        * @return A GetQualityRatingResponse
        */
        def Ratings_getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Either[CommonError,GetQualityRatingResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionWithChildrenResponse
        */
        def Regions_searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): Either[CommonError,GetRegionWithChildrenResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Regions_searchRegionsById(regionId: Long): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A GetRegionsResponse
        */
        def Regions_searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): Either[CommonError,GetRegionsResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateGoodsMovementReport(generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateGoodsTurnoverReport(generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GenerateReportResponse
        */
        def Reports_generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): Either[CommonError,GenerateReportResponse] = Left(TODO)

        /**
        * 
        * @return A GetReportInfoResponse
        */
        def Reports_getReportInfo(reportId: String): Either[CommonError,GetReportInfoResponse] = Left(TODO)

        /**
        * 
        * @return A GetReturnResponse
        */
        def Returns_getReturn(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,GetReturnResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Returns_getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Returns_getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetReturnsResponse
        */
        def Returns_getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]): Either[CommonError,GetReturnsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Returns_setReturnDecision(campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Returns_submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Shipments_confirmShipment(campaignId: Long, shipmentId: Long, confirmShipmentRequest: ConfirmShipmentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Shipments_downloadShipmentAct(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Shipments_downloadShipmentDiscrepancyAct(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Shipments_downloadShipmentInboundAct(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Shipments_downloadShipmentPalletLabels(campaignId: Long, shipmentId: Long, format: Option[ShipmentPalletLabelPageFormatType]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Shipments_downloadShipmentReceptionTransferAct(campaignId: Long, warehouseId: Option[Int]): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Shipments_downloadShipmentTransportationWaybill(campaignId: Long, shipmentId: Long): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A GetShipmentResponse
        */
        def Shipments_getShipment(campaignId: Long, shipmentId: Long, cancelledOrders: Option[Boolean]): Either[CommonError,GetShipmentResponse] = Left(TODO)

        /**
        * 
        * @return A GetShipmentOrdersInfoResponse
        */
        def Shipments_getShipmentOrdersInfo(campaignId: Long, shipmentId: Long): Either[CommonError,GetShipmentOrdersInfoResponse] = Left(TODO)

        /**
        * 
        * @return A SearchShipmentsResponse
        */
        def Shipments_searchShipments(campaignId: Long, searchShipmentsRequest: SearchShipmentsRequest, pageToken: Option[String], limit: Option[Int]): Either[CommonError,SearchShipmentsResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Shipments_setShipmentPalletsCount(campaignId: Long, shipmentId: Long, setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Shipments_transferOrdersFromShipment(campaignId: Long, shipmentId: Long, transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehouseStocksResponse
        */
        def Stocks_getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: GetWarehouseStocksRequest): Either[CommonError,GetWarehouseStocksResponse] = Left(TODO)

        /**
        * 
        * @return A EmptyApiResponse
        */
        def Stocks_updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): Either[CommonError,EmptyApiResponse] = Left(TODO)

        /**
        * 
        * @return A CalculateTariffsResponse
        */
        def Tariffs_calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): Either[CommonError,CalculateTariffsResponse] = Left(TODO)

        /**
        * 
        * @return A GetFulfillmentWarehousesResponse
        */
        def Warehouses_getFulfillmentWarehouses(): Either[CommonError,GetFulfillmentWarehousesResponse] = Left(TODO)

        /**
        * 
        * @return A GetWarehousesResponse
        */
        def Warehouses_getWarehouses(businessId: Long): Either[CommonError,GetWarehousesResponse] = Left(TODO)

}