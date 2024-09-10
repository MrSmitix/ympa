//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Логистический статус конкретного товара.
class ReturnInstanceStatusType {
  /// Instantiate a new enum with the provided [value].
  const ReturnInstanceStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATED = ReturnInstanceStatusType._(r'CREATED');
  static const RECEIVED = ReturnInstanceStatusType._(r'RECEIVED');
  static const IN_TRANSIT = ReturnInstanceStatusType._(r'IN_TRANSIT');
  static const READY_FOR_PICKUP = ReturnInstanceStatusType._(r'READY_FOR_PICKUP');
  static const PICKED = ReturnInstanceStatusType._(r'PICKED');
  static const RECEIVED_ON_FULFILLMENT = ReturnInstanceStatusType._(r'RECEIVED_ON_FULFILLMENT');
  static const CANCELLED = ReturnInstanceStatusType._(r'CANCELLED');
  static const LOST = ReturnInstanceStatusType._(r'LOST');
  static const UTILIZED = ReturnInstanceStatusType._(r'UTILIZED');
  static const PREPARED_FOR_UTILIZATION = ReturnInstanceStatusType._(r'PREPARED_FOR_UTILIZATION');
  static const EXPROPRIATED = ReturnInstanceStatusType._(r'EXPROPRIATED');
  static const NOT_IN_DEMAND = ReturnInstanceStatusType._(r'NOT_IN_DEMAND');

  /// List of all possible values in this [enum][ReturnInstanceStatusType].
  static const values = <ReturnInstanceStatusType>[
    CREATED,
    RECEIVED,
    IN_TRANSIT,
    READY_FOR_PICKUP,
    PICKED,
    RECEIVED_ON_FULFILLMENT,
    CANCELLED,
    LOST,
    UTILIZED,
    PREPARED_FOR_UTILIZATION,
    EXPROPRIATED,
    NOT_IN_DEMAND,
  ];

  static ReturnInstanceStatusType? fromJson(dynamic value) => ReturnInstanceStatusTypeTypeTransformer().decode(value);

  static List<ReturnInstanceStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnInstanceStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnInstanceStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnInstanceStatusType] to String,
/// and [decode] dynamic data back to [ReturnInstanceStatusType].
class ReturnInstanceStatusTypeTypeTransformer {
  factory ReturnInstanceStatusTypeTypeTransformer() => _instance ??= const ReturnInstanceStatusTypeTypeTransformer._();

  const ReturnInstanceStatusTypeTypeTransformer._();

  String encode(ReturnInstanceStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnInstanceStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnInstanceStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATED': return ReturnInstanceStatusType.CREATED;
        case r'RECEIVED': return ReturnInstanceStatusType.RECEIVED;
        case r'IN_TRANSIT': return ReturnInstanceStatusType.IN_TRANSIT;
        case r'READY_FOR_PICKUP': return ReturnInstanceStatusType.READY_FOR_PICKUP;
        case r'PICKED': return ReturnInstanceStatusType.PICKED;
        case r'RECEIVED_ON_FULFILLMENT': return ReturnInstanceStatusType.RECEIVED_ON_FULFILLMENT;
        case r'CANCELLED': return ReturnInstanceStatusType.CANCELLED;
        case r'LOST': return ReturnInstanceStatusType.LOST;
        case r'UTILIZED': return ReturnInstanceStatusType.UTILIZED;
        case r'PREPARED_FOR_UTILIZATION': return ReturnInstanceStatusType.PREPARED_FOR_UTILIZATION;
        case r'EXPROPRIATED': return ReturnInstanceStatusType.EXPROPRIATED;
        case r'NOT_IN_DEMAND': return ReturnInstanceStatusType.NOT_IN_DEMAND;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnInstanceStatusTypeTypeTransformer] instance.
  static ReturnInstanceStatusTypeTypeTransformer? _instance;
}

