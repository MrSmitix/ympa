package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.GetFulfillmentWarehousesResponse
import ympa_kotlin_vertx_server.models.GetWarehousesResponse
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


interface WarehousesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getFulfillmentWarehouses
     * Идентификаторы складов Маркета (FBY) */
    suspend fun getFulfillmentWarehouses(context:OperationRequest):Response<GetFulfillmentWarehousesResponse>
    /* getWarehouses
     * Список складов и групп складов */
    suspend fun getWarehouses(businessId:kotlin.Long?,context:OperationRequest):Response<GetWarehousesResponse>
    companion object {
        const val address = "WarehousesApi-service"
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
            for (m in WarehousesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(WarehousesApi::class.java, address)
            return routerFactory
        }
    }
}
