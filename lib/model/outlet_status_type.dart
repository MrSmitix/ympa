//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
class OutletStatusType {
  /// Instantiate a new enum with the provided [value].
  const OutletStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AT_MODERATION = OutletStatusType._(r'AT_MODERATION');
  static const FAILED = OutletStatusType._(r'FAILED');
  static const MODERATED = OutletStatusType._(r'MODERATED');
  static const NONMODERATED = OutletStatusType._(r'NONMODERATED');
  static const UNKNOWN = OutletStatusType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OutletStatusType].
  static const values = <OutletStatusType>[
    AT_MODERATION,
    FAILED,
    MODERATED,
    NONMODERATED,
    UNKNOWN,
  ];

  static OutletStatusType? fromJson(dynamic value) => OutletStatusTypeTypeTransformer().decode(value);

  static List<OutletStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OutletStatusType] to String,
/// and [decode] dynamic data back to [OutletStatusType].
class OutletStatusTypeTypeTransformer {
  factory OutletStatusTypeTypeTransformer() => _instance ??= const OutletStatusTypeTypeTransformer._();

  const OutletStatusTypeTypeTransformer._();

  String encode(OutletStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OutletStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OutletStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AT_MODERATION': return OutletStatusType.AT_MODERATION;
        case r'FAILED': return OutletStatusType.FAILED;
        case r'MODERATED': return OutletStatusType.MODERATED;
        case r'NONMODERATED': return OutletStatusType.NONMODERATED;
        case r'UNKNOWN': return OutletStatusType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OutletStatusTypeTypeTransformer] instance.
  static OutletStatusTypeTypeTransformer? _instance;
}

