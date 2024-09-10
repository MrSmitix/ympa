//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderDTO {
  /// Returns a new [OrderDTO] instance.
  OrderDTO({
    this.id,
    this.status,
    this.substatus,
    this.creationDate,
    this.updatedAt,
    this.currency,
    this.itemsTotal,
    this.deliveryTotal,
    this.buyerItemsTotal,
    this.buyerTotal,
    this.buyerItemsTotalBeforeDiscount,
    this.buyerTotalBeforeDiscount,
    this.paymentType,
    this.paymentMethod,
    this.fake,
    this.items = const [],
    this.subsidies = const [],
    this.delivery,
    this.buyer,
    this.notes,
    this.taxSystem,
    this.cancelRequested,
    this.expiryDate,
  });

  /// Идентификатор заказа.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderStatusType? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderSubstatusType? substatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? creationDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? updatedAt;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CurrencyType? currency;

  /// Платеж покупателя. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? itemsTotal;

  /// Стоимость доставки. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? deliveryTotal;

  /// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? buyerItemsTotal;

  /// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? buyerTotal;

  /// Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? buyerItemsTotalBeforeDiscount;

  /// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? buyerTotalBeforeDiscount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderPaymentType? paymentType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderPaymentMethodType? paymentMethod;

  /// Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? fake;

  /// Список товаров в заказе.
  List<OrderItemDTO> items;

  /// Список субсидий по типам.
  List<OrderSubsidyDTO>? subsidies;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryDTO? delivery;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderBuyerDTO? buyer;

  /// Комментарий к заказу.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? notes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderTaxSystemType? taxSystem;

  /// **Только для модели DBS**  Запрошена ли отмена. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? cancelRequested;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? expiryDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderDTO &&
    other.id == id &&
    other.status == status &&
    other.substatus == substatus &&
    other.creationDate == creationDate &&
    other.updatedAt == updatedAt &&
    other.currency == currency &&
    other.itemsTotal == itemsTotal &&
    other.deliveryTotal == deliveryTotal &&
    other.buyerItemsTotal == buyerItemsTotal &&
    other.buyerTotal == buyerTotal &&
    other.buyerItemsTotalBeforeDiscount == buyerItemsTotalBeforeDiscount &&
    other.buyerTotalBeforeDiscount == buyerTotalBeforeDiscount &&
    other.paymentType == paymentType &&
    other.paymentMethod == paymentMethod &&
    other.fake == fake &&
    _deepEquality.equals(other.items, items) &&
    _deepEquality.equals(other.subsidies, subsidies) &&
    other.delivery == delivery &&
    other.buyer == buyer &&
    other.notes == notes &&
    other.taxSystem == taxSystem &&
    other.cancelRequested == cancelRequested &&
    other.expiryDate == expiryDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (substatus == null ? 0 : substatus!.hashCode) +
    (creationDate == null ? 0 : creationDate!.hashCode) +
    (updatedAt == null ? 0 : updatedAt!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (itemsTotal == null ? 0 : itemsTotal!.hashCode) +
    (deliveryTotal == null ? 0 : deliveryTotal!.hashCode) +
    (buyerItemsTotal == null ? 0 : buyerItemsTotal!.hashCode) +
    (buyerTotal == null ? 0 : buyerTotal!.hashCode) +
    (buyerItemsTotalBeforeDiscount == null ? 0 : buyerItemsTotalBeforeDiscount!.hashCode) +
    (buyerTotalBeforeDiscount == null ? 0 : buyerTotalBeforeDiscount!.hashCode) +
    (paymentType == null ? 0 : paymentType!.hashCode) +
    (paymentMethod == null ? 0 : paymentMethod!.hashCode) +
    (fake == null ? 0 : fake!.hashCode) +
    (items.hashCode) +
    (subsidies == null ? 0 : subsidies!.hashCode) +
    (delivery == null ? 0 : delivery!.hashCode) +
    (buyer == null ? 0 : buyer!.hashCode) +
    (notes == null ? 0 : notes!.hashCode) +
    (taxSystem == null ? 0 : taxSystem!.hashCode) +
    (cancelRequested == null ? 0 : cancelRequested!.hashCode) +
    (expiryDate == null ? 0 : expiryDate!.hashCode);

  @override
  String toString() => 'OrderDTO[id=$id, status=$status, substatus=$substatus, creationDate=$creationDate, updatedAt=$updatedAt, currency=$currency, itemsTotal=$itemsTotal, deliveryTotal=$deliveryTotal, buyerItemsTotal=$buyerItemsTotal, buyerTotal=$buyerTotal, buyerItemsTotalBeforeDiscount=$buyerItemsTotalBeforeDiscount, buyerTotalBeforeDiscount=$buyerTotalBeforeDiscount, paymentType=$paymentType, paymentMethod=$paymentMethod, fake=$fake, items=$items, subsidies=$subsidies, delivery=$delivery, buyer=$buyer, notes=$notes, taxSystem=$taxSystem, cancelRequested=$cancelRequested, expiryDate=$expiryDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.substatus != null) {
      json[r'substatus'] = this.substatus;
    } else {
      json[r'substatus'] = null;
    }
    if (this.creationDate != null) {
      json[r'creationDate'] = this.creationDate;
    } else {
      json[r'creationDate'] = null;
    }
    if (this.updatedAt != null) {
      json[r'updatedAt'] = this.updatedAt;
    } else {
      json[r'updatedAt'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.itemsTotal != null) {
      json[r'itemsTotal'] = this.itemsTotal;
    } else {
      json[r'itemsTotal'] = null;
    }
    if (this.deliveryTotal != null) {
      json[r'deliveryTotal'] = this.deliveryTotal;
    } else {
      json[r'deliveryTotal'] = null;
    }
    if (this.buyerItemsTotal != null) {
      json[r'buyerItemsTotal'] = this.buyerItemsTotal;
    } else {
      json[r'buyerItemsTotal'] = null;
    }
    if (this.buyerTotal != null) {
      json[r'buyerTotal'] = this.buyerTotal;
    } else {
      json[r'buyerTotal'] = null;
    }
    if (this.buyerItemsTotalBeforeDiscount != null) {
      json[r'buyerItemsTotalBeforeDiscount'] = this.buyerItemsTotalBeforeDiscount;
    } else {
      json[r'buyerItemsTotalBeforeDiscount'] = null;
    }
    if (this.buyerTotalBeforeDiscount != null) {
      json[r'buyerTotalBeforeDiscount'] = this.buyerTotalBeforeDiscount;
    } else {
      json[r'buyerTotalBeforeDiscount'] = null;
    }
    if (this.paymentType != null) {
      json[r'paymentType'] = this.paymentType;
    } else {
      json[r'paymentType'] = null;
    }
    if (this.paymentMethod != null) {
      json[r'paymentMethod'] = this.paymentMethod;
    } else {
      json[r'paymentMethod'] = null;
    }
    if (this.fake != null) {
      json[r'fake'] = this.fake;
    } else {
      json[r'fake'] = null;
    }
      json[r'items'] = this.items;
    if (this.subsidies != null) {
      json[r'subsidies'] = this.subsidies;
    } else {
      json[r'subsidies'] = null;
    }
    if (this.delivery != null) {
      json[r'delivery'] = this.delivery;
    } else {
      json[r'delivery'] = null;
    }
    if (this.buyer != null) {
      json[r'buyer'] = this.buyer;
    } else {
      json[r'buyer'] = null;
    }
    if (this.notes != null) {
      json[r'notes'] = this.notes;
    } else {
      json[r'notes'] = null;
    }
    if (this.taxSystem != null) {
      json[r'taxSystem'] = this.taxSystem;
    } else {
      json[r'taxSystem'] = null;
    }
    if (this.cancelRequested != null) {
      json[r'cancelRequested'] = this.cancelRequested;
    } else {
      json[r'cancelRequested'] = null;
    }
    if (this.expiryDate != null) {
      json[r'expiryDate'] = this.expiryDate;
    } else {
      json[r'expiryDate'] = null;
    }
    return json;
  }

  /// Returns a new [OrderDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderDTO(
        id: mapValueOfType<int>(json, r'id'),
        status: OrderStatusType.fromJson(json[r'status']),
        substatus: OrderSubstatusType.fromJson(json[r'substatus']),
        creationDate: mapValueOfType<String>(json, r'creationDate'),
        updatedAt: mapValueOfType<String>(json, r'updatedAt'),
        currency: CurrencyType.fromJson(json[r'currency']),
        itemsTotal: num.parse('${json[r'itemsTotal']}'),
        deliveryTotal: num.parse('${json[r'deliveryTotal']}'),
        buyerItemsTotal: num.parse('${json[r'buyerItemsTotal']}'),
        buyerTotal: num.parse('${json[r'buyerTotal']}'),
        buyerItemsTotalBeforeDiscount: num.parse('${json[r'buyerItemsTotalBeforeDiscount']}'),
        buyerTotalBeforeDiscount: num.parse('${json[r'buyerTotalBeforeDiscount']}'),
        paymentType: OrderPaymentType.fromJson(json[r'paymentType']),
        paymentMethod: OrderPaymentMethodType.fromJson(json[r'paymentMethod']),
        fake: mapValueOfType<bool>(json, r'fake'),
        items: OrderItemDTO.listFromJson(json[r'items']),
        subsidies: OrderSubsidyDTO.listFromJson(json[r'subsidies']),
        delivery: OrderDeliveryDTO.fromJson(json[r'delivery']),
        buyer: OrderBuyerDTO.fromJson(json[r'buyer']),
        notes: mapValueOfType<String>(json, r'notes'),
        taxSystem: OrderTaxSystemType.fromJson(json[r'taxSystem']),
        cancelRequested: mapValueOfType<bool>(json, r'cancelRequested'),
        expiryDate: mapValueOfType<String>(json, r'expiryDate'),
      );
    }
    return null;
  }

  static List<OrderDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderDTO> mapFromJson(dynamic json) {
    final map = <String, OrderDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderDTO-objects as value to a dart map
  static Map<String, List<OrderDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
  };
}

