//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
class FeedbackCommentAuthorType {
  /// Instantiate a new enum with the provided [value].
  const FeedbackCommentAuthorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const USER = FeedbackCommentAuthorType._(r'USER');
  static const SHOP = FeedbackCommentAuthorType._(r'SHOP');

  /// List of all possible values in this [enum][FeedbackCommentAuthorType].
  static const values = <FeedbackCommentAuthorType>[
    USER,
    SHOP,
  ];

  static FeedbackCommentAuthorType? fromJson(dynamic value) => FeedbackCommentAuthorTypeTypeTransformer().decode(value);

  static List<FeedbackCommentAuthorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackCommentAuthorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackCommentAuthorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedbackCommentAuthorType] to String,
/// and [decode] dynamic data back to [FeedbackCommentAuthorType].
class FeedbackCommentAuthorTypeTypeTransformer {
  factory FeedbackCommentAuthorTypeTypeTransformer() => _instance ??= const FeedbackCommentAuthorTypeTypeTransformer._();

  const FeedbackCommentAuthorTypeTypeTransformer._();

  String encode(FeedbackCommentAuthorType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedbackCommentAuthorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedbackCommentAuthorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'USER': return FeedbackCommentAuthorType.USER;
        case r'SHOP': return FeedbackCommentAuthorType.SHOP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedbackCommentAuthorTypeTypeTransformer] instance.
  static FeedbackCommentAuthorTypeTypeTransformer? _instance;
}

