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
        /// Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
        /// </summary>
        /// <value>Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. </value>
        [TypeConverter(typeof(CustomEnumConverter<SellingProgramType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SellingProgramType
        {
            
            /// <summary>
            /// Enum FBYEnum for FBY
            /// </summary>
            [EnumMember(Value = "FBY")]
            FBYEnum = 1,
            
            /// <summary>
            /// Enum FBSEnum for FBS
            /// </summary>
            [EnumMember(Value = "FBS")]
            FBSEnum = 2,
            
            /// <summary>
            /// Enum DBSEnum for DBS
            /// </summary>
            [EnumMember(Value = "DBS")]
            DBSEnum = 3,
            
            /// <summary>
            /// Enum EXPRESSEnum for EXPRESS
            /// </summary>
            [EnumMember(Value = "EXPRESS")]
            EXPRESSEnum = 4
        }
}
