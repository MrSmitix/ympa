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
 * Информация об услугах Маркета.
 * @param type 
 * @param parameters Параметры расчета тарифа.
 * @param amount Стоимость услуги в рублях.
 */
object CalculatedTariffDTOs : BaseTable<CalculatedTariffDTO>("CalculatedTariffDTO") {
    val type = long("type")
    val amount = decimal("amount") /* null */ /* Стоимость услуги в рублях. */

    /**
     * Create an entity of type CalculatedTariffDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CalculatedTariffDTO(
        type = CalculatedTariffTypes.createEntity(row, withReferences) /* CalculatedTariffType */,
        parameters = emptyList() /* kotlin.Array<TariffParameterDTO> */ /* Параметры расчета тарифа. */,
        amount = row[amount]  /* java.math.BigDecimal? */ /* Стоимость услуги в рублях. */
    )

    /**
    * Assign all the columns from the entity of type CalculatedTariffDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CalculatedTariffDTO()
    * database.update(CalculatedTariffDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CalculatedTariffDTO) {
        this.apply {
            set(CalculatedTariffDTOs.type, entity.type)
            set(CalculatedTariffDTOs.amount, entity.amount)
        }
    }

}


object CalculatedTariffDTOTariffParameterDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CalculatedTariffDTOTariffParameterDTO") {
    val calculatedTariffDTO = long("calculatedTariffDTO")
    val tariffParameterDTO = long("tariffParameterDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[calculatedTariffDTO] ?: 0, row[tariffParameterDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CalculatedTariffDTOTariffParameterDTO.calculatedTariffDTO, entity.first)
            set(CalculatedTariffDTOTariffParameterDTO.tariffParameterDTO, entity.second)
        }
    }

}

