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
import scala.math.BigDecimal
import ympa_scala_cask_server.model.CurrencyType
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** GetPriceDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class GetPriceDTOData(
/* Значение. */
  value: BigDecimal,

    currencyId: CurrencyType,

  /* Время последнего обновления. */
  updatedAt: OffsetDateTime

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // value

        // validate against exclusive minimum 0
        if (errors.isEmpty || !failFast) {
            if !(value > 0) then
            errors += ValidationError(path :+ GetPriceDTO.Fields.value, s"value '$value' is not greater than the exclusive minimum value 0")
        }





        
        if (errors.isEmpty || !failFast) {
            if (value == null) {
            errors += ValidationError(path :+ GetPriceDTO.Fields.value, "value is a required field and cannot be null")
            }
        }
        







        

        // ==================
        // currencyId






        
        if (errors.isEmpty || !failFast) {
            if (currencyId == null) {
            errors += ValidationError(path :+ GetPriceDTO.Fields.currencyId, "currencyId is a required field and cannot be null")
            }
        }
        







        

        // ==================
        // updatedAt






        
        if (errors.isEmpty || !failFast) {
            if (updatedAt == null) {
            errors += ValidationError(path :+ GetPriceDTO.Fields.updatedAt, "updatedAt is a required field and cannot be null")
            }
        }
        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[GetPriceDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : GetPriceDTO = {
    GetPriceDTO(
        value = 
        value
        
        ,
        currencyId = 
        currencyId
        
        ,
        updatedAt = 
        updatedAt
        
        
    )
  }
}

object GetPriceDTOData {

  given readWriter : RW[GetPriceDTOData] = macroRW

  def fromJsonString(jason : String) : GetPriceDTOData = try {
        read[GetPriceDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[GetPriceDTOData] = try {
        read[List[GetPriceDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[GetPriceDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[GetPriceDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, GetPriceDTOData] = try {
        read[Map[String, GetPriceDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, GetPriceDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, GetPriceDTO]())) {
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

