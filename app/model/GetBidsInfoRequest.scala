package model

import play.api.libs.json._

/**
  * description.
  * @param skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetBidsInfoRequest(
  skus: Option[List[String]]
)

object GetBidsInfoRequest {
  implicit lazy val getBidsInfoRequestJsonFormat: Format[GetBidsInfoRequest] = Json.format[GetBidsInfoRequest]
}

