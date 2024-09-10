//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
class SortOrderType {
  /// Instantiate a new enum with the provided [value].
  const SortOrderType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ASC = SortOrderType._(r'ASC');
  static const DESC = SortOrderType._(r'DESC');

  /// List of all possible values in this [enum][SortOrderType].
  static const values = <SortOrderType>[
    ASC,
    DESC,
  ];

  static SortOrderType? fromJson(dynamic value) => SortOrderTypeTypeTransformer().decode(value);

  static List<SortOrderType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SortOrderType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SortOrderType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SortOrderType] to String,
/// and [decode] dynamic data back to [SortOrderType].
class SortOrderTypeTypeTransformer {
  factory SortOrderTypeTypeTransformer() => _instance ??= const SortOrderTypeTypeTransformer._();

  const SortOrderTypeTypeTransformer._();

  String encode(SortOrderType data) => data.value;

  /// Decodes a [dynamic value][data] to a SortOrderType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SortOrderType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ASC': return SortOrderType.ASC;
        case r'DESC': return SortOrderType.DESC;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [SortOrderTypeTypeTransformer] instance.
  static SortOrderTypeTypeTransformer? _instance;
}

