/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package ympa_kotlin_server.models

import ympa_kotlin_server.models.GetPriceWithDiscountDTO
import ympa_kotlin_server.models.GetPriceWithVatDTO
import ympa_kotlin_server.models.OfferCampaignStatusType
import ympa_kotlin_server.models.OfferErrorDTO
import ympa_kotlin_server.models.QuantumDTO

/**
 * Параметры размещения товара в магазине.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param quantum 
 * @param available Есть ли товар в продаже. 
 * @param basicPrice 
 * @param campaignPrice 
 * @param status 
 * @param errors Ошибки, препятствующие размещению товара на витрине. 
 * @param warnings Предупреждения, не препятствующие размещению товара на витрине. 
 */
data class GetCampaignOfferDTO(
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    val offerId: kotlin.String,
    val quantum: QuantumDTO? = null,
    /* Есть ли товар в продаже.  */
    val available: kotlin.Boolean? = null,
    val basicPrice: GetPriceWithDiscountDTO? = null,
    val campaignPrice: GetPriceWithVatDTO? = null,
    val status: OfferCampaignStatusType? = null,
    /* Ошибки, препятствующие размещению товара на витрине.  */
    val errors: kotlin.collections.List<OfferErrorDTO>? = null,
    /* Предупреждения, не препятствующие размещению товара на витрине.  */
    val warnings: kotlin.collections.List<OfferErrorDTO>? = null
) 

