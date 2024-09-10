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

import ympa_kotlin_client.models.SkuBidItemDTO

class SkuBidItemDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SkuBidItemDTO
        //val modelInstance = SkuBidItemDTO()

        // to test the property `sku` - Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        should("test sku") {
            // uncomment below to test the property
            //modelInstance.sku shouldBe ("TODO")
        }

        // to test the property `bid` - Значение ставки.
        should("test bid") {
            // uncomment below to test the property
            //modelInstance.bid shouldBe ("TODO")
        }

    }
}
