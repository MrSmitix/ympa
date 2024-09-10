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
import model.CurrencyType
import model.GetModelsOffersResponse
import model.GetModelsRequest
import model.GetModelsResponse
import model.SearchModelsResponse
import model.SortOrderType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class ModelsApiController @Inject()(cc: ControllerComponents, api: ModelsApi) extends AbstractController(cc) {
  /**
    * GET /models/:modelId?regionId=[value]&currency=[value]
    * @param modelId Идентификатор модели товара.
    */
  def getModel(modelId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetModelsResponse = {
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      api.getModel(modelId, regionId, currency)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /models/:modelId/offers?regionId=[value]&currency=[value]&orderByPrice=[value]&count=[value]&page=[value]
    * @param modelId Идентификатор модели товара.
    */
  def getModelOffers(modelId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetModelsOffersResponse = {
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      val orderByPrice = request.getQueryString("orderByPrice")
        .map(value => )
        
      val count = request.getQueryString("count")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      api.getModelOffers(modelId, regionId, currency, orderByPrice, count, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /models?regionId=[value]&currency=[value]
    */
  def getModels(): Action[AnyContent] = Action { request =>
    def executeApi(): GetModelsResponse = {
      val getModelsRequest = request.body.asJson.map(_.as[GetModelsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getModelsRequest")
      }
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      api.getModels(regionId, getModelsRequest, currency)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /models/offers?regionId=[value]&currency=[value]&orderByPrice=[value]
    */
  def getModelsOffers(): Action[AnyContent] = Action { request =>
    def executeApi(): GetModelsOffersResponse = {
      val getModelsRequest = request.body.asJson.map(_.as[GetModelsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getModelsRequest")
      }
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      val orderByPrice = request.getQueryString("orderByPrice")
        .map(value => )
        
      api.getModelsOffers(regionId, getModelsRequest, currency, orderByPrice)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /models?query=[value]&regionId=[value]&currency=[value]&page=[value]&pageSize=[value]
    */
  def searchModels(): Action[AnyContent] = Action { request =>
    def executeApi(): SearchModelsResponse = {
      val query = request.getQueryString("query")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("query", "query string")
        }
        
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.searchModels(query, regionId, currency, page, pageSize)
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
