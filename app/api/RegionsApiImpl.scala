package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetRegionWithChildrenResponse
import model.GetRegionsResponse

/**
  * Provides a default implementation for [[RegionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class RegionsApiImpl extends RegionsApi {
  /**
    * @inheritdoc
    */
  override def searchRegionChildren(regionId: Long, page: Option[Int], pageSize: Option[Int]): GetRegionWithChildrenResponse = {
    // TODO: Implement better logic

    GetRegionWithChildrenResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRegionsById(regionId: Long): GetRegionsResponse = {
    // TODO: Implement better logic

    GetRegionsResponse(List.empty[RegionDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int]): GetRegionsResponse = {
    // TODO: Implement better logic

    GetRegionsResponse(List.empty[RegionDTO], None)
  }
}
