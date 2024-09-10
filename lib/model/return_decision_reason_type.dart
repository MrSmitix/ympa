//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
class ReturnDecisionReasonType {
  /// Instantiate a new enum with the provided [value].
  const ReturnDecisionReasonType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BAD_QUALITY = ReturnDecisionReasonType._(r'BAD_QUALITY');
  static const DOES_NOT_FIT = ReturnDecisionReasonType._(r'DOES_NOT_FIT');
  static const WRONG_ITEM = ReturnDecisionReasonType._(r'WRONG_ITEM');
  static const DAMAGE_DELIVERY = ReturnDecisionReasonType._(r'DAMAGE_DELIVERY');
  static const LOYALTY_FAIL = ReturnDecisionReasonType._(r'LOYALTY_FAIL');
  static const CONTENT_FAIL = ReturnDecisionReasonType._(r'CONTENT_FAIL');
  static const UNKNOWN = ReturnDecisionReasonType._(r'UNKNOWN');

  /// List of all possible values in this [enum][ReturnDecisionReasonType].
  static const values = <ReturnDecisionReasonType>[
    BAD_QUALITY,
    DOES_NOT_FIT,
    WRONG_ITEM,
    DAMAGE_DELIVERY,
    LOYALTY_FAIL,
    CONTENT_FAIL,
    UNKNOWN,
  ];

  static ReturnDecisionReasonType? fromJson(dynamic value) => ReturnDecisionReasonTypeTypeTransformer().decode(value);

  static List<ReturnDecisionReasonType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnDecisionReasonType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnDecisionReasonType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnDecisionReasonType] to String,
/// and [decode] dynamic data back to [ReturnDecisionReasonType].
class ReturnDecisionReasonTypeTypeTransformer {
  factory ReturnDecisionReasonTypeTypeTransformer() => _instance ??= const ReturnDecisionReasonTypeTypeTransformer._();

  const ReturnDecisionReasonTypeTypeTransformer._();

  String encode(ReturnDecisionReasonType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnDecisionReasonType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnDecisionReasonType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BAD_QUALITY': return ReturnDecisionReasonType.BAD_QUALITY;
        case r'DOES_NOT_FIT': return ReturnDecisionReasonType.DOES_NOT_FIT;
        case r'WRONG_ITEM': return ReturnDecisionReasonType.WRONG_ITEM;
        case r'DAMAGE_DELIVERY': return ReturnDecisionReasonType.DAMAGE_DELIVERY;
        case r'LOYALTY_FAIL': return ReturnDecisionReasonType.LOYALTY_FAIL;
        case r'CONTENT_FAIL': return ReturnDecisionReasonType.CONTENT_FAIL;
        case r'UNKNOWN': return ReturnDecisionReasonType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnDecisionReasonTypeTypeTransformer] instance.
  static ReturnDecisionReasonTypeTypeTransformer? _instance;
}

