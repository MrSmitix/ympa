//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение. 
class ReturnDecisionType {
  /// Instantiate a new enum with the provided [value].
  const ReturnDecisionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REFUND_MONEY = ReturnDecisionType._(r'REFUND_MONEY');
  static const REFUND_MONEY_INCLUDING_SHIPMENT = ReturnDecisionType._(r'REFUND_MONEY_INCLUDING_SHIPMENT');
  static const REPAIR = ReturnDecisionType._(r'REPAIR');
  static const REPLACE = ReturnDecisionType._(r'REPLACE');
  static const SEND_TO_EXAMINATION = ReturnDecisionType._(r'SEND_TO_EXAMINATION');
  static const DECLINE_REFUND = ReturnDecisionType._(r'DECLINE_REFUND');
  static const OTHER_DECISION = ReturnDecisionType._(r'OTHER_DECISION');
  static const UNKNOWN = ReturnDecisionType._(r'UNKNOWN');

  /// List of all possible values in this [enum][ReturnDecisionType].
  static const values = <ReturnDecisionType>[
    REFUND_MONEY,
    REFUND_MONEY_INCLUDING_SHIPMENT,
    REPAIR,
    REPLACE,
    SEND_TO_EXAMINATION,
    DECLINE_REFUND,
    OTHER_DECISION,
    UNKNOWN,
  ];

  static ReturnDecisionType? fromJson(dynamic value) => ReturnDecisionTypeTypeTransformer().decode(value);

  static List<ReturnDecisionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnDecisionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnDecisionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnDecisionType] to String,
/// and [decode] dynamic data back to [ReturnDecisionType].
class ReturnDecisionTypeTypeTransformer {
  factory ReturnDecisionTypeTypeTransformer() => _instance ??= const ReturnDecisionTypeTypeTransformer._();

  const ReturnDecisionTypeTypeTransformer._();

  String encode(ReturnDecisionType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnDecisionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnDecisionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'REFUND_MONEY': return ReturnDecisionType.REFUND_MONEY;
        case r'REFUND_MONEY_INCLUDING_SHIPMENT': return ReturnDecisionType.REFUND_MONEY_INCLUDING_SHIPMENT;
        case r'REPAIR': return ReturnDecisionType.REPAIR;
        case r'REPLACE': return ReturnDecisionType.REPLACE;
        case r'SEND_TO_EXAMINATION': return ReturnDecisionType.SEND_TO_EXAMINATION;
        case r'DECLINE_REFUND': return ReturnDecisionType.DECLINE_REFUND;
        case r'OTHER_DECISION': return ReturnDecisionType.OTHER_DECISION;
        case r'UNKNOWN': return ReturnDecisionType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnDecisionTypeTypeTransformer] instance.
  static ReturnDecisionTypeTypeTransformer? _instance;
}

