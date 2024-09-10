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
import model.EmptyApiResponse
import model.GetWarehouseStocksRequest
import model.GetWarehouseStocksResponse
import model.UpdateStocksRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class StocksApiController @Inject()(cc: ControllerComponents, api: StocksApi) extends AbstractController(cc) {
  /**
    * POST /campaigns/:campaignId/offers/stocks?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getStocks(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetWarehouseStocksResponse = {
      val getWarehouseStocksRequest = request.body.asJson.map(_.as[GetWarehouseStocksRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/offers/stocks
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateStocks(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateStocksRequest = request.body.asJson.map(_.as[UpdateStocksRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateStocksRequest")
      }
      api.updateStocks(campaignId, updateStocksRequest)
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
