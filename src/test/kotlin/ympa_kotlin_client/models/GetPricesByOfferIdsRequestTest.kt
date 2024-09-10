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

import ympa_kotlin_client.models.GetPricesByOfferIdsRequest

class GetPricesByOfferIdsRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetPricesByOfferIdsRequest
        //val modelInstance = GetPricesByOfferIdsRequest()

        // to test the property `offerIds` - Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
        should("test offerIds") {
            // uncomment below to test the property
            //modelInstance.offerIds shouldBe ("TODO")
        }

    }
}
