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
 * Информация о заказах, которые повлияли на индекс качества.
 * @param affectedOrders Список заказов, которые повлияли на индекс качества.
 */
object QualityRatingDetailsDTOs : BaseTable<QualityRatingDetailsDTO>("QualityRatingDetailsDTO") {

    /**
     * Create an entity of type QualityRatingDetailsDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = QualityRatingDetailsDTO(
        affectedOrders = emptyList() /* kotlin.Array<QualityRatingAffectedOrderDTO> */ /* Список заказов, которые повлияли на индекс качества. */
    )

    /**
    * Assign all the columns from the entity of type QualityRatingDetailsDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = QualityRatingDetailsDTO()
    * database.update(QualityRatingDetailsDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: QualityRatingDetailsDTO) {
        this.apply {
        }
    }

}


object QualityRatingDetailsDTOQualityRatingAffectedOrderDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("QualityRatingDetailsDTOQualityRatingAffectedOrderDTO") {
    val qualityRatingDetailsDTO = long("qualityRatingDetailsDTO")
    val qualityRatingAffectedOrderDTO = long("qualityRatingAffectedOrderDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[qualityRatingDetailsDTO] ?: 0, row[qualityRatingAffectedOrderDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(QualityRatingDetailsDTOQualityRatingAffectedOrderDTO.qualityRatingDetailsDTO, entity.first)
            set(QualityRatingDetailsDTOQualityRatingAffectedOrderDTO.qualityRatingAffectedOrderDTO, entity.second)
        }
    }

}

