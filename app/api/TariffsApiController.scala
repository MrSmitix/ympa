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
import model.CalculateTariffsRequest
import model.CalculateTariffsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class TariffsApiController @Inject()(cc: ControllerComponents, api: TariffsApi) extends AbstractController(cc) {
  /**
    * POST /tariffs/calculate
    */
  def calculateTariffs(): Action[AnyContent] = Action { request =>
    def executeApi(): CalculateTariffsResponse = {
      val calculateTariffsRequest = request.body.asJson.map(_.as[CalculateTariffsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "calculateTariffsRequest")
      }
      api.calculateTariffs(calculateTariffsRequest)
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
