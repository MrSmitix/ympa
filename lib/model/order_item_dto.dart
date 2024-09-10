//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderItemDTO {
  /// Returns a new [OrderItemDTO] instance.
  OrderItemDTO({
    this.id,
    this.offerId,
    this.offerName,
    this.price,
    this.buyerPrice,
    this.buyerPriceBeforeDiscount,
    this.priceBeforeDiscount,
    this.count,
    this.vat,
    this.shopSku,
    this.subsidy,
    this.partnerWarehouseId,
    this.promos = const [],
    this.instances = const [],
    this.details = const [],
    this.subsidies = const [],
    this.requiredInstanceTypes = const [],
  });

  /// Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? offerId;

  /// Название товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? offerName;

  /// Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  /// Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? buyerPrice;

  /// Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? buyerPriceBeforeDiscount;

  /// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? priceBeforeDiscount;

  /// Количество единиц товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? count;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderVatType? vat;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopSku;

  /// {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? subsidy;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerWarehouseId;

  /// Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
  List<OrderItemPromoDTO>? promos;

  /// Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
  List<OrderItemInstanceDTO>? instances;

  /// Информация об удалении товара из заказа. 
  List<OrderItemDetailDTO>? details;

  /// Список субсидий по типам.
  List<OrderItemSubsidyDTO>? subsidies;

  /// Список необходимых маркировок товара.
  List<OrderItemInstanceType>? requiredInstanceTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderItemDTO &&
    other.id == id &&
    other.offerId == offerId &&
    other.offerName == offerName &&
    other.price == price &&
    other.buyerPrice == buyerPrice &&
    other.buyerPriceBeforeDiscount == buyerPriceBeforeDiscount &&
    other.priceBeforeDiscount == priceBeforeDiscount &&
    other.count == count &&
    other.vat == vat &&
    other.shopSku == shopSku &&
    other.subsidy == subsidy &&
    other.partnerWarehouseId == partnerWarehouseId &&
    _deepEquality.equals(other.promos, promos) &&
    _deepEquality.equals(other.instances, instances) &&
    _deepEquality.equals(other.details, details) &&
    _deepEquality.equals(other.subsidies, subsidies) &&
    _deepEquality.equals(other.requiredInstanceTypes, requiredInstanceTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (offerId == null ? 0 : offerId!.hashCode) +
    (offerName == null ? 0 : offerName!.hashCode) +
    (price == null ? 0 : price!.hashCode) +
    (buyerPrice == null ? 0 : buyerPrice!.hashCode) +
    (buyerPriceBeforeDiscount == null ? 0 : buyerPriceBeforeDiscount!.hashCode) +
    (priceBeforeDiscount == null ? 0 : priceBeforeDiscount!.hashCode) +
    (count == null ? 0 : count!.hashCode) +
    (vat == null ? 0 : vat!.hashCode) +
    (shopSku == null ? 0 : shopSku!.hashCode) +
    (subsidy == null ? 0 : subsidy!.hashCode) +
    (partnerWarehouseId == null ? 0 : partnerWarehouseId!.hashCode) +
    (promos == null ? 0 : promos!.hashCode) +
    (instances == null ? 0 : instances!.hashCode) +
    (details == null ? 0 : details!.hashCode) +
    (subsidies == null ? 0 : subsidies!.hashCode) +
    (requiredInstanceTypes == null ? 0 : requiredInstanceTypes!.hashCode);

  @override
  String toString() => 'OrderItemDTO[id=$id, offerId=$offerId, offerName=$offerName, price=$price, buyerPrice=$buyerPrice, buyerPriceBeforeDiscount=$buyerPriceBeforeDiscount, priceBeforeDiscount=$priceBeforeDiscount, count=$count, vat=$vat, shopSku=$shopSku, subsidy=$subsidy, partnerWarehouseId=$partnerWarehouseId, promos=$promos, instances=$instances, details=$details, subsidies=$subsidies, requiredInstanceTypes=$requiredInstanceTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.offerId != null) {
      json[r'offerId'] = this.offerId;
    } else {
      json[r'offerId'] = null;
    }
    if (this.offerName != null) {
      json[r'offerName'] = this.offerName;
    } else {
      json[r'offerName'] = null;
    }
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.buyerPrice != null) {
      json[r'buyerPrice'] = this.buyerPrice;
    } else {
      json[r'buyerPrice'] = null;
    }
    if (this.buyerPriceBeforeDiscount != null) {
      json[r'buyerPriceBeforeDiscount'] = this.buyerPriceBeforeDiscount;
    } else {
      json[r'buyerPriceBeforeDiscount'] = null;
    }
    if (this.priceBeforeDiscount != null) {
      json[r'priceBeforeDiscount'] = this.priceBeforeDiscount;
    } else {
      json[r'priceBeforeDiscount'] = null;
    }
    if (this.count != null) {
      json[r'count'] = this.count;
    } else {
      json[r'count'] = null;
    }
    if (this.vat != null) {
      json[r'vat'] = this.vat;
    } else {
      json[r'vat'] = null;
    }
    if (this.shopSku != null) {
      json[r'shopSku'] = this.shopSku;
    } else {
      json[r'shopSku'] = null;
    }
    if (this.subsidy != null) {
      json[r'subsidy'] = this.subsidy;
    } else {
      json[r'subsidy'] = null;
    }
    if (this.partnerWarehouseId != null) {
      json[r'partnerWarehouseId'] = this.partnerWarehouseId;
    } else {
      json[r'partnerWarehouseId'] = null;
    }
    if (this.promos != null) {
      json[r'promos'] = this.promos;
    } else {
      json[r'promos'] = null;
    }
    if (this.instances != null) {
      json[r'instances'] = this.instances;
    } else {
      json[r'instances'] = null;
    }
    if (this.details != null) {
      json[r'details'] = this.details;
    } else {
      json[r'details'] = null;
    }
    if (this.subsidies != null) {
      json[r'subsidies'] = this.subsidies;
    } else {
      json[r'subsidies'] = null;
    }
    if (this.requiredInstanceTypes != null) {
      json[r'requiredInstanceTypes'] = this.requiredInstanceTypes;
    } else {
      json[r'requiredInstanceTypes'] = null;
    }
    return json;
  }

  /// Returns a new [OrderItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderItemDTO(
        id: mapValueOfType<int>(json, r'id'),
        offerId: mapValueOfType<String>(json, r'offerId'),
        offerName: mapValueOfType<String>(json, r'offerName'),
        price: num.parse('${json[r'price']}'),
        buyerPrice: num.parse('${json[r'buyerPrice']}'),
        buyerPriceBeforeDiscount: num.parse('${json[r'buyerPriceBeforeDiscount']}'),
        priceBeforeDiscount: num.parse('${json[r'priceBeforeDiscount']}'),
        count: mapValueOfType<int>(json, r'count'),
        vat: OrderVatType.fromJson(json[r'vat']),
        shopSku: mapValueOfType<String>(json, r'shopSku'),
        subsidy: num.parse('${json[r'subsidy']}'),
        partnerWarehouseId: mapValueOfType<String>(json, r'partnerWarehouseId'),
        promos: OrderItemPromoDTO.listFromJson(json[r'promos']),
        instances: OrderItemInstanceDTO.listFromJson(json[r'instances']),
        details: OrderItemDetailDTO.listFromJson(json[r'details']),
        subsidies: OrderItemSubsidyDTO.listFromJson(json[r'subsidies']),
        requiredInstanceTypes: OrderItemInstanceType.listFromJson(json[r'requiredInstanceTypes']),
      );
    }
    return null;
  }

  static List<OrderItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderItemDTO> mapFromJson(dynamic json) {
    final map = <String, OrderItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderItemDTO-objects as value to a dart map
  static Map<String, List<OrderItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

