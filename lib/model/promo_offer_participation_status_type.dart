//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
class PromoOfferParticipationStatusType {
  /// Instantiate a new enum with the provided [value].
  const PromoOfferParticipationStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AUTO = PromoOfferParticipationStatusType._(r'AUTO');
  static const PARTIALLY_AUTO = PromoOfferParticipationStatusType._(r'PARTIALLY_AUTO');
  static const MANUAL = PromoOfferParticipationStatusType._(r'MANUAL');
  static const NOT_PARTICIPATING = PromoOfferParticipationStatusType._(r'NOT_PARTICIPATING');

  /// List of all possible values in this [enum][PromoOfferParticipationStatusType].
  static const values = <PromoOfferParticipationStatusType>[
    AUTO,
    PARTIALLY_AUTO,
    MANUAL,
    NOT_PARTICIPATING,
  ];

  static PromoOfferParticipationStatusType? fromJson(dynamic value) => PromoOfferParticipationStatusTypeTypeTransformer().decode(value);

  static List<PromoOfferParticipationStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoOfferParticipationStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoOfferParticipationStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromoOfferParticipationStatusType] to String,
/// and [decode] dynamic data back to [PromoOfferParticipationStatusType].
class PromoOfferParticipationStatusTypeTypeTransformer {
  factory PromoOfferParticipationStatusTypeTypeTransformer() => _instance ??= const PromoOfferParticipationStatusTypeTypeTransformer._();

  const PromoOfferParticipationStatusTypeTypeTransformer._();

  String encode(PromoOfferParticipationStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a PromoOfferParticipationStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromoOfferParticipationStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AUTO': return PromoOfferParticipationStatusType.AUTO;
        case r'PARTIALLY_AUTO': return PromoOfferParticipationStatusType.PARTIALLY_AUTO;
        case r'MANUAL': return PromoOfferParticipationStatusType.MANUAL;
        case r'NOT_PARTICIPATING': return PromoOfferParticipationStatusType.NOT_PARTICIPATING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PromoOfferParticipationStatusTypeTypeTransformer] instance.
  static PromoOfferParticipationStatusTypeTypeTransformer? _instance;
}

