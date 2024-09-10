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

import ympa_kotlin_client.models.FlippingPagerDTO
import ympa_kotlin_client.models.ForwardScrollingPagerDTO
import ympa_kotlin_client.models.OrderDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Модель для ответа API списка информации по заказам.
 *
 * @param orders Модель заказа. 
 * @param pager 
 * @param paging 
 */


data class GetOrdersResponse (

    /* Модель заказа.  */
    @Json(name = "orders")
    val orders: kotlin.collections.List<OrderDTO>,

    @Json(name = "pager")
    val pager: FlippingPagerDTO? = null,

    @Json(name = "paging")
    val paging: ForwardScrollingPagerDTO? = null

) {


}

