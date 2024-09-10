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

import ympa_kotlin_client.models.FlippingPagerDTO

class FlippingPagerDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FlippingPagerDTO
        //val modelInstance = FlippingPagerDTO()

        // to test the property `total` - Сколько всего найдено элементов.
        should("test total") {
            // uncomment below to test the property
            //modelInstance.total shouldBe ("TODO")
        }

        // to test the property `from` - Начальный номер найденного элемента на странице.
        should("test from") {
            // uncomment below to test the property
            //modelInstance.from shouldBe ("TODO")
        }

        // to test the property `to` - Конечный номер найденного элемента на странице.
        should("test to") {
            // uncomment below to test the property
            //modelInstance.to shouldBe ("TODO")
        }

        // to test the property `currentPage` - Текущая страница.
        should("test currentPage") {
            // uncomment below to test the property
            //modelInstance.currentPage shouldBe ("TODO")
        }

        // to test the property `pagesCount` - Общее количество страниц.
        should("test pagesCount") {
            // uncomment below to test the property
            //modelInstance.pagesCount shouldBe ("TODO")
        }

        // to test the property `pageSize` - Размер страницы.
        should("test pageSize") {
            // uncomment below to test the property
            //modelInstance.pageSize shouldBe ("TODO")
        }

    }
}
