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
        /// Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
        /// </summary>
        /// <value>Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. </value>
        [TypeConverter(typeof(CustomEnumConverter<OrderDocumentStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrderDocumentStatusType
        {
            
            /// <summary>
            /// Enum READYEnum for READY
            /// </summary>
            [EnumMember(Value = "READY")]
            READYEnum = 1,
            
            /// <summary>
            /// Enum NOTREADYEnum for NOT_READY
            /// </summary>
            [EnumMember(Value = "NOT_READY")]
            NOTREADYEnum = 2
        }
}
