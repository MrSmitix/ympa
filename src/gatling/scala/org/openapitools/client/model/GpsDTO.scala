
package org.openapitools.client.model


case class GpsDTO (
    /* Широта. */
    _latitude: Number,
    /* Долгота. */
    _longitude: Number
)
object GpsDTO {
    def toStringBody(var_latitude: Object, var_longitude: Object) =
        s"""
        | {
        | "latitude":$var_latitude,"longitude":$var_longitude
        | }
        """.stripMargin
}
