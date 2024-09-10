//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
class ShipmentType {
  /// Instantiate a new enum with the provided [value].
  const ShipmentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const IMPORT = ShipmentType._(r'IMPORT');
  static const WITHDRAW = ShipmentType._(r'WITHDRAW');

  /// List of all possible values in this [enum][ShipmentType].
  static const values = <ShipmentType>[
    IMPORT,
    WITHDRAW,
  ];

  static ShipmentType? fromJson(dynamic value) => ShipmentTypeTypeTransformer().decode(value);

  static List<ShipmentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ShipmentType] to String,
/// and [decode] dynamic data back to [ShipmentType].
class ShipmentTypeTypeTransformer {
  factory ShipmentTypeTypeTransformer() => _instance ??= const ShipmentTypeTypeTransformer._();

  const ShipmentTypeTypeTransformer._();

  String encode(ShipmentType data) => data.value;

  /// Decodes a [dynamic value][data] to a ShipmentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ShipmentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'IMPORT': return ShipmentType.IMPORT;
        case r'WITHDRAW': return ShipmentType.WITHDRAW;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ShipmentTypeTypeTransformer] instance.
  static ShipmentTypeTypeTransformer? _instance;
}

