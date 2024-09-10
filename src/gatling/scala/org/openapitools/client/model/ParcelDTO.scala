
package org.openapitools.client.model


case class ParcelDTO (
    /* Список грузовых мест. Маркет определяет количество мест по длине этого списка. */
    _boxes: List[ParcelBoxDTO]
)
object ParcelDTO {
    def toStringBody(var_boxes: Object) =
        s"""
        | {
        | "boxes":$var_boxes
        | }
        """.stripMargin
}
