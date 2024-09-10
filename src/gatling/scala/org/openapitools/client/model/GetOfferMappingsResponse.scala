
package org.openapitools.client.model


case class GetOfferMappingsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetOfferMappingsResultDTO]
)
object GetOfferMappingsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
