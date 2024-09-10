//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
class OrderStatusType {
  /// Instantiate a new enum with the provided [value].
  const OrderStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PLACING = OrderStatusType._(r'PLACING');
  static const RESERVED = OrderStatusType._(r'RESERVED');
  static const UNPAID = OrderStatusType._(r'UNPAID');
  static const PROCESSING = OrderStatusType._(r'PROCESSING');
  static const DELIVERY = OrderStatusType._(r'DELIVERY');
  static const PICKUP = OrderStatusType._(r'PICKUP');
  static const DELIVERED = OrderStatusType._(r'DELIVERED');
  static const CANCELLED = OrderStatusType._(r'CANCELLED');
  static const PENDING = OrderStatusType._(r'PENDING');
  static const PARTIALLY_RETURNED = OrderStatusType._(r'PARTIALLY_RETURNED');
  static const RETURNED = OrderStatusType._(r'RETURNED');
  static const UNKNOWN = OrderStatusType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderStatusType].
  static const values = <OrderStatusType>[
    PLACING,
    RESERVED,
    UNPAID,
    PROCESSING,
    DELIVERY,
    PICKUP,
    DELIVERED,
    CANCELLED,
    PENDING,
    PARTIALLY_RETURNED,
    RETURNED,
    UNKNOWN,
  ];

  static OrderStatusType? fromJson(dynamic value) => OrderStatusTypeTypeTransformer().decode(value);

  static List<OrderStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderStatusType] to String,
/// and [decode] dynamic data back to [OrderStatusType].
class OrderStatusTypeTypeTransformer {
  factory OrderStatusTypeTypeTransformer() => _instance ??= const OrderStatusTypeTypeTransformer._();

  const OrderStatusTypeTypeTransformer._();

  String encode(OrderStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PLACING': return OrderStatusType.PLACING;
        case r'RESERVED': return OrderStatusType.RESERVED;
        case r'UNPAID': return OrderStatusType.UNPAID;
        case r'PROCESSING': return OrderStatusType.PROCESSING;
        case r'DELIVERY': return OrderStatusType.DELIVERY;
        case r'PICKUP': return OrderStatusType.PICKUP;
        case r'DELIVERED': return OrderStatusType.DELIVERED;
        case r'CANCELLED': return OrderStatusType.CANCELLED;
        case r'PENDING': return OrderStatusType.PENDING;
        case r'PARTIALLY_RETURNED': return OrderStatusType.PARTIALLY_RETURNED;
        case r'RETURNED': return OrderStatusType.RETURNED;
        case r'UNKNOWN': return OrderStatusType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderStatusTypeTypeTransformer] instance.
  static OrderStatusTypeTypeTransformer? _instance;
}

