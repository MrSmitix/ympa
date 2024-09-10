package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.GetOrderLabelsDataResponse
import ympa_kotlin_vertx_server.models.PageFormatType
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


interface OrderLabelsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* generateOrderLabel
     * Готовый ярлык‑наклейка для коробки в заказе */
    suspend fun generateOrderLabel(campaignId:kotlin.Long?,orderId:kotlin.Long?,shipmentId:kotlin.Long?,boxId:kotlin.Long?,format:PageFormatType?,context:OperationRequest):Response<java.io.File>
    /* generateOrderLabels
     * Готовые ярлыки‑наклейки на все коробки в одном заказе */
    suspend fun generateOrderLabels(campaignId:kotlin.Long?,orderId:kotlin.Long?,format:PageFormatType?,context:OperationRequest):Response<java.io.File>
    /* getOrderLabelsData
     * Данные для самостоятельного изготовления ярлыков */
    suspend fun getOrderLabelsData(campaignId:kotlin.Long?,orderId:kotlin.Long?,context:OperationRequest):Response<GetOrderLabelsDataResponse>
    companion object {
        const val address = "OrderLabelsApi-service"
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
            for (m in OrderLabelsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OrderLabelsApi::class.java, address)
            return routerFactory
        }
    }
}
