/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ympa_kotlin_client.models.GenerateShelfsStatisticsRequest
import ympa_kotlin_client.models.ShelfsStatisticsAttributionType

class GenerateShelfsStatisticsRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GenerateShelfsStatisticsRequest
        //val modelInstance = GenerateShelfsStatisticsRequest()

        // to test the property `businessId` - Идентификатор бизнеса.
        should("test businessId") {
            // uncomment below to test the property
            //modelInstance.businessId shouldBe ("TODO")
        }

        // to test the property `dateFrom` - Начало периода, включительно.
        should("test dateFrom") {
            // uncomment below to test the property
            //modelInstance.dateFrom shouldBe ("TODO")
        }

        // to test the property `dateTo` - Конец периода, включительно.
        should("test dateTo") {
            // uncomment below to test the property
            //modelInstance.dateTo shouldBe ("TODO")
        }

        // to test the property `attributionType`
        should("test attributionType") {
            // uncomment below to test the property
            //modelInstance.attributionType shouldBe ("TODO")
        }

    }
}
