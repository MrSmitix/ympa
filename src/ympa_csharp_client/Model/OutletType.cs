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
    /// Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). 
    /// </summary>
    /// <value>Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OutletType
    {
        /// <summary>
        /// Enum DEPOT for value: DEPOT
        /// </summary>
        [EnumMember(Value = "DEPOT")]
        DEPOT = 1,

        /// <summary>
        /// Enum MIXED for value: MIXED
        /// </summary>
        [EnumMember(Value = "MIXED")]
        MIXED = 2,

        /// <summary>
        /// Enum RETAIL for value: RETAIL
        /// </summary>
        [EnumMember(Value = "RETAIL")]
        RETAIL = 3,

        /// <summary>
        /// Enum NOTDEFINED for value: NOT_DEFINED
        /// </summary>
        [EnumMember(Value = "NOT_DEFINED")]
        NOTDEFINED = 4
    }

}
