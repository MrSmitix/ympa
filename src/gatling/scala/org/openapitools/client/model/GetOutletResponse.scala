
package org.openapitools.client.model


case class GetOutletResponse (
    _outlet: Option[FullOutletDTO]
)
object GetOutletResponse {
    def toStringBody(var_outlet: Object) =
        s"""
        | {
        | "outlet":$var_outlet
        | }
        """.stripMargin
}
