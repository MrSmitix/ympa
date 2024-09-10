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
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** GetMappingDTOData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class GetMappingDTOData(
/* SKU на Маркете. */
  marketSku: Long = 0 ,

  /* Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
  marketSkuName: String = "" ,

  /* Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
  marketModelId: Long = 0 ,

  /* Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
  marketModelName: String = "" ,

  /* Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
  marketCategoryId: Long = 0 ,

  /* Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
  marketCategoryName: String = "" 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // marketSku






        







        

        // ==================
        // marketSkuName






        







        

        // ==================
        // marketModelId






        







        

        // ==================
        // marketModelName






        







        

        // ==================
        // marketCategoryId






        







        

        // ==================
        // marketCategoryName






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[GetMappingDTO] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : GetMappingDTO = {
    GetMappingDTO(
        marketSku = Option(
        marketSku
        )
        ,
        marketSkuName = Option(
        marketSkuName
        )
        ,
        marketModelId = Option(
        marketModelId
        )
        ,
        marketModelName = Option(
        marketModelName
        )
        ,
        marketCategoryId = Option(
        marketCategoryId
        )
        ,
        marketCategoryName = Option(
        marketCategoryName
        )
        
    )
  }
}

object GetMappingDTOData {

  given readWriter : RW[GetMappingDTOData] = macroRW

  def fromJsonString(jason : String) : GetMappingDTOData = try {
        read[GetMappingDTOData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[GetMappingDTOData] = try {
        read[List[GetMappingDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[GetMappingDTO]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[GetMappingDTO]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, GetMappingDTOData] = try {
        read[Map[String, GetMappingDTOData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, GetMappingDTO]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, GetMappingDTO]())) {
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

