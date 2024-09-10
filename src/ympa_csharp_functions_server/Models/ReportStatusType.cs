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
        /// Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
        /// </summary>
        /// <value>Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. </value>
        [TypeConverter(typeof(CustomEnumConverter<ReportStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ReportStatusType
        {
            
            /// <summary>
            /// Enum PENDINGEnum for PENDING
            /// </summary>
            [EnumMember(Value = "PENDING")]
            PENDINGEnum = 1,
            
            /// <summary>
            /// Enum PROCESSINGEnum for PROCESSING
            /// </summary>
            [EnumMember(Value = "PROCESSING")]
            PROCESSINGEnum = 2,
            
            /// <summary>
            /// Enum FAILEDEnum for FAILED
            /// </summary>
            [EnumMember(Value = "FAILED")]
            FAILEDEnum = 3,
            
            /// <summary>
            /// Enum DONEEnum for DONE
            /// </summary>
            [EnumMember(Value = "DONE")]
            DONEEnum = 4
        }
}
