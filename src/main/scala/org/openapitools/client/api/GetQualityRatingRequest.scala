package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GetQualityRatingRequest._

case class GetQualityRatingRequest (
  /* Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  */
  dateFrom: Option[LocalDate],
/* Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  */
  dateTo: Option[LocalDate],
/* Список идентификаторов магазинов. */
  campaignIds: Set[Long])

object GetQualityRatingRequest {
  import DateTimeCodecs._

  implicit val GetQualityRatingRequestCodecJson: CodecJson[GetQualityRatingRequest] = CodecJson.derive[GetQualityRatingRequest]
  implicit val GetQualityRatingRequestDecoder: EntityDecoder[GetQualityRatingRequest] = jsonOf[GetQualityRatingRequest]
  implicit val GetQualityRatingRequestEncoder: EntityEncoder[GetQualityRatingRequest] = jsonEncoderOf[GetQualityRatingRequest]
}
