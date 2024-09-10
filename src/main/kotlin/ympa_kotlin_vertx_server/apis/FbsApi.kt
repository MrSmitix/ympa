package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.AddHiddenOffersRequest
import ympa_kotlin_vertx_server.models.AddOffersToArchiveRequest
import ympa_kotlin_vertx_server.models.AddOffersToArchiveResponse
import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.CalculateTariffsRequest
import ympa_kotlin_vertx_server.models.CalculateTariffsResponse
import ympa_kotlin_vertx_server.models.ConfirmPricesRequest
import ympa_kotlin_vertx_server.models.ConfirmShipmentRequest
import ympa_kotlin_vertx_server.models.CreateChatRequest
import ympa_kotlin_vertx_server.models.CreateChatResponse
import ympa_kotlin_vertx_server.models.CurrencyType
import ympa_kotlin_vertx_server.models.DeleteCampaignOffersRequest
import ympa_kotlin_vertx_server.models.DeleteCampaignOffersResponse
import ympa_kotlin_vertx_server.models.DeleteGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.DeleteHiddenOffersRequest
import ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveRequest
import ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveResponse
import ympa_kotlin_vertx_server.models.DeleteOffersRequest
import ympa_kotlin_vertx_server.models.DeleteOffersResponse
import ympa_kotlin_vertx_server.models.DeletePromoOffersRequest
import ympa_kotlin_vertx_server.models.DeletePromoOffersResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.FeedIndexLogsStatusType
import ympa_kotlin_vertx_server.models.GenerateBoostConsolidatedRequest
import ympa_kotlin_vertx_server.models.GenerateCompetitorsPositionReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsFeedbackRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsRealizationReportRequest
import ympa_kotlin_vertx_server.models.GenerateMassOrderLabelsRequest
import ympa_kotlin_vertx_server.models.GeneratePricesReportRequest
import ympa_kotlin_vertx_server.models.GenerateReportResponse
import ympa_kotlin_vertx_server.models.GenerateShelfsStatisticsRequest
import ympa_kotlin_vertx_server.models.GenerateShipmentListDocumentReportRequest
import ympa_kotlin_vertx_server.models.GenerateShowsSalesReportRequest
import ympa_kotlin_vertx_server.models.GenerateStocksOnWarehousesReportRequest
import ympa_kotlin_vertx_server.models.GenerateUnitedMarketplaceServicesReportRequest
import ympa_kotlin_vertx_server.models.GenerateUnitedNettingReportRequest
import ympa_kotlin_vertx_server.models.GenerateUnitedOrdersRequest
import ympa_kotlin_vertx_server.models.GetAllOffersResponse
import ympa_kotlin_vertx_server.models.GetBidsInfoRequest
import ympa_kotlin_vertx_server.models.GetBidsInfoResponse
import ympa_kotlin_vertx_server.models.GetBidsRecommendationsRequest
import ympa_kotlin_vertx_server.models.GetBidsRecommendationsResponse
import ympa_kotlin_vertx_server.models.GetBusinessBuyerInfoResponse
import ympa_kotlin_vertx_server.models.GetBusinessDocumentsInfoResponse
import ympa_kotlin_vertx_server.models.GetBusinessSettingsResponse
import ympa_kotlin_vertx_server.models.GetCampaignLoginsResponse
import ympa_kotlin_vertx_server.models.GetCampaignOffersRequest
import ympa_kotlin_vertx_server.models.GetCampaignOffersResponse
import ympa_kotlin_vertx_server.models.GetCampaignRegionResponse
import ympa_kotlin_vertx_server.models.GetCampaignResponse
import ympa_kotlin_vertx_server.models.GetCampaignSettingsResponse
import ympa_kotlin_vertx_server.models.GetCampaignsResponse
import ympa_kotlin_vertx_server.models.GetCategoriesMaxSaleQuantumRequest
import ympa_kotlin_vertx_server.models.GetCategoriesMaxSaleQuantumResponse
import ympa_kotlin_vertx_server.models.GetCategoriesRequest
import ympa_kotlin_vertx_server.models.GetCategoriesResponse
import ympa_kotlin_vertx_server.models.GetCategoryContentParametersResponse
import ympa_kotlin_vertx_server.models.GetChatHistoryRequest
import ympa_kotlin_vertx_server.models.GetChatHistoryResponse
import ympa_kotlin_vertx_server.models.GetChatsRequest
import ympa_kotlin_vertx_server.models.GetChatsResponse
import ympa_kotlin_vertx_server.models.GetDeliveryServicesResponse
import ympa_kotlin_vertx_server.models.GetFeedIndexLogsResponse
import ympa_kotlin_vertx_server.models.GetFeedResponse
import ympa_kotlin_vertx_server.models.GetFeedbackListResponse
import ympa_kotlin_vertx_server.models.GetFeedsResponse
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsRequest
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsResponse
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackRequest
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackResponse
import ympa_kotlin_vertx_server.models.GetGoodsStatsRequest
import ympa_kotlin_vertx_server.models.GetGoodsStatsResponse
import ympa_kotlin_vertx_server.models.GetHiddenOffersResponse
import ympa_kotlin_vertx_server.models.GetOfferCardsContentStatusRequest
import ympa_kotlin_vertx_server.models.GetOfferCardsContentStatusResponse
import ympa_kotlin_vertx_server.models.GetOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.GetOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetOfferMappingsResponse
import ympa_kotlin_vertx_server.models.GetOfferRecommendationsRequest
import ympa_kotlin_vertx_server.models.GetOfferRecommendationsResponse
import ympa_kotlin_vertx_server.models.GetOffersResponse
import ympa_kotlin_vertx_server.models.GetOrderLabelsDataResponse
import ympa_kotlin_vertx_server.models.GetOrderResponse
import ympa_kotlin_vertx_server.models.GetOrdersResponse
import ympa_kotlin_vertx_server.models.GetOrdersStatsRequest
import ympa_kotlin_vertx_server.models.GetOrdersStatsResponse
import ympa_kotlin_vertx_server.models.GetPricesByOfferIdsRequest
import ympa_kotlin_vertx_server.models.GetPricesByOfferIdsResponse
import ympa_kotlin_vertx_server.models.GetPricesResponse
import ympa_kotlin_vertx_server.models.GetPromoOffersRequest
import ympa_kotlin_vertx_server.models.GetPromoOffersResponse
import ympa_kotlin_vertx_server.models.GetPromosRequest
import ympa_kotlin_vertx_server.models.GetPromosResponse
import ympa_kotlin_vertx_server.models.GetQualityRatingDetailsResponse
import ympa_kotlin_vertx_server.models.GetQualityRatingRequest
import ympa_kotlin_vertx_server.models.GetQualityRatingResponse
import ympa_kotlin_vertx_server.models.GetQuarantineOffersRequest
import ympa_kotlin_vertx_server.models.GetQuarantineOffersResponse
import ympa_kotlin_vertx_server.models.GetRegionWithChildrenResponse
import ympa_kotlin_vertx_server.models.GetRegionsResponse
import ympa_kotlin_vertx_server.models.GetReportInfoResponse
import ympa_kotlin_vertx_server.models.GetReturnResponse
import ympa_kotlin_vertx_server.models.GetReturnsResponse
import ympa_kotlin_vertx_server.models.GetShipmentOrdersInfoResponse
import ympa_kotlin_vertx_server.models.GetShipmentResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsResponse
import ympa_kotlin_vertx_server.models.GetWarehouseStocksRequest
import ympa_kotlin_vertx_server.models.GetWarehouseStocksResponse
import ympa_kotlin_vertx_server.models.GetWarehousesResponse
import ympa_kotlin_vertx_server.models.OfferAvailabilityStatusType
import ympa_kotlin_vertx_server.models.OfferMappingKindType
import ympa_kotlin_vertx_server.models.OfferProcessingStatusType
import ympa_kotlin_vertx_server.models.OrderBuyerType
import ympa_kotlin_vertx_server.models.OrderDeliveryDispatchType
import ympa_kotlin_vertx_server.models.OrderStatusType
import ympa_kotlin_vertx_server.models.OrderSubstatusType
import ympa_kotlin_vertx_server.models.PageFormatType
import ympa_kotlin_vertx_server.models.ProvideOrderItemIdentifiersRequest
import ympa_kotlin_vertx_server.models.ProvideOrderItemIdentifiersResponse
import ympa_kotlin_vertx_server.models.PutSkuBidsRequest
import ympa_kotlin_vertx_server.models.RefundStatusType
import ympa_kotlin_vertx_server.models.ReportFormatType
import ympa_kotlin_vertx_server.models.ReturnType
import ympa_kotlin_vertx_server.models.SearchShipmentsRequest
import ympa_kotlin_vertx_server.models.SearchShipmentsResponse
import ympa_kotlin_vertx_server.models.SendMessageToChatRequest
import ympa_kotlin_vertx_server.models.SetFeedParamsRequest
import ympa_kotlin_vertx_server.models.SetOrderBoxLayoutRequest
import ympa_kotlin_vertx_server.models.SetOrderBoxLayoutResponse
import ympa_kotlin_vertx_server.models.SetOrderShipmentBoxesRequest
import ympa_kotlin_vertx_server.models.SetOrderShipmentBoxesResponse
import ympa_kotlin_vertx_server.models.SetShipmentPalletsCountRequest
import ympa_kotlin_vertx_server.models.ShipmentPalletLabelPageFormatType
import ympa_kotlin_vertx_server.models.SkipGoodsFeedbackReactionRequest
import ympa_kotlin_vertx_server.models.SuggestPricesRequest
import ympa_kotlin_vertx_server.models.SuggestPricesResponse
import ympa_kotlin_vertx_server.models.TransferOrdersFromShipmentRequest
import ympa_kotlin_vertx_server.models.UpdateBusinessPricesRequest
import ympa_kotlin_vertx_server.models.UpdateCampaignOffersRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentResponse
import ympa_kotlin_vertx_server.models.UpdateOfferContentRequest
import ympa_kotlin_vertx_server.models.UpdateOfferContentResponse
import ympa_kotlin_vertx_server.models.UpdateOfferMappingEntryRequest
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsRequest
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsResponse
import ympa_kotlin_vertx_server.models.UpdateOrderItemRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStatusRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStatusResponse
import ympa_kotlin_vertx_server.models.UpdateOrderStatusesRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStatusesResponse
import ympa_kotlin_vertx_server.models.UpdatePricesRequest
import ympa_kotlin_vertx_server.models.UpdatePromoOffersRequest
import ympa_kotlin_vertx_server.models.UpdatePromoOffersResponse
import ympa_kotlin_vertx_server.models.UpdateStocksRequest
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface FbsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* addHiddenOffers
     * Скрытие товаров и настройки скрытия */
    suspend fun addHiddenOffers(campaignId:kotlin.Long?,addHiddenOffersRequest:AddHiddenOffersRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* addOffersToArchive
     * Добавление товаров в архив */
    suspend fun addOffersToArchive(businessId:kotlin.Long?,addOffersToArchiveRequest:AddOffersToArchiveRequest?,context:OperationRequest):Response<AddOffersToArchiveResponse>
    /* calculateTariffs
     * Калькулятор стоимости услуг */
    suspend fun calculateTariffs(calculateTariffsRequest:CalculateTariffsRequest?,context:OperationRequest):Response<CalculateTariffsResponse>
    /* confirmBusinessPrices
     * Удаление товара из карантина по цене в кабинете */
    suspend fun confirmBusinessPrices(businessId:kotlin.Long?,confirmPricesRequest:ConfirmPricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* confirmCampaignPrices
     * Удаление товара из карантина по цене в магазине */
    suspend fun confirmCampaignPrices(campaignId:kotlin.Long?,confirmPricesRequest:ConfirmPricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* confirmShipment
     * Подтверждение отгрузки */
    suspend fun confirmShipment(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,confirmShipmentRequest:ConfirmShipmentRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* createChat
     * Создание нового чата с покупателем */
    suspend fun createChat(businessId:kotlin.Long?,createChatRequest:CreateChatRequest?,context:OperationRequest):Response<CreateChatResponse>
    /* deleteCampaignOffers
     * Удаление товаров из ассортимента магазина */
    suspend fun deleteCampaignOffers(campaignId:kotlin.Long?,deleteCampaignOffersRequest:DeleteCampaignOffersRequest?,context:OperationRequest):Response<DeleteCampaignOffersResponse>
    /* deleteGoodsFeedbackComment
     * Удаление комментария к отзыву */
    suspend fun deleteGoodsFeedbackComment(businessId:kotlin.Long?,deleteGoodsFeedbackCommentRequest:DeleteGoodsFeedbackCommentRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* deleteHiddenOffers
     * Возобновление показа товаров */
    suspend fun deleteHiddenOffers(campaignId:kotlin.Long?,deleteHiddenOffersRequest:DeleteHiddenOffersRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* deleteOffers
     * Удаление товаров из каталога */
    suspend fun deleteOffers(businessId:kotlin.Long?,deleteOffersRequest:DeleteOffersRequest?,context:OperationRequest):Response<DeleteOffersResponse>
    /* deleteOffersFromArchive
     * Удаление товаров из архива */
    suspend fun deleteOffersFromArchive(businessId:kotlin.Long?,deleteOffersFromArchiveRequest:DeleteOffersFromArchiveRequest?,context:OperationRequest):Response<DeleteOffersFromArchiveResponse>
    /* deletePromoOffers
     * Удаление товаров из акции */
    suspend fun deletePromoOffers(businessId:kotlin.Long?,deletePromoOffersRequest:DeletePromoOffersRequest?,context:OperationRequest):Response<DeletePromoOffersResponse>
    /* downloadShipmentAct
     * Получение акта приема-передачи */
    suspend fun downloadShipmentAct(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentDiscrepancyAct
     * Получение акта расхождений */
    suspend fun downloadShipmentDiscrepancyAct(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentInboundAct
     * Получение фактического акта приема-передачи */
    suspend fun downloadShipmentInboundAct(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentPalletLabels
     * Ярлыки для доверительной приемки (FBS) */
    suspend fun downloadShipmentPalletLabels(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,format:ShipmentPalletLabelPageFormatType?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentReceptionTransferAct
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее */
    suspend fun downloadShipmentReceptionTransferAct(campaignId:kotlin.Long?,warehouseId:kotlin.Int?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentTransportationWaybill
     * Получение транспортной накладной */
    suspend fun downloadShipmentTransportationWaybill(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* generateBoostConsolidatedReport
     * Отчет по бусту продаж */
    suspend fun generateBoostConsolidatedReport(generateBoostConsolidatedRequest:GenerateBoostConsolidatedRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateCompetitorsPositionReport
     * Отчет «Конкурентная позиция» */
    suspend fun generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest:GenerateCompetitorsPositionReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateGoodsFeedbackReport
     * Отчет по отзывам о товарах */
    suspend fun generateGoodsFeedbackReport(generateGoodsFeedbackRequest:GenerateGoodsFeedbackRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateGoodsRealizationReport
     * Отчет по реализации */
    suspend fun generateGoodsRealizationReport(generateGoodsRealizationReportRequest:GenerateGoodsRealizationReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateMassOrderLabelsReport
     * Готовые ярлыки‑наклейки на все коробки в нескольких заказах */
    suspend fun generateMassOrderLabelsReport(generateMassOrderLabelsRequest:GenerateMassOrderLabelsRequest?,format:PageFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateOrderLabel
     * Готовый ярлык‑наклейка для коробки в заказе */
    suspend fun generateOrderLabel(campaignId:kotlin.Long?,orderId:kotlin.Long?,shipmentId:kotlin.Long?,boxId:kotlin.Long?,format:PageFormatType?,context:OperationRequest):Response<java.io.File>
    /* generateOrderLabels
     * Готовые ярлыки‑наклейки на все коробки в одном заказе */
    suspend fun generateOrderLabels(campaignId:kotlin.Long?,orderId:kotlin.Long?,format:PageFormatType?,context:OperationRequest):Response<java.io.File>
    /* generatePricesReport
     * Отчет «Цены на рынке» */
    suspend fun generatePricesReport(generatePricesReportRequest:GeneratePricesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateShelfsStatisticsReport
     * Отчет по полкам */
    suspend fun generateShelfsStatisticsReport(generateShelfsStatisticsRequest:GenerateShelfsStatisticsRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateShipmentListDocumentReport
     * Получение листа сборки */
    suspend fun generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest:GenerateShipmentListDocumentReportRequest?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateShowsSalesReport
     * Отчет «Аналитика продаж» */
    suspend fun generateShowsSalesReport(generateShowsSalesReportRequest:GenerateShowsSalesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateStocksOnWarehousesReport
     * Отчет по остаткам на складах */
    suspend fun generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest:GenerateStocksOnWarehousesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateUnitedMarketplaceServicesReport
     * Отчет по стоимости услуг */
    suspend fun generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest:GenerateUnitedMarketplaceServicesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateUnitedNettingReport
     * Отчет по платежам */
    suspend fun generateUnitedNettingReport(generateUnitedNettingReportRequest:GenerateUnitedNettingReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateUnitedOrdersReport
     * Отчет по заказам */
    suspend fun generateUnitedOrdersReport(generateUnitedOrdersRequest:GenerateUnitedOrdersRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* getAllOffers
     * Все предложения магазина */
    suspend fun getAllOffers(campaignId:kotlin.Long?,feedId:kotlin.Long?,chunk:kotlin.Int?,context:OperationRequest):Response<GetAllOffersResponse>
    /* getBidsInfoForBusiness
     * Информация об установленных ставках */
    suspend fun getBidsInfoForBusiness(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getBidsInfoRequest:GetBidsInfoRequest?,context:OperationRequest):Response<GetBidsInfoResponse>
    /* getBidsRecommendations
     * Рекомендованные ставки для заданных товаров */
    suspend fun getBidsRecommendations(businessId:kotlin.Long?,getBidsRecommendationsRequest:GetBidsRecommendationsRequest?,context:OperationRequest):Response<GetBidsRecommendationsResponse>
    /* getBusinessQuarantineOffers
     * Список товаров, находящихся в карантине по цене в кабинете */
    suspend fun getBusinessQuarantineOffers(businessId:kotlin.Long?,getQuarantineOffersRequest:GetQuarantineOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetQuarantineOffersResponse>
    /* getBusinessSettings
     * Настройки кабинета */
    suspend fun getBusinessSettings(businessId:kotlin.Long?,context:OperationRequest):Response<GetBusinessSettingsResponse>
    /* getCampaign
     * Информация о магазине */
    suspend fun getCampaign(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignResponse>
    /* getCampaignLogins
     * Логины, связанные с магазином */
    suspend fun getCampaignLogins(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignLoginsResponse>
    /* getCampaignOffers
     * Информация о товарах, которые размещены в заданном магазине */
    suspend fun getCampaignOffers(campaignId:kotlin.Long?,getCampaignOffersRequest:GetCampaignOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetCampaignOffersResponse>
    /* getCampaignQuarantineOffers
     * Список товаров, находящихся в карантине по цене в магазине */
    suspend fun getCampaignQuarantineOffers(campaignId:kotlin.Long?,getQuarantineOffersRequest:GetQuarantineOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetQuarantineOffersResponse>
    /* getCampaignRegion
     * Регион магазина */
    suspend fun getCampaignRegion(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignRegionResponse>
    /* getCampaignSettings
     * Настройки магазина */
    suspend fun getCampaignSettings(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignSettingsResponse>
    /* getCampaigns
     * Список магазинов пользователя */
    suspend fun getCampaigns(page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetCampaignsResponse>
    /* getCampaignsByLogin
     * Магазины, доступные логину */
    suspend fun getCampaignsByLogin(login:kotlin.String?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetCampaignsResponse>
    /* getCategoriesMaxSaleQuantum
     * Лимит на установку кванта продажи и минимального количества товаров в заказе */
    suspend fun getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest:GetCategoriesMaxSaleQuantumRequest?,context:OperationRequest):Response<GetCategoriesMaxSaleQuantumResponse>
    /* getCategoriesTree
     * Дерево категорий */
    suspend fun getCategoriesTree(getCategoriesRequest:GetCategoriesRequest?,context:OperationRequest):Response<GetCategoriesResponse>
    /* getCategoryContentParameters
     * Списки характеристик товаров по категориям */
    suspend fun getCategoryContentParameters(categoryId:kotlin.Long?,context:OperationRequest):Response<GetCategoryContentParametersResponse>
    /* getChatHistory
     * Получение истории сообщений в чате */
    suspend fun getChatHistory(businessId:kotlin.Long?,chatId:kotlin.Long?,getChatHistoryRequest:GetChatHistoryRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetChatHistoryResponse>
    /* getChats
     * Получение доступных чатов */
    suspend fun getChats(businessId:kotlin.Long?,getChatsRequest:GetChatsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetChatsResponse>
    /* getDeliveryServices
     * Справочник служб доставки */
    suspend fun getDeliveryServices(context:OperationRequest):Response<GetDeliveryServicesResponse>
    /* getFeed
     * Информация о прайс-листе */
    suspend fun getFeed(campaignId:kotlin.Long?,feedId:kotlin.Long?,context:OperationRequest):Response<GetFeedResponse>
    /* getFeedIndexLogs
     * Отчет по индексации прайс-листа */
    suspend fun getFeedIndexLogs(campaignId:kotlin.Long?,feedId:kotlin.Long?,limit:kotlin.Int?,publishedTimeFrom:java.time.OffsetDateTime?,publishedTimeTo:java.time.OffsetDateTime?,status:FeedIndexLogsStatusType?,context:OperationRequest):Response<GetFeedIndexLogsResponse>
    /* getFeedbackAndCommentUpdates
     * Новые и обновленные отзывы о магазине */
    suspend fun getFeedbackAndCommentUpdates(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,fromDate:java.time.LocalDate?,context:OperationRequest):Response<GetFeedbackListResponse>
    /* getFeeds
     * Список прайс-листов магазина */
    suspend fun getFeeds(campaignId:kotlin.Long?,context:OperationRequest):Response<GetFeedsResponse>
    /* getGoodsFeedbackComments
     * Получение комментариев к отзыву */
    suspend fun getGoodsFeedbackComments(businessId:kotlin.Long?,getGoodsFeedbackCommentsRequest:GetGoodsFeedbackCommentsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetGoodsFeedbackCommentsResponse>
    /* getGoodsFeedbacks
     * Получение отзывов о товарах продавца */
    suspend fun getGoodsFeedbacks(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getGoodsFeedbackRequest:GetGoodsFeedbackRequest?,context:OperationRequest):Response<GetGoodsFeedbackResponse>
    /* getGoodsStats
     * Отчет по товарам */
    suspend fun getGoodsStats(campaignId:kotlin.Long?,getGoodsStatsRequest:GetGoodsStatsRequest?,context:OperationRequest):Response<GetGoodsStatsResponse>
    /* getHiddenOffers
     * Информация о скрытых вами товарах */
    suspend fun getHiddenOffers(campaignId:kotlin.Long?,offerId:kotlin.Array<kotlin.String>?,pageToken:kotlin.String?,limit:kotlin.Int?,offset:kotlin.Int?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetHiddenOffersResponse>
    /* getOfferCardsContentStatus
     * Получение информации о заполненности карточек магазина */
    suspend fun getOfferCardsContentStatus(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getOfferCardsContentStatusRequest:GetOfferCardsContentStatusRequest?,context:OperationRequest):Response<GetOfferCardsContentStatusResponse>
    /* getOfferMappingEntries
     * Список товаров в каталоге */
    suspend fun getOfferMappingEntries(campaignId:kotlin.Long?,offerId:kotlin.Array<kotlin.String>?,shopSku:kotlin.Array<kotlin.String>?,mappingKind:OfferMappingKindType?,status:kotlin.Array<OfferProcessingStatusType>?,availability:kotlin.Array<OfferAvailabilityStatusType>?,categoryId:kotlin.Array<kotlin.Int>?,vendor:kotlin.Array<kotlin.String>?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetOfferMappingEntriesResponse>
    /* getOfferMappings
     * Информация о товарах в каталоге */
    suspend fun getOfferMappings(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getOfferMappingsRequest:GetOfferMappingsRequest?,context:OperationRequest):Response<GetOfferMappingsResponse>
    /* getOfferRecommendations
     * Рекомендации Маркета, касающиеся цен */
    suspend fun getOfferRecommendations(businessId:kotlin.Long?,getOfferRecommendationsRequest:GetOfferRecommendationsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetOfferRecommendationsResponse>
    /* getOffers
     * Предложения магазина */
    suspend fun getOffers(campaignId:kotlin.Long?,query:kotlin.String?,feedId:kotlin.Long?,shopCategoryId:kotlin.String?,currency:CurrencyType?,matched:kotlin.Boolean?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetOffersResponse>
    /* getOrder
     * Информация об одном заказе */
    suspend fun getOrder(campaignId:kotlin.Long?,orderId:kotlin.Long?,context:OperationRequest):Response<GetOrderResponse>
    /* getOrderBusinessBuyerInfo
     * Информация о покупателе — юридическом лице */
    suspend fun getOrderBusinessBuyerInfo(campaignId:kotlin.Long?,orderId:kotlin.Long?,context:OperationRequest):Response<GetBusinessBuyerInfoResponse>
    /* getOrderBusinessDocumentsInfo
     * Информация о документах */
    suspend fun getOrderBusinessDocumentsInfo(campaignId:kotlin.Long?,orderId:kotlin.Long?,context:OperationRequest):Response<GetBusinessDocumentsInfoResponse>
    /* getOrderLabelsData
     * Данные для самостоятельного изготовления ярлыков */
    suspend fun getOrderLabelsData(campaignId:kotlin.Long?,orderId:kotlin.Long?,context:OperationRequest):Response<GetOrderLabelsDataResponse>
    /* getOrders
     * Информация о нескольких заказах */
    suspend fun getOrders(campaignId:kotlin.Long?,orderIds:kotlin.Array<kotlin.Long>?,status:kotlin.collections.Set<OrderStatusType>?,substatus:kotlin.collections.Set<OrderSubstatusType>?,fromDate:java.time.LocalDate?,toDate:java.time.LocalDate?,supplierShipmentDateFrom:java.time.LocalDate?,supplierShipmentDateTo:java.time.LocalDate?,updatedAtFrom:java.time.OffsetDateTime?,updatedAtTo:java.time.OffsetDateTime?,dispatchType:OrderDeliveryDispatchType?,fake:kotlin.Boolean?,hasCis:kotlin.Boolean?,onlyWaitingForCancellationApprove:kotlin.Boolean?,onlyEstimatedDelivery:kotlin.Boolean?,buyerType:OrderBuyerType?,page:kotlin.Int?,pageSize:kotlin.Int?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetOrdersResponse>
    /* getOrdersStats
     * Детальная информация по заказам */
    suspend fun getOrdersStats(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getOrdersStatsRequest:GetOrdersStatsRequest?,context:OperationRequest):Response<GetOrdersStatsResponse>
    /* getPrices
     * Список цен */
    suspend fun getPrices(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,archived:kotlin.Boolean?,context:OperationRequest):Response<GetPricesResponse>
    /* getPricesByOfferIds
     * Просмотр цен на указанные товары в магазине */
    suspend fun getPricesByOfferIds(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getPricesByOfferIdsRequest:GetPricesByOfferIdsRequest?,context:OperationRequest):Response<GetPricesByOfferIdsResponse>
    /* getPromoOffers
     * Получение списка товаров, которые участвуют или могут участвовать в акции */
    suspend fun getPromoOffers(businessId:kotlin.Long?,getPromoOffersRequest:GetPromoOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetPromoOffersResponse>
    /* getPromos
     * Получение списка акций */
    suspend fun getPromos(businessId:kotlin.Long?,getPromosRequest:GetPromosRequest?,context:OperationRequest):Response<GetPromosResponse>
    /* getQualityRatingDetails
     * Заказы, которые повлияли на индекс качества */
    suspend fun getQualityRatingDetails(campaignId:kotlin.Long?,context:OperationRequest):Response<GetQualityRatingDetailsResponse>
    /* getQualityRatings
     * Индекс качества магазинов */
    suspend fun getQualityRatings(businessId:kotlin.Long?,getQualityRatingRequest:GetQualityRatingRequest?,context:OperationRequest):Response<GetQualityRatingResponse>
    /* getReportInfo
     * Получение заданного отчета */
    suspend fun getReportInfo(reportId:kotlin.String?,context:OperationRequest):Response<GetReportInfoResponse>
    /* getReturn
     * Информация о невыкупе или возврате */
    suspend fun getReturn(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,context:OperationRequest):Response<GetReturnResponse>
    /* getReturnApplication
     * Получение заявления на возврат */
    suspend fun getReturnApplication(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* getReturnPhoto
     * Получение фотографии возврата */
    suspend fun getReturnPhoto(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,itemId:kotlin.Long?,imageHash:kotlin.String?,context:OperationRequest):Response<java.io.File>
    /* getReturns
     * Список невыкупов и возвратов */
    suspend fun getReturns(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,orderIds:kotlin.Array<kotlin.Long>?,statuses:kotlin.Array<RefundStatusType>?,type:ReturnType?,fromDate:java.time.LocalDate?,toDate:java.time.LocalDate?,fromDate2:java.time.LocalDate?,toDate2:java.time.LocalDate?,context:OperationRequest):Response<GetReturnsResponse>
    /* getShipment
     * Получение информации об одной отгрузке */
    suspend fun getShipment(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,cancelledOrders:kotlin.Boolean?,context:OperationRequest):Response<GetShipmentResponse>
    /* getShipmentOrdersInfo
     * Получение информации о возможности печати ярлыков (FBS) */
    suspend fun getShipmentOrdersInfo(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<GetShipmentOrdersInfoResponse>
    /* getStocks
     * Информация об остатках и оборачиваемости */
    suspend fun getStocks(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getWarehouseStocksRequest:GetWarehouseStocksRequest?,context:OperationRequest):Response<GetWarehouseStocksResponse>
    /* getSuggestedOfferMappingEntries
     * Рекомендованные карточки для товаров */
    suspend fun getSuggestedOfferMappingEntries(campaignId:kotlin.Long?,getSuggestedOfferMappingEntriesRequest:GetSuggestedOfferMappingEntriesRequest?,context:OperationRequest):Response<GetSuggestedOfferMappingEntriesResponse>
    /* getSuggestedOfferMappings
     * Просмотр карточек на Маркете, которые подходят вашим товарам */
    suspend fun getSuggestedOfferMappings(businessId:kotlin.Long?,getSuggestedOfferMappingsRequest:GetSuggestedOfferMappingsRequest?,context:OperationRequest):Response<GetSuggestedOfferMappingsResponse>
    /* getSuggestedPrices
     * Цены для продвижения товаров */
    suspend fun getSuggestedPrices(campaignId:kotlin.Long?,suggestPricesRequest:SuggestPricesRequest?,context:OperationRequest):Response<SuggestPricesResponse>
    /* getWarehouses
     * Список складов и групп складов */
    suspend fun getWarehouses(businessId:kotlin.Long?,context:OperationRequest):Response<GetWarehousesResponse>
    /* provideOrderItemIdentifiers
     * Передача кодов маркировки единиц товара */
    suspend fun provideOrderItemIdentifiers(campaignId:kotlin.Long?,orderId:kotlin.Long?,provideOrderItemIdentifiersRequest:ProvideOrderItemIdentifiersRequest?,context:OperationRequest):Response<ProvideOrderItemIdentifiersResponse>
    /* putBidsForBusiness
     * Включение буста продаж и установка ставок */
    suspend fun putBidsForBusiness(businessId:kotlin.Long?,putSkuBidsRequest:PutSkuBidsRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* putBidsForCampaign
     * Включение буста продаж и установка ставок для магазина */
    suspend fun putBidsForCampaign(campaignId:kotlin.Long?,putSkuBidsRequest:PutSkuBidsRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* refreshFeed
     * Сообщить, что прайс-лист обновился */
    suspend fun refreshFeed(campaignId:kotlin.Long?,feedId:kotlin.Long?,context:OperationRequest):Response<EmptyApiResponse>
    /* searchRegionChildren
     * Информация о дочерних регионах */
    suspend fun searchRegionChildren(regionId:kotlin.Long?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetRegionWithChildrenResponse>
    /* searchRegionsById
     * Информация о регионе */
    suspend fun searchRegionsById(regionId:kotlin.Long?,context:OperationRequest):Response<GetRegionsResponse>
    /* searchRegionsByName
     * Поиск регионов по их имени */
    suspend fun searchRegionsByName(name:kotlin.String?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetRegionsResponse>
    /* searchShipments
     * Получение информации о нескольких отгрузках */
    suspend fun searchShipments(campaignId:kotlin.Long?,searchShipmentsRequest:SearchShipmentsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<SearchShipmentsResponse>
    /* sendFileToChat
     * Отправка файла в чат */
    suspend fun sendFileToChat(businessId:kotlin.Long?,chatId:kotlin.Long?,file:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<EmptyApiResponse>
    /* sendMessageToChat
     * Отправка сообщения в чат */
    suspend fun sendMessageToChat(businessId:kotlin.Long?,chatId:kotlin.Long?,sendMessageToChatRequest:SendMessageToChatRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* setFeedParams
     * Изменение параметров прайс-листа */
    suspend fun setFeedParams(campaignId:kotlin.Long?,feedId:kotlin.Long?,setFeedParamsRequest:SetFeedParamsRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* setOrderBoxLayout
     * Подготовка заказа */
    suspend fun setOrderBoxLayout(campaignId:kotlin.Long?,orderId:kotlin.Long?,setOrderBoxLayoutRequest:SetOrderBoxLayoutRequest?,context:OperationRequest):Response<SetOrderBoxLayoutResponse>
    /* setOrderShipmentBoxes
     * Передача количества грузовых мест в заказе */
    suspend fun setOrderShipmentBoxes(campaignId:kotlin.Long?,orderId:kotlin.Long?,shipmentId:kotlin.Long?,setOrderShipmentBoxesRequest:SetOrderShipmentBoxesRequest?,context:OperationRequest):Response<SetOrderShipmentBoxesResponse>
    /* setShipmentPalletsCount
     * Передача количества упаковок в отгрузке */
    suspend fun setShipmentPalletsCount(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,setShipmentPalletsCountRequest:SetShipmentPalletsCountRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* skipGoodsFeedbacksReaction
     * Отказ от ответа на отзывы */
    suspend fun skipGoodsFeedbacksReaction(businessId:kotlin.Long?,skipGoodsFeedbackReactionRequest:SkipGoodsFeedbackReactionRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* transferOrdersFromShipment
     * Перенос заказов в следующую отгрузку */
    suspend fun transferOrdersFromShipment(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,transferOrdersFromShipmentRequest:TransferOrdersFromShipmentRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updateBusinessPrices
     * Установка цен на товары во всех магазинах */
    suspend fun updateBusinessPrices(businessId:kotlin.Long?,updateBusinessPricesRequest:UpdateBusinessPricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updateCampaignOffers
     * Изменение условий продажи товаров в магазине */
    suspend fun updateCampaignOffers(campaignId:kotlin.Long?,updateCampaignOffersRequest:UpdateCampaignOffersRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updateGoodsFeedbackComment
     * Добавление нового или изменение созданного комментария */
    suspend fun updateGoodsFeedbackComment(businessId:kotlin.Long?,updateGoodsFeedbackCommentRequest:UpdateGoodsFeedbackCommentRequest?,context:OperationRequest):Response<UpdateGoodsFeedbackCommentResponse>
    /* updateOfferContent
     * Редактирование категорийных характеристик товара */
    suspend fun updateOfferContent(businessId:kotlin.Long?,updateOfferContentRequest:UpdateOfferContentRequest?,context:OperationRequest):Response<UpdateOfferContentResponse>
    /* updateOfferMappingEntries
     * Добавление и редактирование товаров в каталоге */
    suspend fun updateOfferMappingEntries(campaignId:kotlin.Long?,updateOfferMappingEntryRequest:UpdateOfferMappingEntryRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updateOfferMappings
     * Добавление товаров в каталог и изменение информации о них */
    suspend fun updateOfferMappings(businessId:kotlin.Long?,updateOfferMappingsRequest:UpdateOfferMappingsRequest?,context:OperationRequest):Response<UpdateOfferMappingsResponse>
    /* updateOrderItems
     * Удаление товара из заказа или уменьшение числа единиц */
    suspend fun updateOrderItems(campaignId:kotlin.Long?,orderId:kotlin.Long?,updateOrderItemRequest:UpdateOrderItemRequest?,context:OperationRequest):Response<Void>
    /* updateOrderStatus
     * Изменение статуса одного заказа */
    suspend fun updateOrderStatus(campaignId:kotlin.Long?,orderId:kotlin.Long?,updateOrderStatusRequest:UpdateOrderStatusRequest?,context:OperationRequest):Response<UpdateOrderStatusResponse>
    /* updateOrderStatuses
     * Изменение статусов нескольких заказов */
    suspend fun updateOrderStatuses(campaignId:kotlin.Long?,updateOrderStatusesRequest:UpdateOrderStatusesRequest?,context:OperationRequest):Response<UpdateOrderStatusesResponse>
    /* updatePrices
     * Установка цен на товары в конкретном магазине */
    suspend fun updatePrices(campaignId:kotlin.Long?,updatePricesRequest:UpdatePricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updatePromoOffers
     * Добавление товаров в акцию или изменение их цен */
    suspend fun updatePromoOffers(businessId:kotlin.Long?,updatePromoOffersRequest:UpdatePromoOffersRequest?,context:OperationRequest):Response<UpdatePromoOffersResponse>
    /* updateStocks
     * Передача информации об остатках */
    suspend fun updateStocks(campaignId:kotlin.Long?,updateStocksRequest:UpdateStocksRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "FbsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in FbsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(FbsApi::class.java, address)
            return routerFactory
        }
    }
}
