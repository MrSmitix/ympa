package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.ChangeOutletRequest
import ympa_kotlin_vertx_server.models.CreateOutletResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetOutletResponse
import ympa_kotlin_vertx_server.models.GetOutletsResponse
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


interface OutletsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* createOutlet
     * Создание точки продаж */
    suspend fun createOutlet(campaignId:kotlin.Long?,changeOutletRequest:ChangeOutletRequest?,context:OperationRequest):Response<CreateOutletResponse>
    /* deleteOutlet
     * Удаление точки продаж */
    suspend fun deleteOutlet(campaignId:kotlin.Long?,outletId:kotlin.Long?,context:OperationRequest):Response<EmptyApiResponse>
    /* getOutlet
     * Информация об одной точке продаж */
    suspend fun getOutlet(campaignId:kotlin.Long?,outletId:kotlin.Long?,context:OperationRequest):Response<GetOutletResponse>
    /* getOutlets
     * Информация о нескольких точках продаж */
    suspend fun getOutlets(campaignId:kotlin.Long?,pageToken:kotlin.String?,regionId:kotlin.Long?,shopOutletCode:kotlin.String?,regionId2:kotlin.Long?,context:OperationRequest):Response<GetOutletsResponse>
    /* updateOutlet
     * Изменение информации о точке продаж */
    suspend fun updateOutlet(campaignId:kotlin.Long?,outletId:kotlin.Long?,changeOutletRequest:ChangeOutletRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "OutletsApi-service"
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
            for (m in OutletsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OutletsApi::class.java, address)
            return routerFactory
        }
    }
}
