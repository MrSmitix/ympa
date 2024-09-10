//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
class OrderDocumentStatusType {
  /// Instantiate a new enum with the provided [value].
  const OrderDocumentStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const READY = OrderDocumentStatusType._(r'READY');
  static const NOT_READY = OrderDocumentStatusType._(r'NOT_READY');

  /// List of all possible values in this [enum][OrderDocumentStatusType].
  static const values = <OrderDocumentStatusType>[
    READY,
    NOT_READY,
  ];

  static OrderDocumentStatusType? fromJson(dynamic value) => OrderDocumentStatusTypeTypeTransformer().decode(value);

  static List<OrderDocumentStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDocumentStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDocumentStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderDocumentStatusType] to String,
/// and [decode] dynamic data back to [OrderDocumentStatusType].
class OrderDocumentStatusTypeTypeTransformer {
  factory OrderDocumentStatusTypeTypeTransformer() => _instance ??= const OrderDocumentStatusTypeTypeTransformer._();

  const OrderDocumentStatusTypeTypeTransformer._();

  String encode(OrderDocumentStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderDocumentStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderDocumentStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'READY': return OrderDocumentStatusType.READY;
        case r'NOT_READY': return OrderDocumentStatusType.NOT_READY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderDocumentStatusTypeTypeTransformer] instance.
  static OrderDocumentStatusTypeTypeTransformer? _instance;
}

