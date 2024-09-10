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
 * Модель для пагинации.
 * @param total Сколько всего найдено элементов.
 * @param from Начальный номер найденного элемента на странице.
 * @param to Конечный номер найденного элемента на странице.
 * @param currentPage Текущая страница.
 * @param pagesCount Общее количество страниц.
 * @param pageSize Размер страницы.
 */
object FlippingPagerDTOs : BaseTable<FlippingPagerDTO>("FlippingPagerDTO") {
    val total = int("total") /* null */ /* Сколько всего найдено элементов. */
    val from = int("from") /* null */ /* Начальный номер найденного элемента на странице. */
    val to = int("to") /* null */ /* Конечный номер найденного элемента на странице. */
    val currentPage = int("currentPage") /* null */ /* Текущая страница. */
    val pagesCount = int("pagesCount") /* null */ /* Общее количество страниц. */
    val pageSize = int("pageSize") /* null */ /* Размер страницы. */

    /**
     * Create an entity of type FlippingPagerDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FlippingPagerDTO(
        total = row[total]  /* kotlin.Int? */ /* Сколько всего найдено элементов. */,
        from = row[from]  /* kotlin.Int? */ /* Начальный номер найденного элемента на странице. */,
        to = row[to]  /* kotlin.Int? */ /* Конечный номер найденного элемента на странице. */,
        currentPage = row[currentPage]  /* kotlin.Int? */ /* Текущая страница. */,
        pagesCount = row[pagesCount]  /* kotlin.Int? */ /* Общее количество страниц. */,
        pageSize = row[pageSize]  /* kotlin.Int? */ /* Размер страницы. */
    )

    /**
    * Assign all the columns from the entity of type FlippingPagerDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FlippingPagerDTO()
    * database.update(FlippingPagerDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FlippingPagerDTO) {
        this.apply {
            set(FlippingPagerDTOs.total, entity.total)
            set(FlippingPagerDTOs.from, entity.from)
            set(FlippingPagerDTOs.to, entity.to)
            set(FlippingPagerDTOs.currentPage, entity.currentPage)
            set(FlippingPagerDTOs.pagesCount, entity.pagesCount)
            set(FlippingPagerDTOs.pageSize, entity.pageSize)
        }
    }

}


