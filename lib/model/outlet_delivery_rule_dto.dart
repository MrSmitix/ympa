//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OutletDeliveryRuleDTO {
  /// Returns a new [OutletDeliveryRuleDTO] instance.
  OutletDeliveryRuleDTO({
    this.minDeliveryDays,
    this.maxDeliveryDays,
    this.deliveryServiceId,
    this.orderBefore,
    this.priceFreePickup,
    this.unspecifiedDeliveryInterval,
  });

  /// Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? minDeliveryDays;

  /// Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxDeliveryDays;

  /// Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? deliveryServiceId;

  /// Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.  Значение по умолчанию: `24`. 
  ///
  /// Minimum value: 0
  /// Maximum value: 24
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? orderBefore;

  /// Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? priceFreePickup;

  /// Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * `true` — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением `true`.  Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? unspecifiedDeliveryInterval;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OutletDeliveryRuleDTO &&
    other.minDeliveryDays == minDeliveryDays &&
    other.maxDeliveryDays == maxDeliveryDays &&
    other.deliveryServiceId == deliveryServiceId &&
    other.orderBefore == orderBefore &&
    other.priceFreePickup == priceFreePickup &&
    other.unspecifiedDeliveryInterval == unspecifiedDeliveryInterval;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minDeliveryDays == null ? 0 : minDeliveryDays!.hashCode) +
    (maxDeliveryDays == null ? 0 : maxDeliveryDays!.hashCode) +
    (deliveryServiceId == null ? 0 : deliveryServiceId!.hashCode) +
    (orderBefore == null ? 0 : orderBefore!.hashCode) +
    (priceFreePickup == null ? 0 : priceFreePickup!.hashCode) +
    (unspecifiedDeliveryInterval == null ? 0 : unspecifiedDeliveryInterval!.hashCode);

  @override
  String toString() => 'OutletDeliveryRuleDTO[minDeliveryDays=$minDeliveryDays, maxDeliveryDays=$maxDeliveryDays, deliveryServiceId=$deliveryServiceId, orderBefore=$orderBefore, priceFreePickup=$priceFreePickup, unspecifiedDeliveryInterval=$unspecifiedDeliveryInterval]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.minDeliveryDays != null) {
      json[r'minDeliveryDays'] = this.minDeliveryDays;
    } else {
      json[r'minDeliveryDays'] = null;
    }
    if (this.maxDeliveryDays != null) {
      json[r'maxDeliveryDays'] = this.maxDeliveryDays;
    } else {
      json[r'maxDeliveryDays'] = null;
    }
    if (this.deliveryServiceId != null) {
      json[r'deliveryServiceId'] = this.deliveryServiceId;
    } else {
      json[r'deliveryServiceId'] = null;
    }
    if (this.orderBefore != null) {
      json[r'orderBefore'] = this.orderBefore;
    } else {
      json[r'orderBefore'] = null;
    }
    if (this.priceFreePickup != null) {
      json[r'priceFreePickup'] = this.priceFreePickup;
    } else {
      json[r'priceFreePickup'] = null;
    }
    if (this.unspecifiedDeliveryInterval != null) {
      json[r'unspecifiedDeliveryInterval'] = this.unspecifiedDeliveryInterval;
    } else {
      json[r'unspecifiedDeliveryInterval'] = null;
    }
    return json;
  }

  /// Returns a new [OutletDeliveryRuleDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OutletDeliveryRuleDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OutletDeliveryRuleDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OutletDeliveryRuleDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OutletDeliveryRuleDTO(
        minDeliveryDays: mapValueOfType<int>(json, r'minDeliveryDays'),
        maxDeliveryDays: mapValueOfType<int>(json, r'maxDeliveryDays'),
        deliveryServiceId: mapValueOfType<int>(json, r'deliveryServiceId'),
        orderBefore: mapValueOfType<int>(json, r'orderBefore'),
        priceFreePickup: num.parse('${json[r'priceFreePickup']}'),
        unspecifiedDeliveryInterval: mapValueOfType<bool>(json, r'unspecifiedDeliveryInterval'),
      );
    }
    return null;
  }

  static List<OutletDeliveryRuleDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletDeliveryRuleDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletDeliveryRuleDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OutletDeliveryRuleDTO> mapFromJson(dynamic json) {
    final map = <String, OutletDeliveryRuleDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OutletDeliveryRuleDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OutletDeliveryRuleDTO-objects as value to a dart map
  static Map<String, List<OutletDeliveryRuleDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OutletDeliveryRuleDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OutletDeliveryRuleDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

