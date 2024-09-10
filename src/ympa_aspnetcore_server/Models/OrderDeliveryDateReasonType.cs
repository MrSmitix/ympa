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
        /// Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
        /// </summary>
        /// <value>Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. </value>
        [TypeConverter(typeof(CustomEnumConverter<OrderDeliveryDateReasonType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OrderDeliveryDateReasonType
        {
            
            /// <summary>
            /// Enum USERMOVEDDELIVERYDATESEnum for USER_MOVED_DELIVERY_DATES
            /// </summary>
            [EnumMember(Value = "USER_MOVED_DELIVERY_DATES")]
            USERMOVEDDELIVERYDATESEnum = 1,
            
            /// <summary>
            /// Enum PARTNERMOVEDDELIVERYDATESEnum for PARTNER_MOVED_DELIVERY_DATES
            /// </summary>
            [EnumMember(Value = "PARTNER_MOVED_DELIVERY_DATES")]
            PARTNERMOVEDDELIVERYDATESEnum = 2
        }
}
