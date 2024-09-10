package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetOrderBuyerInfoResponse
import model.SetOrderDeliveryDateRequest
import model.SetOrderDeliveryTrackCodeRequest
import model.UpdateOrderStorageLimitRequest
import model.VerifyOrderEacRequest
import model.VerifyOrderEacResponse

/**
  * Provides a default implementation for [[OrderDeliveryApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OrderDeliveryApiImpl extends OrderDeliveryApi {
  /**
    * @inheritdoc
    */
  override def getOrderBuyerInfo(campaignId: Long, orderId: Long): GetOrderBuyerInfoResponse = {
    // TODO: Implement better logic

    GetOrderBuyerInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderDeliveryDate(campaignId: Long, orderId: Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setOrderDeliveryTrackCode(campaignId: Long, orderId: Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOrderStorageLimit(campaignId: Long, orderId: Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def verifyOrderEac(campaignId: Long, orderId: Long, verifyOrderEacRequest: VerifyOrderEacRequest): VerifyOrderEacResponse = {
    // TODO: Implement better logic

    VerifyOrderEacResponse(None, None, Map.empty)
  }
}
