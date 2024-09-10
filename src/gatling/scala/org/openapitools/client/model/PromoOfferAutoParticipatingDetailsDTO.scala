
package org.openapitools.client.model


case class PromoOfferAutoParticipatingDetailsDTO (
    /* Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`.  */
    _campaignIds: Option[List[Long]]
)
object PromoOfferAutoParticipatingDetailsDTO {
    def toStringBody(var_campaignIds: Object) =
        s"""
        | {
        | "campaignIds":$var_campaignIds
        | }
        """.stripMargin
}
