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
import ympa_kotlin_vertx_server.models.ConfirmPricesRequest
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetQuarantineOffersRequest
import ympa_kotlin_vertx_server.models.GetQuarantineOffersResponse

class PriceQuarantineApiVertxProxyHandler(private val vertx: Vertx, private val service: PriceQuarantineApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
