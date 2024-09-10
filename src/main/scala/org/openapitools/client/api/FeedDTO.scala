package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import FeedDTO._

case class FeedDTO (
  /* Идентификатор прайс-листа. */
  id: Option[Long],
/* Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
  login: Option[String],
/* Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  */
  name: Option[String],
/* Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
  password: Option[String],
/* Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  */
  uploadDate: Option[OffsetDateTime],
/* URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  */
  url: Option[String],
content: Option[FeedContentDTO],
download: Option[FeedDownloadDTO],
placement: Option[FeedPlacementDTO],
publication: Option[FeedPublicationDTO])

object FeedDTO {
  import DateTimeCodecs._

  implicit val FeedDTOCodecJson: CodecJson[FeedDTO] = CodecJson.derive[FeedDTO]
  implicit val FeedDTODecoder: EntityDecoder[FeedDTO] = jsonOf[FeedDTO]
  implicit val FeedDTOEncoder: EntityEncoder[FeedDTO] = jsonEncoderOf[FeedDTO]
}
