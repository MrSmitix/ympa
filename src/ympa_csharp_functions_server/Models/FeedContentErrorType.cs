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
        /// Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
        /// </summary>
        /// <value>Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. </value>
        [TypeConverter(typeof(CustomEnumConverter<FeedContentErrorType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum FeedContentErrorType
        {
            
            /// <summary>
            /// Enum PARSEERROREnum for PARSE_ERROR
            /// </summary>
            [EnumMember(Value = "PARSE_ERROR")]
            PARSEERROREnum = 1,
            
            /// <summary>
            /// Enum PARSEXMLERROREnum for PARSE_XML_ERROR
            /// </summary>
            [EnumMember(Value = "PARSE_XML_ERROR")]
            PARSEXMLERROREnum = 2,
            
            /// <summary>
            /// Enum TOOMANYREJECTEDOFFERSEnum for TOO_MANY_REJECTED_OFFERS
            /// </summary>
            [EnumMember(Value = "TOO_MANY_REJECTED_OFFERS")]
            TOOMANYREJECTEDOFFERSEnum = 3
        }
}
