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
 * Информация об установленной цене.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param price 
 * @param updatedAt Дата и время последнего обновления цены.
 */
object OfferPriceByOfferIdsResponseDTOs : BaseTable<OfferPriceByOfferIdsResponseDTO>("OfferPriceByOfferIdsResponseDTO") {
    val offerId = text("offerId") /* null */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    val price = long("price") /* null */
    val updatedAt = datetime("updatedAt") /* null */ /* Дата и время последнего обновления цены. */

    /**
     * Create an entity of type OfferPriceByOfferIdsResponseDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OfferPriceByOfferIdsResponseDTO(
        offerId = row[offerId]  /* kotlin.String? */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */,
        price = PriceDTOs.createEntity(row, withReferences) /* PriceDTO? */,
        updatedAt = row[updatedAt]  /* java.time.LocalDateTime? */ /* Дата и время последнего обновления цены. */
    )

    /**
    * Assign all the columns from the entity of type OfferPriceByOfferIdsResponseDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OfferPriceByOfferIdsResponseDTO()
    * database.update(OfferPriceByOfferIdsResponseDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OfferPriceByOfferIdsResponseDTO) {
        this.apply {
            set(OfferPriceByOfferIdsResponseDTOs.offerId, entity.offerId)
            set(OfferPriceByOfferIdsResponseDTOs.price, entity.price)
            set(OfferPriceByOfferIdsResponseDTOs.updatedAt, entity.updatedAt)
        }
    }

}


