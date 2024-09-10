
package org.openapitools.client.model


case class FeedDownloadErrorDTO (
    /* HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
    _httpStatusCode: Option[Integer],
    _type: Option[FeedDownloadErrorType],
    /* Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  */
    _description: Option[String]
)
object FeedDownloadErrorDTO {
    def toStringBody(var_httpStatusCode: Object, var_type: Object, var_description: Object) =
        s"""
        | {
        | "httpStatusCode":$var_httpStatusCode,"type":$var_type,"description":$var_description
        | }
        """.stripMargin
}
