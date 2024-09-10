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
import ympa_kotlin_vertx_server.models.ConfirmShipmentRequest
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetShipmentOrdersInfoResponse
import ympa_kotlin_vertx_server.models.GetShipmentResponse
import ympa_kotlin_vertx_server.models.SearchShipmentsRequest
import ympa_kotlin_vertx_server.models.SearchShipmentsResponse
import ympa_kotlin_vertx_server.models.SetShipmentPalletsCountRequest
import ympa_kotlin_vertx_server.models.ShipmentPalletLabelPageFormatType
import ympa_kotlin_vertx_server.models.TransferOrdersFromShipmentRequest

class ShipmentsApiVertxProxyHandler(private val vertx: Vertx, private val service: ShipmentsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "confirmShipment" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    val confirmShipmentRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val confirmShipmentRequest = if(confirmShipmentRequestParam ==null) null else Gson().fromJson(confirmShipmentRequestParam.encode(), ConfirmShipmentRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.confirmShipment(campaignId,shipmentId,confirmShipmentRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadShipmentAct" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadShipmentAct(campaignId,shipmentId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadShipmentDiscrepancyAct" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadShipmentDiscrepancyAct(campaignId,shipmentId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadShipmentInboundAct" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadShipmentInboundAct(campaignId,shipmentId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadShipmentPalletLabels" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    val formatParam = ApiHandlerUtils.searchJsonObjectInJson(params,"format")
                    val format = if(formatParam ==null) null else Gson().fromJson(formatParam.encode(), ShipmentPalletLabelPageFormatType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadShipmentPalletLabels(campaignId,shipmentId,format,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadShipmentReceptionTransferAct" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val warehouseId = ApiHandlerUtils.searchIntegerInJson(params,"warehouse_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadShipmentReceptionTransferAct(campaignId,warehouseId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadShipmentTransportationWaybill" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadShipmentTransportationWaybill(campaignId,shipmentId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getShipment" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    val cancelledOrders = ApiHandlerUtils.searchStringInJson(params,"cancelledOrders")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getShipment(campaignId,shipmentId,cancelledOrders,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getShipmentOrdersInfo" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getShipmentOrdersInfo(campaignId,shipmentId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "searchShipments" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val searchShipmentsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (searchShipmentsRequestParam == null) {
                        throw IllegalArgumentException("searchShipmentsRequest is required")
                    }
                    val searchShipmentsRequest = Gson().fromJson(searchShipmentsRequestParam.encode(), SearchShipmentsRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.searchShipments(campaignId,searchShipmentsRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setShipmentPalletsCount" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    val setShipmentPalletsCountRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setShipmentPalletsCountRequestParam == null) {
                        throw IllegalArgumentException("setShipmentPalletsCountRequest is required")
                    }
                    val setShipmentPalletsCountRequest = Gson().fromJson(setShipmentPalletsCountRequestParam.encode(), SetShipmentPalletsCountRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setShipmentPalletsCount(campaignId,shipmentId,setShipmentPalletsCountRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "transferOrdersFromShipment" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    val transferOrdersFromShipmentRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (transferOrdersFromShipmentRequestParam == null) {
                        throw IllegalArgumentException("transferOrdersFromShipmentRequest is required")
                    }
                    val transferOrdersFromShipmentRequest = Gson().fromJson(transferOrdersFromShipmentRequestParam.encode(), TransferOrdersFromShipmentRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.transferOrdersFromShipment(campaignId,shipmentId,transferOrdersFromShipmentRequest,context)
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
