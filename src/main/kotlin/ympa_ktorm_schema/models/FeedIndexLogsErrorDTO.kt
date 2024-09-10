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
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @param type 
 * @param description Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
 */
object FeedIndexLogsErrorDTOs : BaseTable<FeedIndexLogsErrorDTO>("FeedIndexLogsErrorDTO") {
    val httpStatusCode = int("httpStatusCode") /* null */ /* HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
    val type = long("type") /* null */
    val description = text("description") /* null */ /* Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  */

    /**
     * Create an entity of type FeedIndexLogsErrorDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FeedIndexLogsErrorDTO(
        httpStatusCode = row[httpStatusCode]  /* kotlin.Int? */ /* HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */,
        type = FeedIndexLogsErrorTypes.createEntity(row, withReferences) /* FeedIndexLogsErrorType? */,
        description = row[description]  /* kotlin.String? */ /* Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  */
    )

    /**
    * Assign all the columns from the entity of type FeedIndexLogsErrorDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FeedIndexLogsErrorDTO()
    * database.update(FeedIndexLogsErrorDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FeedIndexLogsErrorDTO) {
        this.apply {
            set(FeedIndexLogsErrorDTOs.httpStatusCode, entity.httpStatusCode)
            set(FeedIndexLogsErrorDTOs.type, entity.type)
            set(FeedIndexLogsErrorDTOs.description, entity.description)
        }
    }

}


