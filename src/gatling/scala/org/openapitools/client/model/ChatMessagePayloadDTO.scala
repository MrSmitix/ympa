
package org.openapitools.client.model


case class ChatMessagePayloadDTO (
    /* Имя файла. */
    _name: String,
    /* Ссылка для скачивания файла. */
    _url: String,
    /* Размер файла в байтах. */
    _size: Integer
)
object ChatMessagePayloadDTO {
    def toStringBody(var_name: Object, var_url: Object, var_size: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url,"size":$var_size
        | }
        """.stripMargin
}
