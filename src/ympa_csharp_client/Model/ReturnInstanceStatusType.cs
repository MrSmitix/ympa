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
    /// Логистический статус конкретного товара.
    /// </summary>
    /// <value>Логистический статус конкретного товара.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ReturnInstanceStatusType
    {
        /// <summary>
        /// Enum CREATED for value: CREATED
        /// </summary>
        [EnumMember(Value = "CREATED")]
        CREATED = 1,

        /// <summary>
        /// Enum RECEIVED for value: RECEIVED
        /// </summary>
        [EnumMember(Value = "RECEIVED")]
        RECEIVED = 2,

        /// <summary>
        /// Enum INTRANSIT for value: IN_TRANSIT
        /// </summary>
        [EnumMember(Value = "IN_TRANSIT")]
        INTRANSIT = 3,

        /// <summary>
        /// Enum READYFORPICKUP for value: READY_FOR_PICKUP
        /// </summary>
        [EnumMember(Value = "READY_FOR_PICKUP")]
        READYFORPICKUP = 4,

        /// <summary>
        /// Enum PICKED for value: PICKED
        /// </summary>
        [EnumMember(Value = "PICKED")]
        PICKED = 5,

        /// <summary>
        /// Enum RECEIVEDONFULFILLMENT for value: RECEIVED_ON_FULFILLMENT
        /// </summary>
        [EnumMember(Value = "RECEIVED_ON_FULFILLMENT")]
        RECEIVEDONFULFILLMENT = 6,

        /// <summary>
        /// Enum CANCELLED for value: CANCELLED
        /// </summary>
        [EnumMember(Value = "CANCELLED")]
        CANCELLED = 7,

        /// <summary>
        /// Enum LOST for value: LOST
        /// </summary>
        [EnumMember(Value = "LOST")]
        LOST = 8,

        /// <summary>
        /// Enum UTILIZED for value: UTILIZED
        /// </summary>
        [EnumMember(Value = "UTILIZED")]
        UTILIZED = 9,

        /// <summary>
        /// Enum PREPAREDFORUTILIZATION for value: PREPARED_FOR_UTILIZATION
        /// </summary>
        [EnumMember(Value = "PREPARED_FOR_UTILIZATION")]
        PREPAREDFORUTILIZATION = 10,

        /// <summary>
        /// Enum EXPROPRIATED for value: EXPROPRIATED
        /// </summary>
        [EnumMember(Value = "EXPROPRIATED")]
        EXPROPRIATED = 11,

        /// <summary>
        /// Enum NOTINDEMAND for value: NOT_IN_DEMAND
        /// </summary>
        [EnumMember(Value = "NOT_IN_DEMAND")]
        NOTINDEMAND = 12
    }

}
