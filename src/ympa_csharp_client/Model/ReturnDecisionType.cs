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
    /// Решение по возврату:  * &#x60;REFUND_MONEY&#x60; — вернуть деньги покупателю.  * &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60; — вернуть деньги за товар и пересылку.  * &#x60;REPAIR&#x60; — отремонтировать товар.  * &#x60;REPLACE&#x60; — заменить товар.  * &#x60;SEND_TO_EXAMINATION&#x60; — взять товар на экспертизу.  * &#x60;DECLINE_REFUND&#x60; — отказать в возврате.  * &#x60;OTHER_DECISION&#x60; — другое решение. 
    /// </summary>
    /// <value>Решение по возврату:  * &#x60;REFUND_MONEY&#x60; — вернуть деньги покупателю.  * &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60; — вернуть деньги за товар и пересылку.  * &#x60;REPAIR&#x60; — отремонтировать товар.  * &#x60;REPLACE&#x60; — заменить товар.  * &#x60;SEND_TO_EXAMINATION&#x60; — взять товар на экспертизу.  * &#x60;DECLINE_REFUND&#x60; — отказать в возврате.  * &#x60;OTHER_DECISION&#x60; — другое решение. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ReturnDecisionType
    {
        /// <summary>
        /// Enum REFUNDMONEY for value: REFUND_MONEY
        /// </summary>
        [EnumMember(Value = "REFUND_MONEY")]
        REFUNDMONEY = 1,

        /// <summary>
        /// Enum REFUNDMONEYINCLUDINGSHIPMENT for value: REFUND_MONEY_INCLUDING_SHIPMENT
        /// </summary>
        [EnumMember(Value = "REFUND_MONEY_INCLUDING_SHIPMENT")]
        REFUNDMONEYINCLUDINGSHIPMENT = 2,

        /// <summary>
        /// Enum REPAIR for value: REPAIR
        /// </summary>
        [EnumMember(Value = "REPAIR")]
        REPAIR = 3,

        /// <summary>
        /// Enum REPLACE for value: REPLACE
        /// </summary>
        [EnumMember(Value = "REPLACE")]
        REPLACE = 4,

        /// <summary>
        /// Enum SENDTOEXAMINATION for value: SEND_TO_EXAMINATION
        /// </summary>
        [EnumMember(Value = "SEND_TO_EXAMINATION")]
        SENDTOEXAMINATION = 5,

        /// <summary>
        /// Enum DECLINEREFUND for value: DECLINE_REFUND
        /// </summary>
        [EnumMember(Value = "DECLINE_REFUND")]
        DECLINEREFUND = 6,

        /// <summary>
        /// Enum OTHERDECISION for value: OTHER_DECISION
        /// </summary>
        [EnumMember(Value = "OTHER_DECISION")]
        OTHERDECISION = 7,

        /// <summary>
        /// Enum UNKNOWN for value: UNKNOWN
        /// </summary>
        [EnumMember(Value = "UNKNOWN")]
        UNKNOWN = 8
    }

}
