package model

import play.api.libs.json._

/**
  * Информация о приложенных к сообщению файлах.
  * @param name Имя файла.
  * @param url Ссылка для скачивания файла.
  * @param size Размер файла в байтах.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ChatMessagePayloadDTO(
  name: String,
  url: String,
  size: Int
)

object ChatMessagePayloadDTO {
  implicit lazy val chatMessagePayloadDTOJsonFormat: Format[ChatMessagePayloadDTO] = Json.format[ChatMessagePayloadDTO]
}

