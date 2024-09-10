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
open class CampaignsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getCampaign.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaign(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignStubBuilder =
        GetCampaignStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignLogins.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignLoginsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignLogins(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignLoginsStubBuilder =
        GetCampaignLoginsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/logins"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignRegion.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignRegionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignRegion(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignRegionStubBuilder =
        GetCampaignRegionStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/region"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignSettings.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignSettingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignSettings(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignSettingsStubBuilder =
        GetCampaignSettingsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/settings"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaigns.
     *
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaigns(page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignsStubBuilder =
        GetCampaignsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns"))
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignsByLogin.
     *
     * @param login path parameter login pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignsByLoginStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignsByLogin(login: StringValuePattern, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignsByLoginStubBuilder =
        GetCampaignsByLoginStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/by_login/{login}"))
            .withPathParam("login", login)
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )
}
