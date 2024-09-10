
package org.openapitools.client.model


case class FeedPlacementDTO (
    _status: Option[FeedStatusType],
    /* Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. */
    _totalOffersCount: Option[Integer]
)
object FeedPlacementDTO {
    def toStringBody(var_status: Object, var_totalOffersCount: Object) =
        s"""
        | {
        | "status":$var_status,"totalOffersCount":$var_totalOffersCount
        | }
        """.stripMargin
}
