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
open class BusinessesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getBusinessSettings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessSettingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessSettings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessSettingsStubBuilder =
        GetBusinessSettingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/settings"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
