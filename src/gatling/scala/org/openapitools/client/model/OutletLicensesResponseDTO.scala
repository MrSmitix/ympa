
package org.openapitools.client.model


case class OutletLicensesResponseDTO (
    /* Список лицензий. */
    _licenses: List[FullOutletLicenseDTO]
)
object OutletLicensesResponseDTO {
    def toStringBody(var_licenses: Object) =
        s"""
        | {
        | "licenses":$var_licenses
        | }
        """.stripMargin
}
