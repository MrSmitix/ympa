/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using modelData.mustache
package ympa_scala_cask_server.model
import ympa_scala_cask_server.model.ApiResponseStatusType
import ympa_scala_cask_server.model.OfferRecommendationsResultDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** GetOfferRecommendationsResponseData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class GetOfferRecommendationsResponseData(
  status: ApiResponseStatusType = null ,

    result: OfferRecommendationsResultDTOData = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // status






        







        

        // ==================
        // result






        







        
        // validating result
        if (errors.isEmpty || !failFast) {
            if result != null then errors ++= result.validationErrors(path :+ GetOfferRecommendationsResponse.Fields.result, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[GetOfferRecommendationsResponse] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : GetOfferRecommendationsResponse = {
    GetOfferRecommendationsResponse(
        status = Option(
        status
        )
        ,
        result = Option(
        result
        )
        .map(_.asModel)
    )
  }
}

object GetOfferRecommendationsResponseData {

  given readWriter : RW[GetOfferRecommendationsResponseData] = macroRW

  def fromJsonString(jason : String) : GetOfferRecommendationsResponseData = try {
        read[GetOfferRecommendationsResponseData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[GetOfferRecommendationsResponseData] = try {
        read[List[GetOfferRecommendationsResponseData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[GetOfferRecommendationsResponse]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[GetOfferRecommendationsResponse]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, GetOfferRecommendationsResponseData] = try {
        read[Map[String, GetOfferRecommendationsResponseData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, GetOfferRecommendationsResponse]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, GetOfferRecommendationsResponse]())) {
         case (Success(map), (key, next)) =>
           next.validated(failFast) match {
             case Success(ok) => Success(map.updated(key, ok))
             case Failure(err) => Failure(new Exception(s"Validation error on element $key: ${err.getMessage}", err))
           }
         case (fail, _) => fail
       }
     }
  }
}

