
package org.openapitools.client.model


case class WarehouseDTO (
    /* Идентификатор склада. */
    _id: Long,
    /* Название склада. */
    _name: String,
    /* Идентификатор кампании в API и идентификатор магазина. */
    _campaignId: Long,
    /* Возможна ли доставка по модели Экспресс. */
    _express: Boolean,
    _address: Option[WarehouseAddressDTO]
)
object WarehouseDTO {
    def toStringBody(var_id: Object, var_name: Object, var_campaignId: Object, var_express: Object, var_address: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"campaignId":$var_campaignId,"express":$var_express,"address":$var_address
        | }
        """.stripMargin
}
