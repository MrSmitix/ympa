package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.DeleteGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsRequest
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsResponse
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackRequest
import ympa_kotlin_vertx_server.models.GetGoodsFeedbackResponse
import ympa_kotlin_vertx_server.models.SkipGoodsFeedbackReactionRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentRequest
import ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentResponse
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


interface GoodsFeedbackApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteGoodsFeedbackComment
     * Удаление комментария к отзыву */
    suspend fun deleteGoodsFeedbackComment(businessId:kotlin.Long?,deleteGoodsFeedbackCommentRequest:DeleteGoodsFeedbackCommentRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* getGoodsFeedbackComments
     * Получение комментариев к отзыву */
    suspend fun getGoodsFeedbackComments(businessId:kotlin.Long?,getGoodsFeedbackCommentsRequest:GetGoodsFeedbackCommentsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetGoodsFeedbackCommentsResponse>
    /* getGoodsFeedbacks
     * Получение отзывов о товарах продавца */
    suspend fun getGoodsFeedbacks(businessId:kotlin.Long?,pageToken:kotlin.String?,limit:kotlin.Int?,getGoodsFeedbackRequest:GetGoodsFeedbackRequest?,context:OperationRequest):Response<GetGoodsFeedbackResponse>
    /* skipGoodsFeedbacksReaction
     * Отказ от ответа на отзывы */
    suspend fun skipGoodsFeedbacksReaction(businessId:kotlin.Long?,skipGoodsFeedbackReactionRequest:SkipGoodsFeedbackReactionRequest?,context:OperationRequest):Response<EmptyApiResponse>
    /* updateGoodsFeedbackComment
     * Добавление нового или изменение созданного комментария */
    suspend fun updateGoodsFeedbackComment(businessId:kotlin.Long?,updateGoodsFeedbackCommentRequest:UpdateGoodsFeedbackCommentRequest?,context:OperationRequest):Response<UpdateGoodsFeedbackCommentResponse>
    companion object {
        const val address = "GoodsFeedbackApi-service"
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
            for (m in GoodsFeedbackApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(GoodsFeedbackApi::class.java, address)
            return routerFactory
        }
    }
}
