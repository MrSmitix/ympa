package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.CurrencyType
import ympa_kotlin_vertx_server.models.DeleteCampaignOffersRequest
import ympa_kotlin_vertx_server.models.DeleteCampaignOffersResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetAllOffersResponse
import ympa_kotlin_vertx_server.models.GetCampaignOffersRequest
import ympa_kotlin_vertx_server.models.GetCampaignOffersResponse
import ympa_kotlin_vertx_server.models.GetOfferRecommendationsRequest
import ympa_kotlin_vertx_server.models.GetOfferRecommendationsResponse
import ympa_kotlin_vertx_server.models.GetOffersResponse
import ympa_kotlin_vertx_server.models.UpdateCampaignOffersRequest
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


interface OffersApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteCampaignOffers
     * Удаление товаров из ассортимента магазина */
    suspend fun deleteCampaignOffers(campaignId:kotlin.Long?,deleteCampaignOffersRequest:DeleteCampaignOffersRequest?,context:OperationRequest):Response<DeleteCampaignOffersResponse>
    /* getAllOffers
     * Все предложения магазина */
    suspend fun getAllOffers(campaignId:kotlin.Long?,feedId:kotlin.Long?,chunk:kotlin.Int?,context:OperationRequest):Response<GetAllOffersResponse>
    /* getCampaignOffers
     * Информация о товарах, которые размещены в заданном магазине */
    suspend fun getCampaignOffers(campaignId:kotlin.Long?,getCampaignOffersRequest:GetCampaignOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetCampaignOffersResponse>
    /* getOfferRecommendations
     * Рекомендации Маркета, касающиеся цен */
    suspend fun getOfferRecommendations(businessId:kotlin.Long?,getOfferRecommendationsRequest:GetOfferRecommendationsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetOfferRecommendationsResponse>
    /* getOffers
     * Предложения магазина */
    suspend fun getOffers(campaignId:kotlin.Long?,query:kotlin.String?,feedId:kotlin.Long?,shopCategoryId:kotlin.String?,currency:CurrencyType?,matched:kotlin.Boolean?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetOffersResponse>
    /* updateCampaignOffers
     * Изменение условий продажи товаров в магазине */
    suspend fun updateCampaignOffers(campaignId:kotlin.Long?,updateCampaignOffersRequest:UpdateCampaignOffersRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "OffersApi-service"
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
            for (m in OffersApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OffersApi::class.java, address)
            return routerFactory
        }
    }
}
