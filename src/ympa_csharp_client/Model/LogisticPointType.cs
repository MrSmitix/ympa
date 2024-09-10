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
    /// Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
    /// </summary>
    /// <value>Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LogisticPointType
    {
        /// <summary>
        /// Enum WAREHOUSE for value: WAREHOUSE
        /// </summary>
        [EnumMember(Value = "WAREHOUSE")]
        WAREHOUSE = 1,

        /// <summary>
        /// Enum PICKUPPOINT for value: PICKUP_POINT
        /// </summary>
        [EnumMember(Value = "PICKUP_POINT")]
        PICKUPPOINT = 2,

        /// <summary>
        /// Enum PICKUPTERMINAL for value: PICKUP_TERMINAL
        /// </summary>
        [EnumMember(Value = "PICKUP_TERMINAL")]
        PICKUPTERMINAL = 3,

        /// <summary>
        /// Enum PICKUPPOSTOFFICE for value: PICKUP_POST_OFFICE
        /// </summary>
        [EnumMember(Value = "PICKUP_POST_OFFICE")]
        PICKUPPOSTOFFICE = 4,

        /// <summary>
        /// Enum PICKUPMIXED for value: PICKUP_MIXED
        /// </summary>
        [EnumMember(Value = "PICKUP_MIXED")]
        PICKUPMIXED = 5,

        /// <summary>
        /// Enum PICKUPRETAIL for value: PICKUP_RETAIL
        /// </summary>
        [EnumMember(Value = "PICKUP_RETAIL")]
        PICKUPRETAIL = 6,

        /// <summary>
        /// Enum UNKNOWN for value: UNKNOWN
        /// </summary>
        [EnumMember(Value = "UNKNOWN")]
        UNKNOWN = 7
    }

}
