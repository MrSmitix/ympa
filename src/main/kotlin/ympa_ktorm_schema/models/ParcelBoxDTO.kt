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
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 * @param id {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @param fulfilmentId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 */
object ParcelBoxDTOs : BaseTable<ParcelBoxDTO>("ParcelBoxDTO") {
    val id = long("id") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    val fulfilmentId = text("fulfilmentId") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */

    /**
     * Create an entity of type ParcelBoxDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ParcelBoxDTO(
        id = row[id]  /* kotlin.Long? */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */,
        fulfilmentId = row[fulfilmentId]  /* kotlin.String? */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    )

    /**
    * Assign all the columns from the entity of type ParcelBoxDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ParcelBoxDTO()
    * database.update(ParcelBoxDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ParcelBoxDTO) {
        this.apply {
            set(ParcelBoxDTOs.id, entity.id)
            set(ParcelBoxDTOs.fulfilmentId, entity.fulfilmentId)
        }
    }

}


