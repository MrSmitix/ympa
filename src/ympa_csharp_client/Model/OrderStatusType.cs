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
    /// Статус заказа:  * &#x60;CANCELLED&#x60; — отменен.  * &#x60;DELIVERED&#x60; — получен покупателем.  * &#x60;DELIVERY&#x60; — передан в службу доставки.  * &#x60;PICKUP&#x60; — доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — находится в обработке.  * &#x60;PENDING&#x60; — ожидает обработки со стороны продавца.  * &#x60;UNPAID&#x60; — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * &#x60;PLACING&#x60; — оформляется, подготовка к резервированию.  * &#x60;RESERVED&#x60; — зарезервирован, но недооформлен.  * &#x60;PARTIALLY_RETURNED&#x60; — возвращен частично.  * &#x60;RETURNED&#x60; — возвращен полностью.  * &#x60;UNKNOWN&#x60; — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
    /// </summary>
    /// <value>Статус заказа:  * &#x60;CANCELLED&#x60; — отменен.  * &#x60;DELIVERED&#x60; — получен покупателем.  * &#x60;DELIVERY&#x60; — передан в службу доставки.  * &#x60;PICKUP&#x60; — доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — находится в обработке.  * &#x60;PENDING&#x60; — ожидает обработки со стороны продавца.  * &#x60;UNPAID&#x60; — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * &#x60;PLACING&#x60; — оформляется, подготовка к резервированию.  * &#x60;RESERVED&#x60; — зарезервирован, но недооформлен.  * &#x60;PARTIALLY_RETURNED&#x60; — возвращен частично.  * &#x60;RETURNED&#x60; — возвращен полностью.  * &#x60;UNKNOWN&#x60; — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OrderStatusType
    {
        /// <summary>
        /// Enum PLACING for value: PLACING
        /// </summary>
        [EnumMember(Value = "PLACING")]
        PLACING = 1,

        /// <summary>
        /// Enum RESERVED for value: RESERVED
        /// </summary>
        [EnumMember(Value = "RESERVED")]
        RESERVED = 2,

        /// <summary>
        /// Enum UNPAID for value: UNPAID
        /// </summary>
        [EnumMember(Value = "UNPAID")]
        UNPAID = 3,

        /// <summary>
        /// Enum PROCESSING for value: PROCESSING
        /// </summary>
        [EnumMember(Value = "PROCESSING")]
        PROCESSING = 4,

        /// <summary>
        /// Enum DELIVERY for value: DELIVERY
        /// </summary>
        [EnumMember(Value = "DELIVERY")]
        DELIVERY = 5,

        /// <summary>
        /// Enum PICKUP for value: PICKUP
        /// </summary>
        [EnumMember(Value = "PICKUP")]
        PICKUP = 6,

        /// <summary>
        /// Enum DELIVERED for value: DELIVERED
        /// </summary>
        [EnumMember(Value = "DELIVERED")]
        DELIVERED = 7,

        /// <summary>
        /// Enum CANCELLED for value: CANCELLED
        /// </summary>
        [EnumMember(Value = "CANCELLED")]
        CANCELLED = 8,

        /// <summary>
        /// Enum PENDING for value: PENDING
        /// </summary>
        [EnumMember(Value = "PENDING")]
        PENDING = 9,

        /// <summary>
        /// Enum PARTIALLYRETURNED for value: PARTIALLY_RETURNED
        /// </summary>
        [EnumMember(Value = "PARTIALLY_RETURNED")]
        PARTIALLYRETURNED = 10,

        /// <summary>
        /// Enum RETURNED for value: RETURNED
        /// </summary>
        [EnumMember(Value = "RETURNED")]
        RETURNED = 11,

        /// <summary>
        /// Enum UNKNOWN for value: UNKNOWN
        /// </summary>
        [EnumMember(Value = "UNKNOWN")]
        UNKNOWN = 12
    }

}
