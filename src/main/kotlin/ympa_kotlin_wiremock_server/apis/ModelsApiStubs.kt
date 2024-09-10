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
open class ModelsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getModel.
     *
     * @param modelId path parameter modelId pattern.
     * @param regionId query parameter regionId pattern.
     * @param currency query parameter currency pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetModelStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getModel(modelId: StringValuePattern, regionId: StringValuePattern? = null, currency: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetModelStubBuilder =
        GetModelStubBuilder(objectMapper, get(urlPathTemplate("/models/{modelId}"))
            .withPathParam("modelId", modelId)
            .apply { regionId?.let { withQueryParam("regionId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getModelOffers.
     *
     * @param modelId path parameter modelId pattern.
     * @param regionId query parameter regionId pattern.
     * @param currency query parameter currency pattern.
     * @param orderByPrice query parameter orderByPrice pattern.
     * @param count query parameter count pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetModelOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getModelOffers(modelId: StringValuePattern, regionId: StringValuePattern? = null, currency: StringValuePattern? = null, orderByPrice: StringValuePattern? = null, count: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetModelOffersStubBuilder =
        GetModelOffersStubBuilder(objectMapper, get(urlPathTemplate("/models/{modelId}/offers"))
            .withPathParam("modelId", modelId)
            .apply { regionId?.let { withQueryParam("regionId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .apply { orderByPrice?.let { withQueryParam("orderByPrice", it) } }
            .apply { count?.let { withQueryParam("count", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getModels.
     *
     * @param regionId query parameter regionId pattern.
     * @param currency query parameter currency pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetModelsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getModels(regionId: StringValuePattern? = null, currency: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetModelsStubBuilder =
        GetModelsStubBuilder(objectMapper, post(urlPathTemplate("/models"))
            .apply { regionId?.let { withQueryParam("regionId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getModelsOffers.
     *
     * @param regionId query parameter regionId pattern.
     * @param currency query parameter currency pattern.
     * @param orderByPrice query parameter orderByPrice pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetModelsOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getModelsOffers(regionId: StringValuePattern? = null, currency: StringValuePattern? = null, orderByPrice: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetModelsOffersStubBuilder =
        GetModelsOffersStubBuilder(objectMapper, post(urlPathTemplate("/models/offers"))
            .apply { regionId?.let { withQueryParam("regionId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .apply { orderByPrice?.let { withQueryParam("orderByPrice", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation searchModels.
     *
     * @param query query parameter query pattern.
     * @param regionId query parameter regionId pattern.
     * @param currency query parameter currency pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchModelsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchModels(query: StringValuePattern? = null, regionId: StringValuePattern? = null, currency: StringValuePattern? = null, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchModelsStubBuilder =
        SearchModelsStubBuilder(objectMapper, get(urlPathTemplate("/models"))
            .apply { query?.let { withQueryParam("query", it) } }
            .apply { regionId?.let { withQueryParam("regionId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )
}
