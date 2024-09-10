package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculateTariffsOfferInfoDTO._

case class CalculateTariffsOfferInfoDTO (
  offer: CalculateTariffsOfferDTO,
/* Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
  tariffs: List[CalculatedTariffDTO])

object CalculateTariffsOfferInfoDTO {
  import DateTimeCodecs._

  implicit val CalculateTariffsOfferInfoDTOCodecJson: CodecJson[CalculateTariffsOfferInfoDTO] = CodecJson.derive[CalculateTariffsOfferInfoDTO]
  implicit val CalculateTariffsOfferInfoDTODecoder: EntityDecoder[CalculateTariffsOfferInfoDTO] = jsonOf[CalculateTariffsOfferInfoDTO]
  implicit val CalculateTariffsOfferInfoDTOEncoder: EntityEncoder[CalculateTariffsOfferInfoDTO] = jsonEncoderOf[CalculateTariffsOfferInfoDTO]
}
