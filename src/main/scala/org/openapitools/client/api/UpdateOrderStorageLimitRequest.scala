package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import UpdateOrderStorageLimitRequest._

case class UpdateOrderStorageLimitRequest (
  /* Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`.  */
  newDate: LocalDate)

object UpdateOrderStorageLimitRequest {
  import DateTimeCodecs._

  implicit val UpdateOrderStorageLimitRequestCodecJson: CodecJson[UpdateOrderStorageLimitRequest] = CodecJson.derive[UpdateOrderStorageLimitRequest]
  implicit val UpdateOrderStorageLimitRequestDecoder: EntityDecoder[UpdateOrderStorageLimitRequest] = jsonOf[UpdateOrderStorageLimitRequest]
  implicit val UpdateOrderStorageLimitRequestEncoder: EntityEncoder[UpdateOrderStorageLimitRequest] = jsonEncoderOf[UpdateOrderStorageLimitRequest]
}
