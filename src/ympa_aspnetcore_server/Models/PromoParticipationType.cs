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
        /// Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
        /// </summary>
        /// <value>Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. </value>
        [TypeConverter(typeof(CustomEnumConverter<PromoParticipationType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PromoParticipationType
        {
            
            /// <summary>
            /// Enum PARTICIPATINGNOWEnum for PARTICIPATING_NOW
            /// </summary>
            [EnumMember(Value = "PARTICIPATING_NOW")]
            PARTICIPATINGNOWEnum = 1,
            
            /// <summary>
            /// Enum PARTICIPATEDEnum for PARTICIPATED
            /// </summary>
            [EnumMember(Value = "PARTICIPATED")]
            PARTICIPATEDEnum = 2
        }
}
