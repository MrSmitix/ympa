
package org.openapitools.client.model


case class GetPromoMechanicsInfoDTO (
    _type: MechanicsType,
    _promocodeInfo: Option[GetPromoPromocodeInfoDTO]
)
object GetPromoMechanicsInfoDTO {
    def toStringBody(var_type: Object, var_promocodeInfo: Object) =
        s"""
        | {
        | "type":$var_type,"promocodeInfo":$var_promocodeInfo
        | }
        """.stripMargin
}
