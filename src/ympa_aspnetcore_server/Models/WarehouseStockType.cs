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
        /// Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. 
        /// </summary>
        /// <value>Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. </value>
        [TypeConverter(typeof(CustomEnumConverter<WarehouseStockType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum WarehouseStockType
        {
            
            /// <summary>
            /// Enum FITEnum for FIT
            /// </summary>
            [EnumMember(Value = "FIT")]
            FITEnum = 1,
            
            /// <summary>
            /// Enum FREEZEEnum for FREEZE
            /// </summary>
            [EnumMember(Value = "FREEZE")]
            FREEZEEnum = 2,
            
            /// <summary>
            /// Enum AVAILABLEEnum for AVAILABLE
            /// </summary>
            [EnumMember(Value = "AVAILABLE")]
            AVAILABLEEnum = 3,
            
            /// <summary>
            /// Enum QUARANTINEEnum for QUARANTINE
            /// </summary>
            [EnumMember(Value = "QUARANTINE")]
            QUARANTINEEnum = 4,
            
            /// <summary>
            /// Enum UTILIZATIONEnum for UTILIZATION
            /// </summary>
            [EnumMember(Value = "UTILIZATION")]
            UTILIZATIONEnum = 5,
            
            /// <summary>
            /// Enum DEFECTEnum for DEFECT
            /// </summary>
            [EnumMember(Value = "DEFECT")]
            DEFECTEnum = 6,
            
            /// <summary>
            /// Enum EXPIREDEnum for EXPIRED
            /// </summary>
            [EnumMember(Value = "EXPIRED")]
            EXPIREDEnum = 7
        }
}
