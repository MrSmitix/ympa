//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
class RefundStatusType {
  /// Instantiate a new enum with the provided [value].
  const RefundStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const STARTED_BY_USER = RefundStatusType._(r'STARTED_BY_USER');
  static const REFUND_IN_PROGRESS = RefundStatusType._(r'REFUND_IN_PROGRESS');
  static const REFUNDED = RefundStatusType._(r'REFUNDED');
  static const FAILED = RefundStatusType._(r'FAILED');
  static const WAITING_FOR_DECISION = RefundStatusType._(r'WAITING_FOR_DECISION');
  static const DECISION_MADE = RefundStatusType._(r'DECISION_MADE');
  static const REFUNDED_WITH_BONUSES = RefundStatusType._(r'REFUNDED_WITH_BONUSES');
  static const REFUNDED_BY_SHOP = RefundStatusType._(r'REFUNDED_BY_SHOP');
  static const CANCELLED = RefundStatusType._(r'CANCELLED');
  static const COMPLETE_WITHOUT_REFUND = RefundStatusType._(r'COMPLETE_WITHOUT_REFUND');
  static const UNKNOWN = RefundStatusType._(r'UNKNOWN');

  /// List of all possible values in this [enum][RefundStatusType].
  static const values = <RefundStatusType>[
    STARTED_BY_USER,
    REFUND_IN_PROGRESS,
    REFUNDED,
    FAILED,
    WAITING_FOR_DECISION,
    DECISION_MADE,
    REFUNDED_WITH_BONUSES,
    REFUNDED_BY_SHOP,
    CANCELLED,
    COMPLETE_WITHOUT_REFUND,
    UNKNOWN,
  ];

  static RefundStatusType? fromJson(dynamic value) => RefundStatusTypeTypeTransformer().decode(value);

  static List<RefundStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RefundStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RefundStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RefundStatusType] to String,
/// and [decode] dynamic data back to [RefundStatusType].
class RefundStatusTypeTypeTransformer {
  factory RefundStatusTypeTypeTransformer() => _instance ??= const RefundStatusTypeTypeTransformer._();

  const RefundStatusTypeTypeTransformer._();

  String encode(RefundStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a RefundStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RefundStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'STARTED_BY_USER': return RefundStatusType.STARTED_BY_USER;
        case r'REFUND_IN_PROGRESS': return RefundStatusType.REFUND_IN_PROGRESS;
        case r'REFUNDED': return RefundStatusType.REFUNDED;
        case r'FAILED': return RefundStatusType.FAILED;
        case r'WAITING_FOR_DECISION': return RefundStatusType.WAITING_FOR_DECISION;
        case r'DECISION_MADE': return RefundStatusType.DECISION_MADE;
        case r'REFUNDED_WITH_BONUSES': return RefundStatusType.REFUNDED_WITH_BONUSES;
        case r'REFUNDED_BY_SHOP': return RefundStatusType.REFUNDED_BY_SHOP;
        case r'CANCELLED': return RefundStatusType.CANCELLED;
        case r'COMPLETE_WITHOUT_REFUND': return RefundStatusType.COMPLETE_WITHOUT_REFUND;
        case r'UNKNOWN': return RefundStatusType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RefundStatusTypeTypeTransformer] instance.
  static RefundStatusTypeTypeTransformer? _instance;
}

