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
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. 
 * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 */
object FeedPublicationPriceAndStockUpdateDTOs : BaseTable<FeedPublicationPriceAndStockUpdateDTO>("FeedPublicationPriceAndStockUpdateDTO") {
    val fileTime = datetime("fileTime") /* null */ /* Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    val publishedTime = datetime("publishedTime") /* null */ /* Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */

    /**
     * Create an entity of type FeedPublicationPriceAndStockUpdateDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FeedPublicationPriceAndStockUpdateDTO(
        fileTime = row[fileTime]  /* java.time.LocalDateTime? */ /* Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */,
        publishedTime = row[publishedTime]  /* java.time.LocalDateTime? */ /* Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    )

    /**
    * Assign all the columns from the entity of type FeedPublicationPriceAndStockUpdateDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FeedPublicationPriceAndStockUpdateDTO()
    * database.update(FeedPublicationPriceAndStockUpdateDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FeedPublicationPriceAndStockUpdateDTO) {
        this.apply {
            set(FeedPublicationPriceAndStockUpdateDTOs.fileTime, entity.fileTime)
            set(FeedPublicationPriceAndStockUpdateDTOs.publishedTime, entity.publishedTime)
        }
    }

}


