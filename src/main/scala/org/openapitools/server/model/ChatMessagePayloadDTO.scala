package org.openapitools.server.model


/**
 * Информация о приложенных к сообщению файлах.
 *
 * @param name Имя файла. for example: ''null''
 * @param url Ссылка для скачивания файла. for example: ''null''
 * @param size Размер файла в байтах. for example: ''null''
*/
final case class ChatMessagePayloadDTO (
  name: String,
  url: String,
  size: Int
)

