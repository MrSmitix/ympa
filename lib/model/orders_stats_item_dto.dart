//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsItemDTO {
  /// Returns a new [OrdersStatsItemDTO] instance.
  OrdersStatsItemDTO({
    this.offerName,
    this.marketSku,
    this.shopSku,
    this.count,
    this.prices = const [],
    this.warehouse,
    this.details = const [],
    this.cisList = const [],
    this.initialCount,
    this.bidFee,
    this.cofinanceThreshold,
    this.cofinanceValue,
  });

  /// Название товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? offerName;

  /// SKU на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketSku;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopSku;

  /// Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? count;

  /// Цена или скидки на товар.
  List<OrdersStatsPriceDTO>? prices;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsWarehouseDTO? warehouse;

  /// Информация об удалении товара из заказа.
  List<OrdersStatsDetailsDTO>? details;

  /// Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  List<String>? cisList;

  /// Первоначальное количество единиц товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? initialCount;

  /// Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
  ///
  /// Minimum value: 0
  /// Maximum value: 10000
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? bidFee;

  /// Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? cofinanceThreshold;

  /// Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? cofinanceValue;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsItemDTO &&
    other.offerName == offerName &&
    other.marketSku == marketSku &&
    other.shopSku == shopSku &&
    other.count == count &&
    _deepEquality.equals(other.prices, prices) &&
    other.warehouse == warehouse &&
    _deepEquality.equals(other.details, details) &&
    _deepEquality.equals(other.cisList, cisList) &&
    other.initialCount == initialCount &&
    other.bidFee == bidFee &&
    other.cofinanceThreshold == cofinanceThreshold &&
    other.cofinanceValue == cofinanceValue;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerName == null ? 0 : offerName!.hashCode) +
    (marketSku == null ? 0 : marketSku!.hashCode) +
    (shopSku == null ? 0 : shopSku!.hashCode) +
    (count == null ? 0 : count!.hashCode) +
    (prices == null ? 0 : prices!.hashCode) +
    (warehouse == null ? 0 : warehouse!.hashCode) +
    (details == null ? 0 : details!.hashCode) +
    (cisList == null ? 0 : cisList!.hashCode) +
    (initialCount == null ? 0 : initialCount!.hashCode) +
    (bidFee == null ? 0 : bidFee!.hashCode) +
    (cofinanceThreshold == null ? 0 : cofinanceThreshold!.hashCode) +
    (cofinanceValue == null ? 0 : cofinanceValue!.hashCode);

  @override
  String toString() => 'OrdersStatsItemDTO[offerName=$offerName, marketSku=$marketSku, shopSku=$shopSku, count=$count, prices=$prices, warehouse=$warehouse, details=$details, cisList=$cisList, initialCount=$initialCount, bidFee=$bidFee, cofinanceThreshold=$cofinanceThreshold, cofinanceValue=$cofinanceValue]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerName != null) {
      json[r'offerName'] = this.offerName;
    } else {
      json[r'offerName'] = null;
    }
    if (this.marketSku != null) {
      json[r'marketSku'] = this.marketSku;
    } else {
      json[r'marketSku'] = null;
    }
    if (this.shopSku != null) {
      json[r'shopSku'] = this.shopSku;
    } else {
      json[r'shopSku'] = null;
    }
    if (this.count != null) {
      json[r'count'] = this.count;
    } else {
      json[r'count'] = null;
    }
    if (this.prices != null) {
      json[r'prices'] = this.prices;
    } else {
      json[r'prices'] = null;
    }
    if (this.warehouse != null) {
      json[r'warehouse'] = this.warehouse;
    } else {
      json[r'warehouse'] = null;
    }
    if (this.details != null) {
      json[r'details'] = this.details;
    } else {
      json[r'details'] = null;
    }
    if (this.cisList != null) {
      json[r'cisList'] = this.cisList;
    } else {
      json[r'cisList'] = null;
    }
    if (this.initialCount != null) {
      json[r'initialCount'] = this.initialCount;
    } else {
      json[r'initialCount'] = null;
    }
    if (this.bidFee != null) {
      json[r'bidFee'] = this.bidFee;
    } else {
      json[r'bidFee'] = null;
    }
    if (this.cofinanceThreshold != null) {
      json[r'cofinanceThreshold'] = this.cofinanceThreshold;
    } else {
      json[r'cofinanceThreshold'] = null;
    }
    if (this.cofinanceValue != null) {
      json[r'cofinanceValue'] = this.cofinanceValue;
    } else {
      json[r'cofinanceValue'] = null;
    }
    return json;
  }

  /// Returns a new [OrdersStatsItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsItemDTO(
        offerName: mapValueOfType<String>(json, r'offerName'),
        marketSku: mapValueOfType<int>(json, r'marketSku'),
        shopSku: mapValueOfType<String>(json, r'shopSku'),
        count: mapValueOfType<int>(json, r'count'),
        prices: OrdersStatsPriceDTO.listFromJson(json[r'prices']),
        warehouse: OrdersStatsWarehouseDTO.fromJson(json[r'warehouse']),
        details: OrdersStatsDetailsDTO.listFromJson(json[r'details']),
        cisList: json[r'cisList'] is Iterable
            ? (json[r'cisList'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        initialCount: mapValueOfType<int>(json, r'initialCount'),
        bidFee: mapValueOfType<int>(json, r'bidFee'),
        cofinanceThreshold: num.parse('${json[r'cofinanceThreshold']}'),
        cofinanceValue: num.parse('${json[r'cofinanceValue']}'),
      );
    }
    return null;
  }

  static List<OrdersStatsItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsItemDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsItemDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

