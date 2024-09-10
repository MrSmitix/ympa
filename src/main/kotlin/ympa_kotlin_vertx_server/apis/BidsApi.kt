package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetBidsInfoRequest
import ympa_kotlin_vertx_server.models.GetBidsInfoResponse
import ympa_kotlin_vertx_server.models.GetBidsRecommendationsRequest
import ympa_kotlin_vertx_server.models.GetBidsRecommendationsResponse
import ympa_kotlin_vertx_server.models.PutSkuBidsRequest
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


interface BidsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getBidsInfoForBusiness
     * Информация об установленных ставках */
    suspend fun getBidsInfoForBusiness(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getBidsInfoRequest:GetBidsInfoRequest?,context:OperationRequest):Response<GetBidsInfoResponse>
    /* getBidsRecommendations
     * Рекомендованные ставки для заданных товаров */
    suspend fun getBidsRecommendations(businessId:kotlin.Long?,getBidsRecommendationsRequest:GetBidsRecommendationsRequest?,context:OperationRequest):Response<GetBidsRecommendationsResponse>
    /* putBidsForBusiness
     * Включение буста продаж и установка ставок */
    suspend fun putBidsForBusiness(businessId:kotlin.Long?,putSkuBidsRequest:PutSkuBidsRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* putBidsForCampaign
     * Включение буста продаж и установка ставок для магазина */
    suspend fun putBidsForCampaign(campaignId:kotlin.Long?,putSkuBidsRequest:PutSkuBidsRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "BidsApi-service"
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
            for (m in BidsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BidsApi::class.java, address)
            return routerFactory
        }
    }
}
