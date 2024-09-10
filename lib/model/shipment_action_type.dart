//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. 
class ShipmentActionType {
  /// Instantiate a new enum with the provided [value].
  const ShipmentActionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CONFIRM = ShipmentActionType._(r'CONFIRM');
  static const DOWNLOAD_ACT = ShipmentActionType._(r'DOWNLOAD_ACT');
  static const DOWNLOAD_INBOUND_ACT = ShipmentActionType._(r'DOWNLOAD_INBOUND_ACT');
  static const DOWNLOAD_DISCREPANCY_ACT = ShipmentActionType._(r'DOWNLOAD_DISCREPANCY_ACT');
  static const CHANGE_PALLETS_COUNT = ShipmentActionType._(r'CHANGE_PALLETS_COUNT');

  /// List of all possible values in this [enum][ShipmentActionType].
  static const values = <ShipmentActionType>[
    CONFIRM,
    DOWNLOAD_ACT,
    DOWNLOAD_INBOUND_ACT,
    DOWNLOAD_DISCREPANCY_ACT,
    CHANGE_PALLETS_COUNT,
  ];

  static ShipmentActionType? fromJson(dynamic value) => ShipmentActionTypeTypeTransformer().decode(value);

  static List<ShipmentActionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentActionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentActionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ShipmentActionType] to String,
/// and [decode] dynamic data back to [ShipmentActionType].
class ShipmentActionTypeTypeTransformer {
  factory ShipmentActionTypeTypeTransformer() => _instance ??= const ShipmentActionTypeTypeTransformer._();

  const ShipmentActionTypeTypeTransformer._();

  String encode(ShipmentActionType data) => data.value;

  /// Decodes a [dynamic value][data] to a ShipmentActionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ShipmentActionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CONFIRM': return ShipmentActionType.CONFIRM;
        case r'DOWNLOAD_ACT': return ShipmentActionType.DOWNLOAD_ACT;
        case r'DOWNLOAD_INBOUND_ACT': return ShipmentActionType.DOWNLOAD_INBOUND_ACT;
        case r'DOWNLOAD_DISCREPANCY_ACT': return ShipmentActionType.DOWNLOAD_DISCREPANCY_ACT;
        case r'CHANGE_PALLETS_COUNT': return ShipmentActionType.CHANGE_PALLETS_COUNT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ShipmentActionTypeTypeTransformer] instance.
  static ShipmentActionTypeTypeTransformer? _instance;
}

