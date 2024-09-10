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
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetPricesByOfferIdsRequest
import ympa_kotlin_vertx_server.models.GetPricesByOfferIdsResponse
import ympa_kotlin_vertx_server.models.GetPricesResponse
import ympa_kotlin_vertx_server.models.SuggestPricesRequest
import ympa_kotlin_vertx_server.models.SuggestPricesResponse
import ympa_kotlin_vertx_server.models.UpdateBusinessPricesRequest
import ympa_kotlin_vertx_server.models.UpdatePricesRequest

class PricesApiVertxProxyHandler(private val vertx: Vertx, private val service: PricesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
