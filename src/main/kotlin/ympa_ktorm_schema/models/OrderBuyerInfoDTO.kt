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
 * Информация о покупателе и его номере телефона.
 * @param id Идентификатор покупателя.
 * @param lastName Фамилия покупателя.
 * @param firstName Имя покупателя.
 * @param middleName Отчество покупателя.
 * @param type 
 * @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
 */
object OrderBuyerInfoDTOs : BaseTable<OrderBuyerInfoDTO>("OrderBuyerInfoDTO") {
    val id = text("id") /* null */ /* Идентификатор покупателя. */
    val lastName = text("lastName") /* null */ /* Фамилия покупателя. */
    val firstName = text("firstName") /* null */ /* Имя покупателя. */
    val middleName = text("middleName") /* null */ /* Отчество покупателя. */
    val type = long("type") /* null */
    val phone = text("phone") /* null */ /* Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  */

    /**
     * Create an entity of type OrderBuyerInfoDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrderBuyerInfoDTO(
        id = row[id]  /* kotlin.String? */ /* Идентификатор покупателя. */,
        lastName = row[lastName]  /* kotlin.String? */ /* Фамилия покупателя. */,
        firstName = row[firstName]  /* kotlin.String? */ /* Имя покупателя. */,
        middleName = row[middleName]  /* kotlin.String? */ /* Отчество покупателя. */,
        type = OrderBuyerTypes.createEntity(row, withReferences) /* OrderBuyerType? */,
        phone = row[phone]  /* kotlin.String? */ /* Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  */
    )

    /**
    * Assign all the columns from the entity of type OrderBuyerInfoDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrderBuyerInfoDTO()
    * database.update(OrderBuyerInfoDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrderBuyerInfoDTO) {
        this.apply {
            set(OrderBuyerInfoDTOs.id, entity.id)
            set(OrderBuyerInfoDTOs.lastName, entity.lastName)
            set(OrderBuyerInfoDTOs.firstName, entity.firstName)
            set(OrderBuyerInfoDTOs.middleName, entity.middleName)
            set(OrderBuyerInfoDTOs.type, entity.type)
            set(OrderBuyerInfoDTOs.phone, entity.phone)
        }
    }

}


