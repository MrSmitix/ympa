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
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 * @param marketSku SKU на Маркете.
 */
object UpdateMappingDTOs : BaseTable<UpdateMappingDTO>("UpdateMappingDTO") {
    val marketSku = long("marketSku") /* null */ /* SKU на Маркете. */

    /**
     * Create an entity of type UpdateMappingDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateMappingDTO(
        marketSku = row[marketSku]  /* kotlin.Long? */ /* SKU на Маркете. */
    )

    /**
    * Assign all the columns from the entity of type UpdateMappingDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateMappingDTO()
    * database.update(UpdateMappingDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateMappingDTO) {
        this.apply {
            set(UpdateMappingDTOs.marketSku, entity.marketSku)
        }
    }

}


