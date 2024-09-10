//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
class PromoOfferParticipationStatusFilterType {
  /// Instantiate a new enum with the provided [value].
  const PromoOfferParticipationStatusFilterType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MANUALLY_ADDED = PromoOfferParticipationStatusFilterType._(r'MANUALLY_ADDED');
  static const NOT_MANUALLY_ADDED = PromoOfferParticipationStatusFilterType._(r'NOT_MANUALLY_ADDED');

  /// List of all possible values in this [enum][PromoOfferParticipationStatusFilterType].
  static const values = <PromoOfferParticipationStatusFilterType>[
    MANUALLY_ADDED,
    NOT_MANUALLY_ADDED,
  ];

  static PromoOfferParticipationStatusFilterType? fromJson(dynamic value) => PromoOfferParticipationStatusFilterTypeTypeTransformer().decode(value);

  static List<PromoOfferParticipationStatusFilterType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoOfferParticipationStatusFilterType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoOfferParticipationStatusFilterType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromoOfferParticipationStatusFilterType] to String,
/// and [decode] dynamic data back to [PromoOfferParticipationStatusFilterType].
class PromoOfferParticipationStatusFilterTypeTypeTransformer {
  factory PromoOfferParticipationStatusFilterTypeTypeTransformer() => _instance ??= const PromoOfferParticipationStatusFilterTypeTypeTransformer._();

  const PromoOfferParticipationStatusFilterTypeTypeTransformer._();

  String encode(PromoOfferParticipationStatusFilterType data) => data.value;

  /// Decodes a [dynamic value][data] to a PromoOfferParticipationStatusFilterType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromoOfferParticipationStatusFilterType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'MANUALLY_ADDED': return PromoOfferParticipationStatusFilterType.MANUALLY_ADDED;
        case r'NOT_MANUALLY_ADDED': return PromoOfferParticipationStatusFilterType.NOT_MANUALLY_ADDED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PromoOfferParticipationStatusFilterTypeTypeTransformer] instance.
  static PromoOfferParticipationStatusFilterTypeTypeTransformer? _instance;
}

