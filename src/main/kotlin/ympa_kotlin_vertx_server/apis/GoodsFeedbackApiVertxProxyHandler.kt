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
import ympa_kotlin_vertx_server.models.DeleteGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsRequest
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsResponse
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackRequest
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackResponse
import ympa_kotlin_vertx_server.models.SkipGoodsFeedbackReactionRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentResponse

class GoodsFeedbackApiVertxProxyHandler(private val vertx: Vertx, private val service: GoodsFeedbackApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
