
package org.openapitools.client.model


case class GetGoodsStatsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GoodsStatsDTO]
)
object GetGoodsStatsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
