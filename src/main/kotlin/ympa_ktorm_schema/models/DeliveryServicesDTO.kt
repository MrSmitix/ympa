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
 * Информация о службах доставки.
 * @param deliveryService Информация о службе доставки.
 */
object DeliveryServicesDTOs : BaseTable<DeliveryServicesDTO>("DeliveryServicesDTO") {

    /**
     * Create an entity of type DeliveryServicesDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DeliveryServicesDTO(
        deliveryService = emptyList() /* kotlin.Array<DeliveryServiceInfoDTO> */ /* Информация о службе доставки. */
    )

    /**
    * Assign all the columns from the entity of type DeliveryServicesDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DeliveryServicesDTO()
    * database.update(DeliveryServicesDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DeliveryServicesDTO) {
        this.apply {
        }
    }

}


object DeliveryServicesDTODeliveryServiceInfoDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("DeliveryServicesDTODeliveryServiceInfoDTO") {
    val deliveryServicesDTO = long("deliveryServicesDTO")
    val deliveryServiceInfoDTO = long("deliveryServiceInfoDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[deliveryServicesDTO] ?: 0, row[deliveryServiceInfoDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(DeliveryServicesDTODeliveryServiceInfoDTO.deliveryServicesDTO, entity.first)
            set(DeliveryServicesDTODeliveryServiceInfoDTO.deliveryServiceInfoDTO, entity.second)
        }
    }

}

