//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsStatsGoodsDTO {
  /// Returns a new [GoodsStatsGoodsDTO] instance.
  GoodsStatsGoodsDTO({
    this.shopSku,
    this.marketSku,
    this.name,
    this.price,
    this.categoryId,
    this.categoryName,
    this.weightDimensions,
    this.warehouses = const [],
    this.tariffs = const [],
    this.pictures = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopSku;

  /// SKU на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketSku;

  /// Название товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  /// Идентификатор категории товара на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? categoryId;

  /// Название категории товара на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? categoryName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GoodsStatsWeightDimensionsDTO? weightDimensions;

  /// Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
  List<GoodsStatsWarehouseDTO>? warehouses;

  /// Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  List<TariffDTO>? tariffs;

  /// Ссылки (URL) изображений товара в хорошем качестве.
  List<String>? pictures;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsStatsGoodsDTO &&
    other.shopSku == shopSku &&
    other.marketSku == marketSku &&
    other.name == name &&
    other.price == price &&
    other.categoryId == categoryId &&
    other.categoryName == categoryName &&
    other.weightDimensions == weightDimensions &&
    _deepEquality.equals(other.warehouses, warehouses) &&
    _deepEquality.equals(other.tariffs, tariffs) &&
    _deepEquality.equals(other.pictures, pictures);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (shopSku == null ? 0 : shopSku!.hashCode) +
    (marketSku == null ? 0 : marketSku!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (price == null ? 0 : price!.hashCode) +
    (categoryId == null ? 0 : categoryId!.hashCode) +
    (categoryName == null ? 0 : categoryName!.hashCode) +
    (weightDimensions == null ? 0 : weightDimensions!.hashCode) +
    (warehouses == null ? 0 : warehouses!.hashCode) +
    (tariffs == null ? 0 : tariffs!.hashCode) +
    (pictures == null ? 0 : pictures!.hashCode);

  @override
  String toString() => 'GoodsStatsGoodsDTO[shopSku=$shopSku, marketSku=$marketSku, name=$name, price=$price, categoryId=$categoryId, categoryName=$categoryName, weightDimensions=$weightDimensions, warehouses=$warehouses, tariffs=$tariffs, pictures=$pictures]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.shopSku != null) {
      json[r'shopSku'] = this.shopSku;
    } else {
      json[r'shopSku'] = null;
    }
    if (this.marketSku != null) {
      json[r'marketSku'] = this.marketSku;
    } else {
      json[r'marketSku'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.categoryId != null) {
      json[r'categoryId'] = this.categoryId;
    } else {
      json[r'categoryId'] = null;
    }
    if (this.categoryName != null) {
      json[r'categoryName'] = this.categoryName;
    } else {
      json[r'categoryName'] = null;
    }
    if (this.weightDimensions != null) {
      json[r'weightDimensions'] = this.weightDimensions;
    } else {
      json[r'weightDimensions'] = null;
    }
    if (this.warehouses != null) {
      json[r'warehouses'] = this.warehouses;
    } else {
      json[r'warehouses'] = null;
    }
    if (this.tariffs != null) {
      json[r'tariffs'] = this.tariffs;
    } else {
      json[r'tariffs'] = null;
    }
    if (this.pictures != null) {
      json[r'pictures'] = this.pictures;
    } else {
      json[r'pictures'] = null;
    }
    return json;
  }

  /// Returns a new [GoodsStatsGoodsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsStatsGoodsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsStatsGoodsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsStatsGoodsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsStatsGoodsDTO(
        shopSku: mapValueOfType<String>(json, r'shopSku'),
        marketSku: mapValueOfType<int>(json, r'marketSku'),
        name: mapValueOfType<String>(json, r'name'),
        price: num.parse('${json[r'price']}'),
        categoryId: mapValueOfType<int>(json, r'categoryId'),
        categoryName: mapValueOfType<String>(json, r'categoryName'),
        weightDimensions: GoodsStatsWeightDimensionsDTO.fromJson(json[r'weightDimensions']),
        warehouses: GoodsStatsWarehouseDTO.listFromJson(json[r'warehouses']),
        tariffs: TariffDTO.listFromJson(json[r'tariffs']),
        pictures: json[r'pictures'] is Iterable
            ? (json[r'pictures'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GoodsStatsGoodsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsStatsGoodsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsStatsGoodsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsStatsGoodsDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsStatsGoodsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsStatsGoodsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsStatsGoodsDTO-objects as value to a dart map
  static Map<String, List<GoodsStatsGoodsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsStatsGoodsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsStatsGoodsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

