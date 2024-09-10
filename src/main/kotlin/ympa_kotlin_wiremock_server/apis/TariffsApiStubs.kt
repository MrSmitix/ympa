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
open class TariffsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation calculateTariffs.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CalculateTariffsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun calculateTariffs(configurer: MappingBuilder.() -> MappingBuilder = { this }): CalculateTariffsStubBuilder =
        CalculateTariffsStubBuilder(objectMapper, post(urlPathTemplate("/tariffs/calculate"))
            .configurer()
        )
}
