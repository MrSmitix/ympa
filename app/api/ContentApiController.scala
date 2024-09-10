package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
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

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class ContentApiController @Inject()(cc: ControllerComponents, api: ContentApi) extends AbstractController(cc) {
  /**
    * POST /category/:categoryId/parameters
    * @param categoryId Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    */
  def getCategoryContentParameters(categoryId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCategoryContentParametersResponse = {
      api.getCategoryContentParameters(categoryId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-cards?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferCardsContentStatus(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferCardsContentStatusResponse = {
      val getOfferCardsContentStatusRequest = request.body.asJson.map(_.as[GetOfferCardsContentStatusRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-cards/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOfferContent(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateOfferContentResponse = {
      val updateOfferContentRequest = request.body.asJson.map(_.as[UpdateOfferContentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOfferContentRequest")
      }
      api.updateOfferContent(businessId, updateOfferContentRequest)
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
