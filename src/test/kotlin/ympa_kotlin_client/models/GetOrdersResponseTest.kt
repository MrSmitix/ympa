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

import ympa_kotlin_client.models.GetOrdersResponse
import ympa_kotlin_client.models.FlippingPagerDTO
import ympa_kotlin_client.models.ForwardScrollingPagerDTO
import ympa_kotlin_client.models.OrderDTO

class GetOrdersResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetOrdersResponse
        //val modelInstance = GetOrdersResponse()

        // to test the property `orders` - Модель заказа. 
        should("test orders") {
            // uncomment below to test the property
            //modelInstance.orders shouldBe ("TODO")
        }

        // to test the property `pager`
        should("test pager") {
            // uncomment below to test the property
            //modelInstance.pager shouldBe ("TODO")
        }

        // to test the property `paging`
        should("test paging") {
            // uncomment below to test the property
            //modelInstance.paging shouldBe ("TODO")
        }

    }
}
