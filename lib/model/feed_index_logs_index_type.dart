//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
class FeedIndexLogsIndexType {
  /// Instantiate a new enum with the provided [value].
  const FeedIndexLogsIndexType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DIFF = FeedIndexLogsIndexType._(r'DIFF');
  static const FAST_PRICE = FeedIndexLogsIndexType._(r'FAST_PRICE');
  static const FULL = FeedIndexLogsIndexType._(r'FULL');

  /// List of all possible values in this [enum][FeedIndexLogsIndexType].
  static const values = <FeedIndexLogsIndexType>[
    DIFF,
    FAST_PRICE,
    FULL,
  ];

  static FeedIndexLogsIndexType? fromJson(dynamic value) => FeedIndexLogsIndexTypeTypeTransformer().decode(value);

  static List<FeedIndexLogsIndexType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedIndexLogsIndexType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedIndexLogsIndexType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedIndexLogsIndexType] to String,
/// and [decode] dynamic data back to [FeedIndexLogsIndexType].
class FeedIndexLogsIndexTypeTypeTransformer {
  factory FeedIndexLogsIndexTypeTypeTransformer() => _instance ??= const FeedIndexLogsIndexTypeTypeTransformer._();

  const FeedIndexLogsIndexTypeTypeTransformer._();

  String encode(FeedIndexLogsIndexType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedIndexLogsIndexType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedIndexLogsIndexType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DIFF': return FeedIndexLogsIndexType.DIFF;
        case r'FAST_PRICE': return FeedIndexLogsIndexType.FAST_PRICE;
        case r'FULL': return FeedIndexLogsIndexType.FULL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedIndexLogsIndexTypeTypeTransformer] instance.
  static FeedIndexLogsIndexTypeTypeTransformer? _instance;
}

