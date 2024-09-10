package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.CreateChatRequest
import ympa_kotlin_vertx_server.models.CreateChatResponse
import ympa_kotlin_vertx_server.models.EmptyApiResponse
import ympa_kotlin_vertx_server.models.GetChatHistoryRequest
import ympa_kotlin_vertx_server.models.GetChatHistoryResponse
import ympa_kotlin_vertx_server.models.GetChatsRequest
import ympa_kotlin_vertx_server.models.GetChatsResponse
import ympa_kotlin_vertx_server.models.SendMessageToChatRequest
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


interface ChatsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* createChat
     * Создание нового чата с покупателем */
    suspend fun createChat(businessId:kotlin.Long?,createChatRequest:CreateChatRequest?,context:OperationRequest):Response<CreateChatResponse>
    /* getChatHistory
     * Получение истории сообщений в чате */
    suspend fun getChatHistory(businessId:kotlin.Long?,chatId:kotlin.Long?,getChatHistoryRequest:GetChatHistoryRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetChatHistoryResponse>
    /* getChats
     * Получение доступных чатов */
    suspend fun getChats(businessId:kotlin.Long?,getChatsRequest:GetChatsRequest?,pageToken:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<GetChatsResponse>
    /* sendFileToChat
     * Отправка файла в чат */
    suspend fun sendFileToChat(businessId:kotlin.Long?,chatId:kotlin.Long?,file:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<EmptyApiResponse>
    /* sendMessageToChat
     * Отправка сообщения в чат */
    suspend fun sendMessageToChat(businessId:kotlin.Long?,chatId:kotlin.Long?,sendMessageToChatRequest:SendMessageToChatRequest?,context:OperationRequest):Response<EmptyApiResponse>
    companion object {
        const val address = "ChatsApi-service"
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
            for (m in ChatsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ChatsApi::class.java, address)
            return routerFactory
        }
    }
}
