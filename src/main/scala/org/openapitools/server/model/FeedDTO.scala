package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация о прайс-листе.
 *
 * @param id Идентификатор прайс-листа. for example: ''null''
 * @param login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  for example: ''null''
 * @param name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  for example: ''null''
 * @param password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  for example: ''null''
 * @param uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  for example: ''null''
 * @param url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  for example: ''null''
 * @param content  for example: ''null''
 * @param download  for example: ''null''
 * @param placement  for example: ''null''
 * @param publication  for example: ''null''
*/
final case class FeedDTO (
  id: Option[Long] = None,
  login: Option[String] = None,
  name: Option[String] = None,
  password: Option[String] = None,
  uploadDate: Option[OffsetDateTime] = None,
  url: Option[String] = None,
  content: Option[FeedContentDTO] = None,
  download: Option[FeedDownloadDTO] = None,
  placement: Option[FeedPlacementDTO] = None,
  publication: Option[FeedPublicationDTO] = None
)

