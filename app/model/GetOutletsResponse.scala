package model

import play.api.libs.json._

/**
  * Ответ на запрос информации о точках продаж.
  * @param outlets Информация о точках продаж.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOutletsResponse(
  outlets: List[FullOutletDTO],
  paging: Option[ScrollingPagerDTO],
  pager: Option[FlippingPagerDTO]
)

object GetOutletsResponse {
  implicit lazy val getOutletsResponseJsonFormat: Format[GetOutletsResponse] = Json.format[GetOutletsResponse]
}

