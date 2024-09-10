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

// this model was generated using modelTest.mustache
package ympa_scala_cask_server.model
import java.time.LocalDate
import java.time.OffsetDateTime
import ympa_scala_cask_server.model.PlacementType

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import scala.util.*

class GenerateUnitedMarketplaceServicesReportRequestTest extends AnyWordSpec with Matchers {

    "GenerateUnitedMarketplaceServicesReportRequest.fromJson" should {
        """not parse invalid json""" in {
           val Failure(err) = Try(GenerateUnitedMarketplaceServicesReportRequestData.fromJsonString("invalid jason"))
           err.getMessage should startWith ("Error parsing json 'invalid jason'")
        }
        """parse """ ignore {
           val Failure(err : ValidationErrors) = GenerateUnitedMarketplaceServicesReportRequestData.fromJsonString("""""").validated()

           sys.error("TODO")
        }
    }

}
