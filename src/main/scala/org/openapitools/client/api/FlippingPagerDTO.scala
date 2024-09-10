package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FlippingPagerDTO._

case class FlippingPagerDTO (
  /* Сколько всего найдено элементов. */
  total: Option[Integer],
/* Начальный номер найденного элемента на странице. */
  from: Option[Integer],
/* Конечный номер найденного элемента на странице. */
  to: Option[Integer],
/* Текущая страница. */
  currentPage: Option[Integer],
/* Общее количество страниц. */
  pagesCount: Option[Integer],
/* Размер страницы. */
  pageSize: Option[Integer])

object FlippingPagerDTO {
  import DateTimeCodecs._

  implicit val FlippingPagerDTOCodecJson: CodecJson[FlippingPagerDTO] = CodecJson.derive[FlippingPagerDTO]
  implicit val FlippingPagerDTODecoder: EntityDecoder[FlippingPagerDTO] = jsonOf[FlippingPagerDTO]
  implicit val FlippingPagerDTOEncoder: EntityEncoder[FlippingPagerDTO] = jsonEncoderOf[FlippingPagerDTO]
}
