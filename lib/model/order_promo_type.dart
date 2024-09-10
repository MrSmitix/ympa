//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. 
class OrderPromoType {
  /// Instantiate a new enum with the provided [value].
  const OrderPromoType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DIRECT_DISCOUNT = OrderPromoType._(r'DIRECT_DISCOUNT');
  static const BLUE_SET = OrderPromoType._(r'BLUE_SET');
  static const BLUE_FLASH = OrderPromoType._(r'BLUE_FLASH');
  static const GENERIC_BUNDLE = OrderPromoType._(r'GENERIC_BUNDLE');
  static const MARKET_COUPON = OrderPromoType._(r'MARKET_COUPON');
  static const MARKET_PROMOCODE = OrderPromoType._(r'MARKET_PROMOCODE');
  static const MARKET_DEAL = OrderPromoType._(r'MARKET_DEAL');
  static const MARKET_BLUE = OrderPromoType._(r'MARKET_BLUE');
  static const MARKET_PRIME = OrderPromoType._(r'MARKET_PRIME');
  static const YANDEX_PLUS = OrderPromoType._(r'YANDEX_PLUS');
  static const BERU_PLUS = OrderPromoType._(r'BERU_PLUS');
  static const MARKET_COIN = OrderPromoType._(r'MARKET_COIN');
  static const YANDEX_EMPLOYEE = OrderPromoType._(r'YANDEX_EMPLOYEE');
  static const LIMITED_FREE_DELIVERY_PROMO = OrderPromoType._(r'LIMITED_FREE_DELIVERY_PROMO');
  static const FREE_DELIVERY_THRESHOLD = OrderPromoType._(r'FREE_DELIVERY_THRESHOLD');
  static const MULTICART_DISCOUNT = OrderPromoType._(r'MULTICART_DISCOUNT');
  static const PRICE_DROP_AS_YOU_SHOP = OrderPromoType._(r'PRICE_DROP_AS_YOU_SHOP');
  static const FREE_DELIVERY_FOR_LDI = OrderPromoType._(r'FREE_DELIVERY_FOR_LDI');
  static const FREE_DELIVERY_FOR_LSC = OrderPromoType._(r'FREE_DELIVERY_FOR_LSC');
  static const SECRET_SALE = OrderPromoType._(r'SECRET_SALE');
  static const FREE_PICKUP = OrderPromoType._(r'FREE_PICKUP');
  static const CHEAPEST_AS_GIFT = OrderPromoType._(r'CHEAPEST_AS_GIFT');
  static const CASHBACK = OrderPromoType._(r'CASHBACK');
  static const SUPPLIER_MULTICART_DISCOUNT = OrderPromoType._(r'SUPPLIER_MULTICART_DISCOUNT');
  static const SPREAD_DISCOUNT_COUNT = OrderPromoType._(r'SPREAD_DISCOUNT_COUNT');
  static const SPREAD_DISCOUNT_RECEIPT = OrderPromoType._(r'SPREAD_DISCOUNT_RECEIPT');
  static const ANNOUNCEMENT_PROMO = OrderPromoType._(r'ANNOUNCEMENT_PROMO');
  static const DISCOUNT_BY_PAYMENT_TYPE = OrderPromoType._(r'DISCOUNT_BY_PAYMENT_TYPE');
  static const PERCENT_DISCOUNT = OrderPromoType._(r'PERCENT_DISCOUNT');
  static const DCO_EXTRA_DISCOUNT = OrderPromoType._(r'DCO_EXTRA_DISCOUNT');
  static const EMPTY_PROMO = OrderPromoType._(r'EMPTY_PROMO');
  static const BLOCKING_PROMO = OrderPromoType._(r'BLOCKING_PROMO');
  static const UNKNOWN = OrderPromoType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderPromoType].
  static const values = <OrderPromoType>[
    DIRECT_DISCOUNT,
    BLUE_SET,
    BLUE_FLASH,
    GENERIC_BUNDLE,
    MARKET_COUPON,
    MARKET_PROMOCODE,
    MARKET_DEAL,
    MARKET_BLUE,
    MARKET_PRIME,
    YANDEX_PLUS,
    BERU_PLUS,
    MARKET_COIN,
    YANDEX_EMPLOYEE,
    LIMITED_FREE_DELIVERY_PROMO,
    FREE_DELIVERY_THRESHOLD,
    MULTICART_DISCOUNT,
    PRICE_DROP_AS_YOU_SHOP,
    FREE_DELIVERY_FOR_LDI,
    FREE_DELIVERY_FOR_LSC,
    SECRET_SALE,
    FREE_PICKUP,
    CHEAPEST_AS_GIFT,
    CASHBACK,
    SUPPLIER_MULTICART_DISCOUNT,
    SPREAD_DISCOUNT_COUNT,
    SPREAD_DISCOUNT_RECEIPT,
    ANNOUNCEMENT_PROMO,
    DISCOUNT_BY_PAYMENT_TYPE,
    PERCENT_DISCOUNT,
    DCO_EXTRA_DISCOUNT,
    EMPTY_PROMO,
    BLOCKING_PROMO,
    UNKNOWN,
  ];

  static OrderPromoType? fromJson(dynamic value) => OrderPromoTypeTypeTransformer().decode(value);

  static List<OrderPromoType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderPromoType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderPromoType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderPromoType] to String,
