package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesResponse
import ympa_kotlin_vertx_server.models.OfferAvailabilityStatusType
import ympa_kotlin_vertx_server.models.OfferMappingKindType
import ympa_kotlin_vertx_server.models.OfferProcessingStatusType
import ympa_kotlin_vertx_server.models.UpdateOfferMappingEntryRequest
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


interface OfferMappingsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getOfferMappingEntries
     * Список товаров в каталоге */
    suspend fun getOfferMappingEntries(campaignId:kotlin.Long?,offerId:kotlin.Array<kotlin.String>?,shopSku:kotlin.Array<kotlin.String>?,mappingKind:OfferMappingKindType?,status:kotlin.Array<OfferProcessingStatusType>?,availability:kotlin.Array<OfferAvailabilityStatusType>?,categoryId:kotlin.Array<kotlin.Int>?,vendor:kotlin.Array<kotlin.String>?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetOfferMappingEntriesResponse>
    /* getSuggestedOfferMappingEntries
     * Рекомендованные карточки для товаров */
    suspend fun getSuggestedOfferMappingEntries(campaignId:kotlin.Long?,getSuggestedOfferMappingEntriesRequest:GetSuggestedOfferMappingEntriesRequest?,context:OperationRequest):Response<GetSuggestedOfferMappingEntriesResponse>
    /* updateOfferMappingEntries
     * Добавление и редактирование товаров в каталоге */
    suspend fun updateOfferMappingEntries(campaignId:kotlin.Long?,updateOfferMappingEntryRequest:UpdateOfferMappingEntryRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "OfferMappingsApi-service"
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
            for (m in OfferMappingsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OfferMappingsApi::class.java, address)
            return routerFactory
        }
    }
}
