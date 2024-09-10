//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип цены:  * `BUYBOX` — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре `price` указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * `DEFAULT_OFFER` — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * `MIN_PRICE_MARKET` — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. 
class PriceSuggestType {
  /// Instantiate a new enum with the provided [value].
  const PriceSuggestType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BUYBOX = PriceSuggestType._(r'BUYBOX');
  static const DEFAULT_OFFER = PriceSuggestType._(r'DEFAULT_OFFER');
  static const MIN_PRICE_MARKET = PriceSuggestType._(r'MIN_PRICE_MARKET');

  /// List of all possible values in this [enum][PriceSuggestType].
  static const values = <PriceSuggestType>[
    BUYBOX,
    DEFAULT_OFFER,
    MIN_PRICE_MARKET,
  ];

  static PriceSuggestType? fromJson(dynamic value) => PriceSuggestTypeTypeTransformer().decode(value);

  static List<PriceSuggestType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceSuggestType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceSuggestType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PriceSuggestType] to String,
/// and [decode] dynamic data back to [PriceSuggestType].
class PriceSuggestTypeTypeTransformer {
  factory PriceSuggestTypeTypeTransformer() => _instance ??= const PriceSuggestTypeTypeTransformer._();

  const PriceSuggestTypeTypeTransformer._();

  String encode(PriceSuggestType data) => data.value;

  /// Decodes a [dynamic value][data] to a PriceSuggestType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PriceSuggestType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BUYBOX': return PriceSuggestType.BUYBOX;
        case r'DEFAULT_OFFER': return PriceSuggestType.DEFAULT_OFFER;
        case r'MIN_PRICE_MARKET': return PriceSuggestType.MIN_PRICE_MARKET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PriceSuggestTypeTypeTransformer] instance.
  static PriceSuggestTypeTypeTransformer? _instance;
}

