
package org.openapitools.client.model


case class PromoOfferUpdateWarningDTO (
    _code: PromoOfferUpdateWarningCodeType,
    /* Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  */
    _campaignIds: Option[List[Long]]
)
object PromoOfferUpdateWarningDTO {
    def toStringBody(var_code: Object, var_campaignIds: Object) =
        s"""
        | {
        | "code":$var_code,"campaignIds":$var_campaignIds
        | }
        """.stripMargin
}
