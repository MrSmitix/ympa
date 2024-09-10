package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetPricesByOfferIdsRequest
import ympa_kotlin_vertx_server.models.GetPricesByOfferIdsResponse
import ympa_kotlin_vertx_server.models.GetPricesResponse
import ympa_kotlin_vertx_server.models.SuggestPricesRequest
import ympa_kotlin_vertx_server.models.SuggestPricesResponse
import ympa_kotlin_vertx_server.models.UpdateBusinessPricesRequest
import ympa_kotlin_vertx_server.models.UpdatePricesRequest
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


interface PricesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getPrices
     * Список цен */
    suspend fun getPrices(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,archived:kotlin.Boolean?,context:OperationRequest):Response<GetPricesResponse>
    /* getPricesByOfferIds
     * Просмотр цен на указанные товары в магазине */
    suspend fun getPricesByOfferIds(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getPricesByOfferIdsRequest:GetPricesByOfferIdsRequest?,context:OperationRequest):Response<GetPricesByOfferIdsResponse>
    /* getSuggestedPrices
     * Цены для продвижения товаров */
    suspend fun getSuggestedPrices(campaignId:kotlin.Long?,suggestPricesRequest:SuggestPricesRequest?,context:OperationRequest):Response<SuggestPricesResponse>
    /* updateBusinessPrices
     * Установка цен на товары во всех магазинах */
    suspend fun updateBusinessPrices(businessId:kotlin.Long?,updateBusinessPricesRequest:UpdateBusinessPricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updatePrices
     * Установка цен на товары в конкретном магазине */
    suspend fun updatePrices(campaignId:kotlin.Long?,updatePricesRequest:UpdatePricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "PricesApi-service"
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
            for (m in PricesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(PricesApi::class.java, address)
            return routerFactory
        }
    }
}
