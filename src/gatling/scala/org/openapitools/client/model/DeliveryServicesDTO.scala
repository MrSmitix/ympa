
package org.openapitools.client.model


case class DeliveryServicesDTO (
    /* Информация о службе доставки. */
    _deliveryService: List[DeliveryServiceInfoDTO]
)
object DeliveryServicesDTO {
    def toStringBody(var_deliveryService: Object) =
        s"""
        | {
        | "deliveryService":$var_deliveryService
        | }
        """.stripMargin
}
