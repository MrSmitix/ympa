//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Решение по возврату.
class ReturnRequestDecisionType {
  /// Instantiate a new enum with the provided [value].
  const ReturnRequestDecisionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REFUND_MONEY = ReturnRequestDecisionType._(r'REFUND_MONEY');
  static const REFUND_MONEY_INCLUDING_SHIPMENT = ReturnRequestDecisionType._(r'REFUND_MONEY_INCLUDING_SHIPMENT');
  static const REPAIR = ReturnRequestDecisionType._(r'REPAIR');
  static const REPLACE = ReturnRequestDecisionType._(r'REPLACE');
  static const SEND_TO_EXAMINATION = ReturnRequestDecisionType._(r'SEND_TO_EXAMINATION');
  static const DECLINE_REFUND = ReturnRequestDecisionType._(r'DECLINE_REFUND');
  static const OTHER_DECISION = ReturnRequestDecisionType._(r'OTHER_DECISION');

  /// List of all possible values in this [enum][ReturnRequestDecisionType].
  static const values = <ReturnRequestDecisionType>[
    REFUND_MONEY,
    REFUND_MONEY_INCLUDING_SHIPMENT,
    REPAIR,
    REPLACE,
    SEND_TO_EXAMINATION,
    DECLINE_REFUND,
    OTHER_DECISION,
  ];

  static ReturnRequestDecisionType? fromJson(dynamic value) => ReturnRequestDecisionTypeTypeTransformer().decode(value);

  static List<ReturnRequestDecisionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnRequestDecisionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnRequestDecisionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnRequestDecisionType] to String,
/// and [decode] dynamic data back to [ReturnRequestDecisionType].
class ReturnRequestDecisionTypeTypeTransformer {
  factory ReturnRequestDecisionTypeTypeTransformer() => _instance ??= const ReturnRequestDecisionTypeTypeTransformer._();

  const ReturnRequestDecisionTypeTypeTransformer._();

  String encode(ReturnRequestDecisionType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnRequestDecisionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnRequestDecisionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'REFUND_MONEY': return ReturnRequestDecisionType.REFUND_MONEY;
        case r'REFUND_MONEY_INCLUDING_SHIPMENT': return ReturnRequestDecisionType.REFUND_MONEY_INCLUDING_SHIPMENT;
        case r'REPAIR': return ReturnRequestDecisionType.REPAIR;
        case r'REPLACE': return ReturnRequestDecisionType.REPLACE;
        case r'SEND_TO_EXAMINATION': return ReturnRequestDecisionType.SEND_TO_EXAMINATION;
        case r'DECLINE_REFUND': return ReturnRequestDecisionType.DECLINE_REFUND;
        case r'OTHER_DECISION': return ReturnRequestDecisionType.OTHER_DECISION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnRequestDecisionTypeTypeTransformer] instance.
  static ReturnRequestDecisionTypeTypeTransformer? _instance;
}

