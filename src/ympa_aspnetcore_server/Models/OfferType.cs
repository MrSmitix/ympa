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
        /// Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
        /// </summary>
        /// <value>Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} </value>
        [TypeConverter(typeof(CustomEnumConverter<OfferType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OfferType
        {
            
            /// <summary>
            /// Enum DEFAULTEnum for DEFAULT
            /// </summary>
            [EnumMember(Value = "DEFAULT")]
            DEFAULTEnum = 1,
            
            /// <summary>
            /// Enum MEDICINEEnum for MEDICINE
            /// </summary>
            [EnumMember(Value = "MEDICINE")]
            MEDICINEEnum = 2,
            
            /// <summary>
            /// Enum BOOKEnum for BOOK
            /// </summary>
            [EnumMember(Value = "BOOK")]
            BOOKEnum = 3,
            
            /// <summary>
            /// Enum AUDIOBOOKEnum for AUDIOBOOK
            /// </summary>
            [EnumMember(Value = "AUDIOBOOK")]
            AUDIOBOOKEnum = 4,
            
            /// <summary>
            /// Enum ARTISTTITLEEnum for ARTIST_TITLE
            /// </summary>
            [EnumMember(Value = "ARTIST_TITLE")]
            ARTISTTITLEEnum = 5,
            
            /// <summary>
            /// Enum ONDEMANDEnum for ON_DEMAND
            /// </summary>
            [EnumMember(Value = "ON_DEMAND")]
            ONDEMANDEnum = 6
        }
}
