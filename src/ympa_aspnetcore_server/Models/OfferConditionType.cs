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
        /// Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
        /// </summary>
        /// <value>Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. </value>
        [TypeConverter(typeof(CustomEnumConverter<OfferConditionType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OfferConditionType
        {
            
            /// <summary>
            /// Enum PREOWNEDEnum for PREOWNED
            /// </summary>
            [EnumMember(Value = "PREOWNED")]
            PREOWNEDEnum = 1,
            
            /// <summary>
            /// Enum SHOWCASESAMPLEEnum for SHOWCASESAMPLE
            /// </summary>
            [EnumMember(Value = "SHOWCASESAMPLE")]
            SHOWCASESAMPLEEnum = 2,
            
            /// <summary>
            /// Enum REFURBISHEDEnum for REFURBISHED
            /// </summary>
            [EnumMember(Value = "REFURBISHED")]
            REFURBISHEDEnum = 3,
            
            /// <summary>
            /// Enum REDUCTIONEnum for REDUCTION
            /// </summary>
            [EnumMember(Value = "REDUCTION")]
            REDUCTIONEnum = 4,
            
            /// <summary>
            /// Enum RENOVATEDEnum for RENOVATED
            /// </summary>
            [EnumMember(Value = "RENOVATED")]
            RENOVATEDEnum = 5,
            
            /// <summary>
            /// Enum NOTSPECIFIEDEnum for NOT_SPECIFIED
            /// </summary>
            [EnumMember(Value = "NOT_SPECIFIED")]
            NOTSPECIFIEDEnum = 6
        }
}
