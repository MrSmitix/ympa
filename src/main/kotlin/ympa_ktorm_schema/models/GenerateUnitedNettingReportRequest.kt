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
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 * @param businessId Идентификатор бизнеса.
 * @param dateTimeFrom {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
 * @param dateTimeTo {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
 * @param bankOrderId Номер платежного поручения.
 * @param bankOrderDateTime Дата платежного поручения.
 * @param placementPrograms Список моделей, которые нужны в отчете. 
 * @param inns Список ИНН, которые нужны в отчете.
 * @param campaignIds Список магазинов, которые нужны в отчете.
 */
object GenerateUnitedNettingReportRequests : BaseTable<GenerateUnitedNettingReportRequest>("GenerateUnitedNettingReportRequest") {
    val businessId = long("businessId") /* Идентификатор бизнеса. */
    val dateTimeFrom = datetime("dateTimeFrom") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  */
    val dateTimeTo = datetime("dateTimeTo") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  */
    val dateFrom = date("dateFrom") /* null */ /* Начало периода, включительно. */
    val dateTo = date("dateTo") /* null */ /* Конец периода, включительно. Максимальный период — 1 год. */
    val bankOrderId = long("bankOrderId") /* null */ /* Номер платежного поручения. */
    val bankOrderDateTime = datetime("bankOrderDateTime") /* null */ /* Дата платежного поручения. */

    /**
     * Create an entity of type GenerateUnitedNettingReportRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GenerateUnitedNettingReportRequest(
        businessId = row[businessId] ?: 0 /* kotlin.Long */ /* Идентификатор бизнеса. */,
        dateTimeFrom = row[dateTimeFrom]  /* java.time.LocalDateTime? */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  */,
        dateTimeTo = row[dateTimeTo]  /* java.time.LocalDateTime? */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  */,
        dateFrom = row[dateFrom]  /* java.time.LocalDate? */ /* Начало периода, включительно. */,
        dateTo = row[dateTo]  /* java.time.LocalDate? */ /* Конец периода, включительно. Максимальный период — 1 год. */,
        bankOrderId = row[bankOrderId]  /* kotlin.Long? */ /* Номер платежного поручения. */,
        bankOrderDateTime = row[bankOrderDateTime]  /* java.time.LocalDateTime? */ /* Дата платежного поручения. */,
        placementPrograms = emptyList() /* kotlin.Array<PlacementType>? */ /* Список моделей, которые нужны в отчете.  */,
        inns = emptyList() /* kotlin.Array<kotlin.String>? */ /* Список ИНН, которые нужны в отчете. */,
        campaignIds = emptyList() /* kotlin.Array<kotlin.Long>? */ /* Список магазинов, которые нужны в отчете. */
    )

    /**
    * Assign all the columns from the entity of type GenerateUnitedNettingReportRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GenerateUnitedNettingReportRequest()
    * database.update(GenerateUnitedNettingReportRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GenerateUnitedNettingReportRequest) {
        this.apply {
            set(GenerateUnitedNettingReportRequests.businessId, entity.businessId)
            set(GenerateUnitedNettingReportRequests.dateTimeFrom, entity.dateTimeFrom)
            set(GenerateUnitedNettingReportRequests.dateTimeTo, entity.dateTimeTo)
            set(GenerateUnitedNettingReportRequests.dateFrom, entity.dateFrom)
            set(GenerateUnitedNettingReportRequests.dateTo, entity.dateTo)
            set(GenerateUnitedNettingReportRequests.bankOrderId, entity.bankOrderId)
            set(GenerateUnitedNettingReportRequests.bankOrderDateTime, entity.bankOrderDateTime)
        }
    }

}


object GenerateUnitedNettingReportRequestPlacementType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GenerateUnitedNettingReportRequestPlacementType") {
    val generateUnitedNettingReportRequest = long("generateUnitedNettingReportRequest")
    val placementType = long("placementType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[generateUnitedNettingReportRequest] ?: 0, row[placementType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GenerateUnitedNettingReportRequestPlacementType.generateUnitedNettingReportRequest, entity.first)
            set(GenerateUnitedNettingReportRequestPlacementType.placementType, entity.second)
        }
    }

}

object GenerateUnitedNettingReportRequestInns : BaseTable<Pair<kotlin.Long, kotlin.String>>("GenerateUnitedNettingReportRequestInns") {
    val generateUnitedNettingReportRequest = long("generateUnitedNettingReportRequest")
    val inns = text("inns")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[generateUnitedNettingReportRequest] ?: 0, row[inns] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(GenerateUnitedNettingReportRequestInns.generateUnitedNettingReportRequest, entity.first)
            set(GenerateUnitedNettingReportRequestInns.inns, entity.second)
        }
    }

}

object GenerateUnitedNettingReportRequestCampaignIds : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GenerateUnitedNettingReportRequestCampaignIds") {
    val generateUnitedNettingReportRequest = long("generateUnitedNettingReportRequest")
    val campaignIds = long("campaignIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[generateUnitedNettingReportRequest] ?: 0, row[campaignIds] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GenerateUnitedNettingReportRequestCampaignIds.generateUnitedNettingReportRequest, entity.first)
            set(GenerateUnitedNettingReportRequestCampaignIds.campaignIds, entity.second)
        }
    }

}

