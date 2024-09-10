//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
class CategoryErrorType {
  /// Instantiate a new enum with the provided [value].
  const CategoryErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN_CATEGORY = CategoryErrorType._(r'UNKNOWN_CATEGORY');
  static const CATEGORY_IS_NOT_LEAF = CategoryErrorType._(r'CATEGORY_IS_NOT_LEAF');

  /// List of all possible values in this [enum][CategoryErrorType].
  static const values = <CategoryErrorType>[
    UNKNOWN_CATEGORY,
    CATEGORY_IS_NOT_LEAF,
  ];

  static CategoryErrorType? fromJson(dynamic value) => CategoryErrorTypeTypeTransformer().decode(value);

  static List<CategoryErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CategoryErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CategoryErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CategoryErrorType] to String,
/// and [decode] dynamic data back to [CategoryErrorType].
class CategoryErrorTypeTypeTransformer {
  factory CategoryErrorTypeTypeTransformer() => _instance ??= const CategoryErrorTypeTypeTransformer._();

  const CategoryErrorTypeTypeTransformer._();

  String encode(CategoryErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a CategoryErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CategoryErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN_CATEGORY': return CategoryErrorType.UNKNOWN_CATEGORY;
        case r'CATEGORY_IS_NOT_LEAF': return CategoryErrorType.CATEGORY_IS_NOT_LEAF;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CategoryErrorTypeTypeTransformer] instance.
  static CategoryErrorTypeTypeTransformer? _instance;
}

