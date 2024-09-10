package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация об установленной цене на товар.
  * @param id Идентификатор предложения из прайс-листа.
  * @param marketSku SKU на Маркете.
  * @param updatedAt Дата и время последнего обновления цены на товар.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferPriceResponseDTO(
  id: Option[String],
  price: Option[PriceDTO],
  marketSku: Option[Long],
  updatedAt: Option[OffsetDateTime]
)

object OfferPriceResponseDTO {
  implicit lazy val offerPriceResponseDTOJsonFormat: Format[OfferPriceResponseDTO] = Json.format[OfferPriceResponseDTO]
}

