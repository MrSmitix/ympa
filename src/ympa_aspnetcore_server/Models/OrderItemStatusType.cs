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
        /// Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
        /// </summary>
        /// <value>Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. </value>
        [TypeConverter(typeof(CustomEnumConverter<OrderItemStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrderItemStatusType
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
