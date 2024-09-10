//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
class FeedbackStateType {
  /// Instantiate a new enum with the provided [value].
  const FeedbackStateType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const LAST = FeedbackStateType._(r'LAST');
  static const PREVIOUS = FeedbackStateType._(r'PREVIOUS');
  static const DELETED = FeedbackStateType._(r'DELETED');

  /// List of all possible values in this [enum][FeedbackStateType].
  static const values = <FeedbackStateType>[
    LAST,
    PREVIOUS,
    DELETED,
  ];

  static FeedbackStateType? fromJson(dynamic value) => FeedbackStateTypeTypeTransformer().decode(value);

  static List<FeedbackStateType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackStateType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackStateType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedbackStateType] to String,
/// and [decode] dynamic data back to [FeedbackStateType].
class FeedbackStateTypeTypeTransformer {
  factory FeedbackStateTypeTypeTransformer() => _instance ??= const FeedbackStateTypeTypeTransformer._();

  const FeedbackStateTypeTypeTransformer._();

  String encode(FeedbackStateType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedbackStateType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedbackStateType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'LAST': return FeedbackStateType.LAST;
        case r'PREVIOUS': return FeedbackStateType.PREVIOUS;
        case r'DELETED': return FeedbackStateType.DELETED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedbackStateTypeTypeTransformer] instance.
  static FeedbackStateTypeTypeTransformer? _instance;
}

