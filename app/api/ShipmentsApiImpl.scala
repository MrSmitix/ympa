package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.ConfirmShipmentRequest
import model.EmptyApiResponse
import model.GetShipmentOrdersInfoResponse
import model.GetShipmentResponse
import model.SearchShipmentsRequest
import model.SearchShipmentsResponse
import model.SetShipmentPalletsCountRequest
import model.ShipmentPalletLabelPageFormatType
import play.api.libs.Files.TemporaryFile
import model.TransferOrdersFromShipmentRequest

/**
  * Provides a default implementation for [[ShipmentsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class ShipmentsApiImpl extends ShipmentsApi {
  /**
    * @inheritdoc
    */
  override def confirmShipment(campaignId: Long, shipmentId: Long, confirmShipmentRequest: Option[ConfirmShipmentRequest]): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def downloadShipmentAct(campaignId: Long, shipmentId: Long): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def downloadShipmentDiscrepancyAct(campaignId: Long, shipmentId: Long): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def downloadShipmentInboundAct(campaignId: Long, shipmentId: Long): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def downloadShipmentPalletLabels(campaignId: Long, shipmentId: Long, format: Option[ShipmentPalletLabelPageFormatType]): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def downloadShipmentReceptionTransferAct(campaignId: Long, warehouseId: Option[Int]): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def downloadShipmentTransportationWaybill(campaignId: Long, shipmentId: Long): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def getShipment(campaignId: Long, shipmentId: Long, cancelledOrders: Option[Boolean]): GetShipmentResponse = {
    // TODO: Implement better logic

    GetShipmentResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getShipmentOrdersInfo(campaignId: Long, shipmentId: Long): GetShipmentOrdersInfoResponse = {
    // TODO: Implement better logic

    GetShipmentOrdersInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def searchShipments(campaignId: Long, searchShipmentsRequest: SearchShipmentsRequest, pageToken: Option[String], limit: Option[Int]): SearchShipmentsResponse = {
    // TODO: Implement better logic

    SearchShipmentsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setShipmentPalletsCount(campaignId: Long, shipmentId: Long, setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def transferOrdersFromShipment(campaignId: Long, shipmentId: Long, transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
