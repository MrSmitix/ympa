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
 * @param name Имя автора отзыва или название магазина.
 */
object FeedbackCommentAuthorDTOs : BaseTable<FeedbackCommentAuthorDTO>("FeedbackCommentAuthorDTO") {
    val type = long("type") /* null */
    val name = text("name") /* null */ /* Имя автора отзыва или название магазина. */

    /**
     * Create an entity of type FeedbackCommentAuthorDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FeedbackCommentAuthorDTO(
        type = FeedbackCommentAuthorTypes.createEntity(row, withReferences) /* FeedbackCommentAuthorType? */,
        name = row[name]  /* kotlin.String? */ /* Имя автора отзыва или название магазина. */
    )

    /**
    * Assign all the columns from the entity of type FeedbackCommentAuthorDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FeedbackCommentAuthorDTO()
    * database.update(FeedbackCommentAuthorDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FeedbackCommentAuthorDTO) {
        this.apply {
            set(FeedbackCommentAuthorDTOs.type, entity.type)
            set(FeedbackCommentAuthorDTOs.name, entity.name)
        }
    }

}


