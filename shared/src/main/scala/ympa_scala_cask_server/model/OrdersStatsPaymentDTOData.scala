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
import java.time.LocalDate
import scala.math.BigDecimal
import ympa_scala_cask_server.model.OrdersStatsPaymentOrderDTO
import ympa_scala_cask_server.model.OrdersStatsPaymentSourceType
import ympa_scala_cask_server.model.OrdersStatsPaymentType
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** OrdersStatsPaymentDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class OrdersStatsPaymentDTOData(
/* Идентификатор денежного перевода. */
  id: String = "" ,

  /* Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  */
  date: LocalDate = null ,

    `type`: OrdersStatsPaymentType = null ,

    source: OrdersStatsPaymentSourceType = null ,

  /* Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  */
  total: BigDecimal = 0 ,

    paymentOrder: OrdersStatsPaymentOrderDTOData = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // id






        







        

        // ==================
        // date






        







        

        // ==================
        // `type`






        







        

        // ==================
        // source






        







        

        // ==================
        // total






        







        

        // ==================
        // paymentOrder






        







        
        // validating paymentOrder
        if (errors.isEmpty || !failFast) {
            if paymentOrder != null then errors ++= paymentOrder.validationErrors(path :+ OrdersStatsPaymentDTO.Fields.paymentOrder, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[OrdersStatsPaymentDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : OrdersStatsPaymentDTO = {
    OrdersStatsPaymentDTO(
        id = Option(
        id
        )
        ,
        date = Option(
        date
        )
        ,
        `type` = Option(
        `type`
        )
        ,
        source = Option(
        source
        )
        ,
        total = Option(
        total
        )
        ,
        paymentOrder = Option(
        paymentOrder
        )
        .map(_.asModel)
    )
  }
}

object OrdersStatsPaymentDTOData {

  given readWriter : RW[OrdersStatsPaymentDTOData] = macroRW

  def fromJsonString(jason : String) : OrdersStatsPaymentDTOData = try {
        read[OrdersStatsPaymentDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[OrdersStatsPaymentDTOData] = try {
        read[List[OrdersStatsPaymentDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[OrdersStatsPaymentDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[OrdersStatsPaymentDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, OrdersStatsPaymentDTOData] = try {
        read[Map[String, OrdersStatsPaymentDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, OrdersStatsPaymentDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, OrdersStatsPaymentDTO]())) {
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

