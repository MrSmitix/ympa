package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCardDTO._

case class OfferCardDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,
mapping: Option[GetMappingDTO],
/* Список характеристик с их значениями.  */
  parameterValues: Option[List[ParameterValueDTO]],
cardStatus: Option[OfferCardStatusType],
/* Процент заполненности карточки. */
  contentRating: Option[Integer],
/* Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  */
  recommendations: Option[List[OfferCardRecommendationDTO]],
/* Ошибки в контенте, препятствующие размещению товара на витрине. */
  errors: Option[List[OfferErrorDTO]],
/* Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. */
  warnings: Option[List[OfferErrorDTO]])

object OfferCardDTO {
  import DateTimeCodecs._

  implicit val OfferCardDTOCodecJson: CodecJson[OfferCardDTO] = CodecJson.derive[OfferCardDTO]
  implicit val OfferCardDTODecoder: EntityDecoder[OfferCardDTO] = jsonOf[OfferCardDTO]
  implicit val OfferCardDTOEncoder: EntityEncoder[OfferCardDTO] = jsonEncoderOf[OfferCardDTO]
}
