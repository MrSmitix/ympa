//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
class FeedbackDeliveryType {
  /// Instantiate a new enum with the provided [value].
  const FeedbackDeliveryType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DELIVERY = FeedbackDeliveryType._(r'DELIVERY');
  static const PICKUP = FeedbackDeliveryType._(r'PICKUP');
  static const INSTORE = FeedbackDeliveryType._(r'INSTORE');

  /// List of all possible values in this [enum][FeedbackDeliveryType].
  static const values = <FeedbackDeliveryType>[
    DELIVERY,
    PICKUP,
    INSTORE,
  ];

  static FeedbackDeliveryType? fromJson(dynamic value) => FeedbackDeliveryTypeTypeTransformer().decode(value);

  static List<FeedbackDeliveryType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackDeliveryType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackDeliveryType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedbackDeliveryType] to String,
/// and [decode] dynamic data back to [FeedbackDeliveryType].
class FeedbackDeliveryTypeTypeTransformer {
  factory FeedbackDeliveryTypeTypeTransformer() => _instance ??= const FeedbackDeliveryTypeTypeTransformer._();

  const FeedbackDeliveryTypeTypeTransformer._();

  String encode(FeedbackDeliveryType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedbackDeliveryType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedbackDeliveryType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DELIVERY': return FeedbackDeliveryType.DELIVERY;
        case r'PICKUP': return FeedbackDeliveryType.PICKUP;
        case r'INSTORE': return FeedbackDeliveryType.INSTORE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedbackDeliveryTypeTypeTransformer] instance.
  static FeedbackDeliveryTypeTypeTransformer? _instance;
}

