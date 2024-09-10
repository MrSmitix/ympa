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
import ympa_scala_cask_server.model.HiddenOfferDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** DeleteHiddenOffersRequestData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class DeleteHiddenOffersRequestData(
/* Список скрытых товаров.  */
  hiddenOffers: Seq[HiddenOfferDTOData]

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // hiddenOffers






        
        if (errors.isEmpty || !failFast) {
            if (hiddenOffers == null) {
            errors += ValidationError(path :+ DeleteHiddenOffersRequest.Fields.hiddenOffers, "hiddenOffers is a required field and cannot be null")
            }
        }
        



        // validate min items 1
        if (errors.isEmpty || !failFast) {
          val len = if hiddenOffers == null then 0 else hiddenOffers.size
            if (len < 1) {
               errors += ValidationError(path :+ DeleteHiddenOffersRequest.Fields.hiddenOffers, s"hiddenOffers has $len, which is less than the min items 1")
            }
        }

        // validate min items 500
        if (errors.isEmpty || !failFast) {
          val len = if hiddenOffers == null then 0 else hiddenOffers.size
            if (len > 500) {
               errors += ValidationError(path :+ DeleteHiddenOffersRequest.Fields.hiddenOffers, s"hiddenOffers has $len, which is greater than the max items 500")
            }
        }



        
        if (errors.isEmpty || !failFast) {
            if (hiddenOffers != null) {
                hiddenOffers.zipWithIndex.foreach {
                    case (value, i) if errors.isEmpty || !failFast =>
                      errors ++= value.validationErrors(
                        path :+ DeleteHiddenOffersRequest.Fields.hiddenOffers :+ Field(i.toString),
                        failFast)
                    case (value, i) =>
                }
            }
        }
        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[DeleteHiddenOffersRequest] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : DeleteHiddenOffersRequest = {
    DeleteHiddenOffersRequest(
        hiddenOffers = 
        hiddenOffers
        
        .map(_.asModel)
    )
  }
}

object DeleteHiddenOffersRequestData {

  given readWriter : RW[DeleteHiddenOffersRequestData] = macroRW

  def fromJsonString(jason : String) : DeleteHiddenOffersRequestData = try {
        read[DeleteHiddenOffersRequestData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[DeleteHiddenOffersRequestData] = try {
        read[List[DeleteHiddenOffersRequestData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[DeleteHiddenOffersRequest]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[DeleteHiddenOffersRequest]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, DeleteHiddenOffersRequestData] = try {
        read[Map[String, DeleteHiddenOffersRequestData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, DeleteHiddenOffersRequest]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, DeleteHiddenOffersRequest]())) {
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

