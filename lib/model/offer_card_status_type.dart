//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
class OfferCardStatusType {
  /// Instantiate a new enum with the provided [value].
  const OfferCardStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HAS_CARD_CAN_NOT_UPDATE = OfferCardStatusType._(r'HAS_CARD_CAN_NOT_UPDATE');
  static const HAS_CARD_CAN_UPDATE = OfferCardStatusType._(r'HAS_CARD_CAN_UPDATE');
  static const HAS_CARD_CAN_UPDATE_ERRORS = OfferCardStatusType._(r'HAS_CARD_CAN_UPDATE_ERRORS');
  static const HAS_CARD_CAN_UPDATE_PROCESSING = OfferCardStatusType._(r'HAS_CARD_CAN_UPDATE_PROCESSING');
  static const NO_CARD_NEED_CONTENT = OfferCardStatusType._(r'NO_CARD_NEED_CONTENT');
  static const NO_CARD_MARKET_WILL_CREATE = OfferCardStatusType._(r'NO_CARD_MARKET_WILL_CREATE');
  static const NO_CARD_ERRORS = OfferCardStatusType._(r'NO_CARD_ERRORS');
  static const NO_CARD_PROCESSING = OfferCardStatusType._(r'NO_CARD_PROCESSING');
  static const NO_CARD_ADD_TO_CAMPAIGN = OfferCardStatusType._(r'NO_CARD_ADD_TO_CAMPAIGN');

  /// List of all possible values in this [enum][OfferCardStatusType].
  static const values = <OfferCardStatusType>[
    HAS_CARD_CAN_NOT_UPDATE,
    HAS_CARD_CAN_UPDATE,
    HAS_CARD_CAN_UPDATE_ERRORS,
    HAS_CARD_CAN_UPDATE_PROCESSING,
    NO_CARD_NEED_CONTENT,
    NO_CARD_MARKET_WILL_CREATE,
    NO_CARD_ERRORS,
    NO_CARD_PROCESSING,
    NO_CARD_ADD_TO_CAMPAIGN,
  ];

  static OfferCardStatusType? fromJson(dynamic value) => OfferCardStatusTypeTypeTransformer().decode(value);

  static List<OfferCardStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferCardStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferCardStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferCardStatusType] to String,
/// and [decode] dynamic data back to [OfferCardStatusType].
class OfferCardStatusTypeTypeTransformer {
  factory OfferCardStatusTypeTypeTransformer() => _instance ??= const OfferCardStatusTypeTypeTransformer._();

  const OfferCardStatusTypeTypeTransformer._();

  String encode(OfferCardStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferCardStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferCardStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HAS_CARD_CAN_NOT_UPDATE': return OfferCardStatusType.HAS_CARD_CAN_NOT_UPDATE;
        case r'HAS_CARD_CAN_UPDATE': return OfferCardStatusType.HAS_CARD_CAN_UPDATE;
        case r'HAS_CARD_CAN_UPDATE_ERRORS': return OfferCardStatusType.HAS_CARD_CAN_UPDATE_ERRORS;
        case r'HAS_CARD_CAN_UPDATE_PROCESSING': return OfferCardStatusType.HAS_CARD_CAN_UPDATE_PROCESSING;
        case r'NO_CARD_NEED_CONTENT': return OfferCardStatusType.NO_CARD_NEED_CONTENT;
        case r'NO_CARD_MARKET_WILL_CREATE': return OfferCardStatusType.NO_CARD_MARKET_WILL_CREATE;
        case r'NO_CARD_ERRORS': return OfferCardStatusType.NO_CARD_ERRORS;
        case r'NO_CARD_PROCESSING': return OfferCardStatusType.NO_CARD_PROCESSING;
        case r'NO_CARD_ADD_TO_CAMPAIGN': return OfferCardStatusType.NO_CARD_ADD_TO_CAMPAIGN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferCardStatusTypeTypeTransformer] instance.
  static OfferCardStatusTypeTypeTransformer? _instance;
}

