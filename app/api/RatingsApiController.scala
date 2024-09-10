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
import model.GetQualityRatingDetailsResponse
import model.GetQualityRatingRequest
import model.GetQualityRatingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class RatingsApiController @Inject()(cc: ControllerComponents, api: RatingsApi) extends AbstractController(cc) {
  /**
    * POST /campaigns/:campaignId/ratings/quality/details
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getQualityRatingDetails(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQualityRatingDetailsResponse = {
      api.getQualityRatingDetails(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/ratings/quality
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getQualityRatings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQualityRatingResponse = {
      val getQualityRatingRequest = request.body.asJson.map(_.as[GetQualityRatingRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getQualityRatingRequest")
      }
      api.getQualityRatings(businessId, getQualityRatingRequest)
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
