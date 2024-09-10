
package org.openapitools.client.model


case class ShipmentBoxesDTO (
    /* Список грузовых мест. Маркет определил количество мест по длине этого списка.  */
    _boxes: List[ParcelBoxDTO]
)
object ShipmentBoxesDTO {
    def toStringBody(var_boxes: Object) =
        s"""
        | {
        | "boxes":$var_boxes
        | }
        """.stripMargin
}
