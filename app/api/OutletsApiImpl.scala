package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.ChangeOutletRequest
import model.CreateOutletResponse
import model.EmptyApiResponse
import model.GetOutletResponse
import model.GetOutletsResponse

/**
  * Provides a default implementation for [[OutletsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OutletsApiImpl extends OutletsApi {
  /**
    * @inheritdoc
    */
  override def createOutlet(campaignId: Long, changeOutletRequest: ChangeOutletRequest): CreateOutletResponse = {
    // TODO: Implement better logic

    CreateOutletResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOutlet(campaignId: Long, outletId: Long): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOutlet(campaignId: Long, outletId: Long): GetOutletResponse = {
    // TODO: Implement better logic

    GetOutletResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getOutlets(campaignId: Long, pageToken: Option[String], regionId: Option[Long], shopOutletCode: Option[String], regionId2: Option[Long]): GetOutletsResponse = {
    // TODO: Implement better logic

    GetOutletsResponse(List.empty[FullOutletDTO], None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateOutlet(campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
