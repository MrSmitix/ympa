
package org.openapitools.client.model


case class FeedIndexLogsResultDTO (
    _feed: Option[FeedIndexLogsFeedDTO],
    /* Список отчетов по индексации прайс-листа. */
    _indexLogRecords: List[FeedIndexLogsRecordDTO],
    /* Количество отчетов на всех страницах выходных данных. */
    _total: Option[Long]
)
object FeedIndexLogsResultDTO {
    def toStringBody(var_feed: Object, var_indexLogRecords: Object, var_total: Object) =
        s"""
        | {
        | "feed":$var_feed,"indexLogRecords":$var_indexLogRecords,"total":$var_total
        | }
        """.stripMargin
}
