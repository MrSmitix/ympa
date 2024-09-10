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
import java.time.OffsetDateTime
import ympa_scala_cask_server.model.PriceDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** OfferPriceResponseDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class OfferPriceResponseDTOData(
/* Идентификатор предложения из прайс-листа. */
  id: String = "" ,

    price: PriceDTOData = null ,

  /* SKU на Маркете. */
  marketSku: Long = 0 ,

  /* Дата и время последнего обновления цены на товар. */
  updatedAt: OffsetDateTime = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // id






        







        

        // ==================
        // price






        







        
        // validating price
        if (errors.isEmpty || !failFast) {
            if price != null then errors ++= price.validationErrors(path :+ OfferPriceResponseDTO.Fields.price, failFast)
        }

        // ==================
        // marketSku






        







        

        // ==================
        // updatedAt






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[OfferPriceResponseDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : OfferPriceResponseDTO = {
    OfferPriceResponseDTO(
        id = Option(
        id
        )
        ,
        price = Option(
        price
        )
        .map(_.asModel),
        marketSku = Option(
        marketSku
        )
        ,
        updatedAt = Option(
        updatedAt
        )
        
    )
  }
}

object OfferPriceResponseDTOData {

  given readWriter : RW[OfferPriceResponseDTOData] = macroRW

  def fromJsonString(jason : String) : OfferPriceResponseDTOData = try {
        read[OfferPriceResponseDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[OfferPriceResponseDTOData] = try {
        read[List[OfferPriceResponseDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[OfferPriceResponseDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[OfferPriceResponseDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, OfferPriceResponseDTOData] = try {
        read[Map[String, OfferPriceResponseDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, OfferPriceResponseDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, OfferPriceResponseDTO]())) {
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

