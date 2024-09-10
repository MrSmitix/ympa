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

import ympa_kotlin_client.models.OutletWorkingScheduleItemDTO
import ympa_kotlin_client.models.DayOfWeekType

class OutletWorkingScheduleItemDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OutletWorkingScheduleItemDTO
        //val modelInstance = OutletWorkingScheduleItemDTO()

        // to test the property `startDay`
        should("test startDay") {
            // uncomment below to test the property
            //modelInstance.startDay shouldBe ("TODO")
        }

        // to test the property `endDay`
        should("test endDay") {
            // uncomment below to test the property
            //modelInstance.endDay shouldBe ("TODO")
        }

        // to test the property `startTime` - Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
        should("test startTime") {
            // uncomment below to test the property
            //modelInstance.startTime shouldBe ("TODO")
        }

        // to test the property `endTime` - Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
        should("test endTime") {
            // uncomment below to test the property
            //modelInstance.endTime shouldBe ("TODO")
        }

    }
}
