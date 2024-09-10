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
        /// Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
        /// </summary>
        /// <value>Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. </value>
        [TypeConverter(typeof(CustomEnumConverter<OrderStatsStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrderStatsStatusType
        {
            
            /// <summary>
            /// Enum CANCELLEDBEFOREPROCESSINGEnum for CANCELLED_BEFORE_PROCESSING
            /// </summary>
            [EnumMember(Value = "CANCELLED_BEFORE_PROCESSING")]
            CANCELLEDBEFOREPROCESSINGEnum = 1,
            
            /// <summary>
            /// Enum CANCELLEDINDELIVERYEnum for CANCELLED_IN_DELIVERY
            /// </summary>
            [EnumMember(Value = "CANCELLED_IN_DELIVERY")]
            CANCELLEDINDELIVERYEnum = 2,
            
            /// <summary>
            /// Enum CANCELLEDINPROCESSINGEnum for CANCELLED_IN_PROCESSING
            /// </summary>
            [EnumMember(Value = "CANCELLED_IN_PROCESSING")]
            CANCELLEDINPROCESSINGEnum = 3,
            
            /// <summary>
            /// Enum DELIVERYEnum for DELIVERY
            /// </summary>
            [EnumMember(Value = "DELIVERY")]
            DELIVERYEnum = 4,
            
            /// <summary>
            /// Enum DELIVEREDEnum for DELIVERED
            /// </summary>
            [EnumMember(Value = "DELIVERED")]
            DELIVEREDEnum = 5,
            
            /// <summary>
            /// Enum PARTIALLYDELIVEREDEnum for PARTIALLY_DELIVERED
            /// </summary>
            [EnumMember(Value = "PARTIALLY_DELIVERED")]
            PARTIALLYDELIVEREDEnum = 6,
            
            /// <summary>
            /// Enum PARTIALLYRETURNEDEnum for PARTIALLY_RETURNED
            /// </summary>
            [EnumMember(Value = "PARTIALLY_RETURNED")]
            PARTIALLYRETURNEDEnum = 7,
            
            /// <summary>
            /// Enum PENDINGEnum for PENDING
            /// </summary>
            [EnumMember(Value = "PENDING")]
            PENDINGEnum = 8,
            
            /// <summary>
            /// Enum PICKUPEnum for PICKUP
            /// </summary>
            [EnumMember(Value = "PICKUP")]
            PICKUPEnum = 9,
            
            /// <summary>
            /// Enum PROCESSINGEnum for PROCESSING
            /// </summary>
            [EnumMember(Value = "PROCESSING")]
            PROCESSINGEnum = 10,
            
            /// <summary>
            /// Enum RESERVEDEnum for RESERVED
            /// </summary>
            [EnumMember(Value = "RESERVED")]
            RESERVEDEnum = 11,
            
            /// <summary>
            /// Enum RETURNEDEnum for RETURNED
            /// </summary>
            [EnumMember(Value = "RETURNED")]
            RETURNEDEnum = 12,
            
            /// <summary>
            /// Enum UNKNOWNEnum for UNKNOWN
            /// </summary>
            [EnumMember(Value = "UNKNOWN")]
            UNKNOWNEnum = 13,
            
            /// <summary>
            /// Enum UNPAIDEnum for UNPAID
            /// </summary>
            [EnumMember(Value = "UNPAID")]
            UNPAIDEnum = 14,
            
            /// <summary>
            /// Enum LOSTEnum for LOST
            /// </summary>
            [EnumMember(Value = "LOST")]
            LOSTEnum = 15
        }
}
