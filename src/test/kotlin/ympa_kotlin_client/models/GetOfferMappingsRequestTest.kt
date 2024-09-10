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

import ympa_kotlin_client.models.GetOfferMappingsRequest
import ympa_kotlin_client.models.OfferCardStatusType

class GetOfferMappingsRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetOfferMappingsRequest
        //val modelInstance = GetOfferMappingsRequest()

        // to test the property `offerIds` - Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
        should("test offerIds") {
            // uncomment below to test the property
            //modelInstance.offerIds shouldBe ("TODO")
        }

        // to test the property `cardStatuses` - Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
        should("test cardStatuses") {
            // uncomment below to test the property
            //modelInstance.cardStatuses shouldBe ("TODO")
        }

        // to test the property `categoryIds` - Фильтр по категориям на Маркете.
        should("test categoryIds") {
            // uncomment below to test the property
            //modelInstance.categoryIds shouldBe ("TODO")
        }

        // to test the property `vendorNames` - Фильтр по брендам.
        should("test vendorNames") {
            // uncomment below to test the property
            //modelInstance.vendorNames shouldBe ("TODO")
        }

        // to test the property `tags` - Фильтр по тегам.
        should("test tags") {
            // uncomment below to test the property
            //modelInstance.tags shouldBe ("TODO")
        }

        // to test the property `archived` - Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
        should("test archived") {
            // uncomment below to test the property
            //modelInstance.archived shouldBe ("TODO")
        }

    }
}
