package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculateTariffsOfferDTO._

case class CalculateTariffsOfferDTO (
  /* Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  */
  categoryId: Long,
/* Цена на товар в рублях. */
  price: BigDecimal,
/* Длина товара в сантиметрах. */
  length: BigDecimal,
/* Ширина товара в сантиметрах. */
  width: BigDecimal,
/* Высота товара в сантиметрах. */
  height: BigDecimal,
/* Вес товара в килограммах. */
  weight: BigDecimal,
/* Квант продажи — количество единиц товара в одном товарном предложении. */
  quantity: Option[Integer])

object CalculateTariffsOfferDTO {
  import DateTimeCodecs._

  implicit val CalculateTariffsOfferDTOCodecJson: CodecJson[CalculateTariffsOfferDTO] = CodecJson.derive[CalculateTariffsOfferDTO]
  implicit val CalculateTariffsOfferDTODecoder: EntityDecoder[CalculateTariffsOfferDTO] = jsonOf[CalculateTariffsOfferDTO]
  implicit val CalculateTariffsOfferDTOEncoder: EntityEncoder[CalculateTariffsOfferDTO] = jsonEncoderOf[CalculateTariffsOfferDTO]
}
