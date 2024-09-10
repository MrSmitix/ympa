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
    /// Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
    /// </summary>
    /// <value>Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OrdersStatsOrderPaymentType
    {
        /// <summary>
        /// Enum CREDIT for value: CREDIT
        /// </summary>
        [EnumMember(Value = "CREDIT")]
        CREDIT = 1,

        /// <summary>
        /// Enum POSTPAID for value: POSTPAID
        /// </summary>
        [EnumMember(Value = "POSTPAID")]
        POSTPAID = 2,

        /// <summary>
        /// Enum PREPAID for value: PREPAID
        /// </summary>
        [EnumMember(Value = "PREPAID")]
        PREPAID = 3,

        /// <summary>
        /// Enum TINKOFFCREDIT for value: TINKOFF_CREDIT
        /// </summary>
        [EnumMember(Value = "TINKOFF_CREDIT")]
        TINKOFFCREDIT = 4
    }

}
