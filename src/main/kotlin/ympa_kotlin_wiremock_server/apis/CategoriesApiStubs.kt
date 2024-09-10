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
open class CategoriesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getCategoriesMaxSaleQuantum.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCategoriesMaxSaleQuantumStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCategoriesMaxSaleQuantum(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCategoriesMaxSaleQuantumStubBuilder =
        GetCategoriesMaxSaleQuantumStubBuilder(objectMapper, post(urlPathTemplate("/categories/max-sale-quantum"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getCategoriesTree.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCategoriesTreeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCategoriesTree(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCategoriesTreeStubBuilder =
        GetCategoriesTreeStubBuilder(objectMapper, post(urlPathTemplate("/categories/tree"))
            .configurer()
        )
}
