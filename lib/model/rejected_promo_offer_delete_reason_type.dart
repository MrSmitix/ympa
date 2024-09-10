//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
class RejectedPromoOfferDeleteReasonType {
  /// Instantiate a new enum with the provided [value].
  const RejectedPromoOfferDeleteReasonType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OFFER_DOES_NOT_EXIST = RejectedPromoOfferDeleteReasonType._(r'OFFER_DOES_NOT_EXIST');

  /// List of all possible values in this [enum][RejectedPromoOfferDeleteReasonType].
  static const values = <RejectedPromoOfferDeleteReasonType>[
    OFFER_DOES_NOT_EXIST,
  ];

  static RejectedPromoOfferDeleteReasonType? fromJson(dynamic value) => RejectedPromoOfferDeleteReasonTypeTypeTransformer().decode(value);

  static List<RejectedPromoOfferDeleteReasonType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RejectedPromoOfferDeleteReasonType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RejectedPromoOfferDeleteReasonType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RejectedPromoOfferDeleteReasonType] to String,
/// and [decode] dynamic data back to [RejectedPromoOfferDeleteReasonType].
class RejectedPromoOfferDeleteReasonTypeTypeTransformer {
  factory RejectedPromoOfferDeleteReasonTypeTypeTransformer() => _instance ??= const RejectedPromoOfferDeleteReasonTypeTypeTransformer._();

  const RejectedPromoOfferDeleteReasonTypeTypeTransformer._();

  String encode(RejectedPromoOfferDeleteReasonType data) => data.value;

  /// Decodes a [dynamic value][data] to a RejectedPromoOfferDeleteReasonType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RejectedPromoOfferDeleteReasonType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OFFER_DOES_NOT_EXIST': return RejectedPromoOfferDeleteReasonType.OFFER_DOES_NOT_EXIST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RejectedPromoOfferDeleteReasonTypeTypeTransformer] instance.
  static RejectedPromoOfferDeleteReasonTypeTypeTransformer? _instance;
}

