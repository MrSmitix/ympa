//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
class ReturnType {
  /// Instantiate a new enum with the provided [value].
  const ReturnType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNREDEEMED = ReturnType._(r'UNREDEEMED');
  static const RETURN = ReturnType._(r'RETURN');

  /// List of all possible values in this [enum][ReturnType].
  static const values = <ReturnType>[
    UNREDEEMED,
    RETURN,
  ];

  static ReturnType? fromJson(dynamic value) => ReturnTypeTypeTransformer().decode(value);

  static List<ReturnType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnType] to String,
/// and [decode] dynamic data back to [ReturnType].
class ReturnTypeTypeTransformer {
  factory ReturnTypeTypeTransformer() => _instance ??= const ReturnTypeTypeTransformer._();

  const ReturnTypeTypeTransformer._();

  String encode(ReturnType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNREDEEMED': return ReturnType.UNREDEEMED;
        case r'RETURN': return ReturnType.RETURN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnTypeTypeTransformer] instance.
  static ReturnTypeTypeTransformer? _instance;
}

