package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignOfferDTO._

case class GetCampaignOfferDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,
quantum: Option[QuantumDTO],
/* Есть ли товар в продаже.  */
  available: Option[Boolean],
basicPrice: Option[GetPriceWithDiscountDTO],
campaignPrice: Option[GetPriceWithVatDTO],
status: Option[OfferCampaignStatusType],
/* Ошибки, препятствующие размещению товара на витрине.  */
  errors: Option[List[OfferErrorDTO]],
/* Предупреждения, не препятствующие размещению товара на витрине.  */
  warnings: Option[List[OfferErrorDTO]])

object GetCampaignOfferDTO {
  import DateTimeCodecs._

  implicit val GetCampaignOfferDTOCodecJson: CodecJson[GetCampaignOfferDTO] = CodecJson.derive[GetCampaignOfferDTO]
  implicit val GetCampaignOfferDTODecoder: EntityDecoder[GetCampaignOfferDTO] = jsonOf[GetCampaignOfferDTO]
  implicit val GetCampaignOfferDTOEncoder: EntityEncoder[GetCampaignOfferDTO] = jsonEncoderOf[GetCampaignOfferDTO]
}
