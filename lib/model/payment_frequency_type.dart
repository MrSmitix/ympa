//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
class PaymentFrequencyType {
  /// Instantiate a new enum with the provided [value].
  const PaymentFrequencyType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DAILY = PaymentFrequencyType._(r'DAILY');
  static const WEEKLY = PaymentFrequencyType._(r'WEEKLY');
  static const BIWEEKLY = PaymentFrequencyType._(r'BIWEEKLY');
  static const MONTHLY = PaymentFrequencyType._(r'MONTHLY');

  /// List of all possible values in this [enum][PaymentFrequencyType].
  static const values = <PaymentFrequencyType>[
    DAILY,
    WEEKLY,
    BIWEEKLY,
    MONTHLY,
  ];

  static PaymentFrequencyType? fromJson(dynamic value) => PaymentFrequencyTypeTypeTransformer().decode(value);

  static List<PaymentFrequencyType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PaymentFrequencyType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PaymentFrequencyType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PaymentFrequencyType] to String,
/// and [decode] dynamic data back to [PaymentFrequencyType].
class PaymentFrequencyTypeTypeTransformer {
  factory PaymentFrequencyTypeTypeTransformer() => _instance ??= const PaymentFrequencyTypeTypeTransformer._();

  const PaymentFrequencyTypeTypeTransformer._();

  String encode(PaymentFrequencyType data) => data.value;

  /// Decodes a [dynamic value][data] to a PaymentFrequencyType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PaymentFrequencyType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DAILY': return PaymentFrequencyType.DAILY;
        case r'WEEKLY': return PaymentFrequencyType.WEEKLY;
        case r'BIWEEKLY': return PaymentFrequencyType.BIWEEKLY;
        case r'MONTHLY': return PaymentFrequencyType.MONTHLY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PaymentFrequencyTypeTypeTransformer] instance.
  static PaymentFrequencyTypeTypeTransformer? _instance;
}

