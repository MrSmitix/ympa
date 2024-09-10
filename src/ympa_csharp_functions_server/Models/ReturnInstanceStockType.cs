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
        /// Тип остатка на складе.
        /// </summary>
        /// <value>Тип остатка на складе.</value>
        [TypeConverter(typeof(CustomEnumConverter<ReturnInstanceStockType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ReturnInstanceStockType
        {
            
            /// <summary>
            /// Enum FITEnum for FIT
            /// </summary>
            [EnumMember(Value = "FIT")]
            FITEnum = 1,
            
            /// <summary>
            /// Enum DEFECTEnum for DEFECT
            /// </summary>
            [EnumMember(Value = "DEFECT")]
            DEFECTEnum = 2,
            
            /// <summary>
            /// Enum ANOMALYEnum for ANOMALY
            /// </summary>
            [EnumMember(Value = "ANOMALY")]
            ANOMALYEnum = 3,
            
            /// <summary>
            /// Enum SURPLUSEnum for SURPLUS
            /// </summary>
            [EnumMember(Value = "SURPLUS")]
            SURPLUSEnum = 4,
            
            /// <summary>
            /// Enum EXPIREDEnum for EXPIRED
            /// </summary>
            [EnumMember(Value = "EXPIRED")]
            EXPIREDEnum = 5,
            
            /// <summary>
            /// Enum MISGRADINGEnum for MISGRADING
            /// </summary>
            [EnumMember(Value = "MISGRADING")]
            MISGRADINGEnum = 6,
            
            /// <summary>
            /// Enum UNDEFINEDEnum for UNDEFINED
            /// </summary>
            [EnumMember(Value = "UNDEFINED")]
            UNDEFINEDEnum = 7,
            
            /// <summary>
            /// Enum INCORRECTIMEIEnum for INCORRECT_IMEI
            /// </summary>
            [EnumMember(Value = "INCORRECT_IMEI")]
            INCORRECTIMEIEnum = 8,
            
            /// <summary>
            /// Enum INCORRECTSERIALNUMBEREnum for INCORRECT_SERIAL_NUMBER
            /// </summary>
            [EnumMember(Value = "INCORRECT_SERIAL_NUMBER")]
            INCORRECTSERIALNUMBEREnum = 9,
            
            /// <summary>
            /// Enum INCORRECTCISEnum for INCORRECT_CIS
            /// </summary>
            [EnumMember(Value = "INCORRECT_CIS")]
            INCORRECTCISEnum = 10,
            
            /// <summary>
            /// Enum PARTMISSINGEnum for PART_MISSING
            /// </summary>
            [EnumMember(Value = "PART_MISSING")]
            PARTMISSINGEnum = 11,
            
            /// <summary>
            /// Enum NONCOMPLIENTEnum for NON_COMPLIENT
            /// </summary>
            [EnumMember(Value = "NON_COMPLIENT")]
            NONCOMPLIENTEnum = 12,
            
            /// <summary>
            /// Enum NOTACCEPTABLEEnum for NOT_ACCEPTABLE
            /// </summary>
            [EnumMember(Value = "NOT_ACCEPTABLE")]
            NOTACCEPTABLEEnum = 13,
            
            /// <summary>
            /// Enum SERVICEEnum for SERVICE
            /// </summary>
            [EnumMember(Value = "SERVICE")]
            SERVICEEnum = 14,
            
            /// <summary>
            /// Enum MARKDOWNEnum for MARKDOWN
            /// </summary>
            [EnumMember(Value = "MARKDOWN")]
            MARKDOWNEnum = 15,
            
            /// <summary>
            /// Enum DEMOEnum for DEMO
            /// </summary>
            [EnumMember(Value = "DEMO")]
            DEMOEnum = 16,
            
            /// <summary>
            /// Enum REPAIREnum for REPAIR
            /// </summary>
            [EnumMember(Value = "REPAIR")]
            REPAIREnum = 17,
            
            /// <summary>
            /// Enum FIRMWAREEnum for FIRMWARE
            /// </summary>
            [EnumMember(Value = "FIRMWARE")]
            FIRMWAREEnum = 18,
            
            /// <summary>
            /// Enum UNKNOWNEnum for UNKNOWN
            /// </summary>
            [EnumMember(Value = "UNKNOWN")]
            UNKNOWNEnum = 19
        }
}
