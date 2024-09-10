package api

import model.AcceptOrderCancellationRequest
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetOrderResponse
import model.GetOrdersResponse
import java.time.LocalDate
import java.time.OffsetDateTime
import model.OrderBuyerType
import model.OrderDeliveryDispatchType
import model.OrderStatusType
import model.OrderSubstatusType
import model.ProvideOrderDigitalCodesRequest
import model.ProvideOrderItemIdentifiersRequest
import model.ProvideOrderItemIdentifiersResponse
import scala.collection.immutable.Set
import model.SetOrderBoxLayoutRequest
import model.SetOrderBoxLayoutResponse
import model.SetOrderShipmentBoxesRequest
import model.SetOrderShipmentBoxesResponse
import model.UpdateOrderItemRequest
import model.UpdateOrderStatusRequest
import model.UpdateOrderStatusResponse
import model.UpdateOrderStatusesRequest
import model.UpdateOrderStatusesResponse

/**
  * Provides a default implementation for [[OrdersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OrdersApiImpl extends OrdersApi {
  /**
    * @inheritdoc
    */
  override def acceptOrderCancellation(campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrder(campaignId: Long, orderId: Long): GetOrderResponse = {
    // TODO: Implement better logic

    GetOrderResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getOrders(campaignId: Long, orderIds: Option[List[Long]], status: Option[Set[OrderStatusType]], substatus: Option[Set[OrderSubstatusType]], fromDate: Option[LocalDate], toDate: Option[LocalDate], supplierShipmentDateFrom: Option[LocalDate], supplierShipmentDateTo: Option[LocalDate], updatedAtFrom: Option[OffsetDateTime], updatedAtTo: Option[OffsetDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]): GetOrdersResponse = {
    // TODO: Implement better logic

    GetOrdersResponse(None, List.empty[OrderDTO], None)
  }

  /**
    * @inheritdoc
    */
  override def provideOrderDigitalCodes(campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): ProvideOrderItemIdentifiersResponse = {
    // TODO: Implement better logic

    ProvideOrderItemIdentifiersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): SetOrderBoxLayoutResponse = {
    // TODO: Implement better logic

    SetOrderBoxLayoutResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): SetOrderShipmentBoxesResponse = {
    // TODO: Implement better logic

    SetOrderShipmentBoxesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): UpdateOrderStatusResponse = {
    // TODO: Implement better logic

    UpdateOrderStatusResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): UpdateOrderStatusesResponse = {
    // TODO: Implement better logic

    UpdateOrderStatusesResponse(None, None, Map.empty)
  }
}
