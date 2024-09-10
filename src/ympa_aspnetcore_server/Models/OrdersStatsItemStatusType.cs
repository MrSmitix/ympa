/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using ympa_aspnetcore_server.Converters;

namespace ympa_aspnetcore_server.Models
{ 
        /// <summary>
        /// Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
        /// </summary>
        /// <value>Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. </value>
        [TypeConverter(typeof(CustomEnumConverter<OrdersStatsItemStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrdersStatsItemStatusType
        {
            
            /// <summary>
            /// Enum REJECTEDEnum for REJECTED
            /// </summary>
            [EnumMember(Value = "REJECTED")]
            REJECTEDEnum = 1,
            
            /// <summary>
            /// Enum RETURNEDEnum for RETURNED
            /// </summary>
            [EnumMember(Value = "RETURNED")]
            RETURNEDEnum = 2
        }
}
