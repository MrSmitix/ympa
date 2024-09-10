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
using ympa_csharp_functions_server.Converters;

namespace ympa_csharp_functions_server.Models
{ 
        /// <summary>
        /// Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
        /// </summary>
        /// <value>Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. </value>
        [TypeConverter(typeof(CustomEnumConverter<GoodsFeedbackCommentStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum GoodsFeedbackCommentStatusType
        {
            
            /// <summary>
            /// Enum PUBLISHEDEnum for PUBLISHED
            /// </summary>
            [EnumMember(Value = "PUBLISHED")]
            PUBLISHEDEnum = 1,
            
            /// <summary>
            /// Enum UNMODERATEDEnum for UNMODERATED
            /// </summary>
            [EnumMember(Value = "UNMODERATED")]
            UNMODERATEDEnum = 2,
            
            /// <summary>
            /// Enum BANNEDEnum for BANNED
            /// </summary>
            [EnumMember(Value = "BANNED")]
            BANNEDEnum = 3,
            
            /// <summary>
            /// Enum DELETEDEnum for DELETED
            /// </summary>
            [EnumMember(Value = "DELETED")]
            DELETEDEnum = 4
        }
}
