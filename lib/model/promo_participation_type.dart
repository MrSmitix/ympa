//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
class PromoParticipationType {
  /// Instantiate a new enum with the provided [value].
  const PromoParticipationType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PARTICIPATING_NOW = PromoParticipationType._(r'PARTICIPATING_NOW');
  static const PARTICIPATED = PromoParticipationType._(r'PARTICIPATED');

  /// List of all possible values in this [enum][PromoParticipationType].
  static const values = <PromoParticipationType>[
    PARTICIPATING_NOW,
    PARTICIPATED,
  ];

  static PromoParticipationType? fromJson(dynamic value) => PromoParticipationTypeTypeTransformer().decode(value);

  static List<PromoParticipationType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoParticipationType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoParticipationType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromoParticipationType] to String,
/// and [decode] dynamic data back to [PromoParticipationType].
class PromoParticipationTypeTypeTransformer {
  factory PromoParticipationTypeTypeTransformer() => _instance ??= const PromoParticipationTypeTypeTransformer._();

  const PromoParticipationTypeTypeTransformer._();

  String encode(PromoParticipationType data) => data.value;

  /// Decodes a [dynamic value][data] to a PromoParticipationType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromoParticipationType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PARTICIPATING_NOW': return PromoParticipationType.PARTICIPATING_NOW;
        case r'PARTICIPATED': return PromoParticipationType.PARTICIPATED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PromoParticipationTypeTypeTransformer] instance.
  static PromoParticipationTypeTypeTransformer? _instance;
}

