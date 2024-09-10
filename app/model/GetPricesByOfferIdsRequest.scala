package model

import play.api.libs.json._

/**
  * Запрос списка цен.
  * @param offerIds Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPricesByOfferIdsRequest(
  offerIds: Option[List[String]]
)

object GetPricesByOfferIdsRequest {
  implicit lazy val getPricesByOfferIdsRequestJsonFormat: Format[GetPricesByOfferIdsRequest] = Json.format[GetPricesByOfferIdsRequest]
}

