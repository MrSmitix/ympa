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
import ympa_scala_cask_server.model.BasePriceDTO
import ympa_scala_cask_server.model.PriceCompetitivenessThresholdsDTO
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** OfferRecommendationInfoDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class OfferRecommendationInfoDTOData(
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String = "" ,

    recommendedCofinancePrice: BasePriceDTOData = null ,

    competitivenessThresholds: PriceCompetitivenessThresholdsDTOData = null 

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
              errors += ValidationError(path :+ OfferRecommendationInfoDTO.Fields.offerId, s"value '$offerId' doesn't match pattern $regex")
        }



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if offerId == null then 0 else offerId.length
            if (len < 1) {
               errors += ValidationError(path :+ OfferRecommendationInfoDTO.Fields.offerId, s"length $len is shorter than the min length 1")
            }
        }

        // validate max length 255
        if (errors.isEmpty || !failFast)  {
          val len = if offerId == null then 0 else offerId.length
            if (len < 255) {
               errors += ValidationError(path :+ OfferRecommendationInfoDTO.Fields.offerId, s"length $len is longer than the max length 255")
            }
        }


        







        

        // ==================
        // recommendedCofinancePrice






        







        
        // validating recommendedCofinancePrice
        if (errors.isEmpty || !failFast) {
            if recommendedCofinancePrice != null then errors ++= recommendedCofinancePrice.validationErrors(path :+ OfferRecommendationInfoDTO.Fields.recommendedCofinancePrice, failFast)
        }

        // ==================
        // competitivenessThresholds






        







        
        // validating competitivenessThresholds
        if (errors.isEmpty || !failFast) {
            if competitivenessThresholds != null then errors ++= competitivenessThresholds.validationErrors(path :+ OfferRecommendationInfoDTO.Fields.competitivenessThresholds, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[OfferRecommendationInfoDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : OfferRecommendationInfoDTO = {
    OfferRecommendationInfoDTO(
        offerId = Option(
        offerId
        )
        ,
        recommendedCofinancePrice = Option(
        recommendedCofinancePrice
        )
        .map(_.asModel),
        competitivenessThresholds = Option(
        competitivenessThresholds
        )
        .map(_.asModel)
    )
  }
}

object OfferRecommendationInfoDTOData {

  given readWriter : RW[OfferRecommendationInfoDTOData] = macroRW

  def fromJsonString(jason : String) : OfferRecommendationInfoDTOData = try {
        read[OfferRecommendationInfoDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[OfferRecommendationInfoDTOData] = try {
        read[List[OfferRecommendationInfoDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[OfferRecommendationInfoDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[OfferRecommendationInfoDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, OfferRecommendationInfoDTOData] = try {
        read[Map[String, OfferRecommendationInfoDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, OfferRecommendationInfoDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, OfferRecommendationInfoDTO]())) {
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

