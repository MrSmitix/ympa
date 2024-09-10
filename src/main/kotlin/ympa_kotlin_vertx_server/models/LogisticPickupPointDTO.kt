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
package ympa_kotlin_vertx_server.models

import ympa_kotlin_vertx_server.models.LogisticPointType
import ympa_kotlin_vertx_server.models.PickupAddressDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Описание пункта вывоза для возврата.
 * @param id Идентификатор пункта вывоза.
 * @param name Название пункта вывоза.
 * @param address 
 * @param instruction Дополнительные инструкции к вывозу.
 * @param type 
 * @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class LogisticPickupPointDTO (
    /* Идентификатор пункта вывоза. */
    val id: kotlin.Long? = null,
    /* Название пункта вывоза. */
    val name: kotlin.String? = null,
    val address: PickupAddressDTO? = null,
    /* Дополнительные инструкции к вывозу. */
    val instruction: kotlin.String? = null,
    val type: LogisticPointType? = null,
    /* Идентификатор логистического партнера, к которому относится логистическая точка. */
    val logisticPartnerId: kotlin.Long? = null
) {

}

