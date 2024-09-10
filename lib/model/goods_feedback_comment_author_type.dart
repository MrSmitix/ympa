//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
class GoodsFeedbackCommentAuthorType {
  /// Instantiate a new enum with the provided [value].
  const GoodsFeedbackCommentAuthorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const USER = GoodsFeedbackCommentAuthorType._(r'USER');
  static const BUSINESS = GoodsFeedbackCommentAuthorType._(r'BUSINESS');

  /// List of all possible values in this [enum][GoodsFeedbackCommentAuthorType].
  static const values = <GoodsFeedbackCommentAuthorType>[
    USER,
    BUSINESS,
  ];

  static GoodsFeedbackCommentAuthorType? fromJson(dynamic value) => GoodsFeedbackCommentAuthorTypeTypeTransformer().decode(value);

  static List<GoodsFeedbackCommentAuthorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackCommentAuthorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackCommentAuthorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GoodsFeedbackCommentAuthorType] to String,
/// and [decode] dynamic data back to [GoodsFeedbackCommentAuthorType].
class GoodsFeedbackCommentAuthorTypeTypeTransformer {
  factory GoodsFeedbackCommentAuthorTypeTypeTransformer() => _instance ??= const GoodsFeedbackCommentAuthorTypeTypeTransformer._();

  const GoodsFeedbackCommentAuthorTypeTypeTransformer._();

  String encode(GoodsFeedbackCommentAuthorType data) => data.value;

  /// Decodes a [dynamic value][data] to a GoodsFeedbackCommentAuthorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GoodsFeedbackCommentAuthorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'USER': return GoodsFeedbackCommentAuthorType.USER;
        case r'BUSINESS': return GoodsFeedbackCommentAuthorType.BUSINESS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GoodsFeedbackCommentAuthorTypeTypeTransformer] instance.
  static GoodsFeedbackCommentAuthorTypeTypeTransformer? _instance;
}

