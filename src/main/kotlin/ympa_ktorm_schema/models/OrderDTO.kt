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
package ympa_ktorm_schema.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Заказ.
 * @param items Список товаров в заказе.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 * @param creationDate 
 * @param updatedAt 
 * @param currency 
 * @param itemsTotal Платеж покупателя. 
 * @param deliveryTotal Стоимость доставки. 
 * @param buyerItemsTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
 * @param buyerTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
 * @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @param buyerTotalBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
 * @param paymentType 
 * @param paymentMethod 
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @param subsidies Список субсидий по типам.
 * @param delivery 
 * @param buyer 
 * @param notes Комментарий к заказу.
 * @param taxSystem 
 * @param cancelRequested **Только для модели DBS**  Запрошена ли отмена. 
 * @param expiryDate 
 */
object OrderDTOs : BaseTable<OrderDTO>("OrderDTO") {
    val id = long("id") /* null */ /* Идентификатор заказа. */
    val status = long("status") /* null */
    val substatus = long("substatus") /* null */
    val creationDate = text("creationDate") /* null */
    val updatedAt = text("updatedAt") /* null */
    val currency = long("currency") /* null */
    val itemsTotal = decimal("itemsTotal") /* null */ /* Платеж покупателя.  */
    val deliveryTotal = decimal("deliveryTotal") /* null */ /* Стоимость доставки.  */
    @Deprecated(message = "This property is deprecated.")
    val buyerItemsTotal = decimal("buyerItemsTotal") /* null */ /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  */
    @Deprecated(message = "This property is deprecated.")
    val buyerTotal = decimal("buyerTotal") /* null */ /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  */
    val buyerItemsTotalBeforeDiscount = decimal("buyerItemsTotalBeforeDiscount") /* null */ /* Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  */
    @Deprecated(message = "This property is deprecated.")
    val buyerTotalBeforeDiscount = decimal("buyerTotalBeforeDiscount") /* null */ /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  */
    val paymentType = long("paymentType") /* null */
    val paymentMethod = long("paymentMethod") /* null */
    val fake = boolean("fake") /* null */ /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
    val delivery = long("delivery") /* null */
    val buyer = long("buyer") /* null */
    val notes = text("notes") /* null */ /* Комментарий к заказу. */
    val taxSystem = long("taxSystem") /* null */
    val cancelRequested = boolean("cancelRequested") /* null */ /* **Только для модели DBS**  Запрошена ли отмена.  */
    val expiryDate = text("expiryDate") /* null */

    /**
     * Create an entity of type OrderDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrderDTO(
        items = emptyList() /* kotlin.Array<OrderItemDTO> */ /* Список товаров в заказе. */,
        id = row[id]  /* kotlin.Long? */ /* Идентификатор заказа. */,
        status = OrderStatusTypes.createEntity(row, withReferences) /* OrderStatusType? */,
        substatus = OrderSubstatusTypes.createEntity(row, withReferences) /* OrderSubstatusType? */,
        creationDate = row[creationDate]  /* kotlin.String? */,
        updatedAt = row[updatedAt]  /* kotlin.String? */,
        currency = CurrencyTypes.createEntity(row, withReferences) /* CurrencyType? */,
        itemsTotal = row[itemsTotal]  /* java.math.BigDecimal? */ /* Платеж покупателя.  */,
        deliveryTotal = row[deliveryTotal]  /* java.math.BigDecimal? */ /* Стоимость доставки.  */,
        buyerItemsTotal = row[buyerItemsTotal]  /* java.math.BigDecimal? */ /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  */,
        buyerTotal = row[buyerTotal]  /* java.math.BigDecimal? */ /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  */,
        buyerItemsTotalBeforeDiscount = row[buyerItemsTotalBeforeDiscount]  /* java.math.BigDecimal? */ /* Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  */,
        buyerTotalBeforeDiscount = row[buyerTotalBeforeDiscount]  /* java.math.BigDecimal? */ /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  */,
        paymentType = OrderPaymentTypes.createEntity(row, withReferences) /* OrderPaymentType? */,
        paymentMethod = OrderPaymentMethodTypes.createEntity(row, withReferences) /* OrderPaymentMethodType? */,
        fake = row[fake]  /* kotlin.Boolean? */ /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */,
        subsidies = emptyList() /* kotlin.Array<OrderSubsidyDTO>? */ /* Список субсидий по типам. */,
        delivery = OrderDeliveryDTOs.createEntity(row, withReferences) /* OrderDeliveryDTO? */,
        buyer = OrderBuyerDTOs.createEntity(row, withReferences) /* OrderBuyerDTO? */,
        notes = row[notes]  /* kotlin.String? */ /* Комментарий к заказу. */,
        taxSystem = OrderTaxSystemTypes.createEntity(row, withReferences) /* OrderTaxSystemType? */,
        cancelRequested = row[cancelRequested]  /* kotlin.Boolean? */ /* **Только для модели DBS**  Запрошена ли отмена.  */,
        expiryDate = row[expiryDate]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type OrderDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrderDTO()
    * database.update(OrderDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrderDTO) {
        this.apply {
            set(OrderDTOs.id, entity.id)
            set(OrderDTOs.status, entity.status)
            set(OrderDTOs.substatus, entity.substatus)
            set(OrderDTOs.creationDate, entity.creationDate)
            set(OrderDTOs.updatedAt, entity.updatedAt)
            set(OrderDTOs.currency, entity.currency)
            set(OrderDTOs.itemsTotal, entity.itemsTotal)
            set(OrderDTOs.deliveryTotal, entity.deliveryTotal)
            set(OrderDTOs.buyerItemsTotal, entity.buyerItemsTotal)
            set(OrderDTOs.buyerTotal, entity.buyerTotal)
            set(OrderDTOs.buyerItemsTotalBeforeDiscount, entity.buyerItemsTotalBeforeDiscount)
            set(OrderDTOs.buyerTotalBeforeDiscount, entity.buyerTotalBeforeDiscount)
            set(OrderDTOs.paymentType, entity.paymentType)
            set(OrderDTOs.paymentMethod, entity.paymentMethod)
            set(OrderDTOs.fake, entity.fake)
            set(OrderDTOs.delivery, entity.delivery)
            set(OrderDTOs.buyer, entity.buyer)
            set(OrderDTOs.notes, entity.notes)
            set(OrderDTOs.taxSystem, entity.taxSystem)
            set(OrderDTOs.cancelRequested, entity.cancelRequested)
            set(OrderDTOs.expiryDate, entity.expiryDate)
        }
    }

}


object OrderDTOOrderItemDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("OrderDTOOrderItemDTO") {
    val orderDTO = long("orderDTO")
    val orderItemDTO = long("orderItemDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[orderDTO] ?: 0, row[orderItemDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(OrderDTOOrderItemDTO.orderDTO, entity.first)
            set(OrderDTOOrderItemDTO.orderItemDTO, entity.second)
        }
    }

}

object OrderDTOOrderSubsidyDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("OrderDTOOrderSubsidyDTO") {
    val orderDTO = long("orderDTO")
    val orderSubsidyDTO = long("orderSubsidyDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[orderDTO] ?: 0, row[orderSubsidyDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(OrderDTOOrderSubsidyDTO.orderDTO, entity.first)
            set(OrderDTOOrderSubsidyDTO.orderSubsidyDTO, entity.second)
        }
    }

}

