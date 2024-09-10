
package org.openapitools.client.model


case class ScrollingPagerDTO (
    /* Идентификатор следующей страницы результатов. */
    _nextPageToken: Option[String],
    /* Идентификатор предыдущей страницы результатов. */
    _prevPageToken: Option[String]
)
object ScrollingPagerDTO {
    def toStringBody(var_nextPageToken: Object, var_prevPageToken: Object) =
        s"""
        | {
        | "nextPageToken":$var_nextPageToken,"prevPageToken":$var_prevPageToken
        | }
        """.stripMargin
}
