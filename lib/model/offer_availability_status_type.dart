//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Планы по поставкам:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`. 
class OfferAvailabilityStatusType {
  /// Instantiate a new enum with the provided [value].
  const OfferAvailabilityStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = OfferAvailabilityStatusType._(r'ACTIVE');
  static const INACTIVE = OfferAvailabilityStatusType._(r'INACTIVE');
  static const DELISTED = OfferAvailabilityStatusType._(r'DELISTED');

  /// List of all possible values in this [enum][OfferAvailabilityStatusType].
  static const values = <OfferAvailabilityStatusType>[
    ACTIVE,
    INACTIVE,
    DELISTED,
  ];

  static OfferAvailabilityStatusType? fromJson(dynamic value) => OfferAvailabilityStatusTypeTypeTransformer().decode(value);

  static List<OfferAvailabilityStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferAvailabilityStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferAvailabilityStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferAvailabilityStatusType] to String,
/// and [decode] dynamic data back to [OfferAvailabilityStatusType].
class OfferAvailabilityStatusTypeTypeTransformer {
  factory OfferAvailabilityStatusTypeTypeTransformer() => _instance ??= const OfferAvailabilityStatusTypeTypeTransformer._();

  const OfferAvailabilityStatusTypeTypeTransformer._();

  String encode(OfferAvailabilityStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferAvailabilityStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferAvailabilityStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return OfferAvailabilityStatusType.ACTIVE;
        case r'INACTIVE': return OfferAvailabilityStatusType.INACTIVE;
        case r'DELISTED': return OfferAvailabilityStatusType.DELISTED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferAvailabilityStatusTypeTypeTransformer] instance.
  static OfferAvailabilityStatusTypeTypeTransformer? _instance;
}

