package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.CurrencyType
import ympa_kotlin_vertx_server.models.GetModelsOffersResponse
import ympa_kotlin_vertx_server.models.GetModelsRequest
import ympa_kotlin_vertx_server.models.GetModelsResponse
import ympa_kotlin_vertx_server.models.SearchModelsResponse
import ympa_kotlin_vertx_server.models.SortOrderType
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


interface ModelsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getModel
     * Информация об одной модели */
    suspend fun getModel(modelId:kotlin.Long?,regionId:kotlin.Long?,currency:CurrencyType?,context:OperationRequest):Response<GetModelsResponse>
    /* getModelOffers
     * Список предложений для одной модели */
    suspend fun getModelOffers(modelId:kotlin.Long?,regionId:kotlin.Long?,currency:CurrencyType?,orderByPrice:SortOrderType?,count:kotlin.Int?,page:kotlin.Int?,context:OperationRequest):Response<GetModelsOffersResponse>
    /* getModels
     * Информация о нескольких моделях */
    suspend fun getModels(regionId:kotlin.Long?,getModelsRequest:GetModelsRequest?,currency:CurrencyType?,context:OperationRequest):Response<GetModelsResponse>
    /* getModelsOffers
     * Список предложений для нескольких моделей */
    suspend fun getModelsOffers(regionId:kotlin.Long?,getModelsRequest:GetModelsRequest?,currency:CurrencyType?,orderByPrice:SortOrderType?,context:OperationRequest):Response<GetModelsOffersResponse>
    /* searchModels
     * Поиск модели товара */
    suspend fun searchModels(query:kotlin.String?,regionId:kotlin.Long?,currency:CurrencyType?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<SearchModelsResponse>
    companion object {
        const val address = "ModelsApi-service"
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
            for (m in ModelsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ModelsApi::class.java, address)
            return routerFactory
        }
    }
}
