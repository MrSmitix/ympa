
package org.openapitools.client.model


case class OrderBusinessBuyerDTO (
    /* ИНН. */
    _inn: Option[String],
    /* КПП. */
    _kpp: Option[String],
    /* Наименование юридического лица. */
    _organizationName: Option[String],
    /* Юридический адрес. */
    _organizationJurAddress: Option[String]
)
object OrderBusinessBuyerDTO {
    def toStringBody(var_inn: Object, var_kpp: Object, var_organizationName: Object, var_organizationJurAddress: Object) =
        s"""
        | {
        | "inn":$var_inn,"kpp":$var_kpp,"organizationName":$var_organizationName,"organizationJurAddress":$var_organizationJurAddress
        | }
        """.stripMargin
}
