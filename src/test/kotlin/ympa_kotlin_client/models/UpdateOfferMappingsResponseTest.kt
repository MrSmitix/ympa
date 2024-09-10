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

import ympa_kotlin_client.models.UpdateOfferMappingsResponse
import ympa_kotlin_client.models.ApiResponseStatusType
import ympa_kotlin_client.models.UpdateOfferMappingResultDTO

class UpdateOfferMappingsResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateOfferMappingsResponse
        //val modelInstance = UpdateOfferMappingsResponse()

        // to test the property `status`
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `results` - Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
        should("test results") {
            // uncomment below to test the property
            //modelInstance.results shouldBe ("TODO")
        }

    }
}
