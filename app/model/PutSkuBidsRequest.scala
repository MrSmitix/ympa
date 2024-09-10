package model

import play.api.libs.json._

/**
  * description.
  * @param bids Список товаров и ставки для продвижения, которые на них нужно установить.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PutSkuBidsRequest(
  bids: List[SkuBidItemDTO]
)

object PutSkuBidsRequest {
  implicit lazy val putSkuBidsRequestJsonFormat: Format[PutSkuBidsRequest] = Json.format[PutSkuBidsRequest]
}

