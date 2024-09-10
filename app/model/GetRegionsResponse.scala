package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetRegionsResponse.
  * @param regions Регион доставки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetRegionsResponse(
  regions: List[RegionDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GetRegionsResponse {
  implicit lazy val getRegionsResponseJsonFormat: Format[GetRegionsResponse] = Json.format[GetRegionsResponse]
}

