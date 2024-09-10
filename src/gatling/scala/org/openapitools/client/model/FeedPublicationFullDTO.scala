
package org.openapitools.client.model

import java.time.OffsetDateTime

case class FeedPublicationFullDTO (
    /* Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    _fileTime: Option[OffsetDateTime],
    /* Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    _publishedTime: Option[OffsetDateTime]
)
object FeedPublicationFullDTO {
    def toStringBody(var_fileTime: Object, var_publishedTime: Object) =
        s"""
        | {
        | "fileTime":$var_fileTime,"publishedTime":$var_publishedTime
        | }
        """.stripMargin
}
