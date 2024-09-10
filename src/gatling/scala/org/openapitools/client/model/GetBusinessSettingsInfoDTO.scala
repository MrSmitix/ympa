
package org.openapitools.client.model


case class GetBusinessSettingsInfoDTO (
    _info: Option[BusinessDTO],
    _settings: Option[BusinessSettingsDTO]
)
object GetBusinessSettingsInfoDTO {
    def toStringBody(var_info: Object, var_settings: Object) =
        s"""
        | {
        | "info":$var_info,"settings":$var_settings
        | }
        """.stripMargin
}
