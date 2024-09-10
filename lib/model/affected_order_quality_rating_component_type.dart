//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
class AffectedOrderQualityRatingComponentType {
  /// Instantiate a new enum with the provided [value].
  const AffectedOrderQualityRatingComponentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DBS_CANCELLATION_RATE = AffectedOrderQualityRatingComponentType._(r'DBS_CANCELLATION_RATE');
  static const DBS_LATE_DELIVERY_RATE = AffectedOrderQualityRatingComponentType._(r'DBS_LATE_DELIVERY_RATE');
  static const FBS_CANCELLATION_RATE = AffectedOrderQualityRatingComponentType._(r'FBS_CANCELLATION_RATE');
  static const FBS_LATE_SHIP_RATE = AffectedOrderQualityRatingComponentType._(r'FBS_LATE_SHIP_RATE');

  /// List of all possible values in this [enum][AffectedOrderQualityRatingComponentType].
  static const values = <AffectedOrderQualityRatingComponentType>[
    DBS_CANCELLATION_RATE,
    DBS_LATE_DELIVERY_RATE,
    FBS_CANCELLATION_RATE,
    FBS_LATE_SHIP_RATE,
  ];

  static AffectedOrderQualityRatingComponentType? fromJson(dynamic value) => AffectedOrderQualityRatingComponentTypeTypeTransformer().decode(value);

  static List<AffectedOrderQualityRatingComponentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AffectedOrderQualityRatingComponentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AffectedOrderQualityRatingComponentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AffectedOrderQualityRatingComponentType] to String,
/// and [decode] dynamic data back to [AffectedOrderQualityRatingComponentType].
class AffectedOrderQualityRatingComponentTypeTypeTransformer {
  factory AffectedOrderQualityRatingComponentTypeTypeTransformer() => _instance ??= const AffectedOrderQualityRatingComponentTypeTypeTransformer._();

  const AffectedOrderQualityRatingComponentTypeTypeTransformer._();

  String encode(AffectedOrderQualityRatingComponentType data) => data.value;

  /// Decodes a [dynamic value][data] to a AffectedOrderQualityRatingComponentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AffectedOrderQualityRatingComponentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DBS_CANCELLATION_RATE': return AffectedOrderQualityRatingComponentType.DBS_CANCELLATION_RATE;
        case r'DBS_LATE_DELIVERY_RATE': return AffectedOrderQualityRatingComponentType.DBS_LATE_DELIVERY_RATE;
        case r'FBS_CANCELLATION_RATE': return AffectedOrderQualityRatingComponentType.FBS_CANCELLATION_RATE;
        case r'FBS_LATE_SHIP_RATE': return AffectedOrderQualityRatingComponentType.FBS_LATE_SHIP_RATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AffectedOrderQualityRatingComponentTypeTypeTransformer] instance.
  static AffectedOrderQualityRatingComponentTypeTypeTransformer? _instance;
}

