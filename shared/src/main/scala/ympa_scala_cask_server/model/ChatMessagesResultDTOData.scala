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
import ympa_scala_cask_server.model.ChatMessageDTO
import ympa_scala_cask_server.model.ForwardScrollingPagerDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** ChatMessagesResultDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class ChatMessagesResultDTOData(
/* Идентификатор заказа. */
  orderId: Long,

  /* Информация о сообщениях. */
  messages: Seq[ChatMessageDTOData],

    paging: ForwardScrollingPagerDTOData = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // orderId






        







        

        // ==================
        // messages






        
        if (errors.isEmpty || !failFast) {
            if (messages == null) {
            errors += ValidationError(path :+ ChatMessagesResultDTO.Fields.messages, "messages is a required field and cannot be null")
            }
        }
        







        
        if (errors.isEmpty || !failFast) {
            if (messages != null) {
                messages.zipWithIndex.foreach {
                    case (value, i) if errors.isEmpty || !failFast =>
                      errors ++= value.validationErrors(
                        path :+ ChatMessagesResultDTO.Fields.messages :+ Field(i.toString),
                        failFast)
                    case (value, i) =>
                }
            }
        }
        

        // ==================
        // paging






        







        
        // validating paging
        if (errors.isEmpty || !failFast) {
            if paging != null then errors ++= paging.validationErrors(path :+ ChatMessagesResultDTO.Fields.paging, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[ChatMessagesResultDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : ChatMessagesResultDTO = {
    ChatMessagesResultDTO(
        orderId = 
        orderId
        
        ,
        messages = 
        messages
        
        .map(_.asModel),
        paging = Option(
        paging
        )
        .map(_.asModel)
    )
  }
}

object ChatMessagesResultDTOData {

  given readWriter : RW[ChatMessagesResultDTOData] = macroRW

  def fromJsonString(jason : String) : ChatMessagesResultDTOData = try {
        read[ChatMessagesResultDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[ChatMessagesResultDTOData] = try {
        read[List[ChatMessagesResultDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[ChatMessagesResultDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[ChatMessagesResultDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, ChatMessagesResultDTOData] = try {
        read[Map[String, ChatMessagesResultDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, ChatMessagesResultDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, ChatMessagesResultDTO]())) {
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

