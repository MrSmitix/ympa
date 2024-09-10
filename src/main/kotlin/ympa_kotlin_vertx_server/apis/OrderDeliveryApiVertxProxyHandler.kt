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
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetOrderBuyerInfoResponse
import ympa_kotlin_vertx_server.models.SetOrderDeliveryDateRequest
import ympa_kotlin_vertx_server.models.SetOrderDeliveryTrackCodeRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStorageLimitRequest
import ympa_kotlin_vertx_server.models.VerifyOrderEacRequest
import ympa_kotlin_vertx_server.models.VerifyOrderEacResponse

class OrderDeliveryApiVertxProxyHandler(private val vertx: Vertx, private val service: OrderDeliveryApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "getOrderBuyerInfo" -> {
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
                        val result = service.getOrderBuyerInfo(campaignId,orderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setOrderDeliveryDate" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val setOrderDeliveryDateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setOrderDeliveryDateRequestParam == null) {
                        throw IllegalArgumentException("setOrderDeliveryDateRequest is required")
                    }
                    val setOrderDeliveryDateRequest = Gson().fromJson(setOrderDeliveryDateRequestParam.encode(), SetOrderDeliveryDateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setOrderDeliveryDate(campaignId,orderId,setOrderDeliveryDateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setOrderDeliveryTrackCode" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val setOrderDeliveryTrackCodeRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setOrderDeliveryTrackCodeRequestParam == null) {
                        throw IllegalArgumentException("setOrderDeliveryTrackCodeRequest is required")
                    }
                    val setOrderDeliveryTrackCodeRequest = Gson().fromJson(setOrderDeliveryTrackCodeRequestParam.encode(), SetOrderDeliveryTrackCodeRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setOrderDeliveryTrackCode(campaignId,orderId,setOrderDeliveryTrackCodeRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOrderStorageLimit" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val updateOrderStorageLimitRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOrderStorageLimitRequestParam == null) {
                        throw IllegalArgumentException("updateOrderStorageLimitRequest is required")
                    }
                    val updateOrderStorageLimitRequest = Gson().fromJson(updateOrderStorageLimitRequestParam.encode(), UpdateOrderStorageLimitRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOrderStorageLimit(campaignId,orderId,updateOrderStorageLimitRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "verifyOrderEac" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val verifyOrderEacRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (verifyOrderEacRequestParam == null) {
                        throw IllegalArgumentException("verifyOrderEacRequest is required")
                    }
                    val verifyOrderEacRequest = Gson().fromJson(verifyOrderEacRequestParam.encode(), VerifyOrderEacRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.verifyOrderEac(campaignId,orderId,verifyOrderEacRequest,context)
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
