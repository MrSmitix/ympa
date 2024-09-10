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
import ympa_kotlin_vertx_server.models.CurrencyType
import ympa_kotlin_vertx_server.models.DeleteCampaignOffersRequest
import ympa_kotlin_vertx_server.models.DeleteCampaignOffersResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetAllOffersResponse
import ympa_kotlin_vertx_server.models.GetCampaignOffersRequest
import ympa_kotlin_vertx_server.models.GetCampaignOffersResponse
import ympa_kotlin_vertx_server.models.GetOfferRecommendationsRequest
import ympa_kotlin_vertx_server.models.GetOfferRecommendationsResponse
import ympa_kotlin_vertx_server.models.GetOffersResponse
import ympa_kotlin_vertx_server.models.UpdateCampaignOffersRequest

class OffersApiVertxProxyHandler(private val vertx: Vertx, private val service: OffersApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
