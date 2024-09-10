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

import ympa_kotlin_client.models.TariffDTO
import ympa_kotlin_client.models.TariffParameterDTO
import ympa_kotlin_client.models.TariffType

class TariffDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TariffDTO
        //val modelInstance = TariffDTO()

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `amount` - Значение тарифа в рублях.
        should("test amount") {
            // uncomment below to test the property
            //modelInstance.amount shouldBe ("TODO")
        }

        // to test the property `parameters` - Параметры расчета тарифа.
        should("test parameters") {
            // uncomment below to test the property
            //modelInstance.parameters shouldBe ("TODO")
        }

        // to test the property `percent` - {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
        should("test percent") {
            // uncomment below to test the property
            //modelInstance.percent shouldBe ("TODO")
        }

    }
}
