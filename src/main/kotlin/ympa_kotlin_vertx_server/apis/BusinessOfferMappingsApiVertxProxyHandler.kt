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
import ympa_kotlin_vertx_server.models.AddOffersToArchiveRequest
import ympa_kotlin_vertx_server.models.AddOffersToArchiveResponse
import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveRequest
import ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveResponse
import ympa_kotlin_vertx_server.models.DeleteOffersRequest
import ympa_kotlin_vertx_server.models.DeleteOffersResponse
import ympa_kotlin_vertx_server.models.GetOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetOfferMappingsResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsResponse
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsRequest
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsResponse

class BusinessOfferMappingsApiVertxProxyHandler(private val vertx: Vertx, private val service: BusinessOfferMappingsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
