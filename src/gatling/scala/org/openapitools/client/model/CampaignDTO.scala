
package org.openapitools.client.model


case class CampaignDTO (
    /* URL магазина. */
    _domain: Option[String],
    /* Идентификатор кампании. */
    _id: Option[Long],
    /* Идентификатор плательщика в Яндекс Балансе. */
    _clientId: Option[Long],
    _business: Option[BusinessDTO],
    _placementType: Option[PlacementType]
)
object CampaignDTO {
    def toStringBody(var_domain: Object, var_id: Object, var_clientId: Object, var_business: Object, var_placementType: Object) =
        s"""
        | {
        | "domain":$var_domain,"id":$var_id,"clientId":$var_clientId,"business":$var_business,"placementType":$var_placementType
        | }
        """.stripMargin
}
