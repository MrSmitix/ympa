//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
class TariffType {
  /// Instantiate a new enum with the provided [value].
  const TariffType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AGENCY_COMMISSION = TariffType._(r'AGENCY_COMMISSION');
  static const PAYMENT_TRANSFER = TariffType._(r'PAYMENT_TRANSFER');
  static const STORAGE = TariffType._(r'STORAGE');
  static const WITHDRAW = TariffType._(r'WITHDRAW');
  static const SURPLUS = TariffType._(r'SURPLUS');
  static const FEE = TariffType._(r'FEE');
  static const DELIVERY_TO_CUSTOMER = TariffType._(r'DELIVERY_TO_CUSTOMER');
  static const CROSSREGIONAL_DELIVERY = TariffType._(r'CROSSREGIONAL_DELIVERY');
  static const CROSSREGIONAL_DELIVERY_RETURN = TariffType._(r'CROSSREGIONAL_DELIVERY_RETURN');
  static const DISPOSAL = TariffType._(r'DISPOSAL');
  static const SORTING_CENTER_STORAGE = TariffType._(r'SORTING_CENTER_STORAGE');
  static const EXPRESS_DELIVERY = TariffType._(r'EXPRESS_DELIVERY');
  static const FF_XDOC_SUPPLY_BOX = TariffType._(r'FF_XDOC_SUPPLY_BOX');
  static const FF_XDOC_SUPPLY_PALLET = TariffType._(r'FF_XDOC_SUPPLY_PALLET');
  static const SORTING = TariffType._(r'SORTING');
  static const MIDDLE_MILE = TariffType._(r'MIDDLE_MILE');
  static const RETURN_PROCESSING = TariffType._(r'RETURN_PROCESSING');
  static const EXPRESS_CANCELLED_BY_PARTNER = TariffType._(r'EXPRESS_CANCELLED_BY_PARTNER');
  static const DELIVERY_TO_CUSTOMER_RETURN = TariffType._(r'DELIVERY_TO_CUSTOMER_RETURN');
  static const CROSSBORDER_DELIVERY = TariffType._(r'CROSSBORDER_DELIVERY');
  static const INTAKE_SORTING_BULKY_CARGO = TariffType._(r'INTAKE_SORTING_BULKY_CARGO');
  static const INTAKE_SORTING_SMALL_GOODS = TariffType._(r'INTAKE_SORTING_SMALL_GOODS');
  static const INTAKE_SORTING_DAILY = TariffType._(r'INTAKE_SORTING_DAILY');
  static const FF_STORAGE_BILLING = TariffType._(r'FF_STORAGE_BILLING');
  static const CANCELLED_ORDER_FEE_QI = TariffType._(r'CANCELLED_ORDER_FEE_QI');
  static const LATE_ORDER_EXECUTION_FEE_QI = TariffType._(r'LATE_ORDER_EXECUTION_FEE_QI');

  /// List of all possible values in this [enum][TariffType].
  static const values = <TariffType>[
    AGENCY_COMMISSION,
    PAYMENT_TRANSFER,
    STORAGE,
    WITHDRAW,
    SURPLUS,
    FEE,
    DELIVERY_TO_CUSTOMER,
    CROSSREGIONAL_DELIVERY,
    CROSSREGIONAL_DELIVERY_RETURN,
    DISPOSAL,
    SORTING_CENTER_STORAGE,
    EXPRESS_DELIVERY,
    FF_XDOC_SUPPLY_BOX,
    FF_XDOC_SUPPLY_PALLET,
    SORTING,
    MIDDLE_MILE,
    RETURN_PROCESSING,
    EXPRESS_CANCELLED_BY_PARTNER,
    DELIVERY_TO_CUSTOMER_RETURN,
    CROSSBORDER_DELIVERY,
    INTAKE_SORTING_BULKY_CARGO,
    INTAKE_SORTING_SMALL_GOODS,
    INTAKE_SORTING_DAILY,
    FF_STORAGE_BILLING,
    CANCELLED_ORDER_FEE_QI,
    LATE_ORDER_EXECUTION_FEE_QI,
  ];

  static TariffType? fromJson(dynamic value) => TariffTypeTypeTransformer().decode(value);

  static List<TariffType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TariffType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TariffType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TariffType] to String,
/// and [decode] dynamic data back to [TariffType].
class TariffTypeTypeTransformer {
  factory TariffTypeTypeTransformer() => _instance ??= const TariffTypeTypeTransformer._();

  const TariffTypeTypeTransformer._();

  String encode(TariffType data) => data.value;

  /// Decodes a [dynamic value][data] to a TariffType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TariffType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AGENCY_COMMISSION': return TariffType.AGENCY_COMMISSION;
        case r'PAYMENT_TRANSFER': return TariffType.PAYMENT_TRANSFER;
        case r'STORAGE': return TariffType.STORAGE;
        case r'WITHDRAW': return TariffType.WITHDRAW;
        case r'SURPLUS': return TariffType.SURPLUS;
        case r'FEE': return TariffType.FEE;
        case r'DELIVERY_TO_CUSTOMER': return TariffType.DELIVERY_TO_CUSTOMER;
        case r'CROSSREGIONAL_DELIVERY': return TariffType.CROSSREGIONAL_DELIVERY;
        case r'CROSSREGIONAL_DELIVERY_RETURN': return TariffType.CROSSREGIONAL_DELIVERY_RETURN;
        case r'DISPOSAL': return TariffType.DISPOSAL;
        case r'SORTING_CENTER_STORAGE': return TariffType.SORTING_CENTER_STORAGE;
        case r'EXPRESS_DELIVERY': return TariffType.EXPRESS_DELIVERY;
        case r'FF_XDOC_SUPPLY_BOX': return TariffType.FF_XDOC_SUPPLY_BOX;
        case r'FF_XDOC_SUPPLY_PALLET': return TariffType.FF_XDOC_SUPPLY_PALLET;
        case r'SORTING': return TariffType.SORTING;
        case r'MIDDLE_MILE': return TariffType.MIDDLE_MILE;
        case r'RETURN_PROCESSING': return TariffType.RETURN_PROCESSING;
        case r'EXPRESS_CANCELLED_BY_PARTNER': return TariffType.EXPRESS_CANCELLED_BY_PARTNER;
        case r'DELIVERY_TO_CUSTOMER_RETURN': return TariffType.DELIVERY_TO_CUSTOMER_RETURN;
        case r'CROSSBORDER_DELIVERY': return TariffType.CROSSBORDER_DELIVERY;
        case r'INTAKE_SORTING_BULKY_CARGO': return TariffType.INTAKE_SORTING_BULKY_CARGO;
        case r'INTAKE_SORTING_SMALL_GOODS': return TariffType.INTAKE_SORTING_SMALL_GOODS;
        case r'INTAKE_SORTING_DAILY': return TariffType.INTAKE_SORTING_DAILY;
        case r'FF_STORAGE_BILLING': return TariffType.FF_STORAGE_BILLING;
        case r'CANCELLED_ORDER_FEE_QI': return TariffType.CANCELLED_ORDER_FEE_QI;
        case r'LATE_ORDER_EXECUTION_FEE_QI': return TariffType.LATE_ORDER_EXECUTION_FEE_QI;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TariffTypeTypeTransformer] instance.
  static TariffTypeTypeTransformer? _instance;
}

