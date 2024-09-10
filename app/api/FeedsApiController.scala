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
import model.EmptyApiResponse
import model.FeedIndexLogsStatusType
import model.GetFeedIndexLogsResponse
import model.GetFeedResponse
import model.GetFeedsResponse
import java.time.OffsetDateTime
import model.SetFeedParamsRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class FeedsApiController @Inject()(cc: ControllerComponents, api: FeedsApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId/feeds/:feedId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def getFeed(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedResponse = {
      api.getFeed(campaignId, feedId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/feeds/:feedId/index-logs?limit=[value]&publishedTimeFrom=[value]&publishedTimeTo=[value]&status=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def getFeedIndexLogs(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedIndexLogsResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val publishedTimeFrom = request.getQueryString("published_time_from")
        .map(value => OffsetDateTime.parse(value))
        
      val publishedTimeTo = request.getQueryString("published_time_to")
        .map(value => OffsetDateTime.parse(value))
        
      val status = request.getQueryString("status")
        .map(value => )
        
      api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/feeds
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getFeeds(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedsResponse = {
      api.getFeeds(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/feeds/:feedId/refresh
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def refreshFeed(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      api.refreshFeed(campaignId, feedId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/feeds/:feedId/params
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def setFeedParams(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val setFeedParamsRequest = request.body.asJson.map(_.as[SetFeedParamsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setFeedParamsRequest")
      }
      api.setFeedParams(campaignId, feedId, setFeedParamsRequest)
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
