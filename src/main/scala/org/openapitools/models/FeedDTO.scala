package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.FeedContentDTO
import org.openapitools.models.FeedDownloadDTO
import org.openapitools.models.FeedPlacementDTO
import org.openapitools.models.FeedPublicationDTO

/**
 * Информация о прайс-листе.
 * @param id Идентификатор прайс-листа.
 * @param login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @param name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @param password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @param uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @param url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
 * @param content 
 * @param download 
 * @param placement 
 * @param publication 
 */
case class FeedDTO(id: Option[Long],
                login: Option[String],
                name: Option[String],
                password: Option[String],
                uploadDate: Option[ZonedDateTime],
                url: Option[String],
                content: Option[FeedContentDTO],
                download: Option[FeedDownloadDTO],
                placement: Option[FeedPlacementDTO],
                publication: Option[FeedPublicationDTO]
                )

object FeedDTO {
    /**
     * Creates the codec for converting FeedDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedDTO] = deriveEncoder
}
