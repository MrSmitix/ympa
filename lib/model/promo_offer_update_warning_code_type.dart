//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Предупреждение, которое появилось при добавлении товара:  * `DEEP_DISCOUNT_OFFER` — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * `CATALOG_PRICE_IS_LOWER_THAN_PROMO` — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * `SHOP_PRICES_ARE_LOWER_THAN_PROMO` — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * `PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE` — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * `SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар в отдельном магазине не подходит под условия акции. 
class PromoOfferUpdateWarningCodeType {
  /// Instantiate a new enum with the provided [value].
  const PromoOfferUpdateWarningCodeType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DEEP_DISCOUNT_OFFER = PromoOfferUpdateWarningCodeType._(r'DEEP_DISCOUNT_OFFER');
  static const CATALOG_PRICE_IS_LOWER_THAN_PROMO = PromoOfferUpdateWarningCodeType._(r'CATALOG_PRICE_IS_LOWER_THAN_PROMO');
  static const SHOP_PRICES_ARE_LOWER_THAN_PROMO = PromoOfferUpdateWarningCodeType._(r'SHOP_PRICES_ARE_LOWER_THAN_PROMO');
  static const PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE = PromoOfferUpdateWarningCodeType._(r'PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE');
  static const SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO = PromoOfferUpdateWarningCodeType._(r'SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO');

  /// List of all possible values in this [enum][PromoOfferUpdateWarningCodeType].
  static const values = <PromoOfferUpdateWarningCodeType>[
    DEEP_DISCOUNT_OFFER,
    CATALOG_PRICE_IS_LOWER_THAN_PROMO,
    SHOP_PRICES_ARE_LOWER_THAN_PROMO,
    PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE,
    SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO,
  ];

  static PromoOfferUpdateWarningCodeType? fromJson(dynamic value) => PromoOfferUpdateWarningCodeTypeTypeTransformer().decode(value);

  static List<PromoOfferUpdateWarningCodeType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoOfferUpdateWarningCodeType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoOfferUpdateWarningCodeType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromoOfferUpdateWarningCodeType] to String,
/// and [decode] dynamic data back to [PromoOfferUpdateWarningCodeType].
class PromoOfferUpdateWarningCodeTypeTypeTransformer {
  factory PromoOfferUpdateWarningCodeTypeTypeTransformer() => _instance ??= const PromoOfferUpdateWarningCodeTypeTypeTransformer._();

  const PromoOfferUpdateWarningCodeTypeTypeTransformer._();

  String encode(PromoOfferUpdateWarningCodeType data) => data.value;

  /// Decodes a [dynamic value][data] to a PromoOfferUpdateWarningCodeType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromoOfferUpdateWarningCodeType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DEEP_DISCOUNT_OFFER': return PromoOfferUpdateWarningCodeType.DEEP_DISCOUNT_OFFER;
        case r'CATALOG_PRICE_IS_LOWER_THAN_PROMO': return PromoOfferUpdateWarningCodeType.CATALOG_PRICE_IS_LOWER_THAN_PROMO;
        case r'SHOP_PRICES_ARE_LOWER_THAN_PROMO': return PromoOfferUpdateWarningCodeType.SHOP_PRICES_ARE_LOWER_THAN_PROMO;
        case r'PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE': return PromoOfferUpdateWarningCodeType.PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE;
        case r'SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO': return PromoOfferUpdateWarningCodeType.SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PromoOfferUpdateWarningCodeTypeTypeTransformer] instance.
  static PromoOfferUpdateWarningCodeTypeTypeTransformer? _instance;
}

