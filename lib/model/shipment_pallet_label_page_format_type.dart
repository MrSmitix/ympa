//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
class ShipmentPalletLabelPageFormatType {
  /// Instantiate a new enum with the provided [value].
  const ShipmentPalletLabelPageFormatType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const a4 = ShipmentPalletLabelPageFormatType._(r'A4');
  static const a8 = ShipmentPalletLabelPageFormatType._(r'A8');

  /// List of all possible values in this [enum][ShipmentPalletLabelPageFormatType].
  static const values = <ShipmentPalletLabelPageFormatType>[
    a4,
    a8,
  ];

  static ShipmentPalletLabelPageFormatType? fromJson(dynamic value) => ShipmentPalletLabelPageFormatTypeTypeTransformer().decode(value);

  static List<ShipmentPalletLabelPageFormatType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentPalletLabelPageFormatType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentPalletLabelPageFormatType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ShipmentPalletLabelPageFormatType] to String,
/// and [decode] dynamic data back to [ShipmentPalletLabelPageFormatType].
class ShipmentPalletLabelPageFormatTypeTypeTransformer {
  factory ShipmentPalletLabelPageFormatTypeTypeTransformer() => _instance ??= const ShipmentPalletLabelPageFormatTypeTypeTransformer._();

  const ShipmentPalletLabelPageFormatTypeTypeTransformer._();

  String encode(ShipmentPalletLabelPageFormatType data) => data.value;

  /// Decodes a [dynamic value][data] to a ShipmentPalletLabelPageFormatType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ShipmentPalletLabelPageFormatType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'A4': return ShipmentPalletLabelPageFormatType.a4;
        case r'A8': return ShipmentPalletLabelPageFormatType.a8;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ShipmentPalletLabelPageFormatTypeTypeTransformer] instance.
  static ShipmentPalletLabelPageFormatTypeTypeTransformer? _instance;
}

