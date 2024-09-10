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
import ympa_scala_cask_server.model.CampaignSettingsTimePeriodDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** CampaignSettingsScheduleDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class CampaignSettingsScheduleDTOData(
/* Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  */
  availableOnHolidays: Boolean = false ,

  /* Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. */
  customHolidays: Seq[String],

  /* Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. */
  customWorkingDays: Seq[String],

    period: CampaignSettingsTimePeriodDTOData = null ,

  /* Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. */
  totalHolidays: Seq[String],

  /* Список выходных дней недели и государственных праздников. */
  weeklyHolidays: Seq[Int]

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // availableOnHolidays






        







        

        // ==================
        // customHolidays






        







        

        // ==================
        // customWorkingDays






        







        

        // ==================
        // period






        







        
        // validating period
        if (errors.isEmpty || !failFast) {
            if period != null then errors ++= period.validationErrors(path :+ CampaignSettingsScheduleDTO.Fields.period, failFast)
        }

        // ==================
        // totalHolidays






        







        

        // ==================
        // weeklyHolidays






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[CampaignSettingsScheduleDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : CampaignSettingsScheduleDTO = {
    CampaignSettingsScheduleDTO(
        availableOnHolidays = Option(
        availableOnHolidays
        )
        ,
        customHolidays = 
        customHolidays
        
        ,
        customWorkingDays = 
        customWorkingDays
        
        ,
        period = Option(
        period
        )
        .map(_.asModel),
        totalHolidays = 
        totalHolidays
        
        ,
        weeklyHolidays = 
        weeklyHolidays
        
        
    )
  }
}

object CampaignSettingsScheduleDTOData {

  given readWriter : RW[CampaignSettingsScheduleDTOData] = macroRW

  def fromJsonString(jason : String) : CampaignSettingsScheduleDTOData = try {
        read[CampaignSettingsScheduleDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[CampaignSettingsScheduleDTOData] = try {
        read[List[CampaignSettingsScheduleDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[CampaignSettingsScheduleDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[CampaignSettingsScheduleDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, CampaignSettingsScheduleDTOData] = try {
        read[Map[String, CampaignSettingsScheduleDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, CampaignSettingsScheduleDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, CampaignSettingsScheduleDTO]())) {
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

