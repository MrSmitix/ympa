
package org.openapitools.client.model


case class GetDeliveryServicesResponse (
    _result: Option[DeliveryServicesDTO]
)
object GetDeliveryServicesResponse {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
