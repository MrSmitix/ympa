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
import model.GetCategoriesMaxSaleQuantumRequest
import model.GetCategoriesMaxSaleQuantumResponse
import model.GetCategoriesRequest
import model.GetCategoriesResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class CategoriesApiController @Inject()(cc: ControllerComponents, api: CategoriesApi) extends AbstractController(cc) {
  /**
    * POST /categories/max-sale-quantum
    */
  def getCategoriesMaxSaleQuantum(): Action[AnyContent] = Action { request =>
    def executeApi(): GetCategoriesMaxSaleQuantumResponse = {
      val getCategoriesMaxSaleQuantumRequest = request.body.asJson.map(_.as[GetCategoriesMaxSaleQuantumRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getCategoriesMaxSaleQuantumRequest")
      }
      api.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /categories/tree
    */
  def getCategoriesTree(): Action[AnyContent] = Action { request =>
    def executeApi(): GetCategoriesResponse = {
      val getCategoriesRequest = request.body.asJson.map(_.as[GetCategoriesRequest])
      api.getCategoriesTree(getCategoriesRequest)
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
