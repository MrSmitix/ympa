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

import ympa_kotlin_client.models.UpdateOutletLicenseRequest
import ympa_kotlin_client.models.OutletLicenseDTO

class UpdateOutletLicenseRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateOutletLicenseRequest
        //val modelInstance = UpdateOutletLicenseRequest()

        // to test the property `licenses` - Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
        should("test licenses") {
            // uncomment below to test the property
            //modelInstance.licenses shouldBe ("TODO")
        }

    }
}
