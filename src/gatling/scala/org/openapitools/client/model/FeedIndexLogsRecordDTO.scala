
package org.openapitools.client.model

import java.time.OffsetDateTime

case class FeedIndexLogsRecordDTO (
    /* Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    _downloadTime: Option[OffsetDateTime],
    /* Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    _fileTime: Option[OffsetDateTime],
    /* Идентификатор индексации. */
    _generationId: Option[Long],
    _indexType: Option[FeedIndexLogsIndexType],
    /* Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    _publishedTime: Option[OffsetDateTime],
    _status: Option[FeedIndexLogsStatusType],
    _error: Option[FeedIndexLogsErrorDTO],
    _offers: Option[FeedIndexLogsOffersDTO]
)
object FeedIndexLogsRecordDTO {
    def toStringBody(var_downloadTime: Object, var_fileTime: Object, var_generationId: Object, var_indexType: Object, var_publishedTime: Object, var_status: Object, var_error: Object, var_offers: Object) =
        s"""
        | {
        | "downloadTime":$var_downloadTime,"fileTime":$var_fileTime,"generationId":$var_generationId,"indexType":$var_indexType,"publishedTime":$var_publishedTime,"status":$var_status,"error":$var_error,"offers":$var_offers
        | }
        """.stripMargin
}
