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
open class RegionsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation searchRegionChildren.
     *
     * @param regionId path parameter regionId pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchRegionChildrenStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchRegionChildren(regionId: StringValuePattern, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchRegionChildrenStubBuilder =
        SearchRegionChildrenStubBuilder(objectMapper, get(urlPathTemplate("/regions/{regionId}/children"))
            .withPathParam("regionId", regionId)
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation searchRegionsById.
     *
     * @param regionId path parameter regionId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchRegionsByIdStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchRegionsById(regionId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchRegionsByIdStubBuilder =
        SearchRegionsByIdStubBuilder(objectMapper, get(urlPathTemplate("/regions/{regionId}"))
            .withPathParam("regionId", regionId)
            .configurer()
        )

    /**
     * Construct a stub for the operation searchRegionsByName.
     *
     * @param name query parameter name pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchRegionsByNameStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchRegionsByName(name: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchRegionsByNameStubBuilder =
        SearchRegionsByNameStubBuilder(objectMapper, get(urlPathTemplate("/regions"))
            .apply { name?.let { withQueryParam("name", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )
}
