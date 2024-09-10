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
import ympa_kotlin_vertx_server.models.FeedIndexLogsStatusType
import ympa_kotlin_vertx_server.models.GetFeedIndexLogsResponse
import ympa_kotlin_vertx_server.models.GetFeedResponse
import ympa_kotlin_vertx_server.models.GetFeedsResponse
import ympa_kotlin_vertx_server.models.SetFeedParamsRequest

class FeedsApiVertxProxyHandler(private val vertx: Vertx, private val service: FeedsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "getFeed" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeed(campaignId,feedId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFeedIndexLogs" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val publishedTimeFrom = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"published_time_from"))
                    val publishedTimeTo = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"published_time_to"))
                    val statusParam = ApiHandlerUtils.searchJsonObjectInJson(params,"status")
                    val status = if(statusParam ==null) null else Gson().fromJson(statusParam.encode(), FeedIndexLogsStatusType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeedIndexLogs(campaignId,feedId,limit,publishedTimeFrom,publishedTimeTo,status,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFeeds" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFeeds(campaignId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "refreshFeed" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.refreshFeed(campaignId,feedId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setFeedParams" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val feedId = ApiHandlerUtils.searchLongInJson(params,"feedId")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val setFeedParamsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setFeedParamsRequestParam == null) {
                        throw IllegalArgumentException("setFeedParamsRequest is required")
                    }
                    val setFeedParamsRequest = Gson().fromJson(setFeedParamsRequestParam.encode(), SetFeedParamsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setFeedParams(campaignId,feedId,setFeedParamsRequest,context)
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
