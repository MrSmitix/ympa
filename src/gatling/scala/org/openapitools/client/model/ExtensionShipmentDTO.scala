
package org.openapitools.client.model


case class ExtensionShipmentDTO (
    _currentStatus: Option[ShipmentStatusChangeDTO],
    /* Доступные действия над отгрузкой. */
    _availableActions: Set[ShipmentActionType]
)
object ExtensionShipmentDTO {
    def toStringBody(var_currentStatus: Object, var_availableActions: Object) =
        s"""
        | {
        | "currentStatus":$var_currentStatus,"availableActions":$var_availableActions
        | }
        """.stripMargin
}
