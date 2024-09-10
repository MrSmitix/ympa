
package org.openapitools.client.model


case class GetPromosRequest (
    _participation: Option[PromoParticipationType],
    _mechanics: Option[MechanicsType]
)
object GetPromosRequest {
    def toStringBody(var_participation: Object, var_mechanics: Object) =
        s"""
        | {
        | "participation":$var_participation,"mechanics":$var_mechanics
        | }
        """.stripMargin
}
