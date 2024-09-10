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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 *
 * @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @param price Цена на товар в рублях.
 * @param length Длина товара в сантиметрах.
 * @param width Ширина товара в сантиметрах.
 * @param height Высота товара в сантиметрах.
 * @param weight Вес товара в килограммах.
 * @param quantity Квант продажи — количество единиц товара в одном товарном предложении.
 */


data class CalculateTariffsOfferDTO (

    /* Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  */
    @Json(name = "categoryId")
    val categoryId: kotlin.Long,

    /* Цена на товар в рублях. */
    @Json(name = "price")
    val price: java.math.BigDecimal,

    /* Длина товара в сантиметрах. */
    @Json(name = "length")
    val length: java.math.BigDecimal,

    /* Ширина товара в сантиметрах. */
    @Json(name = "width")
    val width: java.math.BigDecimal,

    /* Высота товара в сантиметрах. */
    @Json(name = "height")
    val height: java.math.BigDecimal,

    /* Вес товара в килограммах. */
    @Json(name = "weight")
    val weight: java.math.BigDecimal,

    /* Квант продажи — количество единиц товара в одном товарном предложении. */
    @Json(name = "quantity")
    val quantity: kotlin.Int? = 1

) {


}

