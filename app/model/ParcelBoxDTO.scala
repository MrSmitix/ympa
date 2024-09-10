package model

import play.api.libs.json._

/**
  * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
  * @param id {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  * @param fulfilmentId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ParcelBoxDTO(
  id: Option[Long],
  fulfilmentId: Option[String]
)

object ParcelBoxDTO {
  implicit lazy val parcelBoxDTOJsonFormat: Format[ParcelBoxDTO] = Json.format[ParcelBoxDTO]
}

