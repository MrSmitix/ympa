
package org.openapitools.client.model


case class OrderBoxesLayoutDTO (
    /* Список коробок. */
    _boxes: List[EnrichedOrderBoxLayoutDTO]
)
object OrderBoxesLayoutDTO {
    def toStringBody(var_boxes: Object) =
        s"""
        | {
        | "boxes":$var_boxes
        | }
        """.stripMargin
}
