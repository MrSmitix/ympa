
package org.openapitools.client.model


case class FeedbackAuthorDTO (
    /* Имя автора отзыва. */
    _name: Option[String],
    _region: Option[RegionDTO]
)
object FeedbackAuthorDTO {
    def toStringBody(var_name: Object, var_region: Object) =
        s"""
        | {
        | "name":$var_name,"region":$var_region
        | }
        """.stripMargin
}
