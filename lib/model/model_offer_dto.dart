//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModelOfferDTO {
  /// Returns a new [ModelOfferDTO] instance.
  ModelOfferDTO({
    this.discount,
    this.name,
    this.pos,
    this.preDiscountPrice,
    this.price,
    this.regionId,
    this.shippingCost,
    this.shopName,
    this.shopRating,
    this.inStock,
  });

  /// Скидка на предложение в процентах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? discount;

  /// Наименование предложения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Позиция предложения в выдаче Маркета на карточке модели.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pos;

  /// Цена предложения без скидки магазина.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? preDiscountPrice;

  /// Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  /// Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? regionId;

  /// Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? shippingCost;

  /// Название магазина (в том виде, в котором отображается на Маркете).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopName;

  /// Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? shopRating;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? inStock;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModelOfferDTO &&
    other.discount == discount &&
    other.name == name &&
    other.pos == pos &&
    other.preDiscountPrice == preDiscountPrice &&
    other.price == price &&
    other.regionId == regionId &&
    other.shippingCost == shippingCost &&
    other.shopName == shopName &&
    other.shopRating == shopRating &&
    other.inStock == inStock;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (discount == null ? 0 : discount!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (pos == null ? 0 : pos!.hashCode) +
    (preDiscountPrice == null ? 0 : preDiscountPrice!.hashCode) +
    (price == null ? 0 : price!.hashCode) +
    (regionId == null ? 0 : regionId!.hashCode) +
    (shippingCost == null ? 0 : shippingCost!.hashCode) +
    (shopName == null ? 0 : shopName!.hashCode) +
    (shopRating == null ? 0 : shopRating!.hashCode) +
    (inStock == null ? 0 : inStock!.hashCode);

  @override
  String toString() => 'ModelOfferDTO[discount=$discount, name=$name, pos=$pos, preDiscountPrice=$preDiscountPrice, price=$price, regionId=$regionId, shippingCost=$shippingCost, shopName=$shopName, shopRating=$shopRating, inStock=$inStock]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.discount != null) {
      json[r'discount'] = this.discount;
    } else {
      json[r'discount'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.pos != null) {
      json[r'pos'] = this.pos;
    } else {
      json[r'pos'] = null;
    }
    if (this.preDiscountPrice != null) {
      json[r'preDiscountPrice'] = this.preDiscountPrice;
    } else {
      json[r'preDiscountPrice'] = null;
    }
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.regionId != null) {
      json[r'regionId'] = this.regionId;
    } else {
      json[r'regionId'] = null;
    }
    if (this.shippingCost != null) {
      json[r'shippingCost'] = this.shippingCost;
    } else {
      json[r'shippingCost'] = null;
    }
    if (this.shopName != null) {
      json[r'shopName'] = this.shopName;
    } else {
      json[r'shopName'] = null;
    }
    if (this.shopRating != null) {
      json[r'shopRating'] = this.shopRating;
    } else {
      json[r'shopRating'] = null;
    }
    if (this.inStock != null) {
      json[r'inStock'] = this.inStock;
    } else {
      json[r'inStock'] = null;
    }
    return json;
  }

  /// Returns a new [ModelOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModelOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModelOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModelOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModelOfferDTO(
        discount: mapValueOfType<int>(json, r'discount'),
        name: mapValueOfType<String>(json, r'name'),
        pos: mapValueOfType<int>(json, r'pos'),
        preDiscountPrice: num.parse('${json[r'preDiscountPrice']}'),
        price: num.parse('${json[r'price']}'),
        regionId: mapValueOfType<int>(json, r'regionId'),
        shippingCost: num.parse('${json[r'shippingCost']}'),
        shopName: mapValueOfType<String>(json, r'shopName'),
        shopRating: mapValueOfType<int>(json, r'shopRating'),
        inStock: mapValueOfType<int>(json, r'inStock'),
      );
    }
    return null;
  }

  static List<ModelOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModelOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModelOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModelOfferDTO> mapFromJson(dynamic json) {
    final map = <String, ModelOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModelOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModelOfferDTO-objects as value to a dart map
  static Map<String, List<ModelOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModelOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModelOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

