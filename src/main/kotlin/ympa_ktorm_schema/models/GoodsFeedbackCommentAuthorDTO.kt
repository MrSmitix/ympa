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
 * Информация об авторе комментария.
 * @param type 
 * @param name Имя автора или название кабинета.
 */
object GoodsFeedbackCommentAuthorDTOs : BaseTable<GoodsFeedbackCommentAuthorDTO>("GoodsFeedbackCommentAuthorDTO") {
    val type = long("type") /* null */
    val name = text("name") /* null */ /* Имя автора или название кабинета. */

    /**
     * Create an entity of type GoodsFeedbackCommentAuthorDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GoodsFeedbackCommentAuthorDTO(
        type = GoodsFeedbackCommentAuthorTypes.createEntity(row, withReferences) /* GoodsFeedbackCommentAuthorType? */,
        name = row[name]  /* kotlin.String? */ /* Имя автора или название кабинета. */
    )

    /**
    * Assign all the columns from the entity of type GoodsFeedbackCommentAuthorDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GoodsFeedbackCommentAuthorDTO()
    * database.update(GoodsFeedbackCommentAuthorDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GoodsFeedbackCommentAuthorDTO) {
        this.apply {
            set(GoodsFeedbackCommentAuthorDTOs.type, entity.type)
            set(GoodsFeedbackCommentAuthorDTOs.name, entity.name)
        }
    }

}


