package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetCategoryContentParametersResponse
import model.GetOfferCardsContentStatusRequest
import model.GetOfferCardsContentStatusResponse
import model.UpdateOfferContentRequest
import model.UpdateOfferContentResponse

/**
  * Provides a default implementation for [[ContentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class ContentApiImpl extends ContentApi {
  /**
    * @inheritdoc
    */
  override def getCategoryContentParameters(categoryId: Long): GetCategoryContentParametersResponse = {
    // TODO: Implement better logic

    GetCategoryContentParametersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: Option[GetOfferCardsContentStatusRequest]): GetOfferCardsContentStatusResponse = {
    // TODO: Implement better logic

    GetOfferCardsContentStatusResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): UpdateOfferContentResponse = {
    // TODO: Implement better logic

    UpdateOfferContentResponse(None, None, Map.empty)
  }
}
