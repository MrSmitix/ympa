package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetRegionWithChildrenResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetRegionWithChildrenResponse(
  pager: Option[FlippingPagerDTO],
  regions: Option[RegionDTO]
)

object GetRegionWithChildrenResponse {
  implicit lazy val getRegionWithChildrenResponseJsonFormat: Format[GetRegionWithChildrenResponse] = Json.format[GetRegionWithChildrenResponse]
}

