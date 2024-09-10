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
import ympa_scala_cask_server.model.CampaignQualityRatingDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** CampaignsQualityRatingDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class CampaignsQualityRatingDTOData(
/* Список магазинов c информацией об их индексе качества. */
  campaignRatings: Seq[CampaignQualityRatingDTOData]

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // campaignRatings






        
        if (errors.isEmpty || !failFast) {
            if (campaignRatings == null) {
            errors += ValidationError(path :+ CampaignsQualityRatingDTO.Fields.campaignRatings, "campaignRatings is a required field and cannot be null")
            }
        }
        







        
        if (errors.isEmpty || !failFast) {
            if (campaignRatings != null) {
                campaignRatings.zipWithIndex.foreach {
                    case (value, i) if errors.isEmpty || !failFast =>
                      errors ++= value.validationErrors(
                        path :+ CampaignsQualityRatingDTO.Fields.campaignRatings :+ Field(i.toString),
                        failFast)
                    case (value, i) =>
                }
            }
        }
        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[CampaignsQualityRatingDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : CampaignsQualityRatingDTO = {
    CampaignsQualityRatingDTO(
        campaignRatings = 
        campaignRatings
        
        .map(_.asModel)
    )
  }
}

object CampaignsQualityRatingDTOData {

  given readWriter : RW[CampaignsQualityRatingDTOData] = macroRW

  def fromJsonString(jason : String) : CampaignsQualityRatingDTOData = try {
        read[CampaignsQualityRatingDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[CampaignsQualityRatingDTOData] = try {
        read[List[CampaignsQualityRatingDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[CampaignsQualityRatingDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[CampaignsQualityRatingDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, CampaignsQualityRatingDTOData] = try {
        read[Map[String, CampaignsQualityRatingDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, CampaignsQualityRatingDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, CampaignsQualityRatingDTO]())) {
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

