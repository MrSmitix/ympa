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
    /// Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
    /// </summary>
    /// <value>Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MechanicsType
    {
        /// <summary>
        /// Enum DIRECTDISCOUNT for value: DIRECT_DISCOUNT
        /// </summary>
        [EnumMember(Value = "DIRECT_DISCOUNT")]
        DIRECTDISCOUNT = 1,

        /// <summary>
        /// Enum BLUEFLASH for value: BLUE_FLASH
        /// </summary>
        [EnumMember(Value = "BLUE_FLASH")]
        BLUEFLASH = 2,

        /// <summary>
        /// Enum MARKETPROMOCODE for value: MARKET_PROMOCODE
        /// </summary>
        [EnumMember(Value = "MARKET_PROMOCODE")]
        MARKETPROMOCODE = 3
    }

}
