package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.GetCampaignLoginsResponse
import ympa_kotlin_vertx_server.models.GetCampaignRegionResponse
import ympa_kotlin_vertx_server.models.GetCampaignResponse
import ympa_kotlin_vertx_server.models.GetCampaignSettingsResponse
import ympa_kotlin_vertx_server.models.GetCampaignsResponse
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


interface CampaignsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getCampaign
     * Информация о магазине */
    suspend fun getCampaign(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignResponse>
    /* getCampaignLogins
     * Логины, связанные с магазином */
    suspend fun getCampaignLogins(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignLoginsResponse>
    /* getCampaignRegion
     * Регион магазина */
    suspend fun getCampaignRegion(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignRegionResponse>
    /* getCampaignSettings
     * Настройки магазина */
    suspend fun getCampaignSettings(campaignId:kotlin.Long?,context:OperationRequest):Response<GetCampaignSettingsResponse>
    /* getCampaigns
     * Список магазинов пользователя */
    suspend fun getCampaigns(page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetCampaignsResponse>
    /* getCampaignsByLogin
     * Магазины, доступные логину */
    suspend fun getCampaignsByLogin(login:kotlin.String?,page:kotlin.Int?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetCampaignsResponse>
    companion object {
        const val address = "CampaignsApi-service"
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
            for (m in CampaignsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CampaignsApi::class.java, address)
            return routerFactory
        }
    }
}
