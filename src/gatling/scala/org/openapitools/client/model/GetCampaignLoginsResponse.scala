
package org.openapitools.client.model


case class GetCampaignLoginsResponse (
    /* Список логинов. */
    _logins: List[String]
)
object GetCampaignLoginsResponse {
    def toStringBody(var_logins: Object) =
        s"""
        | {
        | "logins":$var_logins
        | }
        """.stripMargin
}
