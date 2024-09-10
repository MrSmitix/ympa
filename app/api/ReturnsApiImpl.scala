package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetReturnResponse
import model.GetReturnsResponse
import java.time.LocalDate
import model.RefundStatusType
import model.ReturnType
import model.SetReturnDecisionRequest
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[ReturnsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class ReturnsApiImpl extends ReturnsApi {
  /**
    * @inheritdoc
    */
  override def getReturn(campaignId: Long, orderId: Long, returnId: Long): GetReturnResponse = {
    // TODO: Implement better logic

    GetReturnResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Option[List[Long]], statuses: Option[List[RefundStatusType]], `type`: Option[ReturnType], fromDate: Option[LocalDate], toDate: Option[LocalDate], fromDate2: Option[LocalDate], toDate2: Option[LocalDate]): GetReturnsResponse = {
    // TODO: Implement better logic

    GetReturnsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setReturnDecision(campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
