//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
class OfferCampaignStatusType {
  /// Instantiate a new enum with the provided [value].
  const OfferCampaignStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PUBLISHED = OfferCampaignStatusType._(r'PUBLISHED');
  static const CHECKING = OfferCampaignStatusType._(r'CHECKING');
  static const DISABLED_BY_PARTNER = OfferCampaignStatusType._(r'DISABLED_BY_PARTNER');
  static const DISABLED_AUTOMATICALLY = OfferCampaignStatusType._(r'DISABLED_AUTOMATICALLY');
  static const REJECTED_BY_MARKET = OfferCampaignStatusType._(r'REJECTED_BY_MARKET');
  static const CREATING_CARD = OfferCampaignStatusType._(r'CREATING_CARD');
  static const NO_CARD = OfferCampaignStatusType._(r'NO_CARD');
  static const NO_STOCKS = OfferCampaignStatusType._(r'NO_STOCKS');
  static const ARCHIVED = OfferCampaignStatusType._(r'ARCHIVED');

  /// List of all possible values in this [enum][OfferCampaignStatusType].
  static const values = <OfferCampaignStatusType>[
    PUBLISHED,
    CHECKING,
    DISABLED_BY_PARTNER,
    DISABLED_AUTOMATICALLY,
    REJECTED_BY_MARKET,
    CREATING_CARD,
    NO_CARD,
    NO_STOCKS,
    ARCHIVED,
  ];

  static OfferCampaignStatusType? fromJson(dynamic value) => OfferCampaignStatusTypeTypeTransformer().decode(value);

  static List<OfferCampaignStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferCampaignStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferCampaignStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferCampaignStatusType] to String,
/// and [decode] dynamic data back to [OfferCampaignStatusType].
class OfferCampaignStatusTypeTypeTransformer {
  factory OfferCampaignStatusTypeTypeTransformer() => _instance ??= const OfferCampaignStatusTypeTypeTransformer._();

  const OfferCampaignStatusTypeTypeTransformer._();

  String encode(OfferCampaignStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferCampaignStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferCampaignStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PUBLISHED': return OfferCampaignStatusType.PUBLISHED;
        case r'CHECKING': return OfferCampaignStatusType.CHECKING;
        case r'DISABLED_BY_PARTNER': return OfferCampaignStatusType.DISABLED_BY_PARTNER;
        case r'DISABLED_AUTOMATICALLY': return OfferCampaignStatusType.DISABLED_AUTOMATICALLY;
        case r'REJECTED_BY_MARKET': return OfferCampaignStatusType.REJECTED_BY_MARKET;
        case r'CREATING_CARD': return OfferCampaignStatusType.CREATING_CARD;
        case r'NO_CARD': return OfferCampaignStatusType.NO_CARD;
        case r'NO_STOCKS': return OfferCampaignStatusType.NO_STOCKS;
        case r'ARCHIVED': return OfferCampaignStatusType.ARCHIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferCampaignStatusTypeTypeTransformer] instance.
  static OfferCampaignStatusTypeTypeTransformer? _instance;
}

