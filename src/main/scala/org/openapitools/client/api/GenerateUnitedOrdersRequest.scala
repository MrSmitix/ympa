package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateUnitedOrdersRequest._

case class GenerateUnitedOrdersRequest (
  /* Идентификатор бизнеса. */
  businessId: Long,
/* Начало периода, включительно. */
  dateFrom: LocalDate,
/* Конец периода, включительно. Максимальный период — 1 год. */
  dateTo: LocalDate,
/* Список магазинов, которые нужны в отчете. */
  campaignIds: Option[List[Long]],
/* Идентификатор акции, товары из которой нужны в отчете. */
  promoId: Option[String])

object GenerateUnitedOrdersRequest {
  import DateTimeCodecs._

  implicit val GenerateUnitedOrdersRequestCodecJson: CodecJson[GenerateUnitedOrdersRequest] = CodecJson.derive[GenerateUnitedOrdersRequest]
  implicit val GenerateUnitedOrdersRequestDecoder: EntityDecoder[GenerateUnitedOrdersRequest] = jsonOf[GenerateUnitedOrdersRequest]
  implicit val GenerateUnitedOrdersRequestEncoder: EntityEncoder[GenerateUnitedOrdersRequest] = jsonEncoderOf[GenerateUnitedOrdersRequest]
}
