
package org.openapitools.client.model


case class ReturnInstanceDTO (
    _stockType: Option[ReturnInstanceStockType],
    _status: Option[ReturnInstanceStatusType],
    /* Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). */
    _cis: Option[String],
    /* Международный идентификатор мобильного оборудования. */
    _imei: Option[String]
)
object ReturnInstanceDTO {
    def toStringBody(var_stockType: Object, var_status: Object, var_cis: Object, var_imei: Object) =
        s"""
        | {
        | "stockType":$var_stockType,"status":$var_status,"cis":$var_cis,"imei":$var_imei
        | }
        """.stripMargin
}
