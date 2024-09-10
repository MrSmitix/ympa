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
 * Цена с указанием скидки, валюты и времени последнего обновления.
 * @param value Цена на товар.
 * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 * @param currencyId 
 * @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
 */
object PriceDTOs : BaseTable<PriceDTO>("PriceDTO") {
    val value = decimal("value") /* null */ /* Цена на товар. */
    val discountBase = decimal("discountBase") /* null */ /* Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
    val currencyId = long("currencyId") /* null */
    val vat = int("vat") /* null */ /* Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  */

    /**
     * Create an entity of type PriceDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = PriceDTO(
        value = row[value]  /* java.math.BigDecimal? */ /* Цена на товар. */,
        discountBase = row[discountBase]  /* java.math.BigDecimal? */ /* Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */,
        currencyId = CurrencyTypes.createEntity(row, withReferences) /* CurrencyType? */,
        vat = row[vat]  /* kotlin.Int? */ /* Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  */
    )

    /**
    * Assign all the columns from the entity of type PriceDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = PriceDTO()
    * database.update(PriceDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: PriceDTO) {
        this.apply {
            set(PriceDTOs.value, entity.value)
            set(PriceDTOs.discountBase, entity.discountBase)
            set(PriceDTOs.currencyId, entity.currencyId)
            set(PriceDTOs.vat, entity.vat)
        }
    }

}


