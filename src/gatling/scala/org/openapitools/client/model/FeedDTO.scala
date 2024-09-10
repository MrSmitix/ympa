
package org.openapitools.client.model

import java.time.OffsetDateTime

case class FeedDTO (
    /* Идентификатор прайс-листа. */
    _id: Option[Long],
    /* Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
    _login: Option[String],
    /* Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  */
    _name: Option[String],
    /* Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
    _password: Option[String],
    /* Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  */
    _uploadDate: Option[OffsetDateTime],
    /* URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  */
    _url: Option[String],
    _content: Option[FeedContentDTO],
    _download: Option[FeedDownloadDTO],
    _placement: Option[FeedPlacementDTO],
    _publication: Option[FeedPublicationDTO]
)
object FeedDTO {
    def toStringBody(var_id: Object, var_login: Object, var_name: Object, var_password: Object, var_uploadDate: Object, var_url: Object, var_content: Object, var_download: Object, var_placement: Object, var_publication: Object) =
        s"""
        | {
        | "id":$var_id,"login":$var_login,"name":$var_name,"password":$var_password,"uploadDate":$var_uploadDate,"url":$var_url,"content":$var_content,"download":$var_download,"placement":$var_placement,"publication":$var_publication
        | }
        """.stripMargin
}
