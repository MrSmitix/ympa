package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EacVerificationResultDTO._

case class EacVerificationResultDTO (
  verificationResult: Option[EacVerificationStatusType],
/* Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  */
  attemptsLeft: Option[Integer])

object EacVerificationResultDTO {
  import DateTimeCodecs._

  implicit val EacVerificationResultDTOCodecJson: CodecJson[EacVerificationResultDTO] = CodecJson.derive[EacVerificationResultDTO]
  implicit val EacVerificationResultDTODecoder: EntityDecoder[EacVerificationResultDTO] = jsonOf[EacVerificationResultDTO]
  implicit val EacVerificationResultDTOEncoder: EntityEncoder[EacVerificationResultDTO] = jsonEncoderOf[EacVerificationResultDTO]
}
