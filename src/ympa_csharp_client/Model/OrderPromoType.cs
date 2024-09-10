/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. 
    /// </summary>
    /// <value>Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OrderPromoType
    {
        /// <summary>
        /// Enum DIRECTDISCOUNT for value: DIRECT_DISCOUNT
        /// </summary>
        [EnumMember(Value = "DIRECT_DISCOUNT")]
        DIRECTDISCOUNT = 1,

        /// <summary>
        /// Enum BLUESET for value: BLUE_SET
        /// </summary>
        [EnumMember(Value = "BLUE_SET")]
        BLUESET = 2,

        /// <summary>
        /// Enum BLUEFLASH for value: BLUE_FLASH
        /// </summary>
        [EnumMember(Value = "BLUE_FLASH")]
        BLUEFLASH = 3,

        /// <summary>
        /// Enum GENERICBUNDLE for value: GENERIC_BUNDLE
        /// </summary>
        [EnumMember(Value = "GENERIC_BUNDLE")]
        GENERICBUNDLE = 4,

        /// <summary>
        /// Enum MARKETCOUPON for value: MARKET_COUPON
        /// </summary>
        [EnumMember(Value = "MARKET_COUPON")]
        MARKETCOUPON = 5,

        /// <summary>
        /// Enum MARKETPROMOCODE for value: MARKET_PROMOCODE
        /// </summary>
        [EnumMember(Value = "MARKET_PROMOCODE")]
        MARKETPROMOCODE = 6,

        /// <summary>
        /// Enum MARKETDEAL for value: MARKET_DEAL
        /// </summary>
        [EnumMember(Value = "MARKET_DEAL")]
        MARKETDEAL = 7,

        /// <summary>
        /// Enum MARKETBLUE for value: MARKET_BLUE
        /// </summary>
        [EnumMember(Value = "MARKET_BLUE")]
        MARKETBLUE = 8,

        /// <summary>
        /// Enum MARKETPRIME for value: MARKET_PRIME
        /// </summary>
        [EnumMember(Value = "MARKET_PRIME")]
        MARKETPRIME = 9,

        /// <summary>
        /// Enum YANDEXPLUS for value: YANDEX_PLUS
        /// </summary>
        [EnumMember(Value = "YANDEX_PLUS")]
        YANDEXPLUS = 10,

        /// <summary>
        /// Enum BERUPLUS for value: BERU_PLUS
        /// </summary>
        [EnumMember(Value = "BERU_PLUS")]
        BERUPLUS = 11,

        /// <summary>
        /// Enum MARKETCOIN for value: MARKET_COIN
        /// </summary>
        [EnumMember(Value = "MARKET_COIN")]
        MARKETCOIN = 12,

        /// <summary>
        /// Enum YANDEXEMPLOYEE for value: YANDEX_EMPLOYEE
        /// </summary>
        [EnumMember(Value = "YANDEX_EMPLOYEE")]
        YANDEXEMPLOYEE = 13,

        /// <summary>
        /// Enum LIMITEDFREEDELIVERYPROMO for value: LIMITED_FREE_DELIVERY_PROMO
        /// </summary>
        [EnumMember(Value = "LIMITED_FREE_DELIVERY_PROMO")]
        LIMITEDFREEDELIVERYPROMO = 14,

        /// <summary>
        /// Enum FREEDELIVERYTHRESHOLD for value: FREE_DELIVERY_THRESHOLD
        /// </summary>
        [EnumMember(Value = "FREE_DELIVERY_THRESHOLD")]
        FREEDELIVERYTHRESHOLD = 15,

        /// <summary>
        /// Enum MULTICARTDISCOUNT for value: MULTICART_DISCOUNT
        /// </summary>
        [EnumMember(Value = "MULTICART_DISCOUNT")]
        MULTICARTDISCOUNT = 16,

        /// <summary>
        /// Enum PRICEDROPASYOUSHOP for value: PRICE_DROP_AS_YOU_SHOP
        /// </summary>
        [EnumMember(Value = "PRICE_DROP_AS_YOU_SHOP")]
        PRICEDROPASYOUSHOP = 17,

        /// <summary>
        /// Enum FREEDELIVERYFORLDI for value: FREE_DELIVERY_FOR_LDI
        /// </summary>
        [EnumMember(Value = "FREE_DELIVERY_FOR_LDI")]
        FREEDELIVERYFORLDI = 18,

        /// <summary>
        /// Enum FREEDELIVERYFORLSC for value: FREE_DELIVERY_FOR_LSC
        /// </summary>
        [EnumMember(Value = "FREE_DELIVERY_FOR_LSC")]
        FREEDELIVERYFORLSC = 19,

        /// <summary>
        /// Enum SECRETSALE for value: SECRET_SALE
        /// </summary>
        [EnumMember(Value = "SECRET_SALE")]
        SECRETSALE = 20,

        /// <summary>
        /// Enum FREEPICKUP for value: FREE_PICKUP
        /// </summary>
        [EnumMember(Value = "FREE_PICKUP")]
        FREEPICKUP = 21,

        /// <summary>
        /// Enum CHEAPESTASGIFT for value: CHEAPEST_AS_GIFT
        /// </summary>
        [EnumMember(Value = "CHEAPEST_AS_GIFT")]
        CHEAPESTASGIFT = 22,

        /// <summary>
        /// Enum CASHBACK for value: CASHBACK
        /// </summary>
        [EnumMember(Value = "CASHBACK")]
        CASHBACK = 23,

        /// <summary>
        /// Enum SUPPLIERMULTICARTDISCOUNT for value: SUPPLIER_MULTICART_DISCOUNT
        /// </summary>
        [EnumMember(Value = "SUPPLIER_MULTICART_DISCOUNT")]
        SUPPLIERMULTICARTDISCOUNT = 24,

        /// <summary>
        /// Enum SPREADDISCOUNTCOUNT for value: SPREAD_DISCOUNT_COUNT
        /// </summary>
        [EnumMember(Value = "SPREAD_DISCOUNT_COUNT")]
        SPREADDISCOUNTCOUNT = 25,

        /// <summary>
        /// Enum SPREADDISCOUNTRECEIPT for value: SPREAD_DISCOUNT_RECEIPT
        /// </summary>
        [EnumMember(Value = "SPREAD_DISCOUNT_RECEIPT")]
        SPREADDISCOUNTRECEIPT = 26,

        /// <summary>
        /// Enum ANNOUNCEMENTPROMO for value: ANNOUNCEMENT_PROMO
        /// </summary>
        [EnumMember(Value = "ANNOUNCEMENT_PROMO")]
        ANNOUNCEMENTPROMO = 27,

        /// <summary>
        /// Enum DISCOUNTBYPAYMENTTYPE for value: DISCOUNT_BY_PAYMENT_TYPE
        /// </summary>
        [EnumMember(Value = "DISCOUNT_BY_PAYMENT_TYPE")]
        DISCOUNTBYPAYMENTTYPE = 28,

        /// <summary>
        /// Enum PERCENTDISCOUNT for value: PERCENT_DISCOUNT
        /// </summary>
        [EnumMember(Value = "PERCENT_DISCOUNT")]
        PERCENTDISCOUNT = 29,

        /// <summary>
        /// Enum DCOEXTRADISCOUNT for value: DCO_EXTRA_DISCOUNT
        /// </summary>
        [EnumMember(Value = "DCO_EXTRA_DISCOUNT")]
        DCOEXTRADISCOUNT = 30,

        /// <summary>
        /// Enum EMPTYPROMO for value: EMPTY_PROMO
        /// </summary>
        [EnumMember(Value = "EMPTY_PROMO")]
        EMPTYPROMO = 31,

        /// <summary>
        /// Enum BLOCKINGPROMO for value: BLOCKING_PROMO
        /// </summary>
        [EnumMember(Value = "BLOCKING_PROMO")]
        BLOCKINGPROMO = 32,

        /// <summary>
        /// Enum UNKNOWN for value: UNKNOWN
        /// </summary>
        [EnumMember(Value = "UNKNOWN")]
        UNKNOWN = 33
    }

}
