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
import model.GetOutletLicensesResponse
import scala.collection.immutable.Set
import model.UpdateOutletLicenseRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OutletLicensesApiController @Inject()(cc: ControllerComponents, api: OutletLicensesApi) extends AbstractController(cc) {
  /**
    * DELETE /campaigns/:campaignId/outlets/licenses?ids=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteOutletLicenses(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val ids = request.getQueryString("ids")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toLong)
        
      api.deleteOutletLicenses(campaignId, ids)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/outlets/licenses?outletIds=[value]&ids=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOutletLicenses(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOutletLicensesResponse = {
      val outletIds = request.getQueryString("outletIds")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toLong)
        
      val ids = request.getQueryString("ids")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toLong)
        
      api.getOutletLicenses(campaignId, outletIds, ids)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/outlets/licenses
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOutletLicenses(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateOutletLicenseRequest = request.body.asJson.map(_.as[UpdateOutletLicenseRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOutletLicenseRequest")
      }
      api.updateOutletLicenses(campaignId, updateOutletLicenseRequest)
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
