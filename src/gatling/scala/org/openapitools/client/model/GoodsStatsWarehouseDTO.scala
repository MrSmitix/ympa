
package org.openapitools.client.model


case class GoodsStatsWarehouseDTO (
    /* Идентификатор склада. */
    _id: Option[Long],
    /* Название склада. */
    _name: Option[String],
    /* Информация об остатках товаров на складе. */
    _stocks: List[WarehouseStockDTO]
)
object GoodsStatsWarehouseDTO {
    def toStringBody(var_id: Object, var_name: Object, var_stocks: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"stocks":$var_stocks
        | }
        """.stripMargin
}
