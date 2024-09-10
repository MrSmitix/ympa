package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.GetCategoryContentParametersResponse
import ympa_kotlin_vertx_server.models.GetOfferCardsContentStatusRequest
import ympa_kotlin_vertx_server.models.GetOfferCardsContentStatusResponse
import ympa_kotlin_vertx_server.models.UpdateOfferContentRequest
import ympa_kotlin_vertx_server.models.UpdateOfferContentResponse
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


interface ContentApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getCategoryContentParameters
     * Списки характеристик товаров по категориям */
    suspend fun getCategoryContentParameters(categoryId:kotlin.Long?,context:OperationRequest):Response<GetCategoryContentParametersResponse>
    /* getOfferCardsContentStatus
     * Получение информации о заполненности карточек магазина */
    suspend fun getOfferCardsContentStatus(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getOfferCardsContentStatusRequest:GetOfferCardsContentStatusRequest?,context:OperationRequest):Response<GetOfferCardsContentStatusResponse>
    /* updateOfferContent
     * Редактирование категорийных характеристик товара */
    suspend fun updateOfferContent(businessId:kotlin.Long?,updateOfferContentRequest:UpdateOfferContentRequest?,context:OperationRequest):Response<UpdateOfferContentResponse>
    companion object {
        const val address = "ContentApi-service"
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
            for (m in ContentApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ContentApi::class.java, address)
            return routerFactory
        }
    }
}
