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
open class StocksApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getStocks.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetStocksStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getStocks(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetStocksStubBuilder =
        GetStocksStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers/stocks"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation updateStocks.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateStocksStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateStocks(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateStocksStubBuilder =
        UpdateStocksStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/offers/stocks"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
