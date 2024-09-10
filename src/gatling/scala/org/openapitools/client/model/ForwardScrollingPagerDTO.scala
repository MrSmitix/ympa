
package org.openapitools.client.model


case class ForwardScrollingPagerDTO (
    /* Идентификатор следующей страницы результатов. */
    _nextPageToken: Option[String]
)
object ForwardScrollingPagerDTO {
    def toStringBody(var_nextPageToken: Object) =
        s"""
        | {
        | "nextPageToken":$var_nextPageToken
        | }
        """.stripMargin
}
