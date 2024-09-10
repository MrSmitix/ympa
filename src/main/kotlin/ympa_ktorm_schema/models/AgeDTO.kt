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
 * Возраст в заданных единицах измерения.
 * @param value Значение. 
 * @param ageUnit 
 */
object AgeDTOs : BaseTable<AgeDTO>("AgeDTO") {
    val value = decimal("value") /* Значение.  */
    val ageUnit = long("ageUnit")

    /**
     * Create an entity of type AgeDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AgeDTO(
        value = row[value] ?: 0 /* java.math.BigDecimal */ /* Значение.  */,
        ageUnit = AgeUnitTypes.createEntity(row, withReferences) /* AgeUnitType */
    )

    /**
    * Assign all the columns from the entity of type AgeDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AgeDTO()
    * database.update(AgeDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AgeDTO) {
        this.apply {
            set(AgeDTOs.value, entity.value)
            set(AgeDTOs.ageUnit, entity.ageUnit)
        }
    }

}


