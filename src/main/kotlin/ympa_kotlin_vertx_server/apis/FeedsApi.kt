package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiLockedErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.FeedIndexLogsStatusType
import ympa_kotlin_vertx_server.models.GetFeedIndexLogsResponse
import ympa_kotlin_vertx_server.models.GetFeedResponse
import ympa_kotlin_vertx_server.models.GetFeedsResponse
import ympa_kotlin_vertx_server.models.SetFeedParamsRequest
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


interface FeedsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getFeed
     * Информация о прайс-листе */
    suspend fun getFeed(campaignId:kotlin.Long?,feedId:kotlin.Long?,context:OperationRequest):Response<GetFeedResponse>
    /* getFeedIndexLogs
     * Отчет по индексации прайс-листа */
    suspend fun getFeedIndexLogs(campaignId:kotlin.Long?,feedId:kotlin.Long?,limit:kotlin.Int?,publishedTimeFrom:java.time.OffsetDateTime?,publishedTimeTo:java.time.OffsetDateTime?,status:FeedIndexLogsStatusType?,context:OperationRequest):Response<GetFeedIndexLogsResponse>
    /* getFeeds
     * Список прайс-листов магазина */
    suspend fun getFeeds(campaignId:kotlin.Long?,context:OperationRequest):Response<GetFeedsResponse>
    /* refreshFeed
     * Сообщить, что прайс-лист обновился */
    suspend fun refreshFeed(campaignId:kotlin.Long?,feedId:kotlin.Long?,context:OperationRequest):Response<EmptyApiResponse>
    /* setFeedParams
     * Изменение параметров прайс-листа */
    suspend fun setFeedParams(campaignId:kotlin.Long?,feedId:kotlin.Long?,setFeedParamsRequest:SetFeedParamsRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "FeedsApi-service"
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
            for (m in FeedsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(FeedsApi::class.java, address)
            return routerFactory
        }
    }
}
