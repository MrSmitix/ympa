
package org.openapitools.client.model


case class FeedContentDTO (
    /* Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  */
    _rejectedOffersCount: Option[Long],
    _status: Option[FeedStatusType],
    /* Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  */
    _totalOffersCount: Option[Long],
    _error: Option[FeedContentErrorDTO]
)
object FeedContentDTO {
    def toStringBody(var_rejectedOffersCount: Object, var_status: Object, var_totalOffersCount: Object, var_error: Object) =
        s"""
        | {
        | "rejectedOffersCount":$var_rejectedOffersCount,"status":$var_status,"totalOffersCount":$var_totalOffersCount,"error":$var_error
        | }
        """.stripMargin
}
