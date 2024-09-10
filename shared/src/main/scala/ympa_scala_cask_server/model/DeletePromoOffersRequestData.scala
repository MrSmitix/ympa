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
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** DeletePromoOffersRequestData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class DeletePromoOffersRequestData(
/* Идентификатор акции. */
  promoId: String,

  /* Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. */
  deleteAllOffers: Boolean = false ,

  /* Товары, которые нужно убрать из акции. */
  offerIds: Seq[String] = Nil 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // promoId






        







        

        // ==================
        // deleteAllOffers






        







        

        // ==================
        // offerIds






        



        // validate min items 1
        if (errors.isEmpty || !failFast) {
          val len = if offerIds == null then 0 else offerIds.size
            if (len < 1) {
               errors += ValidationError(path :+ DeletePromoOffersRequest.Fields.offerIds, s"offerIds has $len, which is less than the min items 1")
            }
        }

        // validate min items 500
        if (errors.isEmpty || !failFast) {
          val len = if offerIds == null then 0 else offerIds.size
            if (len > 500) {
               errors += ValidationError(path :+ DeletePromoOffersRequest.Fields.offerIds, s"offerIds has $len, which is greater than the max items 500")
            }
        }



        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[DeletePromoOffersRequest] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : DeletePromoOffersRequest = {
    DeletePromoOffersRequest(
        promoId = 
        promoId
        
        ,
        deleteAllOffers = Option(
        deleteAllOffers
        )
        ,
        offerIds = 
        offerIds
        
        
    )
  }
}

object DeletePromoOffersRequestData {

  given readWriter : RW[DeletePromoOffersRequestData] = macroRW

  def fromJsonString(jason : String) : DeletePromoOffersRequestData = try {
        read[DeletePromoOffersRequestData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[DeletePromoOffersRequestData] = try {
        read[List[DeletePromoOffersRequestData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[DeletePromoOffersRequest]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[DeletePromoOffersRequest]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, DeletePromoOffersRequestData] = try {
        read[Map[String, DeletePromoOffersRequestData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, DeletePromoOffersRequest]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, DeletePromoOffersRequest]())) {
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

