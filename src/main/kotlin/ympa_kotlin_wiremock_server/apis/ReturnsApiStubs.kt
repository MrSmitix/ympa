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
open class ReturnsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getReturn.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturn(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnStubBuilder =
        GetReturnStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturnApplication.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnApplicationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturnApplication(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnApplicationStubBuilder =
        GetReturnApplicationStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturnPhoto.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param itemId path parameter itemId pattern.
     * @param imageHash path parameter imageHash pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnPhotoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturnPhoto(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, itemId: StringValuePattern, imageHash: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnPhotoStubBuilder =
        GetReturnPhotoStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .withPathParam("itemId", itemId)
            .withPathParam("imageHash", imageHash)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturns.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param orderIds query parameter orderIds pattern.
     * @param statuses query parameter statuses pattern.
     * @param type query parameter type pattern.
     * @param fromDate query parameter fromDate pattern.
     * @param toDate query parameter toDate pattern.
     * @param fromDate2 query parameter fromDate2 pattern.
     * @param toDate2 query parameter toDate2 pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturns(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, orderIds: StringValuePattern? = null, statuses: StringValuePattern? = null, type: StringValuePattern? = null, fromDate: StringValuePattern? = null, toDate: StringValuePattern? = null, fromDate2: StringValuePattern? = null, toDate2: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnsStubBuilder =
        GetReturnsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/returns"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { orderIds?.let { withQueryParam("orderIds", it) } }
            .apply { statuses?.let { withQueryParam("statuses", it) } }
            .apply { type?.let { withQueryParam("type", it) } }
            .apply { fromDate?.let { withQueryParam("fromDate", it) } }
            .apply { toDate?.let { withQueryParam("toDate", it) } }
            .apply { fromDate2?.let { withQueryParam("fromDate2", it) } }
            .apply { toDate2?.let { withQueryParam("toDate2", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation setReturnDecision.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetReturnDecisionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setReturnDecision(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetReturnDecisionStubBuilder =
        SetReturnDecisionStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .configurer()
        )

    /**
     * Construct a stub for the operation submitReturnDecision.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SubmitReturnDecisionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun submitReturnDecision(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SubmitReturnDecisionStubBuilder =
        SubmitReturnDecisionStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .configurer()
        )
}
