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
import ympa_scala_cask_server.model.OrderLabelDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** GetOrderLabelsDataResponseData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class GetOrderLabelsDataResponseData(
  status: ApiResponseStatusType = null ,

    result: OrderLabelDTOData = null 

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
            if result != null then errors ++= result.validationErrors(path :+ GetOrderLabelsDataResponse.Fields.result, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[GetOrderLabelsDataResponse] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : GetOrderLabelsDataResponse = {
    GetOrderLabelsDataResponse(
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

object GetOrderLabelsDataResponseData {

  given readWriter : RW[GetOrderLabelsDataResponseData] = macroRW

  def fromJsonString(jason : String) : GetOrderLabelsDataResponseData = try {
        read[GetOrderLabelsDataResponseData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[GetOrderLabelsDataResponseData] = try {
        read[List[GetOrderLabelsDataResponseData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[GetOrderLabelsDataResponse]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[GetOrderLabelsDataResponse]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, GetOrderLabelsDataResponseData] = try {
        read[Map[String, GetOrderLabelsDataResponseData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, GetOrderLabelsDataResponse]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, GetOrderLabelsDataResponse]())) {
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

