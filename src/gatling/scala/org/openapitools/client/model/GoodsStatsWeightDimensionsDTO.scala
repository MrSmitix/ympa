
package org.openapitools.client.model


case class GoodsStatsWeightDimensionsDTO (
    /* Длина товара в сантиметрах. */
    _length: Option[Number],
    /* Ширина товара в сантиметрах. */
    _width: Option[Number],
    /* Высота товара в сантиметрах. */
    _height: Option[Number],
    /* Вес товара в килограммах. */
    _weight: Option[Number]
)
object GoodsStatsWeightDimensionsDTO {
    def toStringBody(var_length: Object, var_width: Object, var_height: Object, var_weight: Object) =
        s"""
        | {
        | "length":$var_length,"width":$var_width,"height":$var_height,"weight":$var_weight
        | }
        """.stripMargin
}
