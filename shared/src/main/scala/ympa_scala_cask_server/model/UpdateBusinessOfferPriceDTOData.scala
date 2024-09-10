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
import ympa_scala_cask_server.model.UpdatePriceWithDiscountDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** UpdateBusinessOfferPriceDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class UpdateBusinessOfferPriceDTOData(
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,

    price: UpdatePriceWithDiscountDTOData

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // offerId
        // validate against pattern '^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$'
        if (errors.isEmpty || !failFast) {
           val regex = """^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$"""
           if offerId == null || !regex.r.matches(offerId) then
              errors += ValidationError(path :+ UpdateBusinessOfferPriceDTO.Fields.offerId, s"value '$offerId' doesn't match pattern $regex")
        }



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if offerId == null then 0 else offerId.length
            if (len < 1) {
               errors += ValidationError(path :+ UpdateBusinessOfferPriceDTO.Fields.offerId, s"length $len is shorter than the min length 1")
            }
        }

        // validate max length 255
        if (errors.isEmpty || !failFast)  {
          val len = if offerId == null then 0 else offerId.length
            if (len < 255) {
               errors += ValidationError(path :+ UpdateBusinessOfferPriceDTO.Fields.offerId, s"length $len is longer than the max length 255")
            }
        }


        







        

        // ==================
        // price






        
        if (errors.isEmpty || !failFast) {
            if (price == null) {
            errors += ValidationError(path :+ UpdateBusinessOfferPriceDTO.Fields.price, "price is a required field and cannot be null")
            }
        }
        







        
        // validating price
        if (errors.isEmpty || !failFast) {
            if price != null then errors ++= price.validationErrors(path :+ UpdateBusinessOfferPriceDTO.Fields.price, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[UpdateBusinessOfferPriceDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : UpdateBusinessOfferPriceDTO = {
    UpdateBusinessOfferPriceDTO(
        offerId = 
        offerId
        
        ,
        price = 
        price
        
        
    )
  }
}

object UpdateBusinessOfferPriceDTOData {

  given readWriter : RW[UpdateBusinessOfferPriceDTOData] = macroRW

  def fromJsonString(jason : String) : UpdateBusinessOfferPriceDTOData = try {
        read[UpdateBusinessOfferPriceDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[UpdateBusinessOfferPriceDTOData] = try {
        read[List[UpdateBusinessOfferPriceDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[UpdateBusinessOfferPriceDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[UpdateBusinessOfferPriceDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, UpdateBusinessOfferPriceDTOData] = try {
        read[Map[String, UpdateBusinessOfferPriceDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, UpdateBusinessOfferPriceDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, UpdateBusinessOfferPriceDTO]())) {
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

