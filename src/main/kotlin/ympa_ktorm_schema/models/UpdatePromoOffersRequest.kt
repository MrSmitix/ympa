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
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 * @param promoId Идентификатор акции.
 * @param offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
 */
object UpdatePromoOffersRequests : BaseTable<UpdatePromoOffersRequest>("UpdatePromoOffersRequest") {
    val promoId = text("promoId") /* Идентификатор акции. */

    /**
     * Create an entity of type UpdatePromoOffersRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdatePromoOffersRequest(
        promoId = row[promoId] ?: "" /* kotlin.String */ /* Идентификатор акции. */,
        offers = emptyList() /* kotlin.Array<UpdatePromoOfferDTO> */ /* Товары, которые необходимо добавить в акцию или цены которых нужно изменить. */
    )

    /**
    * Assign all the columns from the entity of type UpdatePromoOffersRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdatePromoOffersRequest()
    * database.update(UpdatePromoOffersRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdatePromoOffersRequest) {
        this.apply {
            set(UpdatePromoOffersRequests.promoId, entity.promoId)
        }
    }

}


object UpdatePromoOffersRequestUpdatePromoOfferDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdatePromoOffersRequestUpdatePromoOfferDTO") {
    val updatePromoOffersRequest = long("updatePromoOffersRequest")
    val updatePromoOfferDTO = long("updatePromoOfferDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updatePromoOffersRequest] ?: 0, row[updatePromoOfferDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdatePromoOffersRequestUpdatePromoOfferDTO.updatePromoOffersRequest, entity.first)
            set(UpdatePromoOffersRequestUpdatePromoOfferDTO.updatePromoOfferDTO, entity.second)
        }
    }

}

