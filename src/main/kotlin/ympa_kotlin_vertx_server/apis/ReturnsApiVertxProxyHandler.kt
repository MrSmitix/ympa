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
import ympa_kotlin_vertx_server.models.GetReturnResponse
import ympa_kotlin_vertx_server.models.GetReturnsResponse
import ympa_kotlin_vertx_server.models.RefundStatusType
import ympa_kotlin_vertx_server.models.ReturnType
import ympa_kotlin_vertx_server.models.SetReturnDecisionRequest

class ReturnsApiVertxProxyHandler(private val vertx: Vertx, private val service: ReturnsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "getReturnApplication" -> {
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
                        val result = service.getReturnApplication(campaignId,orderId,returnId,context)
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
        
                "setReturnDecision" -> {
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
                    val setReturnDecisionRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setReturnDecisionRequestParam == null) {
                        throw IllegalArgumentException("setReturnDecisionRequest is required")
                    }
                    val setReturnDecisionRequest = Gson().fromJson(setReturnDecisionRequestParam.encode(), SetReturnDecisionRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setReturnDecision(campaignId,orderId,returnId,setReturnDecisionRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "submitReturnDecision" -> {
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
                        val result = service.submitReturnDecision(campaignId,orderId,returnId,context)
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
