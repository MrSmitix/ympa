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
import ympa_kotlin_vertx_server.models.AcceptOrderCancellationRequest
import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetOrderResponse
import ympa_kotlin_vertx_server.models.GetOrdersResponse
import ympa_kotlin_vertx_server.models.OrderBuyerType
import ympa_kotlin_vertx_server.models.OrderDeliveryDispatchType
import ympa_kotlin_vertx_server.models.OrderStatusType
import ympa_kotlin_vertx_server.models.OrderSubstatusType
import ympa_kotlin_vertx_server.models.ProvideOrderDigitalCodesRequest
import ympa_kotlin_vertx_server.models.ProvideOrderItemIdentifiersRequest
import ympa_kotlin_vertx_server.models.ProvideOrderItemIdentifiersResponse
import ympa_kotlin_vertx_server.models.SetOrderBoxLayoutRequest
import ympa_kotlin_vertx_server.models.SetOrderBoxLayoutResponse
import ympa_kotlin_vertx_server.models.SetOrderShipmentBoxesRequest
import ympa_kotlin_vertx_server.models.SetOrderShipmentBoxesResponse
import ympa_kotlin_vertx_server.models.UpdateOrderItemRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStatusRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStatusResponse
import ympa_kotlin_vertx_server.models.UpdateOrderStatusesRequest
import ympa_kotlin_vertx_server.models.UpdateOrderStatusesResponse

