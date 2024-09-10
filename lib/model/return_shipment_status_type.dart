//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
class ReturnShipmentStatusType {
  /// Instantiate a new enum with the provided [value].
  const ReturnShipmentStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATED = ReturnShipmentStatusType._(r'CREATED');
  static const RECEIVED = ReturnShipmentStatusType._(r'RECEIVED');
  static const IN_TRANSIT = ReturnShipmentStatusType._(r'IN_TRANSIT');
  static const READY_FOR_PICKUP = ReturnShipmentStatusType._(r'READY_FOR_PICKUP');
  static const PICKED = ReturnShipmentStatusType._(r'PICKED');
  static const LOST = ReturnShipmentStatusType._(r'LOST');
  static const EXPIRED = ReturnShipmentStatusType._(r'EXPIRED');
  static const CANCELLED = ReturnShipmentStatusType._(r'CANCELLED');
  static const FULFILMENT_RECEIVED = ReturnShipmentStatusType._(r'FULFILMENT_RECEIVED');
  static const PREPARED_FOR_UTILIZATION = ReturnShipmentStatusType._(r'PREPARED_FOR_UTILIZATION');
  static const NOT_IN_DEMAND = ReturnShipmentStatusType._(r'NOT_IN_DEMAND');
  static const UTILIZED = ReturnShipmentStatusType._(r'UTILIZED');
  static const READY_FOR_EXPROPRIATION = ReturnShipmentStatusType._(r'READY_FOR_EXPROPRIATION');
  static const RECEIVED_FOR_EXPROPRIATION = ReturnShipmentStatusType._(r'RECEIVED_FOR_EXPROPRIATION');

  /// List of all possible values in this [enum][ReturnShipmentStatusType].
  static const values = <ReturnShipmentStatusType>[
    CREATED,
    RECEIVED,
    IN_TRANSIT,
    READY_FOR_PICKUP,
    PICKED,
    LOST,
    EXPIRED,
    CANCELLED,
    FULFILMENT_RECEIVED,
    PREPARED_FOR_UTILIZATION,
    NOT_IN_DEMAND,
    UTILIZED,
    READY_FOR_EXPROPRIATION,
    RECEIVED_FOR_EXPROPRIATION,
  ];

  static ReturnShipmentStatusType? fromJson(dynamic value) => ReturnShipmentStatusTypeTypeTransformer().decode(value);

  static List<ReturnShipmentStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnShipmentStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnShipmentStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnShipmentStatusType] to String,
/// and [decode] dynamic data back to [ReturnShipmentStatusType].
class ReturnShipmentStatusTypeTypeTransformer {
  factory ReturnShipmentStatusTypeTypeTransformer() => _instance ??= const ReturnShipmentStatusTypeTypeTransformer._();

  const ReturnShipmentStatusTypeTypeTransformer._();

  String encode(ReturnShipmentStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnShipmentStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnShipmentStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATED': return ReturnShipmentStatusType.CREATED;
        case r'RECEIVED': return ReturnShipmentStatusType.RECEIVED;
        case r'IN_TRANSIT': return ReturnShipmentStatusType.IN_TRANSIT;
        case r'READY_FOR_PICKUP': return ReturnShipmentStatusType.READY_FOR_PICKUP;
        case r'PICKED': return ReturnShipmentStatusType.PICKED;
        case r'LOST': return ReturnShipmentStatusType.LOST;
        case r'EXPIRED': return ReturnShipmentStatusType.EXPIRED;
        case r'CANCELLED': return ReturnShipmentStatusType.CANCELLED;
        case r'FULFILMENT_RECEIVED': return ReturnShipmentStatusType.FULFILMENT_RECEIVED;
        case r'PREPARED_FOR_UTILIZATION': return ReturnShipmentStatusType.PREPARED_FOR_UTILIZATION;
        case r'NOT_IN_DEMAND': return ReturnShipmentStatusType.NOT_IN_DEMAND;
        case r'UTILIZED': return ReturnShipmentStatusType.UTILIZED;
        case r'READY_FOR_EXPROPRIATION': return ReturnShipmentStatusType.READY_FOR_EXPROPRIATION;
        case r'RECEIVED_FOR_EXPROPRIATION': return ReturnShipmentStatusType.RECEIVED_FOR_EXPROPRIATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnShipmentStatusTypeTypeTransformer] instance.
  static ReturnShipmentStatusTypeTypeTransformer? _instance;
}

