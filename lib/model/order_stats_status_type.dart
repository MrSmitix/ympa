//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
class OrderStatsStatusType {
  /// Instantiate a new enum with the provided [value].
  const OrderStatsStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CANCELLED_BEFORE_PROCESSING = OrderStatsStatusType._(r'CANCELLED_BEFORE_PROCESSING');
  static const CANCELLED_IN_DELIVERY = OrderStatsStatusType._(r'CANCELLED_IN_DELIVERY');
  static const CANCELLED_IN_PROCESSING = OrderStatsStatusType._(r'CANCELLED_IN_PROCESSING');
  static const DELIVERY = OrderStatsStatusType._(r'DELIVERY');
  static const DELIVERED = OrderStatsStatusType._(r'DELIVERED');
  static const PARTIALLY_DELIVERED = OrderStatsStatusType._(r'PARTIALLY_DELIVERED');
  static const PARTIALLY_RETURNED = OrderStatsStatusType._(r'PARTIALLY_RETURNED');
  static const PENDING = OrderStatsStatusType._(r'PENDING');
  static const PICKUP = OrderStatsStatusType._(r'PICKUP');
  static const PROCESSING = OrderStatsStatusType._(r'PROCESSING');
  static const RESERVED = OrderStatsStatusType._(r'RESERVED');
  static const RETURNED = OrderStatsStatusType._(r'RETURNED');
  static const UNKNOWN = OrderStatsStatusType._(r'UNKNOWN');
  static const UNPAID = OrderStatsStatusType._(r'UNPAID');
  static const LOST = OrderStatsStatusType._(r'LOST');

  /// List of all possible values in this [enum][OrderStatsStatusType].
  static const values = <OrderStatsStatusType>[
    CANCELLED_BEFORE_PROCESSING,
    CANCELLED_IN_DELIVERY,
    CANCELLED_IN_PROCESSING,
    DELIVERY,
    DELIVERED,
    PARTIALLY_DELIVERED,
    PARTIALLY_RETURNED,
    PENDING,
    PICKUP,
    PROCESSING,
    RESERVED,
    RETURNED,
    UNKNOWN,
    UNPAID,
    LOST,
  ];

  static OrderStatsStatusType? fromJson(dynamic value) => OrderStatsStatusTypeTypeTransformer().decode(value);

  static List<OrderStatsStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderStatsStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderStatsStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderStatsStatusType] to String,
/// and [decode] dynamic data back to [OrderStatsStatusType].
class OrderStatsStatusTypeTypeTransformer {
  factory OrderStatsStatusTypeTypeTransformer() => _instance ??= const OrderStatsStatusTypeTypeTransformer._();

  const OrderStatsStatusTypeTypeTransformer._();

  String encode(OrderStatsStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderStatsStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderStatsStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CANCELLED_BEFORE_PROCESSING': return OrderStatsStatusType.CANCELLED_BEFORE_PROCESSING;
        case r'CANCELLED_IN_DELIVERY': return OrderStatsStatusType.CANCELLED_IN_DELIVERY;
        case r'CANCELLED_IN_PROCESSING': return OrderStatsStatusType.CANCELLED_IN_PROCESSING;
        case r'DELIVERY': return OrderStatsStatusType.DELIVERY;
        case r'DELIVERED': return OrderStatsStatusType.DELIVERED;
        case r'PARTIALLY_DELIVERED': return OrderStatsStatusType.PARTIALLY_DELIVERED;
        case r'PARTIALLY_RETURNED': return OrderStatsStatusType.PARTIALLY_RETURNED;
        case r'PENDING': return OrderStatsStatusType.PENDING;
        case r'PICKUP': return OrderStatsStatusType.PICKUP;
        case r'PROCESSING': return OrderStatsStatusType.PROCESSING;
        case r'RESERVED': return OrderStatsStatusType.RESERVED;
        case r'RETURNED': return OrderStatsStatusType.RETURNED;
        case r'UNKNOWN': return OrderStatsStatusType.UNKNOWN;
        case r'UNPAID': return OrderStatsStatusType.UNPAID;
        case r'LOST': return OrderStatsStatusType.LOST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderStatsStatusTypeTypeTransformer] instance.
  static OrderStatsStatusTypeTypeTransformer? _instance;
}

