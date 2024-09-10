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
        /// Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
        /// </summary>
        /// <value>Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). </value>
        [TypeConverter(typeof(CustomEnumConverter<ShelfsStatisticsAttributionType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ShelfsStatisticsAttributionType
        {
            
            /// <summary>
            /// Enum CLICKSEnum for CLICKS
            /// </summary>
            [EnumMember(Value = "CLICKS")]
            CLICKSEnum = 1,
            
            /// <summary>
            /// Enum SHOWSEnum for SHOWS
            /// </summary>
            [EnumMember(Value = "SHOWS")]
            SHOWSEnum = 2
        }
}
