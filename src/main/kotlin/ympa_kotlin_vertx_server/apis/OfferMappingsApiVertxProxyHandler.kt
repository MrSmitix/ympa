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
import ympa_kotlin_vertx_server.models.GetOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.OfferAvailabilityStatusType
import ympa_kotlin_vertx_server.models.OfferMappingKindType
import ympa_kotlin_vertx_server.models.OfferProcessingStatusType
import ympa_kotlin_vertx_server.models.UpdateOfferMappingEntryRequest

class OfferMappingsApiVertxProxyHandler(private val vertx: Vertx, private val service: OfferMappingsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
