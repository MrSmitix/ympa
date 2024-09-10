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
        /// Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
        /// </summary>
        /// <value>Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. </value>
        [TypeConverter(typeof(CustomEnumConverter<RefundStatusType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum RefundStatusType
        {
            
            /// <summary>
            /// Enum STARTEDBYUSEREnum for STARTED_BY_USER
            /// </summary>
            [EnumMember(Value = "STARTED_BY_USER")]
            STARTEDBYUSEREnum = 1,
            
            /// <summary>
            /// Enum REFUNDINPROGRESSEnum for REFUND_IN_PROGRESS
            /// </summary>
            [EnumMember(Value = "REFUND_IN_PROGRESS")]
            REFUNDINPROGRESSEnum = 2,
            
            /// <summary>
            /// Enum REFUNDEDEnum for REFUNDED
            /// </summary>
            [EnumMember(Value = "REFUNDED")]
            REFUNDEDEnum = 3,
            
            /// <summary>
            /// Enum FAILEDEnum for FAILED
            /// </summary>
            [EnumMember(Value = "FAILED")]
            FAILEDEnum = 4,
            
            /// <summary>
            /// Enum WAITINGFORDECISIONEnum for WAITING_FOR_DECISION
            /// </summary>
            [EnumMember(Value = "WAITING_FOR_DECISION")]
            WAITINGFORDECISIONEnum = 5,
            
            /// <summary>
            /// Enum DECISIONMADEEnum for DECISION_MADE
            /// </summary>
            [EnumMember(Value = "DECISION_MADE")]
            DECISIONMADEEnum = 6,
            
            /// <summary>
            /// Enum REFUNDEDWITHBONUSESEnum for REFUNDED_WITH_BONUSES
            /// </summary>
            [EnumMember(Value = "REFUNDED_WITH_BONUSES")]
            REFUNDEDWITHBONUSESEnum = 7,
            
            /// <summary>
            /// Enum REFUNDEDBYSHOPEnum for REFUNDED_BY_SHOP
            /// </summary>
            [EnumMember(Value = "REFUNDED_BY_SHOP")]
            REFUNDEDBYSHOPEnum = 8,
            
            /// <summary>
            /// Enum CANCELLEDEnum for CANCELLED
            /// </summary>
            [EnumMember(Value = "CANCELLED")]
            CANCELLEDEnum = 9,
            
            /// <summary>
            /// Enum COMPLETEWITHOUTREFUNDEnum for COMPLETE_WITHOUT_REFUND
            /// </summary>
            [EnumMember(Value = "COMPLETE_WITHOUT_REFUND")]
            COMPLETEWITHOUTREFUNDEnum = 10,
            
            /// <summary>
            /// Enum UNKNOWNEnum for UNKNOWN
            /// </summary>
            [EnumMember(Value = "UNKNOWN")]
            UNKNOWNEnum = 11
        }
}
