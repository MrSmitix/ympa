//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Размещение ярлыков на странице: * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
class PageFormatType {
  /// Instantiate a new enum with the provided [value].
  const PageFormatType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const a7 = PageFormatType._(r'A7');
  static const a4 = PageFormatType._(r'A4');

  /// List of all possible values in this [enum][PageFormatType].
  static const values = <PageFormatType>[
    a7,
    a4,
  ];

  static PageFormatType? fromJson(dynamic value) => PageFormatTypeTypeTransformer().decode(value);

  static List<PageFormatType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PageFormatType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PageFormatType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PageFormatType] to String,
/// and [decode] dynamic data back to [PageFormatType].
class PageFormatTypeTypeTransformer {
  factory PageFormatTypeTypeTransformer() => _instance ??= const PageFormatTypeTypeTransformer._();

  const PageFormatTypeTypeTransformer._();

  String encode(PageFormatType data) => data.value;

  /// Decodes a [dynamic value][data] to a PageFormatType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PageFormatType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'A7': return PageFormatType.a7;
        case r'A4': return PageFormatType.a4;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PageFormatTypeTypeTransformer] instance.
  static PageFormatTypeTypeTransformer? _instance;
}

