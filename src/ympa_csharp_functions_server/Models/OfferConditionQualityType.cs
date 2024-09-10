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
        /// Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
        /// </summary>
        /// <value>Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. </value>
        [TypeConverter(typeof(CustomEnumConverter<OfferConditionQualityType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OfferConditionQualityType
        {
            
            /// <summary>
            /// Enum PERFECTEnum for PERFECT
            /// </summary>
            [EnumMember(Value = "PERFECT")]
            PERFECTEnum = 1,
            
            /// <summary>
            /// Enum EXCELLENTEnum for EXCELLENT
            /// </summary>
            [EnumMember(Value = "EXCELLENT")]
            EXCELLENTEnum = 2,
            
            /// <summary>
            /// Enum GOODEnum for GOOD
            /// </summary>
            [EnumMember(Value = "GOOD")]
            GOODEnum = 3,
            
            /// <summary>
            /// Enum NOTSPECIFIEDEnum for NOT_SPECIFIED
            /// </summary>
            [EnumMember(Value = "NOT_SPECIFIED")]
            NOTSPECIFIEDEnum = 4
        }
}
