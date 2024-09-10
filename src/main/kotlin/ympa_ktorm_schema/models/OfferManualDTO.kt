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
 * Инструкция по использованию товара. 
 * @param url Ссылка на инструкцию.
 * @param title Название инструкции, которое будет отображаться на карточке товара. 
 */
object OfferManualDTOs : BaseTable<OfferManualDTO>("OfferManualDTO") {
    val url = text("url") /* Ссылка на инструкцию. */
    val title = text("title") /* null */ /* Название инструкции, которое будет отображаться на карточке товара.  */

    /**
     * Create an entity of type OfferManualDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OfferManualDTO(
        url = row[url] ?: "" /* kotlin.String */ /* Ссылка на инструкцию. */,
        title = row[title]  /* kotlin.String? */ /* Название инструкции, которое будет отображаться на карточке товара.  */
    )

    /**
    * Assign all the columns from the entity of type OfferManualDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OfferManualDTO()
    * database.update(OfferManualDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OfferManualDTO) {
        this.apply {
            set(OfferManualDTOs.url, entity.url)
            set(OfferManualDTOs.title, entity.title)
        }
    }

}


