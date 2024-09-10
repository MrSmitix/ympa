package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.ConfirmPricesRequest
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetQuarantineOffersRequest
import ympa_kotlin_vertx_server.models.GetQuarantineOffersResponse
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


interface PriceQuarantineApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* confirmBusinessPrices
     * Удаление товара из карантина по цене в кабинете */
    suspend fun confirmBusinessPrices(businessId:kotlin.Long?,confirmPricesRequest:ConfirmPricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* confirmCampaignPrices
     * Удаление товара из карантина по цене в магазине */
    suspend fun confirmCampaignPrices(campaignId:kotlin.Long?,confirmPricesRequest:ConfirmPricesRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* getBusinessQuarantineOffers
     * Список товаров, находящихся в карантине по цене в кабинете */
    suspend fun getBusinessQuarantineOffers(businessId:kotlin.Long?,getQuarantineOffersRequest:GetQuarantineOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetQuarantineOffersResponse>
    /* getCampaignQuarantineOffers
     * Список товаров, находящихся в карантине по цене в магазине */
    suspend fun getCampaignQuarantineOffers(campaignId:kotlin.Long?,getQuarantineOffersRequest:GetQuarantineOffersRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetQuarantineOffersResponse>
    companion object {
        const val address = "PriceQuarantineApi-service"
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
            for (m in PriceQuarantineApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(PriceQuarantineApi::class.java, address)
            return routerFactory
        }
    }
}
