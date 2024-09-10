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
import scala.math.BigDecimal
import ympa_scala_cask_server.model.CurrencyType
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** UpdatePriceWithDiscountDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class UpdatePriceWithDiscountDTOData(
/* Значение. */
  value: BigDecimal,

    currencyId: CurrencyType,

  /* Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
  discountBase: BigDecimal = 0 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // value

        // validate against exclusive minimum 0
        if (errors.isEmpty || !failFast) {
            if !(value > 0) then
            errors += ValidationError(path :+ UpdatePriceWithDiscountDTO.Fields.value, s"value '$value' is not greater than the exclusive minimum value 0")
        }





        
        if (errors.isEmpty || !failFast) {
            if (value == null) {
            errors += ValidationError(path :+ UpdatePriceWithDiscountDTO.Fields.value, "value is a required field and cannot be null")
            }
        }
        







        

        // ==================
        // currencyId






        
        if (errors.isEmpty || !failFast) {
            if (currencyId == null) {
            errors += ValidationError(path :+ UpdatePriceWithDiscountDTO.Fields.currencyId, "currencyId is a required field and cannot be null")
            }
        }
        







        

        // ==================
        // discountBase

        // validate against exclusive minimum 0
        if (errors.isEmpty || !failFast) {
            if !(discountBase > 0) then
            errors += ValidationError(path :+ UpdatePriceWithDiscountDTO.Fields.discountBase, s"value '$discountBase' is not greater than the exclusive minimum value 0")
        }





        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[UpdatePriceWithDiscountDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : UpdatePriceWithDiscountDTO = {
    UpdatePriceWithDiscountDTO(
        value = 
        value
        
        ,
        currencyId = 
        currencyId
        
        ,
        discountBase = Option(
        discountBase
        )
        
    )
  }
}

object UpdatePriceWithDiscountDTOData {

  given readWriter : RW[UpdatePriceWithDiscountDTOData] = macroRW

  def fromJsonString(jason : String) : UpdatePriceWithDiscountDTOData = try {
        read[UpdatePriceWithDiscountDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[UpdatePriceWithDiscountDTOData] = try {
        read[List[UpdatePriceWithDiscountDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[UpdatePriceWithDiscountDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[UpdatePriceWithDiscountDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, UpdatePriceWithDiscountDTOData] = try {
        read[Map[String, UpdatePriceWithDiscountDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, UpdatePriceWithDiscountDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, UpdatePriceWithDiscountDTO]())) {
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

