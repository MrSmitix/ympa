//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
class RejectedPromoOfferUpdateReasonType {
  /// Instantiate a new enum with the provided [value].
  const RejectedPromoOfferUpdateReasonType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OFFER_DOES_NOT_EXIST = RejectedPromoOfferUpdateReasonType._(r'OFFER_DOES_NOT_EXIST');
  static const OFFER_DUPLICATION = RejectedPromoOfferUpdateReasonType._(r'OFFER_DUPLICATION');
  static const OFFER_NOT_ELIGIBLE_FOR_PROMO = RejectedPromoOfferUpdateReasonType._(r'OFFER_NOT_ELIGIBLE_FOR_PROMO');
  static const OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED = RejectedPromoOfferUpdateReasonType._(r'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED');
  static const DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED = RejectedPromoOfferUpdateReasonType._(r'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED');
  static const EMPTY_OLD_PRICE = RejectedPromoOfferUpdateReasonType._(r'EMPTY_OLD_PRICE');
  static const EMPTY_PROMO_PRICE = RejectedPromoOfferUpdateReasonType._(r'EMPTY_PROMO_PRICE');
  static const MAX_PROMO_PRICE_EXCEEDED = RejectedPromoOfferUpdateReasonType._(r'MAX_PROMO_PRICE_EXCEEDED');
  static const PROMO_PRICE_BIGGER_THAN_MAX = RejectedPromoOfferUpdateReasonType._(r'PROMO_PRICE_BIGGER_THAN_MAX');
  static const PROMO_PRICE_SMALLER_THAN_MIN = RejectedPromoOfferUpdateReasonType._(r'PROMO_PRICE_SMALLER_THAN_MIN');

  /// List of all possible values in this [enum][RejectedPromoOfferUpdateReasonType].
  static const values = <RejectedPromoOfferUpdateReasonType>[
    OFFER_DOES_NOT_EXIST,
    OFFER_DUPLICATION,
    OFFER_NOT_ELIGIBLE_FOR_PROMO,
    OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED,
    DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED,
    EMPTY_OLD_PRICE,
    EMPTY_PROMO_PRICE,
    MAX_PROMO_PRICE_EXCEEDED,
    PROMO_PRICE_BIGGER_THAN_MAX,
    PROMO_PRICE_SMALLER_THAN_MIN,
  ];

  static RejectedPromoOfferUpdateReasonType? fromJson(dynamic value) => RejectedPromoOfferUpdateReasonTypeTypeTransformer().decode(value);

  static List<RejectedPromoOfferUpdateReasonType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RejectedPromoOfferUpdateReasonType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RejectedPromoOfferUpdateReasonType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RejectedPromoOfferUpdateReasonType] to String,
/// and [decode] dynamic data back to [RejectedPromoOfferUpdateReasonType].
class RejectedPromoOfferUpdateReasonTypeTypeTransformer {
  factory RejectedPromoOfferUpdateReasonTypeTypeTransformer() => _instance ??= const RejectedPromoOfferUpdateReasonTypeTypeTransformer._();

  const RejectedPromoOfferUpdateReasonTypeTypeTransformer._();

  String encode(RejectedPromoOfferUpdateReasonType data) => data.value;

  /// Decodes a [dynamic value][data] to a RejectedPromoOfferUpdateReasonType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RejectedPromoOfferUpdateReasonType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OFFER_DOES_NOT_EXIST': return RejectedPromoOfferUpdateReasonType.OFFER_DOES_NOT_EXIST;
        case r'OFFER_DUPLICATION': return RejectedPromoOfferUpdateReasonType.OFFER_DUPLICATION;
        case r'OFFER_NOT_ELIGIBLE_FOR_PROMO': return RejectedPromoOfferUpdateReasonType.OFFER_NOT_ELIGIBLE_FOR_PROMO;
        case r'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED': return RejectedPromoOfferUpdateReasonType.OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED;
        case r'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED': return RejectedPromoOfferUpdateReasonType.DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED;
        case r'EMPTY_OLD_PRICE': return RejectedPromoOfferUpdateReasonType.EMPTY_OLD_PRICE;
        case r'EMPTY_PROMO_PRICE': return RejectedPromoOfferUpdateReasonType.EMPTY_PROMO_PRICE;
        case r'MAX_PROMO_PRICE_EXCEEDED': return RejectedPromoOfferUpdateReasonType.MAX_PROMO_PRICE_EXCEEDED;
        case r'PROMO_PRICE_BIGGER_THAN_MAX': return RejectedPromoOfferUpdateReasonType.PROMO_PRICE_BIGGER_THAN_MAX;
        case r'PROMO_PRICE_SMALLER_THAN_MIN': return RejectedPromoOfferUpdateReasonType.PROMO_PRICE_SMALLER_THAN_MIN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RejectedPromoOfferUpdateReasonTypeTypeTransformer] instance.
  static RejectedPromoOfferUpdateReasonTypeTypeTransformer? _instance;
}

