package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetOutletLicensesResponse
import scala.collection.immutable.Set
import model.UpdateOutletLicenseRequest

/**
  * Provides a default implementation for [[OutletLicensesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OutletLicensesApiImpl extends OutletLicensesApi {
  /**
    * @inheritdoc
    */
  override def deleteOutletLicenses(campaignId: Long, ids: Option[Set[Long]]): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOutletLicenses(campaignId: Long, outletIds: Option[Set[Long]], ids: Option[Set[Long]]): GetOutletLicensesResponse = {
    // TODO: Implement better logic

    GetOutletLicensesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOutletLicenses(campaignId: Long, updateOutletLicenseRequest: UpdateOutletLicenseRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
