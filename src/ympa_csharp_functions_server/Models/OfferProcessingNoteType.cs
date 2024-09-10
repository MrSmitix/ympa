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
        /// Тип причины, по которой товар не прошел модерацию:  * `ASSORTMENT` — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр `offer-mapping-entry` запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * `CANCELLED` — товар отозван с модерации по вашей инициативе. * `CONFLICTING_INFORMATION` _(ранее ошибочно `CONFLICTING`)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре `payload`. * `DEPARTMENT_FROZEN` — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * `INCORRECT_INFORMATION` — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре `payload`. * `LEGAL_CONFLICT` — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * `NEED_CLASSIFICATION_INFORMATION` — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * `NEED_INFORMATION` — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * `NEED_PICTURES` — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * `NEED_VENDOR` — неверно указан производитель товара. * `NO_CATEGORY`, `NO_KNOWLEDGE` — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * `NO_PARAMETERS_IN_SHOP_TITLE` — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре `payload`. * `NO_SIZE_MEASURE` — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре `payload`. * `UNKNOWN` — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. 
        /// </summary>
        /// <value>Тип причины, по которой товар не прошел модерацию:  * `ASSORTMENT` — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр `offer-mapping-entry` запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * `CANCELLED` — товар отозван с модерации по вашей инициативе. * `CONFLICTING_INFORMATION` _(ранее ошибочно `CONFLICTING`)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре `payload`. * `DEPARTMENT_FROZEN` — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * `INCORRECT_INFORMATION` — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре `payload`. * `LEGAL_CONFLICT` — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * `NEED_CLASSIFICATION_INFORMATION` — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * `NEED_INFORMATION` — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * `NEED_PICTURES` — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * `NEED_VENDOR` — неверно указан производитель товара. * `NO_CATEGORY`, `NO_KNOWLEDGE` — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * `NO_PARAMETERS_IN_SHOP_TITLE` — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре `payload`. * `NO_SIZE_MEASURE` — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре `payload`. * `UNKNOWN` — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. </value>
        [TypeConverter(typeof(CustomEnumConverter<OfferProcessingNoteType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OfferProcessingNoteType
        {
            
            /// <summary>
            /// Enum ASSORTMENTEnum for ASSORTMENT
            /// </summary>
            [EnumMember(Value = "ASSORTMENT")]
            ASSORTMENTEnum = 1,
            
            /// <summary>
            /// Enum CANCELLEDEnum for CANCELLED
            /// </summary>
            [EnumMember(Value = "CANCELLED")]
            CANCELLEDEnum = 2,
            
            /// <summary>
            /// Enum CONFLICTINGINFORMATIONEnum for CONFLICTING_INFORMATION
            /// </summary>
            [EnumMember(Value = "CONFLICTING_INFORMATION")]
            CONFLICTINGINFORMATIONEnum = 3,
            
            /// <summary>
            /// Enum OTHEREnum for OTHER
            /// </summary>
            [EnumMember(Value = "OTHER")]
            OTHEREnum = 4,
            
            /// <summary>
            /// Enum DEPARTMENTFROZENEnum for DEPARTMENT_FROZEN
            /// </summary>
            [EnumMember(Value = "DEPARTMENT_FROZEN")]
            DEPARTMENTFROZENEnum = 5,
            
            /// <summary>
            /// Enum INCORRECTINFORMATIONEnum for INCORRECT_INFORMATION
            /// </summary>
            [EnumMember(Value = "INCORRECT_INFORMATION")]
            INCORRECTINFORMATIONEnum = 6,
            
            /// <summary>
            /// Enum LEGALCONFLICTEnum for LEGAL_CONFLICT
            /// </summary>
            [EnumMember(Value = "LEGAL_CONFLICT")]
            LEGALCONFLICTEnum = 7,
            
            /// <summary>
            /// Enum NEEDCLASSIFICATIONINFORMATIONEnum for NEED_CLASSIFICATION_INFORMATION
            /// </summary>
            [EnumMember(Value = "NEED_CLASSIFICATION_INFORMATION")]
            NEEDCLASSIFICATIONINFORMATIONEnum = 8,
            
            /// <summary>
            /// Enum NEEDINFORMATIONEnum for NEED_INFORMATION
            /// </summary>
            [EnumMember(Value = "NEED_INFORMATION")]
            NEEDINFORMATIONEnum = 9,
            
            /// <summary>
            /// Enum NEEDPICTURESEnum for NEED_PICTURES
            /// </summary>
            [EnumMember(Value = "NEED_PICTURES")]
            NEEDPICTURESEnum = 10,
            
            /// <summary>
            /// Enum NEEDVENDOREnum for NEED_VENDOR
            /// </summary>
            [EnumMember(Value = "NEED_VENDOR")]
            NEEDVENDOREnum = 11,
            
            /// <summary>
            /// Enum NOCATEGORYEnum for NO_CATEGORY
            /// </summary>
            [EnumMember(Value = "NO_CATEGORY")]
            NOCATEGORYEnum = 12,
            
            /// <summary>
            /// Enum NOKNOWLEDGEEnum for NO_KNOWLEDGE
            /// </summary>
            [EnumMember(Value = "NO_KNOWLEDGE")]
            NOKNOWLEDGEEnum = 13,
            
            /// <summary>
            /// Enum NOPARAMETERSINSHOPTITLEEnum for NO_PARAMETERS_IN_SHOP_TITLE
            /// </summary>
            [EnumMember(Value = "NO_PARAMETERS_IN_SHOP_TITLE")]
            NOPARAMETERSINSHOPTITLEEnum = 14,
            
            /// <summary>
            /// Enum NOSIZEMEASUREEnum for NO_SIZE_MEASURE
            /// </summary>
            [EnumMember(Value = "NO_SIZE_MEASURE")]
            NOSIZEMEASUREEnum = 15,
            
            /// <summary>
            /// Enum SAMPLELINEEnum for SAMPLE_LINE
            /// </summary>
            [EnumMember(Value = "SAMPLE_LINE")]
            SAMPLELINEEnum = 16
        }
}
