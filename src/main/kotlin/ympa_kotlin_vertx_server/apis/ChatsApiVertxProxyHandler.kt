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
import ympa_kotlin_vertx_server.models.CreateChatRequest
import ympa_kotlin_vertx_server.models.CreateChatResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetChatHistoryRequest
import ympa_kotlin_vertx_server.models.GetChatHistoryResponse
import ympa_kotlin_vertx_server.models.GetChatsRequest
import ympa_kotlin_vertx_server.models.GetChatsResponse
import ympa_kotlin_vertx_server.models.SendMessageToChatRequest

class ChatsApiVertxProxyHandler(private val vertx: Vertx, private val service: ChatsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "createChat" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val createChatRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createChatRequestParam == null) {
                        throw IllegalArgumentException("createChatRequest is required")
                    }
                    val createChatRequest = Gson().fromJson(createChatRequestParam.encode(), CreateChatRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createChat(businessId,createChatRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getChatHistory" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val chatId = ApiHandlerUtils.searchLongInJson(params,"chatId")
                    if(chatId == null){
                        throw IllegalArgumentException("chatId is required")
                    }
                    val getChatHistoryRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getChatHistoryRequestParam == null) {
                        throw IllegalArgumentException("getChatHistoryRequest is required")
                    }
                    val getChatHistoryRequest = Gson().fromJson(getChatHistoryRequestParam.encode(), GetChatHistoryRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getChatHistory(businessId,chatId,getChatHistoryRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getChats" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val getChatsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getChatsRequestParam == null) {
                        throw IllegalArgumentException("getChatsRequest is required")
                    }
                    val getChatsRequest = Gson().fromJson(getChatsRequestParam.encode(), GetChatsRequest::class.java)
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getChats(businessId,getChatsRequest,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sendFileToChat" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val chatId = ApiHandlerUtils.searchLongInJson(params,"chatId")
                    if(chatId == null){
                        throw IllegalArgumentException("chatId is required")
                    }
                    val fileParam = context.extra.getJsonArray("files")
                    if (fileParam == null) {
                         throw IllegalArgumentException("file is required")
                    }
                    val file = fileParam.map{ java.io.File(it as String) }
                    if(file == null){
                        throw IllegalArgumentException("file is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sendFileToChat(businessId,chatId,file,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sendMessageToChat" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchLongInJson(params,"businessId")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val chatId = ApiHandlerUtils.searchLongInJson(params,"chatId")
                    if(chatId == null){
                        throw IllegalArgumentException("chatId is required")
                    }
                    val sendMessageToChatRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (sendMessageToChatRequestParam == null) {
                        throw IllegalArgumentException("sendMessageToChatRequest is required")
                    }
                    val sendMessageToChatRequest = Gson().fromJson(sendMessageToChatRequestParam.encode(), SendMessageToChatRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sendMessageToChat(businessId,chatId,sendMessageToChatRequest,context)
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
