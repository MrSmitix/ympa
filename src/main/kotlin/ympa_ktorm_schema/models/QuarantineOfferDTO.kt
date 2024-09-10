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
 * Товар в карантине.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param currentPrice 
 * @param lastValidPrice 
 * @param verdicts Причины попадания товара в карантин.
 */
object QuarantineOfferDTOs : BaseTable<QuarantineOfferDTO>("QuarantineOfferDTO") {
    val offerId = text("offerId") /* null */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    val currentPrice = long("currentPrice") /* null */
    val lastValidPrice = long("lastValidPrice") /* null */

    /**
     * Create an entity of type QuarantineOfferDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = QuarantineOfferDTO(
        offerId = row[offerId]  /* kotlin.String? */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */,
        currentPrice = BasePriceDTOs.createEntity(row, withReferences) /* BasePriceDTO? */,
        lastValidPrice = BasePriceDTOs.createEntity(row, withReferences) /* BasePriceDTO? */,
        verdicts = emptyList() /* kotlin.Array<PriceQuarantineVerdictDTO>? */ /* Причины попадания товара в карантин. */
    )

    /**
    * Assign all the columns from the entity of type QuarantineOfferDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = QuarantineOfferDTO()
    * database.update(QuarantineOfferDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: QuarantineOfferDTO) {
        this.apply {
            set(QuarantineOfferDTOs.offerId, entity.offerId)
            set(QuarantineOfferDTOs.currentPrice, entity.currentPrice)
            set(QuarantineOfferDTOs.lastValidPrice, entity.lastValidPrice)
        }
    }

}


object QuarantineOfferDTOPriceQuarantineVerdictDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("QuarantineOfferDTOPriceQuarantineVerdictDTO") {
    val quarantineOfferDTO = long("quarantineOfferDTO")
    val priceQuarantineVerdictDTO = long("priceQuarantineVerdictDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[quarantineOfferDTO] ?: 0, row[priceQuarantineVerdictDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(QuarantineOfferDTOPriceQuarantineVerdictDTO.quarantineOfferDTO, entity.first)
            set(QuarantineOfferDTOPriceQuarantineVerdictDTO.priceQuarantineVerdictDTO, entity.second)
        }
    }

}

