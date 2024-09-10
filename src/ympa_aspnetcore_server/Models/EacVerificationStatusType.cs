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
        /// Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
        /// </summary>
        /// <value>Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. </value>
        [TypeConverter(typeof(CustomEnumConverter<EacVerificationStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EacVerificationStatusType
        {
            
            /// <summary>
            /// Enum ACCEPTEDEnum for ACCEPTED
            /// </summary>
            [EnumMember(Value = "ACCEPTED")]
            ACCEPTEDEnum = 1,
            
            /// <summary>
            /// Enum REJECTEDEnum for REJECTED
            /// </summary>
            [EnumMember(Value = "REJECTED")]
            REJECTEDEnum = 2,
            
            /// <summary>
            /// Enum NEEDUPDATEEnum for NEED_UPDATE
            /// </summary>
            [EnumMember(Value = "NEED_UPDATE")]
            NEEDUPDATEEnum = 3
        }
}
