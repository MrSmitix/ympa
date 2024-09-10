package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.ConfirmShipmentRequest
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetShipmentOrdersInfoResponse
import ympa_kotlin_vertx_server.models.GetShipmentResponse
import ympa_kotlin_vertx_server.models.SearchShipmentsRequest
import ympa_kotlin_vertx_server.models.SearchShipmentsResponse
import ympa_kotlin_vertx_server.models.SetShipmentPalletsCountRequest
import ympa_kotlin_vertx_server.models.ShipmentPalletLabelPageFormatType
import ympa_kotlin_vertx_server.models.TransferOrdersFromShipmentRequest
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


interface ShipmentsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* confirmShipment
     * Подтверждение отгрузки */
    suspend fun confirmShipment(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,confirmShipmentRequest:ConfirmShipmentRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* downloadShipmentAct
     * Получение акта приема-передачи */
    suspend fun downloadShipmentAct(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentDiscrepancyAct
     * Получение акта расхождений */
    suspend fun downloadShipmentDiscrepancyAct(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentInboundAct
     * Получение фактического акта приема-передачи */
    suspend fun downloadShipmentInboundAct(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentPalletLabels
     * Ярлыки для доверительной приемки (FBS) */
    suspend fun downloadShipmentPalletLabels(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,format:ShipmentPalletLabelPageFormatType?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentReceptionTransferAct
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее */
    suspend fun downloadShipmentReceptionTransferAct(campaignId:kotlin.Long?,warehouseId:kotlin.Int?,context:OperationRequest):Response<java.io.File>
    /* downloadShipmentTransportationWaybill
     * Получение транспортной накладной */
    suspend fun downloadShipmentTransportationWaybill(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* getShipment
     * Получение информации об одной отгрузке */
    suspend fun getShipment(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,cancelledOrders:kotlin.Boolean?,context:OperationRequest):Response<GetShipmentResponse>
    /* getShipmentOrdersInfo
     * Получение информации о возможности печати ярлыков (FBS) */
    suspend fun getShipmentOrdersInfo(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,context:OperationRequest):Response<GetShipmentOrdersInfoResponse>
    /* searchShipments
     * Получение информации о нескольких отгрузках */
    suspend fun searchShipments(campaignId:kotlin.Long?,searchShipmentsRequest:SearchShipmentsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<SearchShipmentsResponse>
    /* setShipmentPalletsCount
     * Передача количества упаковок в отгрузке */
    suspend fun setShipmentPalletsCount(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,setShipmentPalletsCountRequest:SetShipmentPalletsCountRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* transferOrdersFromShipment
     * Перенос заказов в следующую отгрузку */
    suspend fun transferOrdersFromShipment(campaignId:kotlin.Long?,shipmentId:kotlin.Long?,transferOrdersFromShipmentRequest:TransferOrdersFromShipmentRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "ShipmentsApi-service"
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
            for (m in ShipmentsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ShipmentsApi::class.java, address)
            return routerFactory
        }
    }
}
