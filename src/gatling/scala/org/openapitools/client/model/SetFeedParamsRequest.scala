
package org.openapitools.client.model


case class SetFeedParamsRequest (
    /* Параметры прайс-листа.  Обязательный параметр.  */
    _parameters: List[FeedParameterDTO]
)
object SetFeedParamsRequest {
    def toStringBody(var_parameters: Object) =
        s"""
        | {
        | "parameters":$var_parameters
        | }
        """.stripMargin
}
