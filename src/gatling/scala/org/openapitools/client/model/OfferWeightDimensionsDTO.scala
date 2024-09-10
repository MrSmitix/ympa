
package org.openapitools.client.model


case class OfferWeightDimensionsDTO (
    /* Длина упаковки в см.  */
    _length: Number,
    /* Ширина упаковки в см.  */
    _width: Number,
    /* Высота упаковки в см.  */
    _height: Number,
    /* Вес товара в кг с учетом упаковки (брутто).  */
    _weight: Number
)
object OfferWeightDimensionsDTO {
    def toStringBody(var_length: Object, var_width: Object, var_height: Object, var_weight: Object) =
        s"""
        | {
        | "length":$var_length,"width":$var_width,"height":$var_height,"weight":$var_weight
        | }
        """.stripMargin
}
