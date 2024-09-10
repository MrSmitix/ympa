//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки. 
class ShipmentStatusType {
  /// Instantiate a new enum with the provided [value].
  const ShipmentStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OUTBOUND_CREATED = ShipmentStatusType._(r'OUTBOUND_CREATED');
  static const OUTBOUND_READY_FOR_CONFIRMATION = ShipmentStatusType._(r'OUTBOUND_READY_FOR_CONFIRMATION');
  static const OUTBOUND_CONFIRMED = ShipmentStatusType._(r'OUTBOUND_CONFIRMED');
  static const OUTBOUND_SIGNED = ShipmentStatusType._(r'OUTBOUND_SIGNED');
  static const FINISHED = ShipmentStatusType._(r'FINISHED');
  static const ACCEPTED = ShipmentStatusType._(r'ACCEPTED');
  static const ACCEPTED_WITH_DISCREPANCIES = ShipmentStatusType._(r'ACCEPTED_WITH_DISCREPANCIES');
  static const ERROR = ShipmentStatusType._(r'ERROR');

  /// List of all possible values in this [enum][ShipmentStatusType].
  static const values = <ShipmentStatusType>[
    OUTBOUND_CREATED,
    OUTBOUND_READY_FOR_CONFIRMATION,
    OUTBOUND_CONFIRMED,
    OUTBOUND_SIGNED,
    FINISHED,
    ACCEPTED,
    ACCEPTED_WITH_DISCREPANCIES,
    ERROR,
  ];

  static ShipmentStatusType? fromJson(dynamic value) => ShipmentStatusTypeTypeTransformer().decode(value);

  static List<ShipmentStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ShipmentStatusType] to String,
/// and [decode] dynamic data back to [ShipmentStatusType].
class ShipmentStatusTypeTypeTransformer {
  factory ShipmentStatusTypeTypeTransformer() => _instance ??= const ShipmentStatusTypeTypeTransformer._();

  const ShipmentStatusTypeTypeTransformer._();

  String encode(ShipmentStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ShipmentStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ShipmentStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OUTBOUND_CREATED': return ShipmentStatusType.OUTBOUND_CREATED;
        case r'OUTBOUND_READY_FOR_CONFIRMATION': return ShipmentStatusType.OUTBOUND_READY_FOR_CONFIRMATION;
        case r'OUTBOUND_CONFIRMED': return ShipmentStatusType.OUTBOUND_CONFIRMED;
        case r'OUTBOUND_SIGNED': return ShipmentStatusType.OUTBOUND_SIGNED;
        case r'FINISHED': return ShipmentStatusType.FINISHED;
        case r'ACCEPTED': return ShipmentStatusType.ACCEPTED;
        case r'ACCEPTED_WITH_DISCREPANCIES': return ShipmentStatusType.ACCEPTED_WITH_DISCREPANCIES;
        case r'ERROR': return ShipmentStatusType.ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ShipmentStatusTypeTypeTransformer] instance.
  static ShipmentStatusTypeTypeTransformer? _instance;
}

