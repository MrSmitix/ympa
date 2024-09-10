
package org.openapitools.client.model


case class UpdateOutletLicenseRequest (
    /* Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  */
    _licenses: List[OutletLicenseDTO]
)
object UpdateOutletLicenseRequest {
    def toStringBody(var_licenses: Object) =
        s"""
        | {
        | "licenses":$var_licenses
        | }
        """.stripMargin
}
