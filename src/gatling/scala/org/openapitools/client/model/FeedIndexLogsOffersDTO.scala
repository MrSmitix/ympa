
package org.openapitools.client.model


case class FeedIndexLogsOffersDTO (
    /* Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. */
    _rejectedCount: Option[Long],
    /* Количество предложений в прайс-листе. */
    _totalCount: Option[Long]
)
object FeedIndexLogsOffersDTO {
    def toStringBody(var_rejectedCount: Object, var_totalCount: Object) =
        s"""
        | {
        | "rejectedCount":$var_rejectedCount,"totalCount":$var_totalCount
        | }
        """.stripMargin
}
