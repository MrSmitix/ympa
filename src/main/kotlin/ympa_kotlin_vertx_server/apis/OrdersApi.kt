package ympa_kotlin_vertx_server.apis

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
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface OrdersApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* acceptOrderCancellation
     * Отмена заказа покупателем */
    suspend fun acceptOrderCancellation(campaignId:kotlin.Long?,orderId:kotlin.Long?,acceptOrderCancellationRequest:AcceptOrderCancellationRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* getOrder
     * Информация об одном заказе */
    suspend fun getOrder(campaignId:kotlin.Long?,orderId:kotlin.Long?,context:OperationRequest):Response<GetOrderResponse>
    /* getOrders
     * Информация о нескольких заказах */
    suspend fun getOrders(campaignId:kotlin.Long?,orderIds:kotlin.Array<kotlin.Long>?,status:kotlin.collections.Set<OrderStatusType>?,substatus:kotlin.collections.Set<OrderSubstatusType>?,fromDate:java.time.LocalDate?,toDate:java.time.LocalDate?,supplierShipmentDateFrom:java.time.LocalDate?,supplierShipmentDateTo:java.time.LocalDate?,updatedAtFrom:java.time.OffsetDateTime?,updatedAtTo:java.time.OffsetDateTime?,dispatchType:OrderDeliveryDispatchType?,fake:kotlin.Boolean?,hasCis:kotlin.Boolean?,onlyWaitingForCancellationApprove:kotlin.Boolean?,onlyEstimatedDelivery:kotlin.Boolean?,buyerType:OrderBuyerType?,page:kotlin.Int?,pageSize:kotlin.Int?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetOrdersResponse>
    /* provideOrderDigitalCodes
     * Передача ключей цифровых товаров */
    suspend fun provideOrderDigitalCodes(campaignId:kotlin.Long?,orderId:kotlin.Long?,provideOrderDigitalCodesRequest:ProvideOrderDigitalCodesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* provideOrderItemIdentifiers
     * Передача кодов маркировки единиц товара */
    suspend fun provideOrderItemIdentifiers(campaignId:kotlin.Long?,orderId:kotlin.Long?,provideOrderItemIdentifiersRequest:ProvideOrderItemIdentifiersRequest?,context:OperationRequest):Response<ProvideOrderItemIdentifiersResponse>
    /* setOrderBoxLayout
     * Подготовка заказа */
    suspend fun setOrderBoxLayout(campaignId:kotlin.Long?,orderId:kotlin.Long?,setOrderBoxLayoutRequest:SetOrderBoxLayoutRequest?,context:OperationRequest):Response<SetOrderBoxLayoutResponse>
    /* setOrderShipmentBoxes
     * Передача количества грузовых мест в заказе */
    suspend fun setOrderShipmentBoxes(campaignId:kotlin.Long?,orderId:kotlin.Long?,shipmentId:kotlin.Long?,setOrderShipmentBoxesRequest:SetOrderShipmentBoxesRequest?,context:OperationRequest):Response<SetOrderShipmentBoxesResponse>
    /* updateOrderItems
     * Удаление товара из заказа или уменьшение числа единиц */
    suspend fun updateOrderItems(campaignId:kotlin.Long?,orderId:kotlin.Long?,updateOrderItemRequest:UpdateOrderItemRequest?,context:OperationRequest):Response<Void>
    /* updateOrderStatus
     * Изменение статуса одного заказа */
    suspend fun updateOrderStatus(campaignId:kotlin.Long?,orderId:kotlin.Long?,updateOrderStatusRequest:UpdateOrderStatusRequest?,context:OperationRequest):Response<UpdateOrderStatusResponse>
    /* updateOrderStatuses
     * Изменение статусов нескольких заказов */
    suspend fun updateOrderStatuses(campaignId:kotlin.Long?,updateOrderStatusesRequest:UpdateOrderStatusesRequest?,context:OperationRequest):Response<UpdateOrderStatusesResponse>
    companion object {
        const val address = "OrdersApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in OrdersApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OrdersApi::class.java, address)
            return routerFactory
        }
    }
}
