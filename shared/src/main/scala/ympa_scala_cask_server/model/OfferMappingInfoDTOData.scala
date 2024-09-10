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
import ympa_scala_cask_server.model.OfferMappingDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** OfferMappingInfoDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class OfferMappingInfoDTOData(
  mapping: OfferMappingDTOData = null ,

    awaitingModerationMapping: OfferMappingDTOData = null ,

    rejectedMapping: OfferMappingDTOData = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // mapping






        







        
        // validating mapping
        if (errors.isEmpty || !failFast) {
            if mapping != null then errors ++= mapping.validationErrors(path :+ OfferMappingInfoDTO.Fields.mapping, failFast)
        }

        // ==================
        // awaitingModerationMapping






        







        
        // validating awaitingModerationMapping
        if (errors.isEmpty || !failFast) {
            if awaitingModerationMapping != null then errors ++= awaitingModerationMapping.validationErrors(path :+ OfferMappingInfoDTO.Fields.awaitingModerationMapping, failFast)
        }

        // ==================
        // rejectedMapping






        







        
        // validating rejectedMapping
        if (errors.isEmpty || !failFast) {
            if rejectedMapping != null then errors ++= rejectedMapping.validationErrors(path :+ OfferMappingInfoDTO.Fields.rejectedMapping, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[OfferMappingInfoDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : OfferMappingInfoDTO = {
    OfferMappingInfoDTO(
        mapping = Option(
        mapping
        )
        .map(_.asModel),
        awaitingModerationMapping = Option(
        awaitingModerationMapping
        )
        .map(_.asModel),
        rejectedMapping = Option(
        rejectedMapping
        )
        .map(_.asModel)
    )
  }
}

object OfferMappingInfoDTOData {

  given readWriter : RW[OfferMappingInfoDTOData] = macroRW

  def fromJsonString(jason : String) : OfferMappingInfoDTOData = try {
        read[OfferMappingInfoDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[OfferMappingInfoDTOData] = try {
        read[List[OfferMappingInfoDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[OfferMappingInfoDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[OfferMappingInfoDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, OfferMappingInfoDTOData] = try {
        read[Map[String, OfferMappingInfoDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, OfferMappingInfoDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, OfferMappingInfoDTO]())) {
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

