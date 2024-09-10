//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров. 
class OrdersStatsCommissionType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsCommissionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FEE = OrdersStatsCommissionType._(r'FEE');
  static const FULFILLMENT = OrdersStatsCommissionType._(r'FULFILLMENT');
  static const LOYALTY_PARTICIPATION_FEE = OrdersStatsCommissionType._(r'LOYALTY_PARTICIPATION_FEE');
  static const AUCTION_PROMOTION = OrdersStatsCommissionType._(r'AUCTION_PROMOTION');
  static const INSTALLMENT = OrdersStatsCommissionType._(r'INSTALLMENT');
  static const DELIVERY_TO_CUSTOMER = OrdersStatsCommissionType._(r'DELIVERY_TO_CUSTOMER');
  static const EXPRESS_DELIVERY_TO_CUSTOMER = OrdersStatsCommissionType._(r'EXPRESS_DELIVERY_TO_CUSTOMER');
  static const AGENCY = OrdersStatsCommissionType._(r'AGENCY');
  static const PAYMENT_TRANSFER = OrdersStatsCommissionType._(r'PAYMENT_TRANSFER');
  static const RETURNED_ORDERS_STORAGE = OrdersStatsCommissionType._(r'RETURNED_ORDERS_STORAGE');
  static const SORTING = OrdersStatsCommissionType._(r'SORTING');
  static const INTAKE_SORTING = OrdersStatsCommissionType._(r'INTAKE_SORTING');
  static const RETURN_PROCESSING = OrdersStatsCommissionType._(r'RETURN_PROCESSING');
  static const ILLIQUID_GOODS_SALE = OrdersStatsCommissionType._(r'ILLIQUID_GOODS_SALE');

  /// List of all possible values in this [enum][OrdersStatsCommissionType].
  static const values = <OrdersStatsCommissionType>[
    FEE,
    FULFILLMENT,
    LOYALTY_PARTICIPATION_FEE,
    AUCTION_PROMOTION,
    INSTALLMENT,
    DELIVERY_TO_CUSTOMER,
    EXPRESS_DELIVERY_TO_CUSTOMER,
    AGENCY,
    PAYMENT_TRANSFER,
    RETURNED_ORDERS_STORAGE,
    SORTING,
    INTAKE_SORTING,
    RETURN_PROCESSING,
    ILLIQUID_GOODS_SALE,
  ];

  static OrdersStatsCommissionType? fromJson(dynamic value) => OrdersStatsCommissionTypeTypeTransformer().decode(value);

  static List<OrdersStatsCommissionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsCommissionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsCommissionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsCommissionType] to String,
/// and [decode] dynamic data back to [OrdersStatsCommissionType].
class OrdersStatsCommissionTypeTypeTransformer {
  factory OrdersStatsCommissionTypeTypeTransformer() => _instance ??= const OrdersStatsCommissionTypeTypeTransformer._();

  const OrdersStatsCommissionTypeTypeTransformer._();

  String encode(OrdersStatsCommissionType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsCommissionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsCommissionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FEE': return OrdersStatsCommissionType.FEE;
        case r'FULFILLMENT': return OrdersStatsCommissionType.FULFILLMENT;
        case r'LOYALTY_PARTICIPATION_FEE': return OrdersStatsCommissionType.LOYALTY_PARTICIPATION_FEE;
        case r'AUCTION_PROMOTION': return OrdersStatsCommissionType.AUCTION_PROMOTION;
        case r'INSTALLMENT': return OrdersStatsCommissionType.INSTALLMENT;
        case r'DELIVERY_TO_CUSTOMER': return OrdersStatsCommissionType.DELIVERY_TO_CUSTOMER;
        case r'EXPRESS_DELIVERY_TO_CUSTOMER': return OrdersStatsCommissionType.EXPRESS_DELIVERY_TO_CUSTOMER;
        case r'AGENCY': return OrdersStatsCommissionType.AGENCY;
        case r'PAYMENT_TRANSFER': return OrdersStatsCommissionType.PAYMENT_TRANSFER;
        case r'RETURNED_ORDERS_STORAGE': return OrdersStatsCommissionType.RETURNED_ORDERS_STORAGE;
        case r'SORTING': return OrdersStatsCommissionType.SORTING;
        case r'INTAKE_SORTING': return OrdersStatsCommissionType.INTAKE_SORTING;
        case r'RETURN_PROCESSING': return OrdersStatsCommissionType.RETURN_PROCESSING;
        case r'ILLIQUID_GOODS_SALE': return OrdersStatsCommissionType.ILLIQUID_GOODS_SALE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsCommissionTypeTypeTransformer] instance.
  static OrdersStatsCommissionTypeTypeTransformer? _instance;
}

