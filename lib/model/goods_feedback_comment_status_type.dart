//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
class GoodsFeedbackCommentStatusType {
  /// Instantiate a new enum with the provided [value].
  const GoodsFeedbackCommentStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PUBLISHED = GoodsFeedbackCommentStatusType._(r'PUBLISHED');
  static const UNMODERATED = GoodsFeedbackCommentStatusType._(r'UNMODERATED');
  static const BANNED = GoodsFeedbackCommentStatusType._(r'BANNED');
  static const DELETED = GoodsFeedbackCommentStatusType._(r'DELETED');

  /// List of all possible values in this [enum][GoodsFeedbackCommentStatusType].
  static const values = <GoodsFeedbackCommentStatusType>[
    PUBLISHED,
    UNMODERATED,
    BANNED,
    DELETED,
  ];

  static GoodsFeedbackCommentStatusType? fromJson(dynamic value) => GoodsFeedbackCommentStatusTypeTypeTransformer().decode(value);

  static List<GoodsFeedbackCommentStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackCommentStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackCommentStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GoodsFeedbackCommentStatusType] to String,
/// and [decode] dynamic data back to [GoodsFeedbackCommentStatusType].
class GoodsFeedbackCommentStatusTypeTypeTransformer {
  factory GoodsFeedbackCommentStatusTypeTypeTransformer() => _instance ??= const GoodsFeedbackCommentStatusTypeTypeTransformer._();

  const GoodsFeedbackCommentStatusTypeTypeTransformer._();

  String encode(GoodsFeedbackCommentStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a GoodsFeedbackCommentStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GoodsFeedbackCommentStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PUBLISHED': return GoodsFeedbackCommentStatusType.PUBLISHED;
        case r'UNMODERATED': return GoodsFeedbackCommentStatusType.UNMODERATED;
        case r'BANNED': return GoodsFeedbackCommentStatusType.BANNED;
        case r'DELETED': return GoodsFeedbackCommentStatusType.DELETED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GoodsFeedbackCommentStatusTypeTypeTransformer] instance.
  static GoodsFeedbackCommentStatusTypeTypeTransformer? _instance;
}

