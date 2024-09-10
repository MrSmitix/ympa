//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
class OfferSellingProgramStatusType {
  /// Instantiate a new enum with the provided [value].
  const OfferSellingProgramStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FINE = OfferSellingProgramStatusType._(r'FINE');
  static const REJECT = OfferSellingProgramStatusType._(r'REJECT');

  /// List of all possible values in this [enum][OfferSellingProgramStatusType].
  static const values = <OfferSellingProgramStatusType>[
    FINE,
    REJECT,
  ];

  static OfferSellingProgramStatusType? fromJson(dynamic value) => OfferSellingProgramStatusTypeTypeTransformer().decode(value);

  static List<OfferSellingProgramStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferSellingProgramStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferSellingProgramStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferSellingProgramStatusType] to String,
/// and [decode] dynamic data back to [OfferSellingProgramStatusType].
class OfferSellingProgramStatusTypeTypeTransformer {
  factory OfferSellingProgramStatusTypeTypeTransformer() => _instance ??= const OfferSellingProgramStatusTypeTypeTransformer._();

  const OfferSellingProgramStatusTypeTypeTransformer._();

  String encode(OfferSellingProgramStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferSellingProgramStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferSellingProgramStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FINE': return OfferSellingProgramStatusType.FINE;
        case r'REJECT': return OfferSellingProgramStatusType.REJECT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferSellingProgramStatusTypeTypeTransformer] instance.
  static OfferSellingProgramStatusTypeTypeTransformer? _instance;
}

