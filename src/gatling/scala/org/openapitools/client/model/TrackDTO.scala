
package org.openapitools.client.model


case class TrackDTO (
    /* Трек-код почтового отправления. */
    _trackCode: Option[String]
)
object TrackDTO {
    def toStringBody(var_trackCode: Object) =
        s"""
        | {
        | "trackCode":$var_trackCode
        | }
        """.stripMargin
}
