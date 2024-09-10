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
        /// Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
        /// </summary>
        /// <value>Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). </value>
        [TypeConverter(typeof(CustomEnumConverter<OrdersStatsPaymentSourceType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrdersStatsPaymentSourceType
        {
            
            /// <summary>
            /// Enum BUYEREnum for BUYER
            /// </summary>
            [EnumMember(Value = "BUYER")]
            BUYEREnum = 1,
            
            /// <summary>
            /// Enum CASHBACKEnum for CASHBACK
            /// </summary>
            [EnumMember(Value = "CASHBACK")]
            CASHBACKEnum = 2,
            
            /// <summary>
            /// Enum MARKETPLACEEnum for MARKETPLACE
            /// </summary>
            [EnumMember(Value = "MARKETPLACE")]
            MARKETPLACEEnum = 3,
            
            /// <summary>
            /// Enum SPLITEnum for SPLIT
            /// </summary>
            [EnumMember(Value = "SPLIT")]
            SPLITEnum = 4
        }
}
