//> using scala "3.3.1"
//> using lib "com.lihaoyi::cask:0.8.3"
//> using lib "com.lihaoyi::scalatags:0.12.0"
/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */


// generated from apiService.mustache
package ympa_scala_cask_server.api

import _root_.ympa_scala_cask_server.model.ApiClientDataErrorResponse
import _root_.ympa_scala_cask_server.model.ApiForbiddenErrorResponse
import _root_.ympa_scala_cask_server.model.ApiLimitErrorResponse
import _root_.ympa_scala_cask_server.model.ApiNotFoundErrorResponse
import _root_.ympa_scala_cask_server.model.ApiServerErrorResponse
import _root_.ympa_scala_cask_server.model.ApiUnauthorizedErrorResponse
import _root_.ympa_scala_cask_server.model.DeleteGoodsFeedbackCommentRequest
import _root_.ympa_scala_cask_server.model.EmptyApiResponse
import _root_.ympa_scala_cask_server.model.GetGoodsFeedbackCommentsRequest
import _root_.ympa_scala_cask_server.model.GetGoodsFeedbackCommentsResponse
import _root_.ympa_scala_cask_server.model.GetGoodsFeedbackRequest
import _root_.ympa_scala_cask_server.model.GetGoodsFeedbackResponse
import _root_.ympa_scala_cask_server.model.SkipGoodsFeedbackReactionRequest
import _root_.ympa_scala_cask_server.model.UpdateGoodsFeedbackCommentRequest
import _root_.ympa_scala_cask_server.model.UpdateGoodsFeedbackCommentResponse

import _root_.ympa_scala_cask_server.model.*

object GoodsFeedbackService {
  def apply() : GoodsFeedbackService = new GoodsFeedbackService {
        override def deleteGoodsFeedbackComment(businessId : Long, deleteGoodsFeedbackCommentRequest : DeleteGoodsFeedbackCommentRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def getGoodsFeedbackComments(businessId : Long, getGoodsFeedbackCommentsRequest : GetGoodsFeedbackCommentsRequest, pageToken : Option[String], limit : Option[Int]) : GetGoodsFeedbackCommentsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def getGoodsFeedbacks(businessId : Long, pageToken : Option[String], limit : Option[Int], getGoodsFeedbackRequest : Option[GetGoodsFeedbackRequest]) : GetGoodsFeedbackResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def skipGoodsFeedbacksReaction(businessId : Long, skipGoodsFeedbackReactionRequest : SkipGoodsFeedbackReactionRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def updateGoodsFeedbackComment(businessId : Long, updateGoodsFeedbackCommentRequest : UpdateGoodsFeedbackCommentRequest) : UpdateGoodsFeedbackCommentResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
  }
}

/**
 * The GoodsFeedback business-logic
 */
trait GoodsFeedbackService {
  /** Удаление комментария к отзыву
   * 
   * @return EmptyApiResponse
   */
  def deleteGoodsFeedbackComment(businessId : Long, deleteGoodsFeedbackCommentRequest : DeleteGoodsFeedbackCommentRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Получение комментариев к отзыву
   * 
   * @return GetGoodsFeedbackCommentsResponse
   */
  def getGoodsFeedbackComments(businessId : Long, getGoodsFeedbackCommentsRequest : GetGoodsFeedbackCommentsRequest, pageToken : Option[String], limit : Option[Int]) : GetGoodsFeedbackCommentsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Получение отзывов о товарах продавца
   * 
   * @return GetGoodsFeedbackResponse
   */
  def getGoodsFeedbacks(businessId : Long, pageToken : Option[String], limit : Option[Int], getGoodsFeedbackRequest : Option[GetGoodsFeedbackRequest]) : GetGoodsFeedbackResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Отказ от ответа на отзывы
   * 
   * @return EmptyApiResponse
   */
  def skipGoodsFeedbacksReaction(businessId : Long, skipGoodsFeedbackReactionRequest : SkipGoodsFeedbackReactionRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Добавление нового или изменение созданного комментария
   * 
   * @return UpdateGoodsFeedbackCommentResponse
   */
  def updateGoodsFeedbackComment(businessId : Long, updateGoodsFeedbackCommentRequest : UpdateGoodsFeedbackCommentRequest) : UpdateGoodsFeedbackCommentResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
}
