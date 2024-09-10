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
        /// Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
        /// </summary>
        /// <value>Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. </value>
        [TypeConverter(typeof(CustomEnumConverter<OrdersStatsPriceType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrdersStatsPriceType
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
            MARKETPLACEEnum = 3
        }
}
