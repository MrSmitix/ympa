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
* Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
* Values: FIT,FREEZE,AVAILABLE,QUARANTINE,UTILIZATION,DEFECT,EXPIRED
*/

enum class OrdersStatsStockType(val value: kotlin.String){


    FIT("FIT"),


    FREEZE("FREEZE"),


    AVAILABLE("AVAILABLE"),


    QUARANTINE("QUARANTINE"),


    UTILIZATION("UTILIZATION"),


    DEFECT("DEFECT"),


    EXPIRED("EXPIRED");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

