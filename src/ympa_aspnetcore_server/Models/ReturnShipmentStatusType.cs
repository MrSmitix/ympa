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
        /// Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
        /// </summary>
        /// <value>Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. </value>
        [TypeConverter(typeof(CustomEnumConverter<ReturnShipmentStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ReturnShipmentStatusType
        {
            
            /// <summary>
            /// Enum CREATEDEnum for CREATED
            /// </summary>
            [EnumMember(Value = "CREATED")]
            CREATEDEnum = 1,
            
            /// <summary>
            /// Enum RECEIVEDEnum for RECEIVED
            /// </summary>
            [EnumMember(Value = "RECEIVED")]
            RECEIVEDEnum = 2,
            
            /// <summary>
            /// Enum INTRANSITEnum for IN_TRANSIT
            /// </summary>
            [EnumMember(Value = "IN_TRANSIT")]
            INTRANSITEnum = 3,
            
            /// <summary>
            /// Enum READYFORPICKUPEnum for READY_FOR_PICKUP
            /// </summary>
            [EnumMember(Value = "READY_FOR_PICKUP")]
            READYFORPICKUPEnum = 4,
            
            /// <summary>
            /// Enum PICKEDEnum for PICKED
            /// </summary>
            [EnumMember(Value = "PICKED")]
            PICKEDEnum = 5,
            
            /// <summary>
            /// Enum LOSTEnum for LOST
            /// </summary>
            [EnumMember(Value = "LOST")]
            LOSTEnum = 6,
            
            /// <summary>
            /// Enum EXPIREDEnum for EXPIRED
            /// </summary>
            [EnumMember(Value = "EXPIRED")]
            EXPIREDEnum = 7,
            
            /// <summary>
            /// Enum CANCELLEDEnum for CANCELLED
            /// </summary>
            [EnumMember(Value = "CANCELLED")]
            CANCELLEDEnum = 8,
            
            /// <summary>
            /// Enum FULFILMENTRECEIVEDEnum for FULFILMENT_RECEIVED
            /// </summary>
            [EnumMember(Value = "FULFILMENT_RECEIVED")]
            FULFILMENTRECEIVEDEnum = 9,
            
            /// <summary>
            /// Enum PREPAREDFORUTILIZATIONEnum for PREPARED_FOR_UTILIZATION
            /// </summary>
            [EnumMember(Value = "PREPARED_FOR_UTILIZATION")]
            PREPAREDFORUTILIZATIONEnum = 10,
            
            /// <summary>
            /// Enum NOTINDEMANDEnum for NOT_IN_DEMAND
            /// </summary>
            [EnumMember(Value = "NOT_IN_DEMAND")]
            NOTINDEMANDEnum = 11,
            
            /// <summary>
            /// Enum UTILIZEDEnum for UTILIZED
            /// </summary>
            [EnumMember(Value = "UTILIZED")]
            UTILIZEDEnum = 12,
            
            /// <summary>
            /// Enum READYFOREXPROPRIATIONEnum for READY_FOR_EXPROPRIATION
            /// </summary>
            [EnumMember(Value = "READY_FOR_EXPROPRIATION")]
            READYFOREXPROPRIATIONEnum = 13,
            
            /// <summary>
            /// Enum RECEIVEDFOREXPROPRIATIONEnum for RECEIVED_FOR_EXPROPRIATION
            /// </summary>
            [EnumMember(Value = "RECEIVED_FOR_EXPROPRIATION")]
            RECEIVEDFOREXPROPRIATIONEnum = 14
        }
}
