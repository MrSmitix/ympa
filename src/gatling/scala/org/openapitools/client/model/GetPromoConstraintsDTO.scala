
package org.openapitools.client.model


case class GetPromoConstraintsDTO (
    /* Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  */
    _warehouseIds: Option[List[Long]]
)
object GetPromoConstraintsDTO {
    def toStringBody(var_warehouseIds: Object) =
        s"""
        | {
        | "warehouseIds":$var_warehouseIds
        | }
        """.stripMargin
}
