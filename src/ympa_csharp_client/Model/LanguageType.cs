/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
    /// </summary>
    /// <value>Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LanguageType
    {
        /// <summary>
        /// Enum RU for value: RU
        /// </summary>
        [EnumMember(Value = "RU")]
        RU = 1,

        /// <summary>
        /// Enum EN for value: EN
        /// </summary>
        [EnumMember(Value = "EN")]
        EN = 2
    }

}
