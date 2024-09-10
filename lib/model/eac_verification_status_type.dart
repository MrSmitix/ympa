//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
class EacVerificationStatusType {
  /// Instantiate a new enum with the provided [value].
  const EacVerificationStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACCEPTED = EacVerificationStatusType._(r'ACCEPTED');
  static const REJECTED = EacVerificationStatusType._(r'REJECTED');
  static const NEED_UPDATE = EacVerificationStatusType._(r'NEED_UPDATE');

  /// List of all possible values in this [enum][EacVerificationStatusType].
  static const values = <EacVerificationStatusType>[
    ACCEPTED,
    REJECTED,
    NEED_UPDATE,
  ];

  static EacVerificationStatusType? fromJson(dynamic value) => EacVerificationStatusTypeTypeTransformer().decode(value);

  static List<EacVerificationStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EacVerificationStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EacVerificationStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [EacVerificationStatusType] to String,
/// and [decode] dynamic data back to [EacVerificationStatusType].
class EacVerificationStatusTypeTypeTransformer {
  factory EacVerificationStatusTypeTypeTransformer() => _instance ??= const EacVerificationStatusTypeTypeTransformer._();

  const EacVerificationStatusTypeTypeTransformer._();

  String encode(EacVerificationStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a EacVerificationStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EacVerificationStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACCEPTED': return EacVerificationStatusType.ACCEPTED;
        case r'REJECTED': return EacVerificationStatusType.REJECTED;
        case r'NEED_UPDATE': return EacVerificationStatusType.NEED_UPDATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [EacVerificationStatusTypeTypeTransformer] instance.
  static EacVerificationStatusTypeTypeTransformer? _instance;
}

