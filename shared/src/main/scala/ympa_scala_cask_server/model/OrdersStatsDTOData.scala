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
import ympa_scala_cask_server.model.ForwardScrollingPagerDTO
import ympa_scala_cask_server.model.OrdersStatsOrderDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** OrdersStatsDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class OrdersStatsDTOData(
/* Список заказов. */
  orders: Seq[OrdersStatsOrderDTOData],

    paging: ForwardScrollingPagerDTOData = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // orders






        
        if (errors.isEmpty || !failFast) {
            if (orders == null) {
            errors += ValidationError(path :+ OrdersStatsDTO.Fields.orders, "orders is a required field and cannot be null")
            }
        }
        







        
        if (errors.isEmpty || !failFast) {
            if (orders != null) {
                orders.zipWithIndex.foreach {
                    case (value, i) if errors.isEmpty || !failFast =>
                      errors ++= value.validationErrors(
                        path :+ OrdersStatsDTO.Fields.orders :+ Field(i.toString),
                        failFast)
                    case (value, i) =>
                }
            }
        }
        

        // ==================
        // paging






        







        
        // validating paging
        if (errors.isEmpty || !failFast) {
            if paging != null then errors ++= paging.validationErrors(path :+ OrdersStatsDTO.Fields.paging, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[OrdersStatsDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : OrdersStatsDTO = {
    OrdersStatsDTO(
        orders = 
        orders
        
        .map(_.asModel),
        paging = Option(
        paging
        )
        .map(_.asModel)
    )
  }
}

object OrdersStatsDTOData {

  given readWriter : RW[OrdersStatsDTOData] = macroRW

  def fromJsonString(jason : String) : OrdersStatsDTOData = try {
        read[OrdersStatsDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[OrdersStatsDTOData] = try {
        read[List[OrdersStatsDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[OrdersStatsDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[OrdersStatsDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, OrdersStatsDTOData] = try {
        read[Map[String, OrdersStatsDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, OrdersStatsDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, OrdersStatsDTO]())) {
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

