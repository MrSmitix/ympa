
package org.openapitools.client.model


case class PriceQuarantineVerdictDTO (
    _type: Option[PriceQuarantineVerdictType],
    /* Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. */
    _params: List[PriceQuarantineVerdictParameterDTO]
)
object PriceQuarantineVerdictDTO {
    def toStringBody(var_type: Object, var_params: Object) =
        s"""
        | {
        | "type":$var_type,"params":$var_params
        | }
        """.stripMargin
}
