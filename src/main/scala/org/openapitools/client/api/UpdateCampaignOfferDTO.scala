package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateCampaignOfferDTO._

case class UpdateCampaignOfferDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,
quantum: Option[QuantumDTO],
/* Есть ли товар в продаже.  */
  available: Option[Boolean],
/* Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете.  */
  vat: Option[Integer])

object UpdateCampaignOfferDTO {
  import DateTimeCodecs._

  implicit val UpdateCampaignOfferDTOCodecJson: CodecJson[UpdateCampaignOfferDTO] = CodecJson.derive[UpdateCampaignOfferDTO]
  implicit val UpdateCampaignOfferDTODecoder: EntityDecoder[UpdateCampaignOfferDTO] = jsonOf[UpdateCampaignOfferDTO]
  implicit val UpdateCampaignOfferDTOEncoder: EntityEncoder[UpdateCampaignOfferDTO] = jsonEncoderOf[UpdateCampaignOfferDTO]
}
