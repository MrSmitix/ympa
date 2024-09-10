//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
class ShowsSalesGroupingType {
  /// Instantiate a new enum with the provided [value].
  const ShowsSalesGroupingType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CATEGORIES = ShowsSalesGroupingType._(r'CATEGORIES');
  static const OFFERS = ShowsSalesGroupingType._(r'OFFERS');

  /// List of all possible values in this [enum][ShowsSalesGroupingType].
  static const values = <ShowsSalesGroupingType>[
    CATEGORIES,
    OFFERS,
  ];

  static ShowsSalesGroupingType? fromJson(dynamic value) => ShowsSalesGroupingTypeTypeTransformer().decode(value);

  static List<ShowsSalesGroupingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShowsSalesGroupingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShowsSalesGroupingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ShowsSalesGroupingType] to String,
/// and [decode] dynamic data back to [ShowsSalesGroupingType].
class ShowsSalesGroupingTypeTypeTransformer {
  factory ShowsSalesGroupingTypeTypeTransformer() => _instance ??= const ShowsSalesGroupingTypeTypeTransformer._();

  const ShowsSalesGroupingTypeTypeTransformer._();

  String encode(ShowsSalesGroupingType data) => data.value;

  /// Decodes a [dynamic value][data] to a ShowsSalesGroupingType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ShowsSalesGroupingType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CATEGORIES': return ShowsSalesGroupingType.CATEGORIES;
        case r'OFFERS': return ShowsSalesGroupingType.OFFERS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ShowsSalesGroupingTypeTypeTransformer] instance.
  static ShowsSalesGroupingTypeTypeTransformer? _instance;
}

