
package org.openapitools.client.model


case class MaxSaleQuantumDTO (
    /* Идентификатор категории. */
    _id: Long,
    /* Название категории. */
    _name: Option[String],
    /* Лимит на установку кванта и минимального количества товаров. */
    _maxSaleQuantum: Option[Integer]
)
object MaxSaleQuantumDTO {
    def toStringBody(var_id: Object, var_name: Object, var_maxSaleQuantum: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"maxSaleQuantum":$var_maxSaleQuantum
        | }
        """.stripMargin
}
