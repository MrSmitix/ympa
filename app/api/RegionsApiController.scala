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
import model.GetRegionWithChildrenResponse
import model.GetRegionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class RegionsApiController @Inject()(cc: ControllerComponents, api: RegionsApi) extends AbstractController(cc) {
  /**
    * GET /regions/:regionId/children?page=[value]&pageSize=[value]
    * @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
    */
  def searchRegionChildren(regionId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetRegionWithChildrenResponse = {
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.searchRegionChildren(regionId, page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /regions/:regionId
    * @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
    */
  def searchRegionsById(regionId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetRegionsResponse = {
      api.searchRegionsById(regionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /regions?name=[value]&pageToken=[value]&limit=[value]
    */
  def searchRegionsByName(): Action[AnyContent] = Action { request =>
    def executeApi(): GetRegionsResponse = {
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRegionsByName(name, pageToken, limit)
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
