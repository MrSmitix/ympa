
package org.openapitools.client.model


case class ModelPriceDTO (
    /* Средняя цена предложения для модели в регионе. */
    _avg: Option[Number],
    /* Максимальная цена предложения для модели в регионе. */
    _max: Option[Number],
    /* Минимальная цена предложения для модели в регионе. */
    _min: Option[Number]
)
object ModelPriceDTO {
    def toStringBody(var_avg: Object, var_max: Object, var_min: Object) =
        s"""
        | {
        | "avg":$var_avg,"max":$var_max,"min":$var_min
        | }
        """.stripMargin
}
