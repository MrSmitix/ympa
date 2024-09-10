//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
class OutletType {
  /// Instantiate a new enum with the provided [value].
  const OutletType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DEPOT = OutletType._(r'DEPOT');
  static const MIXED = OutletType._(r'MIXED');
  static const RETAIL = OutletType._(r'RETAIL');
  static const NOT_DEFINED = OutletType._(r'NOT_DEFINED');

  /// List of all possible values in this [enum][OutletType].
  static const values = <OutletType>[
    DEPOT,
    MIXED,
    RETAIL,
    NOT_DEFINED,
  ];

  static OutletType? fromJson(dynamic value) => OutletTypeTypeTransformer().decode(value);

  static List<OutletType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OutletType] to String,
/// and [decode] dynamic data back to [OutletType].
class OutletTypeTypeTransformer {
  factory OutletTypeTypeTransformer() => _instance ??= const OutletTypeTypeTransformer._();

  const OutletTypeTypeTransformer._();

  String encode(OutletType data) => data.value;

  /// Decodes a [dynamic value][data] to a OutletType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OutletType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DEPOT': return OutletType.DEPOT;
        case r'MIXED': return OutletType.MIXED;
        case r'RETAIL': return OutletType.RETAIL;
        case r'NOT_DEFINED': return OutletType.NOT_DEFINED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OutletTypeTypeTransformer] instance.
  static OutletTypeTypeTransformer? _instance;
}

