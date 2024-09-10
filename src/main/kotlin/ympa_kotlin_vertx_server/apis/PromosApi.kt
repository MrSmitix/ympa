package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.DeletePromoOffersRequest
import ympa_kotlin_vertx_server.models.DeletePromoOffersResponse
import ympa_kotlin_vertx_server.models.GetPromoOffersRequest
import ympa_kotlin_vertx_server.models.GetPromoOffersResponse
import ympa_kotlin_vertx_server.models.GetPromosRequest
import ympa_kotlin_vertx_server.models.GetPromosResponse
import ympa_kotlin_vertx_server.models.UpdatePromoOffersRequest
import ympa_kotlin_vertx_server.models.UpdatePromoOffersResponse
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


interface PromosApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deletePromoOffers
     * Удаление товаров из акции */
    suspend fun deletePromoOffers(businessId:kotlin.Long?,deletePromoOffersRequest:DeletePromoOffersRequest?,context:OperationRequest):Response<DeletePromoOffersResponse>
    /* getPromoOffers
     * Получение списка товаров, которые участвуют или могут участвовать в акции */
    suspend fun getPromoOffers(businessId:kotlin.Long?,getPromoOffersRequest:GetPromoOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetPromoOffersResponse>
    /* getPromos
     * Получение списка акций */
    suspend fun getPromos(businessId:kotlin.Long?,getPromosRequest:GetPromosRequest?,context:OperationRequest):Response<GetPromosResponse>
    /* updatePromoOffers
     * Добавление товаров в акцию или изменение их цен */
    suspend fun updatePromoOffers(businessId:kotlin.Long?,updatePromoOffersRequest:UpdatePromoOffersRequest?,context:OperationRequest):Response<UpdatePromoOffersResponse>
    companion object {
        const val address = "PromosApi-service"
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
            for (m in PromosApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(PromosApi::class.java, address)
            return routerFactory
        }
    }
}
