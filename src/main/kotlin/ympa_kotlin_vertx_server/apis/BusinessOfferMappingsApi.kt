package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.AddOffersToArchiveRequest
import ympa_kotlin_vertx_server.models.AddOffersToArchiveResponse
import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveRequest
import ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveResponse
import ympa_kotlin_vertx_server.models.DeleteOffersRequest
import ympa_kotlin_vertx_server.models.DeleteOffersResponse
import ympa_kotlin_vertx_server.models.GetOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetOfferMappingsResponse
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsRequest
import ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsResponse
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsRequest
import ympa_kotlin_vertx_server.models.UpdateOfferMappingsResponse
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


interface BusinessOfferMappingsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* addOffersToArchive
     * Добавление товаров в архив */
    suspend fun addOffersToArchive(businessId:kotlin.Long?,addOffersToArchiveRequest:AddOffersToArchiveRequest?,context:OperationRequest):Response<AddOffersToArchiveResponse>
    /* deleteOffers
     * Удаление товаров из каталога */
    suspend fun deleteOffers(businessId:kotlin.Long?,deleteOffersRequest:DeleteOffersRequest?,context:OperationRequest):Response<DeleteOffersResponse>
    /* deleteOffersFromArchive
     * Удаление товаров из архива */
    suspend fun deleteOffersFromArchive(businessId:kotlin.Long?,deleteOffersFromArchiveRequest:DeleteOffersFromArchiveRequest?,context:OperationRequest):Response<DeleteOffersFromArchiveResponse>
    /* getOfferMappings
     * Информация о товарах в каталоге */
    suspend fun getOfferMappings(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getOfferMappingsRequest:GetOfferMappingsRequest?,context:OperationRequest):Response<GetOfferMappingsResponse>
    /* getSuggestedOfferMappings
     * Просмотр карточек на Маркете, которые подходят вашим товарам */
    suspend fun getSuggestedOfferMappings(businessId:kotlin.Long?,getSuggestedOfferMappingsRequest:GetSuggestedOfferMappingsRequest?,context:OperationRequest):Response<GetSuggestedOfferMappingsResponse>
    /* updateOfferMappings
     * Добавление товаров в каталог и изменение информации о них */
    suspend fun updateOfferMappings(businessId:kotlin.Long?,updateOfferMappingsRequest:UpdateOfferMappingsRequest?,context:OperationRequest):Response<UpdateOfferMappingsResponse>
    companion object {
        const val address = "BusinessOfferMappingsApi-service"
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
            for (m in BusinessOfferMappingsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BusinessOfferMappingsApi::class.java, address)
            return routerFactory
        }
    }
}
