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

import ympa_kotlin_client.models.GetModelsOffersResponse
import ympa_kotlin_client.models.CurrencyType
import ympa_kotlin_client.models.EnrichedModelDTO

class GetModelsOffersResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetModelsOffersResponse
        //val modelInstance = GetModelsOffersResponse()

        // to test the property `models` - Список моделей товаров.
        should("test models") {
            // uncomment below to test the property
            //modelInstance.models shouldBe ("TODO")
        }

        // to test the property `currency`
        should("test currency") {
            // uncomment below to test the property
            //modelInstance.currency shouldBe ("TODO")
        }

        // to test the property `regionId` - Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
        should("test regionId") {
            // uncomment below to test the property
            //modelInstance.regionId shouldBe ("TODO")
        }

    }
}
