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
 * Общий формат ошибки.
 * @param code Код ошибки.
 * @param message Описание ошибки.
 */
object ApiErrorDTOs : BaseTable<ApiErrorDTO>("ApiErrorDTO") {
    val code = text("code") /* Код ошибки. */
    val message = text("message") /* null */ /* Описание ошибки. */

    /**
     * Create an entity of type ApiErrorDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ApiErrorDTO(
        code = row[code] ?: "" /* kotlin.String */ /* Код ошибки. */,
        message = row[message]  /* kotlin.String? */ /* Описание ошибки. */
    )

    /**
    * Assign all the columns from the entity of type ApiErrorDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ApiErrorDTO()
    * database.update(ApiErrorDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ApiErrorDTO) {
        this.apply {
            set(ApiErrorDTOs.code, entity.code)
            set(ApiErrorDTOs.message, entity.message)
        }
    }

}


