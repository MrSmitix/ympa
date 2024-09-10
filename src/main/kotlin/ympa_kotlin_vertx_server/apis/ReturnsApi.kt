package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetReturnResponse
import ympa_kotlin_vertx_server.models.GetReturnsResponse
import ympa_kotlin_vertx_server.models.RefundStatusType
import ympa_kotlin_vertx_server.models.ReturnType
import ympa_kotlin_vertx_server.models.SetReturnDecisionRequest
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


interface ReturnsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getReturn
     * Информация о невыкупе или возврате */
    suspend fun getReturn(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,context:OperationRequest):Response<GetReturnResponse>
    /* getReturnApplication
     * Получение заявления на возврат */
    suspend fun getReturnApplication(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,context:OperationRequest):Response<java.io.File>
    /* getReturnPhoto
     * Получение фотографии возврата */
    suspend fun getReturnPhoto(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,itemId:kotlin.Long?,imageHash:kotlin.String?,context:OperationRequest):Response<java.io.File>
    /* getReturns
     * Список невыкупов и возвратов */
    suspend fun getReturns(campaignId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,orderIds:kotlin.Array<kotlin.Long>?,statuses:kotlin.Array<RefundStatusType>?,type:ReturnType?,fromDate:java.time.LocalDate?,toDate:java.time.LocalDate?,fromDate2:java.time.LocalDate?,toDate2:java.time.LocalDate?,context:OperationRequest):Response<GetReturnsResponse>
    /* setReturnDecision
     * Принятие или изменение решения по возврату */
    suspend fun setReturnDecision(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,setReturnDecisionRequest:SetReturnDecisionRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* submitReturnDecision
     * Подтверждение решения по возврату */
    suspend fun submitReturnDecision(campaignId:kotlin.Long?,orderId:kotlin.Long?,returnId:kotlin.Long?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "ReturnsApi-service"
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
            for (m in ReturnsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ReturnsApi::class.java, address)
            return routerFactory
        }
    }
}
