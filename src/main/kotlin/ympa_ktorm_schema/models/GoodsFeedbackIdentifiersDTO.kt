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
 * Идентификаторы, которые связаны с отзывом.
 * @param orderId Идентификатор заказа на Маркете.
 * @param modelId Идентификатор модели товара.
 */
object GoodsFeedbackIdentifiersDTOs : BaseTable<GoodsFeedbackIdentifiersDTO>("GoodsFeedbackIdentifiersDTO") {
    val orderId = long("orderId") /* Идентификатор заказа на Маркете. */
    val modelId = long("modelId") /* Идентификатор модели товара. */

    /**
     * Create an entity of type GoodsFeedbackIdentifiersDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GoodsFeedbackIdentifiersDTO(
        orderId = row[orderId] ?: 0 /* kotlin.Long */ /* Идентификатор заказа на Маркете. */,
        modelId = row[modelId] ?: 0 /* kotlin.Long */ /* Идентификатор модели товара. */
    )

    /**
    * Assign all the columns from the entity of type GoodsFeedbackIdentifiersDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GoodsFeedbackIdentifiersDTO()
    * database.update(GoodsFeedbackIdentifiersDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GoodsFeedbackIdentifiersDTO) {
        this.apply {
            set(GoodsFeedbackIdentifiersDTOs.orderId, entity.orderId)
            set(GoodsFeedbackIdentifiersDTOs.modelId, entity.modelId)
        }
    }

}