/// and [decode] dynamic data back to [OrderPromoType].
class OrderPromoTypeTypeTransformer {
  factory OrderPromoTypeTypeTransformer() => _instance ??= const OrderPromoTypeTypeTransformer._();

  const OrderPromoTypeTypeTransformer._();

  String encode(OrderPromoType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderPromoType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderPromoType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DIRECT_DISCOUNT': return OrderPromoType.DIRECT_DISCOUNT;
        case r'BLUE_SET': return OrderPromoType.BLUE_SET;
        case r'BLUE_FLASH': return OrderPromoType.BLUE_FLASH;
        case r'GENERIC_BUNDLE': return OrderPromoType.GENERIC_BUNDLE;
        case r'MARKET_COUPON': return OrderPromoType.MARKET_COUPON;
        case r'MARKET_PROMOCODE': return OrderPromoType.MARKET_PROMOCODE;
        case r'MARKET_DEAL': return OrderPromoType.MARKET_DEAL;
        case r'MARKET_BLUE': return OrderPromoType.MARKET_BLUE;
        case r'MARKET_PRIME': return OrderPromoType.MARKET_PRIME;
        case r'YANDEX_PLUS': return OrderPromoType.YANDEX_PLUS;
        case r'BERU_PLUS': return OrderPromoType.BERU_PLUS;
        case r'MARKET_COIN': return OrderPromoType.MARKET_COIN;
        case r'YANDEX_EMPLOYEE': return OrderPromoType.YANDEX_EMPLOYEE;
        case r'LIMITED_FREE_DELIVERY_PROMO': return OrderPromoType.LIMITED_FREE_DELIVERY_PROMO;
        case r'FREE_DELIVERY_THRESHOLD': return OrderPromoType.FREE_DELIVERY_THRESHOLD;
        case r'MULTICART_DISCOUNT': return OrderPromoType.MULTICART_DISCOUNT;
        case r'PRICE_DROP_AS_YOU_SHOP': return OrderPromoType.PRICE_DROP_AS_YOU_SHOP;
        case r'FREE_DELIVERY_FOR_LDI': return OrderPromoType.FREE_DELIVERY_FOR_LDI;
        case r'FREE_DELIVERY_FOR_LSC': return OrderPromoType.FREE_DELIVERY_FOR_LSC;
        case r'SECRET_SALE': return OrderPromoType.SECRET_SALE;
        case r'FREE_PICKUP': return OrderPromoType.FREE_PICKUP;
        case r'CHEAPEST_AS_GIFT': return OrderPromoType.CHEAPEST_AS_GIFT;
        case r'CASHBACK': return OrderPromoType.CASHBACK;
        case r'SUPPLIER_MULTICART_DISCOUNT': return OrderPromoType.SUPPLIER_MULTICART_DISCOUNT;
        case r'SPREAD_DISCOUNT_COUNT': return OrderPromoType.SPREAD_DISCOUNT_COUNT;
        case r'SPREAD_DISCOUNT_RECEIPT': return OrderPromoType.SPREAD_DISCOUNT_RECEIPT;
        case r'ANNOUNCEMENT_PROMO': return OrderPromoType.ANNOUNCEMENT_PROMO;
        case r'DISCOUNT_BY_PAYMENT_TYPE': return OrderPromoType.DISCOUNT_BY_PAYMENT_TYPE;
        case r'PERCENT_DISCOUNT': return OrderPromoType.PERCENT_DISCOUNT;
        case r'DCO_EXTRA_DISCOUNT': return OrderPromoType.DCO_EXTRA_DISCOUNT;
        case r'EMPTY_PROMO': return OrderPromoType.EMPTY_PROMO;
        case r'BLOCKING_PROMO': return OrderPromoType.BLOCKING_PROMO;
        case r'UNKNOWN': return OrderPromoType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderPromoTypeTypeTransformer] instance.
  static OrderPromoTypeTypeTransformer? _instance;
}

