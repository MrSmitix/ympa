package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetCampaignLoginsResponse
import model.GetCampaignRegionResponse
import model.GetCampaignResponse
import model.GetCampaignSettingsResponse
import model.GetCampaignsResponse

/**
  * Provides a default implementation for [[CampaignsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class CampaignsApiImpl extends CampaignsApi {
  /**
    * @inheritdoc
    */
  override def getCampaign(campaignId: Long): GetCampaignResponse = {
    // TODO: Implement better logic

    GetCampaignResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignLogins(campaignId: Long): GetCampaignLoginsResponse = {
    // TODO: Implement better logic

    GetCampaignLoginsResponse(List.empty[String])
  }

  /**
    * @inheritdoc
    */
  override def getCampaignRegion(campaignId: Long): GetCampaignRegionResponse = {
    // TODO: Implement better logic

    GetCampaignRegionResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignSettings(campaignId: Long): GetCampaignSettingsResponse = {
    // TODO: Implement better logic

    GetCampaignSettingsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaigns(page: Option[Int], pageSize: Option[Int]): GetCampaignsResponse = {
    // TODO: Implement better logic

    GetCampaignsResponse(List.empty[CampaignDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignsByLogin(login: String, page: Option[Int], pageSize: Option[Int]): GetCampaignsResponse = {
    // TODO: Implement better logic

    GetCampaignsResponse(List.empty[CampaignDTO], None)
  }
}
