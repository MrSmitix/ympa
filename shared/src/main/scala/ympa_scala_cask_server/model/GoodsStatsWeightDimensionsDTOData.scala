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
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** GoodsStatsWeightDimensionsDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class GoodsStatsWeightDimensionsDTOData(
/* Длина товара в сантиметрах. */
  length: BigDecimal = 0 ,

  /* Ширина товара в сантиметрах. */
  width: BigDecimal = 0 ,

  /* Высота товара в сантиметрах. */
  height: BigDecimal = 0 ,

  /* Вес товара в килограммах. */
  weight: BigDecimal = 0 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // length






        







        

        // ==================
        // width






        







        

        // ==================
        // height






        







        

        // ==================
        // weight






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[GoodsStatsWeightDimensionsDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : GoodsStatsWeightDimensionsDTO = {
    GoodsStatsWeightDimensionsDTO(
        length = Option(
        length
        )
        ,
        width = Option(
        width
        )
        ,
        height = Option(
        height
        )
        ,
        weight = Option(
        weight
        )
        
    )
  }
}

object GoodsStatsWeightDimensionsDTOData {

  given readWriter : RW[GoodsStatsWeightDimensionsDTOData] = macroRW

  def fromJsonString(jason : String) : GoodsStatsWeightDimensionsDTOData = try {
        read[GoodsStatsWeightDimensionsDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[GoodsStatsWeightDimensionsDTOData] = try {
        read[List[GoodsStatsWeightDimensionsDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[GoodsStatsWeightDimensionsDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[GoodsStatsWeightDimensionsDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, GoodsStatsWeightDimensionsDTOData] = try {
        read[Map[String, GoodsStatsWeightDimensionsDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, GoodsStatsWeightDimensionsDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, GoodsStatsWeightDimensionsDTO]())) {
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

