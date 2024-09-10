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
import ympa_kotlin_vertx_server.models.CurrencyType
import ympa_kotlin_vertx_server.models.GetModelsOffersResponse
import ympa_kotlin_vertx_server.models.GetModelsRequest
import ympa_kotlin_vertx_server.models.GetModelsResponse
import ympa_kotlin_vertx_server.models.SearchModelsResponse
import ympa_kotlin_vertx_server.models.SortOrderType

class ModelsApiVertxProxyHandler(private val vertx: Vertx, private val service: ModelsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "getModel" -> {
                    val params = context.params
                    val modelId = ApiHandlerUtils.searchLongInJson(params,"modelId")
                    if(modelId == null){
                        throw IllegalArgumentException("modelId is required")
                    }
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    val currencyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"currency")
                    val currency = if(currencyParam ==null) null else Gson().fromJson(currencyParam.encode(), CurrencyType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getModel(modelId,regionId,currency,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getModelOffers" -> {
                    val params = context.params
                    val modelId = ApiHandlerUtils.searchLongInJson(params,"modelId")
                    if(modelId == null){
                        throw IllegalArgumentException("modelId is required")
                    }
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    val currencyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"currency")
                    val currency = if(currencyParam ==null) null else Gson().fromJson(currencyParam.encode(), CurrencyType::class.java)
                    val orderByPriceParam = ApiHandlerUtils.searchJsonObjectInJson(params,"orderByPrice")
                    val orderByPrice = if(orderByPriceParam ==null) null else Gson().fromJson(orderByPriceParam.encode(), SortOrderType::class.java)
                    val count = ApiHandlerUtils.searchIntegerInJson(params,"count")
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getModelOffers(modelId,regionId,currency,orderByPrice,count,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getModels" -> {
                    val params = context.params
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    val getModelsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getModelsRequestParam == null) {
                        throw IllegalArgumentException("getModelsRequest is required")
                    }
                    val getModelsRequest = Gson().fromJson(getModelsRequestParam.encode(), GetModelsRequest::class.java)
                    val currencyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"currency")
                    val currency = if(currencyParam ==null) null else Gson().fromJson(currencyParam.encode(), CurrencyType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getModels(regionId,getModelsRequest,currency,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getModelsOffers" -> {
                    val params = context.params
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    val getModelsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (getModelsRequestParam == null) {
                        throw IllegalArgumentException("getModelsRequest is required")
                    }
                    val getModelsRequest = Gson().fromJson(getModelsRequestParam.encode(), GetModelsRequest::class.java)
                    val currencyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"currency")
                    val currency = if(currencyParam ==null) null else Gson().fromJson(currencyParam.encode(), CurrencyType::class.java)
                    val orderByPriceParam = ApiHandlerUtils.searchJsonObjectInJson(params,"orderByPrice")
                    val orderByPrice = if(orderByPriceParam ==null) null else Gson().fromJson(orderByPriceParam.encode(), SortOrderType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getModelsOffers(regionId,getModelsRequest,currency,orderByPrice,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "searchModels" -> {
                    val params = context.params
                    val query = ApiHandlerUtils.searchStringInJson(params,"query")
                    if(query == null){
                        throw IllegalArgumentException("query is required")
                    }
                    val regionId = ApiHandlerUtils.searchLongInJson(params,"regionId")
                    if(regionId == null){
                        throw IllegalArgumentException("regionId is required")
                    }
                    val currencyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"currency")
                    val currency = if(currencyParam ==null) null else Gson().fromJson(currencyParam.encode(), CurrencyType::class.java)
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.searchModels(query,regionId,currency,page,pageSize,context)
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
