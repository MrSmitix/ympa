package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculateTariffsParametersDTO._

case class CalculateTariffsParametersDTO (
  /* Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.  */
  campaignId: Option[Long],
sellingProgram: Option[SellingProgramType],
frequency: Option[PaymentFrequencyType])

object CalculateTariffsParametersDTO {
  import DateTimeCodecs._

  implicit val CalculateTariffsParametersDTOCodecJson: CodecJson[CalculateTariffsParametersDTO] = CodecJson.derive[CalculateTariffsParametersDTO]
  implicit val CalculateTariffsParametersDTODecoder: EntityDecoder[CalculateTariffsParametersDTO] = jsonOf[CalculateTariffsParametersDTO]
  implicit val CalculateTariffsParametersDTOEncoder: EntityEncoder[CalculateTariffsParametersDTO] = jsonEncoderOf[CalculateTariffsParametersDTO]
}
