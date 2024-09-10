//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
class CalculatedTariffType {
  /// Instantiate a new enum with the provided [value].
  const CalculatedTariffType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AGENCY_COMMISSION = CalculatedTariffType._(r'AGENCY_COMMISSION');
  static const PAYMENT_TRANSFER = CalculatedTariffType._(r'PAYMENT_TRANSFER');
  static const FEE = CalculatedTariffType._(r'FEE');
  static const DELIVERY_TO_CUSTOMER = CalculatedTariffType._(r'DELIVERY_TO_CUSTOMER');
  static const CROSSREGIONAL_DELIVERY = CalculatedTariffType._(r'CROSSREGIONAL_DELIVERY');
  static const EXPRESS_DELIVERY = CalculatedTariffType._(r'EXPRESS_DELIVERY');
  static const SORTING = CalculatedTariffType._(r'SORTING');
  static const MIDDLE_MILE = CalculatedTariffType._(r'MIDDLE_MILE');

  /// List of all possible values in this [enum][CalculatedTariffType].
  static const values = <CalculatedTariffType>[
    AGENCY_COMMISSION,
    PAYMENT_TRANSFER,
    FEE,
    DELIVERY_TO_CUSTOMER,
    CROSSREGIONAL_DELIVERY,
    EXPRESS_DELIVERY,
    SORTING,
    MIDDLE_MILE,
  ];

  static CalculatedTariffType? fromJson(dynamic value) => CalculatedTariffTypeTypeTransformer().decode(value);

  static List<CalculatedTariffType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CalculatedTariffType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CalculatedTariffType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CalculatedTariffType] to String,
/// and [decode] dynamic data back to [CalculatedTariffType].
class CalculatedTariffTypeTypeTransformer {
  factory CalculatedTariffTypeTypeTransformer() => _instance ??= const CalculatedTariffTypeTypeTransformer._();

  const CalculatedTariffTypeTypeTransformer._();

  String encode(CalculatedTariffType data) => data.value;

  /// Decodes a [dynamic value][data] to a CalculatedTariffType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CalculatedTariffType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AGENCY_COMMISSION': return CalculatedTariffType.AGENCY_COMMISSION;
        case r'PAYMENT_TRANSFER': return CalculatedTariffType.PAYMENT_TRANSFER;
        case r'FEE': return CalculatedTariffType.FEE;
        case r'DELIVERY_TO_CUSTOMER': return CalculatedTariffType.DELIVERY_TO_CUSTOMER;
        case r'CROSSREGIONAL_DELIVERY': return CalculatedTariffType.CROSSREGIONAL_DELIVERY;
        case r'EXPRESS_DELIVERY': return CalculatedTariffType.EXPRESS_DELIVERY;
        case r'SORTING': return CalculatedTariffType.SORTING;
        case r'MIDDLE_MILE': return CalculatedTariffType.MIDDLE_MILE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CalculatedTariffTypeTypeTransformer] instance.
  static CalculatedTariffTypeTypeTransformer? _instance;
}

