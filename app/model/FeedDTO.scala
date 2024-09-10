package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация о прайс-листе.
  * @param id Идентификатор прайс-листа.
  * @param login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  * @param name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
  * @param password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  * @param uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
  * @param url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedDTO(
  id: Option[Long],
  login: Option[String],
  name: Option[String],
  password: Option[String],
  uploadDate: Option[OffsetDateTime],
  url: Option[String],
  content: Option[FeedContentDTO],
  download: Option[FeedDownloadDTO],
  placement: Option[FeedPlacementDTO],
  publication: Option[FeedPublicationDTO]
)

object FeedDTO {
  implicit lazy val feedDTOJsonFormat: Format[FeedDTO] = Json.format[FeedDTO]
}

