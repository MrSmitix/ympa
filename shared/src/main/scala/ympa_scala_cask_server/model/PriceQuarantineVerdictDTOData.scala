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
import ympa_scala_cask_server.model.PriceQuarantineVerdictParameterDTO
import ympa_scala_cask_server.model.PriceQuarantineVerdictType
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** PriceQuarantineVerdictDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class PriceQuarantineVerdictDTOData(
  `type`: PriceQuarantineVerdictType = null ,

  /* Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. */
  params: Seq[PriceQuarantineVerdictParameterDTOData]

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // `type`






        







        

        // ==================
        // params






        
        if (errors.isEmpty || !failFast) {
            if (params == null) {
            errors += ValidationError(path :+ PriceQuarantineVerdictDTO.Fields.params, "params is a required field and cannot be null")
            }
        }
        







        
        if (errors.isEmpty || !failFast) {
            if (params != null) {
                params.zipWithIndex.foreach {
                    case (value, i) if errors.isEmpty || !failFast =>
                      errors ++= value.validationErrors(
                        path :+ PriceQuarantineVerdictDTO.Fields.params :+ Field(i.toString),
                        failFast)
                    case (value, i) =>
                }
            }
        }
        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[PriceQuarantineVerdictDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : PriceQuarantineVerdictDTO = {
    PriceQuarantineVerdictDTO(
        `type` = Option(
        `type`
        )
        ,
        params = 
        params
        
        .map(_.asModel)
    )
  }
}

object PriceQuarantineVerdictDTOData {

  given readWriter : RW[PriceQuarantineVerdictDTOData] = macroRW

  def fromJsonString(jason : String) : PriceQuarantineVerdictDTOData = try {
        read[PriceQuarantineVerdictDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[PriceQuarantineVerdictDTOData] = try {
        read[List[PriceQuarantineVerdictDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[PriceQuarantineVerdictDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[PriceQuarantineVerdictDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, PriceQuarantineVerdictDTOData] = try {
        read[Map[String, PriceQuarantineVerdictDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, PriceQuarantineVerdictDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, PriceQuarantineVerdictDTO]())) {
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

