package ympa_kotlin_vertx_server.apis

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.ApiHandlerUtils
import io.vertx.serviceproxy.ProxyHandler
import io.vertx.serviceproxy.ServiceException
import io.vertx.serviceproxy.ServiceExceptionMessageCodec
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.vertx.kotlin.coroutines.dispatcher
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
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
import ympa_kotlin_vertx_server.models.GenerateGoodsMovementReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsRealizationReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsTurnoverRequest
import ympa_kotlin_vertx_server.models.GeneratePricesReportRequest
import ympa_kotlin_vertx_server.models.GenerateReportResponse
import ympa_kotlin_vertx_server.models.GenerateShelfsStatisticsRequest
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
import ympa_kotlin_vertx_server.models.GetFeedIndexLogsResponse
import ympa_kotlin_vertx_server.models.GetFeedResponse
import ympa_kotlin_vertx_server.models.GetFeedbackListResponse
import ympa_kotlin_vertx_server.models.GetFeedsResponse
import ympa_kotlin_vertx_server.models.GetFulfillmentWarehousesResponse
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
import ympa_kotlin_vertx_server.models.GetQualityRatingRequest
import ympa_kotlin_vertx_server.models.GetQualityRatingResponse
import ympa_kotlin_vertx_server.models.GetQuarantineOffersRequest
import ympa_kotlin_vertx_server.models.GetQuarantineOffersResponse
import ympa_kotlin_vertx_server.models.GetRegionWithChildrenResponse
import ympa_kotlin_vertx_server.models.GetRegionsResponse
import ympa_kotlin_vertx_server.models.GetReportInfoResponse
import ympa_kotlin_vertx_server.models.GetReturnResponse
import ympa_kotlin_vertx_server.models.GetReturnsResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsResponse
import ympa_kotlin_vertx_server.models.GetWarehouseStocksRequest
import ympa_kotlin_vertx_server.models.GetWarehouseStocksResponse
import ympa_kotlin_vertx_server.models.OfferAvailabilityStatusType
import ympa_kotlin_vertx_server.models.OfferMappingKindType
import ympa_kotlin_vertx_server.models.OfferProcessingStatusType
import ympa_kotlin_vertx_server.models.OrderBuyerType
import ympa_kotlin_vertx_server.models.OrderDeliveryDispatchType
import ympa_kotlin_vertx_server.models.OrderStatusType
import ympa_kotlin_vertx_server.models.OrderSubstatusType
import ympa_kotlin_vertx_server.models.PutSkuBidsRequest
import ympa_kotlin_vertx_server.models.RefundStatusType
import ympa_kotlin_vertx_server.models.ReportFormatType
import ympa_kotlin_vertx_server.models.ReturnType
import ympa_kotlin_vertx_server.models.SendMessageToChatRequest
import ympa_kotlin_vertx_server.models.SetFeedParamsRequest
import ympa_kotlin_vertx_server.models.SkipGoodsFeedbackReactionRequest
import ympa_kotlin_vertx_server.models.SuggestPricesRequest
import ympa_kotlin_vertx_server.models.SuggestPricesResponse
import ympa_kotlin_vertx_server.models.UpdateBusinessPricesRequest
import ympa_kotlin_vertx_server.models.UpdateCampaignOffersRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentResponse
import ympa_kotlin_vertx_server.models.UpdateOfferContentRequest
import ympa_kotlin_vertx_server.models.UpdateOfferContentResponse
import ympa_kotlin_vertx_server.models.UpdateOfferMappingEntryRequest
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsRequest
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsResponse
import ympa_kotlin_vertx_server.models.UpdatePricesRequest
import ympa_kotlin_vertx_server.models.UpdatePromoOffersRequest
import ympa_kotlin_vertx_server.models.UpdatePromoOffersResponse

