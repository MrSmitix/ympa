
package org.openapitools.client.model


case class LogisticPickupPointDTO (
    /* Идентификатор пункта вывоза. */
    _id: Option[Long],
    /* Название пункта вывоза. */
    _name: Option[String],
    _address: Option[PickupAddressDTO],
    /* Дополнительные инструкции к вывозу. */
    _instruction: Option[String],
    _type: Option[LogisticPointType],
    /* Идентификатор логистического партнера, к которому относится логистическая точка. */
    _logisticPartnerId: Option[Long]
)
object LogisticPickupPointDTO {
    def toStringBody(var_id: Object, var_name: Object, var_address: Object, var_instruction: Object, var_type: Object, var_logisticPartnerId: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"address":$var_address,"instruction":$var_instruction,"type":$var_type,"logisticPartnerId":$var_logisticPartnerId
        | }
        """.stripMargin
}