class OrdersApiVertxProxyHandler(private val vertx: Vertx, private val service: OrdersApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "acceptOrderCancellation" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val acceptOrderCancellationRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (acceptOrderCancellationRequestParam == null) {
                        throw IllegalArgumentException("acceptOrderCancellationRequest is required")
                    }
                    val acceptOrderCancellationRequest = Gson().fromJson(acceptOrderCancellationRequestParam.encode(), AcceptOrderCancellationRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.acceptOrderCancellation(campaignId,orderId,acceptOrderCancellationRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrder" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrder(campaignId,orderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getOrders" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"orderIds")
                    val orderIds:kotlin.Array<kotlin.Long>? = if(orderIdsParam == null) null
                            else Gson().fromJson(orderIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Long>>(){}.type)
                    val statusParam = ApiHandlerUtils.searchJsonArrayInJson(params,"status")
                    val status:kotlin.collections.Set<OrderStatusType>? = if(statusParam == null) null
                            else Gson().fromJson(statusParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OrderStatusType>>(){}.type)
                    val substatusParam = ApiHandlerUtils.searchJsonArrayInJson(params,"substatus")
                    val substatus:kotlin.collections.Set<OrderSubstatusType>? = if(substatusParam == null) null
                            else Gson().fromJson(substatusParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OrderSubstatusType>>(){}.type)
                    val fromDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"fromDate"))
                    val toDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"toDate"))
                    val supplierShipmentDateFrom = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"supplierShipmentDateFrom"))
                    val supplierShipmentDateTo = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"supplierShipmentDateTo"))
                    val updatedAtFrom = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"updatedAtFrom"))
                    val updatedAtTo = java.time.LocalDateTime.parse(ApiHandlerUtils.searchStringInJson(params,"updatedAtTo"))
                    val dispatchTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"dispatchType")
                    val dispatchType = if(dispatchTypeParam ==null) null else Gson().fromJson(dispatchTypeParam.encode(), OrderDeliveryDispatchType::class.java)
                    val fake = ApiHandlerUtils.searchStringInJson(params,"fake")?.toBoolean()
                    val hasCis = ApiHandlerUtils.searchStringInJson(params,"hasCis")?.toBoolean()
                    val onlyWaitingForCancellationApprove = ApiHandlerUtils.searchStringInJson(params,"onlyWaitingForCancellationApprove")?.toBoolean()
                    val onlyEstimatedDelivery = ApiHandlerUtils.searchStringInJson(params,"onlyEstimatedDelivery")?.toBoolean()
                    val buyerTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"buyerType")
                    val buyerType = if(buyerTypeParam ==null) null else Gson().fromJson(buyerTypeParam.encode(), OrderBuyerType::class.java)
                    val page = ApiHandlerUtils.searchIntegerInJson(params,"page")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"pageSize")
                    val pageToken = ApiHandlerUtils.searchStringInJson(params,"page_token")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getOrders(campaignId,orderIds,status,substatus,fromDate,toDate,supplierShipmentDateFrom,supplierShipmentDateTo,updatedAtFrom,updatedAtTo,dispatchType,fake,hasCis,onlyWaitingForCancellationApprove,onlyEstimatedDelivery,buyerType,page,pageSize,pageToken,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "provideOrderDigitalCodes" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val provideOrderDigitalCodesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (provideOrderDigitalCodesRequestParam == null) {
                        throw IllegalArgumentException("provideOrderDigitalCodesRequest is required")
                    }
                    val provideOrderDigitalCodesRequest = Gson().fromJson(provideOrderDigitalCodesRequestParam.encode(), ProvideOrderDigitalCodesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.provideOrderDigitalCodes(campaignId,orderId,provideOrderDigitalCodesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "provideOrderItemIdentifiers" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val provideOrderItemIdentifiersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (provideOrderItemIdentifiersRequestParam == null) {
                        throw IllegalArgumentException("provideOrderItemIdentifiersRequest is required")
                    }
                    val provideOrderItemIdentifiersRequest = Gson().fromJson(provideOrderItemIdentifiersRequestParam.encode(), ProvideOrderItemIdentifiersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.provideOrderItemIdentifiers(campaignId,orderId,provideOrderItemIdentifiersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setOrderBoxLayout" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val setOrderBoxLayoutRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setOrderBoxLayoutRequestParam == null) {
                        throw IllegalArgumentException("setOrderBoxLayoutRequest is required")
                    }
                    val setOrderBoxLayoutRequest = Gson().fromJson(setOrderBoxLayoutRequestParam.encode(), SetOrderBoxLayoutRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setOrderBoxLayout(campaignId,orderId,setOrderBoxLayoutRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setOrderShipmentBoxes" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val shipmentId = ApiHandlerUtils.searchLongInJson(params,"shipmentId")
                    if(shipmentId == null){
                        throw IllegalArgumentException("shipmentId is required")
                    }
                    val setOrderShipmentBoxesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (setOrderShipmentBoxesRequestParam == null) {
                        throw IllegalArgumentException("setOrderShipmentBoxesRequest is required")
                    }
                    val setOrderShipmentBoxesRequest = Gson().fromJson(setOrderShipmentBoxesRequestParam.encode(), SetOrderShipmentBoxesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setOrderShipmentBoxes(campaignId,orderId,shipmentId,setOrderShipmentBoxesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOrderItems" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val updateOrderItemRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOrderItemRequestParam == null) {
                        throw IllegalArgumentException("updateOrderItemRequest is required")
                    }
                    val updateOrderItemRequest = Gson().fromJson(updateOrderItemRequestParam.encode(), UpdateOrderItemRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOrderItems(campaignId,orderId,updateOrderItemRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOrderStatus" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val orderId = ApiHandlerUtils.searchLongInJson(params,"orderId")
                    if(orderId == null){
                        throw IllegalArgumentException("orderId is required")
                    }
                    val updateOrderStatusRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOrderStatusRequestParam == null) {
                        throw IllegalArgumentException("updateOrderStatusRequest is required")
                    }
                    val updateOrderStatusRequest = Gson().fromJson(updateOrderStatusRequestParam.encode(), UpdateOrderStatusRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOrderStatus(campaignId,orderId,updateOrderStatusRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateOrderStatuses" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchLongInJson(params,"campaignId")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val updateOrderStatusesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateOrderStatusesRequestParam == null) {
                        throw IllegalArgumentException("updateOrderStatusesRequest is required")
                    }
                    val updateOrderStatusesRequest = Gson().fromJson(updateOrderStatusesRequestParam.encode(), UpdateOrderStatusesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateOrderStatuses(campaignId,updateOrderStatusesRequest,context)
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
