//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. 
class ReturnDecisionSubreasonType {
  /// Instantiate a new enum with the provided [value].
  const ReturnDecisionSubreasonType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const USER_DID_NOT_LIKE = ReturnDecisionSubreasonType._(r'USER_DID_NOT_LIKE');
  static const USER_CHANGED_MIND = ReturnDecisionSubreasonType._(r'USER_CHANGED_MIND');
  static const DELIVERED_TOO_LONG = ReturnDecisionSubreasonType._(r'DELIVERED_TOO_LONG');
  static const BAD_PACKAGE = ReturnDecisionSubreasonType._(r'BAD_PACKAGE');
  static const DAMAGED = ReturnDecisionSubreasonType._(r'DAMAGED');
  static const NOT_WORKING = ReturnDecisionSubreasonType._(r'NOT_WORKING');
  static const INCOMPLETENESS = ReturnDecisionSubreasonType._(r'INCOMPLETENESS');
  static const WRONG_ITEM = ReturnDecisionSubreasonType._(r'WRONG_ITEM');
  static const WRONG_COLOR = ReturnDecisionSubreasonType._(r'WRONG_COLOR');
  static const DID_NOT_MATCH_DESCRIPTION = ReturnDecisionSubreasonType._(r'DID_NOT_MATCH_DESCRIPTION');
  static const UNKNOWN = ReturnDecisionSubreasonType._(r'UNKNOWN');

  /// List of all possible values in this [enum][ReturnDecisionSubreasonType].
  static const values = <ReturnDecisionSubreasonType>[
    USER_DID_NOT_LIKE,
    USER_CHANGED_MIND,
    DELIVERED_TOO_LONG,
    BAD_PACKAGE,
    DAMAGED,
    NOT_WORKING,
    INCOMPLETENESS,
    WRONG_ITEM,
    WRONG_COLOR,
    DID_NOT_MATCH_DESCRIPTION,
    UNKNOWN,
  ];

  static ReturnDecisionSubreasonType? fromJson(dynamic value) => ReturnDecisionSubreasonTypeTypeTransformer().decode(value);

  static List<ReturnDecisionSubreasonType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnDecisionSubreasonType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnDecisionSubreasonType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnDecisionSubreasonType] to String,
/// and [decode] dynamic data back to [ReturnDecisionSubreasonType].
class ReturnDecisionSubreasonTypeTypeTransformer {
  factory ReturnDecisionSubreasonTypeTypeTransformer() => _instance ??= const ReturnDecisionSubreasonTypeTypeTransformer._();

  const ReturnDecisionSubreasonTypeTypeTransformer._();

  String encode(ReturnDecisionSubreasonType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnDecisionSubreasonType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnDecisionSubreasonType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'USER_DID_NOT_LIKE': return ReturnDecisionSubreasonType.USER_DID_NOT_LIKE;
        case r'USER_CHANGED_MIND': return ReturnDecisionSubreasonType.USER_CHANGED_MIND;
        case r'DELIVERED_TOO_LONG': return ReturnDecisionSubreasonType.DELIVERED_TOO_LONG;
        case r'BAD_PACKAGE': return ReturnDecisionSubreasonType.BAD_PACKAGE;
        case r'DAMAGED': return ReturnDecisionSubreasonType.DAMAGED;
        case r'NOT_WORKING': return ReturnDecisionSubreasonType.NOT_WORKING;
        case r'INCOMPLETENESS': return ReturnDecisionSubreasonType.INCOMPLETENESS;
        case r'WRONG_ITEM': return ReturnDecisionSubreasonType.WRONG_ITEM;
        case r'WRONG_COLOR': return ReturnDecisionSubreasonType.WRONG_COLOR;
        case r'DID_NOT_MATCH_DESCRIPTION': return ReturnDecisionSubreasonType.DID_NOT_MATCH_DESCRIPTION;
        case r'UNKNOWN': return ReturnDecisionSubreasonType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnDecisionSubreasonTypeTypeTransformer] instance.
  static ReturnDecisionSubreasonTypeTypeTransformer? _instance;
}

