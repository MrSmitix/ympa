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
open class DeliveryServicesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getDeliveryServices.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetDeliveryServicesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getDeliveryServices(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetDeliveryServicesStubBuilder =
        GetDeliveryServicesStubBuilder(objectMapper, get(urlPathTemplate("/delivery/services"))
            .configurer()
        )
}
