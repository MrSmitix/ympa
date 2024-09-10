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
open class GoodsStatsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getGoodsStats.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetGoodsStatsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getGoodsStats(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetGoodsStatsStubBuilder =
        GetGoodsStatsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/stats/skus"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
