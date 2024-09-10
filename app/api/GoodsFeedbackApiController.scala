package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.DeleteGoodsFeedbackCommentRequest
import model.EmptyApiResponse
import model.GetGoodsFeedbackCommentsRequest
import model.GetGoodsFeedbackCommentsResponse
import model.GetGoodsFeedbackRequest
import model.GetGoodsFeedbackResponse
import model.SkipGoodsFeedbackReactionRequest
import model.UpdateGoodsFeedbackCommentRequest
import model.UpdateGoodsFeedbackCommentResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class GoodsFeedbackApiController @Inject()(cc: ControllerComponents, api: GoodsFeedbackApi) extends AbstractController(cc) {
  /**
    * POST /businesses/:businessId/goods-feedback/comments/delete
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteGoodsFeedbackComment(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val deleteGoodsFeedbackCommentRequest = request.body.asJson.map(_.as[DeleteGoodsFeedbackCommentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteGoodsFeedbackCommentRequest")
      }
      api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/comments?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getGoodsFeedbackComments(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetGoodsFeedbackCommentsResponse = {
      val getGoodsFeedbackCommentsRequest = request.body.asJson.map(_.as[GetGoodsFeedbackCommentsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getGoodsFeedbackCommentsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getGoodsFeedbacks(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetGoodsFeedbackResponse = {
      val getGoodsFeedbackRequest = request.body.asJson.map(_.as[GetGoodsFeedbackRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/skip-reaction
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def skipGoodsFeedbacksReaction(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val skipGoodsFeedbackReactionRequest = request.body.asJson.map(_.as[SkipGoodsFeedbackReactionRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "skipGoodsFeedbackReactionRequest")
      }
      api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/comments/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateGoodsFeedbackComment(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateGoodsFeedbackCommentResponse = {
      val updateGoodsFeedbackCommentRequest = request.body.asJson.map(_.as[UpdateGoodsFeedbackCommentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateGoodsFeedbackCommentRequest")
      }
      api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
