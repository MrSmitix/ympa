/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// OrderPromoType : Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. 
/// Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum OrderPromoType {
    #[serde(rename = "DIRECT_DISCOUNT")]
    DirectDiscount,
    #[serde(rename = "BLUE_SET")]
    BlueSet,
    #[serde(rename = "BLUE_FLASH")]
    BlueFlash,
    #[serde(rename = "GENERIC_BUNDLE")]
    GenericBundle,
    #[serde(rename = "MARKET_COUPON")]
    MarketCoupon,
    #[serde(rename = "MARKET_PROMOCODE")]
    MarketPromocode,
    #[serde(rename = "MARKET_DEAL")]
    MarketDeal,
    #[serde(rename = "MARKET_BLUE")]
    MarketBlue,
    #[serde(rename = "MARKET_PRIME")]
    MarketPrime,
    #[serde(rename = "YANDEX_PLUS")]
    YandexPlus,
    #[serde(rename = "BERU_PLUS")]
    BeruPlus,
    #[serde(rename = "MARKET_COIN")]
    MarketCoin,
    #[serde(rename = "YANDEX_EMPLOYEE")]
    YandexEmployee,
    #[serde(rename = "LIMITED_FREE_DELIVERY_PROMO")]
    LimitedFreeDeliveryPromo,
    #[serde(rename = "FREE_DELIVERY_THRESHOLD")]
    FreeDeliveryThreshold,
    #[serde(rename = "MULTICART_DISCOUNT")]
    MulticartDiscount,
    #[serde(rename = "PRICE_DROP_AS_YOU_SHOP")]
    PriceDropAsYouShop,
    #[serde(rename = "FREE_DELIVERY_FOR_LDI")]
    FreeDeliveryForLdi,
    #[serde(rename = "FREE_DELIVERY_FOR_LSC")]
    FreeDeliveryForLsc,
    #[serde(rename = "SECRET_SALE")]
    SecretSale,
    #[serde(rename = "FREE_PICKUP")]
    FreePickup,
    #[serde(rename = "CHEAPEST_AS_GIFT")]
    CheapestAsGift,
    #[serde(rename = "CASHBACK")]
    Cashback,
    #[serde(rename = "SUPPLIER_MULTICART_DISCOUNT")]
    SupplierMulticartDiscount,
    #[serde(rename = "SPREAD_DISCOUNT_COUNT")]
    SpreadDiscountCount,
    #[serde(rename = "SPREAD_DISCOUNT_RECEIPT")]
    SpreadDiscountReceipt,
    #[serde(rename = "ANNOUNCEMENT_PROMO")]
    AnnouncementPromo,
    #[serde(rename = "DISCOUNT_BY_PAYMENT_TYPE")]
    DiscountByPaymentType,
    #[serde(rename = "PERCENT_DISCOUNT")]
    PercentDiscount,
    #[serde(rename = "DCO_EXTRA_DISCOUNT")]
    DcoExtraDiscount,
    #[serde(rename = "EMPTY_PROMO")]
    EmptyPromo,
    #[serde(rename = "BLOCKING_PROMO")]
    BlockingPromo,
    #[serde(rename = "UNKNOWN")]
    Unknown,

}

impl std::fmt::Display for OrderPromoType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::DirectDiscount => write!(f, "DIRECT_DISCOUNT"),
            Self::BlueSet => write!(f, "BLUE_SET"),
            Self::BlueFlash => write!(f, "BLUE_FLASH"),
            Self::GenericBundle => write!(f, "GENERIC_BUNDLE"),
            Self::MarketCoupon => write!(f, "MARKET_COUPON"),
            Self::MarketPromocode => write!(f, "MARKET_PROMOCODE"),
            Self::MarketDeal => write!(f, "MARKET_DEAL"),
            Self::MarketBlue => write!(f, "MARKET_BLUE"),
            Self::MarketPrime => write!(f, "MARKET_PRIME"),
            Self::YandexPlus => write!(f, "YANDEX_PLUS"),
            Self::BeruPlus => write!(f, "BERU_PLUS"),
            Self::MarketCoin => write!(f, "MARKET_COIN"),
            Self::YandexEmployee => write!(f, "YANDEX_EMPLOYEE"),
            Self::LimitedFreeDeliveryPromo => write!(f, "LIMITED_FREE_DELIVERY_PROMO"),
            Self::FreeDeliveryThreshold => write!(f, "FREE_DELIVERY_THRESHOLD"),
            Self::MulticartDiscount => write!(f, "MULTICART_DISCOUNT"),
            Self::PriceDropAsYouShop => write!(f, "PRICE_DROP_AS_YOU_SHOP"),
            Self::FreeDeliveryForLdi => write!(f, "FREE_DELIVERY_FOR_LDI"),
            Self::FreeDeliveryForLsc => write!(f, "FREE_DELIVERY_FOR_LSC"),
            Self::SecretSale => write!(f, "SECRET_SALE"),
            Self::FreePickup => write!(f, "FREE_PICKUP"),
            Self::CheapestAsGift => write!(f, "CHEAPEST_AS_GIFT"),
            Self::Cashback => write!(f, "CASHBACK"),
            Self::SupplierMulticartDiscount => write!(f, "SUPPLIER_MULTICART_DISCOUNT"),
            Self::SpreadDiscountCount => write!(f, "SPREAD_DISCOUNT_COUNT"),
            Self::SpreadDiscountReceipt => write!(f, "SPREAD_DISCOUNT_RECEIPT"),
            Self::AnnouncementPromo => write!(f, "ANNOUNCEMENT_PROMO"),
            Self::DiscountByPaymentType => write!(f, "DISCOUNT_BY_PAYMENT_TYPE"),
            Self::PercentDiscount => write!(f, "PERCENT_DISCOUNT"),
            Self::DcoExtraDiscount => write!(f, "DCO_EXTRA_DISCOUNT"),
            Self::EmptyPromo => write!(f, "EMPTY_PROMO"),
            Self::BlockingPromo => write!(f, "BLOCKING_PROMO"),
            Self::Unknown => write!(f, "UNKNOWN"),
        }
    }
}

impl Default for OrderPromoType {
    fn default() -> OrderPromoType {
        Self::DirectDiscount
    }
}