class FbyApiVertxProxyHandler(private val vertx: Vertx, private val service: FbyApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private lateinit var timerID: Long
    private var lastAccessed: Long = 0
    init {
        try {
            this.vertx.eventBus().registerDefaultCodec(ServiceException::class.java,
            ServiceExceptionMessageCodec())
        } catch (ex: IllegalStateException) {}

        if (timeoutSeconds != (-1).toLong() && !topLevel) {
            var period = timeoutSeconds * 1000 / 2
            if (period > 10000) {
                period = 10000
            }
            this.timerID = vertx.setPeriodic(period) { this.checkTimedOut(it) }
        } else {
            this.timerID = -1
        }
        accessed()
    }
    private fun checkTimedOut(id: Long) {
        val now = System.nanoTime()
        if (now - lastAccessed > timeoutSeconds * 1000000000) {
            close()
        }
    }

    override fun close() {
        if (timerID != (-1).toLong()) {
            vertx.cancelTimer(timerID)
        }
        super.close()
    }

    private fun accessed() {
        this.lastAccessed = System.nanoTime()
    }
    override fun handle(msg: Message<JsonObject>) {
        try {
            val json = msg.body()
            val action = msg.headers().get("action") ?: throw IllegalStateException("action not specified")
            accessed()
            val contextSerialized = json.getJsonObject("context") ?: throw IllegalStateException("Received action $action without OperationRequest \"context\"")
            val context = OperationRequest(contextSerialized)
            when (action) {
        
                "addHiddenOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val addHiddenOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (addHiddenOffersRequestParam == null) {
                        throw IllegalArgumentException("addHiddenOffersRequest is required")
                    }
                    val addHiddenOffersRequest = Gson().fromJson(addHiddenOffersRequestParam.encode(), AddHiddenOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.addHiddenOffers(campaignId,addHiddenOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "addOffersToArchive" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val addOffersToArchiveRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (addOffersToArchiveRequestParam == null) {
                        throw IllegalArgumentException("addOffersToArchiveRequest is required")
                    }
                    val addOffersToArchiveRequest = Gson().fromJson(addOffersToArchiveRequestParam.encode(), AddOffersToArchiveRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.addOffersToArchive(businessId,addOffersToArchiveRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "calculateTariffs" -> {
                    val params = context.params
                    val calculateTariffsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (calculateTariffsRequestParam == null) {
                        throw IllegalArgumentException("calculateTariffsRequest is required")
                    }
                    val calculateTariffsRequest = Gson().fromJson(calculateTariffsRequestParam.encode(), CalculateTariffsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.calculateTariffs(calculateTariffsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "confirmBusinessPrices" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val confirmPricesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (confirmPricesRequestParam == null) {
                        throw IllegalArgumentException("confirmPricesRequest is required")
                    }
                    val confirmPricesRequest = Gson().fromJson(confirmPricesRequestParam.encode(), ConfirmPricesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.confirmBusinessPrices(businessId,confirmPricesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "confirmCampaignPrices" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val confirmPricesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (confirmPricesRequestParam == null) {
                        throw IllegalArgumentException("confirmPricesRequest is required")
                    }
                    val confirmPricesRequest = Gson().fromJson(confirmPricesRequestParam.encode(), ConfirmPricesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.confirmCampaignPrices(campaignId,confirmPricesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createChat" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val createChatRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createChatRequestParam == null) {
                        throw IllegalArgumentException("createChatRequest is required")
                    }
                    val createChatRequest = Gson().fromJson(createChatRequestParam.encode(), CreateChatRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createChat(businessId,createChatRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteCampaignOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val deleteCampaignOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteCampaignOffersRequestParam == null) {
                        throw IllegalArgumentException("deleteCampaignOffersRequest is required")
                    }
                    val deleteCampaignOffersRequest = Gson().fromJson(deleteCampaignOffersRequestParam.encode(), DeleteCampaignOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteCampaignOffers(campaignId,deleteCampaignOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteGoodsFeedbackComment" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deleteGoodsFeedbackCommentRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteGoodsFeedbackCommentRequestParam == null) {
                        throw IllegalArgumentException("deleteGoodsFeedbackCommentRequest is required")
                    }
                    val deleteGoodsFeedbackCommentRequest = Gson().fromJson(deleteGoodsFeedbackCommentRequestParam.encode(), DeleteGoodsFeedbackCommentRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteGoodsFeedbackComment(businessId,deleteGoodsFeedbackCommentRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteHiddenOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val deleteHiddenOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteHiddenOffersRequestParam == null) {
                        throw IllegalArgumentException("deleteHiddenOffersRequest is required")
                    }
                    val deleteHiddenOffersRequest = Gson().fromJson(deleteHiddenOffersRequestParam.encode(), DeleteHiddenOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteHiddenOffers(campaignId,deleteHiddenOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteOffers" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deleteOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteOffersRequestParam == null) {
                        throw IllegalArgumentException("deleteOffersRequest is required")
                    }
                    val deleteOffersRequest = Gson().fromJson(deleteOffersRequestParam.encode(), DeleteOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteOffers(businessId,deleteOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteOffersFromArchive" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deleteOffersFromArchiveRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteOffersFromArchiveRequestParam == null) {
                        throw IllegalArgumentException("deleteOffersFromArchiveRequest is required")
                    }
                    val deleteOffersFromArchiveRequest = Gson().fromJson(deleteOffersFromArchiveRequestParam.encode(), DeleteOffersFromArchiveRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteOffersFromArchive(businessId,deleteOffersFromArchiveRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deletePromoOffers" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deletePromoOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deletePromoOffersRequestParam == null) {
                        throw IllegalArgumentException("deletePromoOffersRequest is required")
                    }
                    val deletePromoOffersRequest = Gson().fromJson(deletePromoOffersRequestParam.encode(), DeletePromoOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deletePromoOffers(businessId,deletePromoOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateBoostConsolidatedReport" -> {
                    val params = context.params
                    val generateBoostConsolidatedRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateBoostConsolidatedRequestParam == null) {
                        throw IllegalArgumentException("generateBoostConsolidatedRequest is required")
                    }
                    val generateBoostConsolidatedRequest = Gson().fromJson(generateBoostConsolidatedRequestParam.encode(), GenerateBoostConsolidatedRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateBoostConsolidatedReport(generateBoostConsolidatedRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateCompetitorsPositionReport" -> {
                    val params = context.params
                    val generateCompetitorsPositionReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateCompetitorsPositionReportRequestParam == null) {
                        throw IllegalArgumentException("generateCompetitorsPositionReportRequest is required")
                    }
                    val generateCompetitorsPositionReportRequest = Gson().fromJson(generateCompetitorsPositionReportRequestParam.encode(), GenerateCompetitorsPositionReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateGoodsFeedbackReport" -> {
                    val params = context.params
                    val generateGoodsFeedbackRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateGoodsFeedbackRequestParam == null) {
                        throw IllegalArgumentException("generateGoodsFeedbackRequest is required")
                    }
                    val generateGoodsFeedbackRequest = Gson().fromJson(generateGoodsFeedbackRequestParam.encode(), GenerateGoodsFeedbackRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateGoodsFeedbackReport(generateGoodsFeedbackRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateGoodsMovementReport" -> {
                    val params = context.params
                    val generateGoodsMovementReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateGoodsMovementReportRequestParam == null) {
                        throw IllegalArgumentException("generateGoodsMovementReportRequest is required")
                    }
                    val generateGoodsMovementReportRequest = Gson().fromJson(generateGoodsMovementReportRequestParam.encode(), GenerateGoodsMovementReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateGoodsMovementReport(generateGoodsMovementReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateGoodsRealizationReport" -> {
                    val params = context.params
                    val generateGoodsRealizationReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateGoodsRealizationReportRequestParam == null) {
                        throw IllegalArgumentException("generateGoodsRealizationReportRequest is required")
                    }
                    val generateGoodsRealizationReportRequest = Gson().fromJson(generateGoodsRealizationReportRequestParam.encode(), GenerateGoodsRealizationReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateGoodsRealizationReport(generateGoodsRealizationReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateGoodsTurnoverReport" -> {
                    val params = context.params
                    val generateGoodsTurnoverRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateGoodsTurnoverRequestParam == null) {
                        throw IllegalArgumentException("generateGoodsTurnoverRequest is required")
                    }
                    val generateGoodsTurnoverRequest = Gson().fromJson(generateGoodsTurnoverRequestParam.encode(), GenerateGoodsTurnoverRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateGoodsTurnoverReport(generateGoodsTurnoverRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generatePricesReport" -> {
                    val params = context.params
                    val generatePricesReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generatePricesReportRequestParam == null) {
                        throw IllegalArgumentException("generatePricesReportRequest is required")
                    }
                    val generatePricesReportRequest = Gson().fromJson(generatePricesReportRequestParam.encode(), GeneratePricesReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generatePricesReport(generatePricesReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateShelfsStatisticsReport" -> {
                    val params = context.params
                    val generateShelfsStatisticsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateShelfsStatisticsRequestParam == null) {
                        throw IllegalArgumentException("generateShelfsStatisticsRequest is required")
                    }
                    val generateShelfsStatisticsRequest = Gson().fromJson(generateShelfsStatisticsRequestParam.encode(), GenerateShelfsStatisticsRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateShelfsStatisticsReport(generateShelfsStatisticsRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateShowsSalesReport" -> {
                    val params = context.params
                    val generateShowsSalesReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateShowsSalesReportRequestParam == null) {
                        throw IllegalArgumentException("generateShowsSalesReportRequest is required")
                    }
                    val generateShowsSalesReportRequest = Gson().fromJson(generateShowsSalesReportRequestParam.encode(), GenerateShowsSalesReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateShowsSalesReport(generateShowsSalesReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateStocksOnWarehousesReport" -> {
                    val params = context.params
                    val generateStocksOnWarehousesReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateStocksOnWarehousesReportRequestParam == null) {
                        throw IllegalArgumentException("generateStocksOnWarehousesReportRequest is required")
                    }
                    val generateStocksOnWarehousesReportRequest = Gson().fromJson(generateStocksOnWarehousesReportRequestParam.encode(), GenerateStocksOnWarehousesReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateUnitedMarketplaceServicesReport" -> {
                    val params = context.params
                    val generateUnitedMarketplaceServicesReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateUnitedMarketplaceServicesReportRequestParam == null) {
                        throw IllegalArgumentException("generateUnitedMarketplaceServicesReportRequest is required")
                    }
                    val generateUnitedMarketplaceServicesReportRequest = Gson().fromJson(generateUnitedMarketplaceServicesReportRequestParam.encode(), GenerateUnitedMarketplaceServicesReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateUnitedNettingReport" -> {
                    val params = context.params
                    val generateUnitedNettingReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateUnitedNettingReportRequestParam == null) {
                        throw IllegalArgumentException("generateUnitedNettingReportRequest is required")
                    }
                    val generateUnitedNettingReportRequest = Gson().fromJson(generateUnitedNettingReportRequestParam.encode(), GenerateUnitedNettingReportRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateUnitedNettingReport(generateUnitedNettingReportRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "generateUnitedOrdersReport" -> {
                    val params = context.params
                    val generateUnitedOrdersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateUnitedOrdersRequestParam == null) {
                        throw IllegalArgumentException("generateUnitedOrdersRequest is required")
                    }
                    val generateUnitedOrdersRequest = Gson().fromJson(generateUnitedOrdersRequestParam.encode(), GenerateUnitedOrdersRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ReportFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateUnitedOrdersReport(generateUnitedOrdersRequest,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAllOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    val chunk = ApiHandlerUtils.searchIntegerInJson(params,"chunk")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAllOffers(campaignId,feedId,chunk,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBidsInfoForBusiness" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getBidsInfoRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getBidsInfoRequest = if(getBidsInfoRequestParam ==null) null else Gson().fromJson(getBidsInfoRequestParam.encode(), GetBidsInfoRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBidsInfoForBusiness(businessId,pageToken,limit,getBidsInfoRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBidsRecommendations" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getBidsRecommendationsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getBidsRecommendationsRequestParam == null) {
                        throw IllegalArgumentException("getBidsRecommendationsRequest is required")
                    }
                    val getBidsRecommendationsRequest = Gson().fromJson(getBidsRecommendationsRequestParam.encode(), GetBidsRecommendationsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBidsRecommendations(businessId,getBidsRecommendationsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBusinessQuarantineOffers" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getQuarantineOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getQuarantineOffersRequestParam == null) {
                        throw IllegalArgumentException("getQuarantineOffersRequest is required")
                    }
                    val getQuarantineOffersRequest = Gson().fromJson(getQuarantineOffersRequestParam.encode(), GetQuarantineOffersRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessQuarantineOffers(businessId,getQuarantineOffersRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBusinessSettings" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessSettings(businessId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaign" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaign(campaignId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignLogins" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignLogins(campaignId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val getCampaignOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getCampaignOffersRequestParam == null) {
                        throw IllegalArgumentException("getCampaignOffersRequest is required")
                    }
                    val getCampaignOffersRequest = Gson().fromJson(getCampaignOffersRequestParam.encode(), GetCampaignOffersRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignOffers(campaignId,getCampaignOffersRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignQuarantineOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val getQuarantineOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getQuarantineOffersRequestParam == null) {
                        throw IllegalArgumentException("getQuarantineOffersRequest is required")
                    }
                    val getQuarantineOffersRequest = Gson().fromJson(getQuarantineOffersRequestParam.encode(), GetQuarantineOffersRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignQuarantineOffers(campaignId,getQuarantineOffersRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignRegion" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignRegion(campaignId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignSettings" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignSettings(campaignId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaigns" -> {
                    val params = context.params
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaigns(page,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignsByLogin" -> {
                    val params = context.params
                    val login = ApiHandlerUtils.searchStringInJson(params,"login")
                    if(login == null){
                        throw IllegalArgumentException("login is required")
                    }
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignsByLogin(login,page,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCategoriesMaxSaleQuantum" -> {
                    val params = context.params
                    val getCategoriesMaxSaleQuantumRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getCategoriesMaxSaleQuantumRequestParam == null) {
                        throw IllegalArgumentException("getCategoriesMaxSaleQuantumRequest is required")
                    }
                    val getCategoriesMaxSaleQuantumRequest = Gson().fromJson(getCategoriesMaxSaleQuantumRequestParam.encode(), GetCategoriesMaxSaleQuantumRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCategoriesTree" -> {
                    val params = context.params
                    val getCategoriesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getCategoriesRequest = if(getCategoriesRequestParam ==null) null else Gson().fromJson(getCategoriesRequestParam.encode(), GetCategoriesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCategoriesTree(getCategoriesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCategoryContentParameters" -> {
                    val params = context.params
                    val categoryId = ApiHandlerUtils.searchLongInJson(params,"categoryId")
                    if(categoryId == null){
                        throw IllegalArgumentException("categoryId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCategoryContentParameters(categoryId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getChatHistory" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val chatId = ApiHandlerUtils.searchLongInJson(params,"chatId")
                    if(chatId == null){
                        throw IllegalArgumentException("chatId is required")
                    }
                    val getChatHistoryRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getChatHistoryRequestParam == null) {
                        throw IllegalArgumentException("getChatHistoryRequest is required")
                    }
                    val getChatHistoryRequest = Gson().fromJson(getChatHistoryRequestParam.encode(), GetChatHistoryRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getChatHistory(businessId,chatId,getChatHistoryRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getChats" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getChatsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getChatsRequestParam == null) {
                        throw IllegalArgumentException("getChatsRequest is required")
                    }
                    val getChatsRequest = Gson().fromJson(getChatsRequestParam.encode(), GetChatsRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getChats(businessId,getChatsRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFeed" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeed(campaignId,feedId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFeedIndexLogs" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val publishedTimeFrom = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"published_time_from"))
                    val publishedTimeTo = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"published_time_to"))
                    val statusParam = ApiHandlerUtils.searchJsonObjectInJson(params,"status")
                    val status = if(statusParam ==null) null else Gson().fromJson(statusParam.encode(), FeedIndexLogsStatusType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeedIndexLogs(campaignId,feedId,limit,publishedTimeFrom,publishedTimeTo,status,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFeedbackAndCommentUpdates" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val fromDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"from_date"))
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeedbackAndCommentUpdates(campaignId,pageToken,limit,fromDate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFeeds" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeeds(campaignId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFulfillmentWarehouses" -> {
                }
        
                "getGoodsFeedbackComments" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getGoodsFeedbackCommentsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getGoodsFeedbackCommentsRequestParam == null) {
                        throw IllegalArgumentException("getGoodsFeedbackCommentsRequest is required")
                    }
                    val getGoodsFeedbackCommentsRequest = Gson().fromJson(getGoodsFeedbackCommentsRequestParam.encode(), GetGoodsFeedbackCommentsRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getGoodsFeedbackComments(businessId,getGoodsFeedbackCommentsRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getGoodsFeedbacks" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getGoodsFeedbackRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getGoodsFeedbackRequest = if(getGoodsFeedbackRequestParam ==null) null else Gson().fromJson(getGoodsFeedbackRequestParam.encode(), GetGoodsFeedbackRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getGoodsFeedbacks(businessId,pageToken,limit,getGoodsFeedbackRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getGoodsStats" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val getGoodsStatsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getGoodsStatsRequestParam == null) {
                        throw IllegalArgumentException("getGoodsStatsRequest is required")
                    }
                    val getGoodsStatsRequest = Gson().fromJson(getGoodsStatsRequestParam.encode(), GetGoodsStatsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getGoodsStats(campaignId,getGoodsStatsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getHiddenOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val offerIdParam = ApiHandlerUtils.searchJsonArrayInJson(params,"offer_id")
                    val offerId:kotlin.Array<kotlin.String>? = if(offerIdParam == null) null
                            else Gson().fromJson(offerIdParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getHiddenOffers(campaignId,offerId,pageToken,limit,offset,page,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOfferCardsContentStatus" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getOfferCardsContentStatusRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getOfferCardsContentStatusRequest = if(getOfferCardsContentStatusRequestParam ==null) null else Gson().fromJson(getOfferCardsContentStatusRequestParam.encode(), GetOfferCardsContentStatusRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOfferCardsContentStatus(businessId,pageToken,limit,getOfferCardsContentStatusRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOfferMappingEntries" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val offerIdParam = ApiHandlerUtils.searchJsonArrayInJson(params,"offer_id")
                    val offerId:kotlin.Array<kotlin.String>? = if(offerIdParam == null) null
                            else Gson().fromJson(offerIdParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val shopSkuParam = ApiHandlerUtils.searchJsonArrayInJson(params,"shop_sku")
                    val shopSku:kotlin.Array<kotlin.String>? = if(shopSkuParam == null) null
                            else Gson().fromJson(shopSkuParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val mappingKindParam = ApiHandlerUtils.searchJsonObjectInJson(params,"mapping_kind")
                    val mappingKind = if(mappingKindParam ==null) null else Gson().fromJson(mappingKindParam.encode(), OfferMappingKindType::class.java)
                    val statusParam = ApiHandlerUtils.searchJsonArrayInJson(params,"status")
                    val status:kotlin.Array<OfferProcessingStatusType>? = if(statusParam == null) null
                            else Gson().fromJson(statusParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OfferProcessingStatusType>>(){}.type)
                    val availabilityParam = ApiHandlerUtils.searchJsonArrayInJson(params,"availability")
                    val availability:kotlin.Array<OfferAvailabilityStatusType>? = if(availabilityParam == null) null
                            else Gson().fromJson(availabilityParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OfferAvailabilityStatusType>>(){}.type)
                    val categoryIdParam = ApiHandlerUtils.searchJsonArrayInJson(params,"category_id")
                    val categoryId:kotlin.Array<kotlin.Int>? = if(categoryIdParam == null) null
                            else Gson().fromJson(categoryIdParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val vendorParam = ApiHandlerUtils.searchJsonArrayInJson(params,"vendor")
                    val vendor:kotlin.Array<kotlin.String>? = if(vendorParam == null) null
                            else Gson().fromJson(vendorParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOfferMappingEntries(campaignId,offerId,shopSku,mappingKind,status,availability,categoryId,vendor,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOfferMappings" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getOfferMappingsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getOfferMappingsRequest = if(getOfferMappingsRequestParam ==null) null else Gson().fromJson(getOfferMappingsRequestParam.encode(), GetOfferMappingsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOfferMappings(businessId,pageToken,limit,getOfferMappingsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOfferRecommendations" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getOfferRecommendationsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getOfferRecommendationsRequestParam == null) {
                        throw IllegalArgumentException("getOfferRecommendationsRequest is required")
                    }
                    val getOfferRecommendationsRequest = Gson().fromJson(getOfferRecommendationsRequestParam.encode(), GetOfferRecommendationsRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOfferRecommendations(businessId,getOfferRecommendationsRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val query = ApiHandlerUtils.searchStringInJson(params,"query")
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    val shopCategoryId = ApiHandlerUtils.searchStringInJson(params,"shopCategoryId")
                    val currencyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"currency")
                    val currency = if(currencyParam ==null) null else Gson().fromJson(currencyParam.encode(), CurrencyType::class.java)
                    val matched = ApiHandlerUtils.searchStringInJson(params,"matched")?.toBoolean()
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOffers(campaignId,query,feedId,shopCategoryId,currency,matched,page,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrder" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrder(campaignId,orderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrderBusinessBuyerInfo" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrderBusinessBuyerInfo(campaignId,orderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrderBusinessDocumentsInfo" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrderBusinessDocumentsInfo(campaignId,orderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrders" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"orderIds")
                    val orderIds:kotlin.Array<kotlin.Long>? = if(orderIdsParam == null) null
                            else Gson().fromJson(orderIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Long>>(){}.type)
                    val statusParam = ApiHandlerUtils.searchJsonArrayInJson(params,"status")
                    val status:kotlin.collections.Set<OrderStatusType>? = if(statusParam == null) null
                            else Gson().fromJson(statusParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OrderStatusType>>(){}.type)
                    val substatusParam = ApiHandlerUtils.searchJsonArrayInJson(params,"substatus")
                    val substatus:kotlin.collections.Set<OrderSubstatusType>? = if(substatusParam == null) null
                            else Gson().fromJson(substatusParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OrderSubstatusType>>(){}.type)
                    val fromDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"fromDate"))
                    val toDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"toDate"))
                    val supplierShipmentDateFrom = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"supplierShipmentDateFrom"))
                    val supplierShipmentDateTo = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"supplierShipmentDateTo"))
                    val updatedAtFrom = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"updatedAtFrom"))
                    val updatedAtTo = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"updatedAtTo"))
                    val dispatchTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"dispatchType")
                    val dispatchType = if(dispatchTypeParam ==null) null else Gson().fromJson(dispatchTypeParam.encode(), OrderDeliveryDispatchType::class.java)
                    val fake = ApiHandlerUtils.searchStringInJson(params,"fake")?.toBoolean()
                    val hasCis = ApiHandlerUtils.searchStringInJson(params,"hasCis")?.toBoolean()
                    val onlyWaitingForCancellationApprove = ApiHandlerUtils.searchStringInJson(params,"onlyWaitingForCancellationApprove")?.toBoolean()
                    val onlyEstimatedDelivery = ApiHandlerUtils.searchStringInJson(params,"onlyEstimatedDelivery")?.toBoolean()
                    val buyerTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"buyerType")
                    val buyerType = if(buyerTypeParam ==null) null else Gson().fromJson(buyerTypeParam.encode(), OrderBuyerType::class.java)
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrders(campaignId,orderIds,status,substatus,fromDate,toDate,supplierShipmentDateFrom,supplierShipmentDateTo,updatedAtFrom,updatedAtTo,dispatchType,fake,hasCis,onlyWaitingForCancellationApprove,onlyEstimatedDelivery,buyerType,page,pageSize,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrdersStats" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getOrdersStatsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getOrdersStatsRequest = if(getOrdersStatsRequestParam ==null) null else Gson().fromJson(getOrdersStatsRequestParam.encode(), GetOrdersStatsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrdersStats(campaignId,pageToken,limit,getOrdersStatsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getPrices" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val archived = ApiHandlerUtils.searchStringInJson(params,"archived")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getPrices(campaignId,pageToken,limit,archived,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getPricesByOfferIds" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getPricesByOfferIdsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getPricesByOfferIdsRequest = if(getPricesByOfferIdsRequestParam ==null) null else Gson().fromJson(getPricesByOfferIdsRequestParam.encode(), GetPricesByOfferIdsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getPricesByOfferIds(campaignId,pageToken,limit,getPricesByOfferIdsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getPromoOffers" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getPromoOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getPromoOffersRequestParam == null) {
                        throw IllegalArgumentException("getPromoOffersRequest is required")
                    }
                    val getPromoOffersRequest = Gson().fromJson(getPromoOffersRequestParam.encode(), GetPromoOffersRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getPromoOffers(businessId,getPromoOffersRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getPromos" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getPromosRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getPromosRequest = if(getPromosRequestParam ==null) null else Gson().fromJson(getPromosRequestParam.encode(), GetPromosRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getPromos(businessId,getPromosRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getQualityRatings" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getQualityRatingRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getQualityRatingRequestParam == null) {
                        throw IllegalArgumentException("getQualityRatingRequest is required")
                    }
                    val getQualityRatingRequest = Gson().fromJson(getQualityRatingRequestParam.encode(), GetQualityRatingRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getQualityRatings(businessId,getQualityRatingRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getReportInfo" -> {
                    val params = context.params
                    val reportId = ApiHandlerUtils.searchStringInJson(params,"reportId")
                    if(reportId == null){
                        throw IllegalArgumentException("reportId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getReportInfo(reportId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getReturn" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val returnId = ApiHandlerUtils.searchLongInJson(params,"returnId")
                    if(returnId == null){
                        throw IllegalArgumentException("returnId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getReturn(campaignId,orderId,returnId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getReturnPhoto" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val returnId = ApiHandlerUtils.searchLongInJson(params,"returnId")
                    if(returnId == null){
                        throw IllegalArgumentException("returnId is required")
                    }
                    val itemId = ApiHandlerUtils.searchLongInJson(params,"itemId")
                    if(itemId == null){
                        throw IllegalArgumentException("itemId is required")
                    }
                    val imageHash = ApiHandlerUtils.searchStringInJson(params,"imageHash")
                    if(imageHash == null){
                        throw IllegalArgumentException("imageHash is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getReturnPhoto(campaignId,orderId,returnId,itemId,imageHash,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getReturns" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val orderIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"orderIds")
                    val orderIds:kotlin.Array<kotlin.Long>? = if(orderIdsParam == null) null
                            else Gson().fromJson(orderIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Long>>(){}.type)
                    val statusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"statuses")
                    val statuses:kotlin.Array<RefundStatusType>? = if(statusesParam == null) null
                            else Gson().fromJson(statusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<RefundStatusType>>(){}.type)
                    val typeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"type")
                    val type = if(typeParam ==null) null else Gson().fromJson(typeParam.encode(), ReturnType::class.java)
                    val fromDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"fromDate"))
                    val toDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"toDate"))
                    val fromDate2 = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"from_date"))
                    val toDate2 = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"to_date"))
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getReturns(campaignId,pageToken,limit,orderIds,statuses,type,fromDate,toDate,fromDate2,toDate2,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getStocks" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val getWarehouseStocksRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getWarehouseStocksRequest = if(getWarehouseStocksRequestParam ==null) null else Gson().fromJson(getWarehouseStocksRequestParam.encode(), GetWarehouseStocksRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getStocks(campaignId,pageToken,limit,getWarehouseStocksRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getSuggestedOfferMappingEntries" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val getSuggestedOfferMappingEntriesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getSuggestedOfferMappingEntriesRequestParam == null) {
                        throw IllegalArgumentException("getSuggestedOfferMappingEntriesRequest is required")
                    }
                    val getSuggestedOfferMappingEntriesRequest = Gson().fromJson(getSuggestedOfferMappingEntriesRequestParam.encode(), GetSuggestedOfferMappingEntriesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getSuggestedOfferMappingEntries(campaignId,getSuggestedOfferMappingEntriesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getSuggestedOfferMappings" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getSuggestedOfferMappingsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val getSuggestedOfferMappingsRequest = if(getSuggestedOfferMappingsRequestParam ==null) null else Gson().fromJson(getSuggestedOfferMappingsRequestParam.encode(), GetSuggestedOfferMappingsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getSuggestedOfferMappings(businessId,getSuggestedOfferMappingsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getSuggestedPrices" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val suggestPricesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (suggestPricesRequestParam == null) {
                        throw IllegalArgumentException("suggestPricesRequest is required")
                    }
                    val suggestPricesRequest = Gson().fromJson(suggestPricesRequestParam.encode(), SuggestPricesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getSuggestedPrices(campaignId,suggestPricesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "putBidsForBusiness" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val putSkuBidsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (putSkuBidsRequestParam == null) {
                        throw IllegalArgumentException("putSkuBidsRequest is required")
                    }
                    val putSkuBidsRequest = Gson().fromJson(putSkuBidsRequestParam.encode(), PutSkuBidsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.putBidsForBusiness(businessId,putSkuBidsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "putBidsForCampaign" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val putSkuBidsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (putSkuBidsRequestParam == null) {
                        throw IllegalArgumentException("putSkuBidsRequest is required")
                    }
                    val putSkuBidsRequest = Gson().fromJson(putSkuBidsRequestParam.encode(), PutSkuBidsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.putBidsForCampaign(campaignId,putSkuBidsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "refreshFeed" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.refreshFeed(campaignId,feedId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "searchRegionChildren" -> {
                    val params = context.params
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.searchRegionChildren(regionId,page,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "searchRegionsById" -> {
                    val params = context.params
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.searchRegionsById(regionId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "searchRegionsByName" -> {
                    val params = context.params
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.searchRegionsByName(name,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sendFileToChat" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val chatId = ApiHandlerUtils.searchLongInJson(params,"chatId")
                    if(chatId == null){
                        throw IllegalArgumentException("chatId is required")
                    }
                    val fileParam = context.extra.getJsonArray("files")
                    if (fileParam == null) {
                         throw IllegalArgumentException("file is required")
                    }
                    val file = fileParam.map{ java.io.File(it as String) }
                    if(file == null){
                        throw IllegalArgumentException("file is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sendFileToChat(businessId,chatId,file,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sendMessageToChat" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val chatId = ApiHandlerUtils.searchLongInJson(params,"chatId")
                    if(chatId == null){
                        throw IllegalArgumentException("chatId is required")
                    }
                    val sendMessageToChatRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (sendMessageToChatRequestParam == null) {
                        throw IllegalArgumentException("sendMessageToChatRequest is required")
                    }
                    val sendMessageToChatRequest = Gson().fromJson(sendMessageToChatRequestParam.encode(), SendMessageToChatRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sendMessageToChat(businessId,chatId,sendMessageToChatRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setFeedParams" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val setFeedParamsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setFeedParamsRequestParam == null) {
                        throw IllegalArgumentException("setFeedParamsRequest is required")
                    }
                    val setFeedParamsRequest = Gson().fromJson(setFeedParamsRequestParam.encode(), SetFeedParamsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setFeedParams(campaignId,feedId,setFeedParamsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "skipGoodsFeedbacksReaction" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val skipGoodsFeedbackReactionRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (skipGoodsFeedbackReactionRequestParam == null) {
                        throw IllegalArgumentException("skipGoodsFeedbackReactionRequest is required")
                    }
                    val skipGoodsFeedbackReactionRequest = Gson().fromJson(skipGoodsFeedbackReactionRequestParam.encode(), SkipGoodsFeedbackReactionRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.skipGoodsFeedbacksReaction(businessId,skipGoodsFeedbackReactionRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateBusinessPrices" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateBusinessPricesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateBusinessPricesRequestParam == null) {
                        throw IllegalArgumentException("updateBusinessPricesRequest is required")
                    }
                    val updateBusinessPricesRequest = Gson().fromJson(updateBusinessPricesRequestParam.encode(), UpdateBusinessPricesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateBusinessPrices(businessId,updateBusinessPricesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateCampaignOffers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val updateCampaignOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateCampaignOffersRequestParam == null) {
                        throw IllegalArgumentException("updateCampaignOffersRequest is required")
                    }
                    val updateCampaignOffersRequest = Gson().fromJson(updateCampaignOffersRequestParam.encode(), UpdateCampaignOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateCampaignOffers(campaignId,updateCampaignOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateGoodsFeedbackComment" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateGoodsFeedbackCommentRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateGoodsFeedbackCommentRequestParam == null) {
                        throw IllegalArgumentException("updateGoodsFeedbackCommentRequest is required")
                    }
                    val updateGoodsFeedbackCommentRequest = Gson().fromJson(updateGoodsFeedbackCommentRequestParam.encode(), UpdateGoodsFeedbackCommentRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateGoodsFeedbackComment(businessId,updateGoodsFeedbackCommentRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOfferContent" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateOfferContentRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOfferContentRequestParam == null) {
                        throw IllegalArgumentException("updateOfferContentRequest is required")
                    }
                    val updateOfferContentRequest = Gson().fromJson(updateOfferContentRequestParam.encode(), UpdateOfferContentRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOfferContent(businessId,updateOfferContentRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOfferMappingEntries" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val updateOfferMappingEntryRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOfferMappingEntryRequestParam == null) {
                        throw IllegalArgumentException("updateOfferMappingEntryRequest is required")
                    }
                    val updateOfferMappingEntryRequest = Gson().fromJson(updateOfferMappingEntryRequestParam.encode(), UpdateOfferMappingEntryRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOfferMappingEntries(campaignId,updateOfferMappingEntryRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOfferMappings" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateOfferMappingsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOfferMappingsRequestParam == null) {
                        throw IllegalArgumentException("updateOfferMappingsRequest is required")
                    }
                    val updateOfferMappingsRequest = Gson().fromJson(updateOfferMappingsRequestParam.encode(), UpdateOfferMappingsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOfferMappings(businessId,updateOfferMappingsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updatePrices" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val updatePricesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updatePricesRequestParam == null) {
                        throw IllegalArgumentException("updatePricesRequest is required")
                    }
                    val updatePricesRequest = Gson().fromJson(updatePricesRequestParam.encode(), UpdatePricesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updatePrices(campaignId,updatePricesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updatePromoOffers" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updatePromoOffersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updatePromoOffersRequestParam == null) {
                        throw IllegalArgumentException("updatePromoOffersRequest is required")
                    }
                    val updatePromoOffersRequest = Gson().fromJson(updatePromoOffersRequestParam.encode(), UpdatePromoOffersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updatePromoOffers(businessId,updatePromoOffersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
