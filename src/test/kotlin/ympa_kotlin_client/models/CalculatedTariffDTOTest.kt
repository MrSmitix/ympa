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

import ympa_kotlin_client.models.CalculatedTariffDTO
import ympa_kotlin_client.models.CalculatedTariffType
import ympa_kotlin_client.models.TariffParameterDTO

class CalculatedTariffDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CalculatedTariffDTO
        //val modelInstance = CalculatedTariffDTO()

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `parameters` - Параметры расчета тарифа.
        should("test parameters") {
            // uncomment below to test the property
            //modelInstance.parameters shouldBe ("TODO")
        }

        // to test the property `amount` - Стоимость услуги в рублях.
        should("test amount") {
            // uncomment below to test the property
            //modelInstance.amount shouldBe ("TODO")
        }

    }
}
