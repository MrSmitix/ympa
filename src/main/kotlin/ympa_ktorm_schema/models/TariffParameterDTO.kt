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
 * Детали расчета конкретной услуги Маркета.
 * @param name Название параметра.
 * @param value Значение параметра.
 */
object TariffParameterDTOs : BaseTable<TariffParameterDTO>("TariffParameterDTO") {
    val name = text("name") /* Название параметра. */
    val value = text("value") /* Значение параметра. */

    /**
     * Create an entity of type TariffParameterDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = TariffParameterDTO(
        name = row[name] ?: "" /* kotlin.String */ /* Название параметра. */,
        value = row[value] ?: "" /* kotlin.String */ /* Значение параметра. */
    )

    /**
    * Assign all the columns from the entity of type TariffParameterDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = TariffParameterDTO()
    * database.update(TariffParameterDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: TariffParameterDTO) {
        this.apply {
            set(TariffParameterDTOs.name, entity.name)
            set(TariffParameterDTOs.value, entity.value)
        }
    }

}


