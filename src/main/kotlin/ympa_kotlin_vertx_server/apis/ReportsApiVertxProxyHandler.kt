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
import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.GenerateBoostConsolidatedRequest
import ympa_kotlin_vertx_server.models.GenerateCompetitorsPositionReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsFeedbackRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsMovementReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsRealizationReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsTurnoverRequest
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
import ympa_kotlin_vertx_server.models.GetReportInfoResponse
import ympa_kotlin_vertx_server.models.PageFormatType
import ympa_kotlin_vertx_server.models.ReportFormatType

class ReportsApiVertxProxyHandler(private val vertx: Vertx, private val service: ReportsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "generateMassOrderLabelsReport" -> {
                    val params = context.params
                    val generateMassOrderLabelsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateMassOrderLabelsRequestParam == null) {
                        throw IllegalArgumentException("generateMassOrderLabelsRequest is required")
                    }
                    val generateMassOrderLabelsRequest = Gson().fromJson(generateMassOrderLabelsRequestParam.encode(), GenerateMassOrderLabelsRequest::class.java)
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), PageFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateMassOrderLabelsReport(generateMassOrderLabelsRequest,format,context)
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
        
                "generateShipmentListDocumentReport" -> {
                    val params = context.params
                    val generateShipmentListDocumentReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (generateShipmentListDocumentReportRequestParam == null) {
                        throw IllegalArgumentException("generateShipmentListDocumentReportRequest is required")
                    }
                    val generateShipmentListDocumentReportRequest = Gson().fromJson(generateShipmentListDocumentReportRequestParam.encode(), GenerateShipmentListDocumentReportRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest,context)
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
