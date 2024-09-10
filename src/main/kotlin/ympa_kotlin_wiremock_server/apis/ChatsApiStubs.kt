@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package ympa_kotlin_wiremock_server.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import ympa_kotlin_wiremock_server.models.*

/**
 * WireMock stub request builder.
 */
open class ChatsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createChat.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateChatStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createChat(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateChatStubBuilder =
        CreateChatStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/new"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getChatHistory.
     *
     * @param businessId path parameter businessId pattern.
     * @param chatId query parameter chatId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetChatHistoryStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getChatHistory(businessId: StringValuePattern, chatId: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetChatHistoryStubBuilder =
        GetChatHistoryStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/history"))
            .withPathParam("businessId", businessId)
            .apply { chatId?.let { withQueryParam("chatId", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getChats.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetChatsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getChats(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetChatsStubBuilder =
        GetChatsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation sendFileToChat.
     *
     * @param businessId path parameter businessId pattern.
     * @param chatId query parameter chatId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SendFileToChatStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sendFileToChat(businessId: StringValuePattern, chatId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SendFileToChatStubBuilder =
        SendFileToChatStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/file/send"))
            .withPathParam("businessId", businessId)
            .apply { chatId?.let { withQueryParam("chatId", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation sendMessageToChat.
     *
     * @param businessId path parameter businessId pattern.
     * @param chatId query parameter chatId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SendMessageToChatStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sendMessageToChat(businessId: StringValuePattern, chatId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SendMessageToChatStubBuilder =
        SendMessageToChatStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/message"))
            .withPathParam("businessId", businessId)
            .apply { chatId?.let { withQueryParam("chatId", it) } }
            .configurer()
        )
}
