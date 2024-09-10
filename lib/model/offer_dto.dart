//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferDTO {
  /// Returns a new [OfferDTO] instance.
  OfferDTO({
    this.price,
    this.feedId,
    this.id,
    this.shopCategoryId,
    this.marketCategoryId,
    this.preDiscountPrice,
    this.discount,
    this.cutPrice,
    this.url,
    required this.modelId,
    this.name,
    this.currency,
    this.bid,
    this.cbid,
    this.fee,
    this.blocked,
  });

  /// Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  /// Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? feedId;

  /// Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopCategoryId;

  /// Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketCategoryId;

  /// Цена предложения без скидки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? preDiscountPrice;

  /// Скидка на предложение в процентах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? discount;

  /// Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? cutPrice;

  /// URL-адрес предложения на сайте магазина.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  /// Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
  int modelId;

  /// Наименование предложения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CurrencyType? currency;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? bid;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? cbid;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? fee;

  /// Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? blocked;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferDTO &&
    other.price == price &&
    other.feedId == feedId &&
    other.id == id &&
    other.shopCategoryId == shopCategoryId &&
    other.marketCategoryId == marketCategoryId &&
    other.preDiscountPrice == preDiscountPrice &&
    other.discount == discount &&
    other.cutPrice == cutPrice &&
    other.url == url &&
    other.modelId == modelId &&
    other.name == name &&
    other.currency == currency &&
    other.bid == bid &&
    other.cbid == cbid &&
    other.fee == fee &&
    other.blocked == blocked;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (price == null ? 0 : price!.hashCode) +
    (feedId == null ? 0 : feedId!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (shopCategoryId == null ? 0 : shopCategoryId!.hashCode) +
    (marketCategoryId == null ? 0 : marketCategoryId!.hashCode) +
    (preDiscountPrice == null ? 0 : preDiscountPrice!.hashCode) +
    (discount == null ? 0 : discount!.hashCode) +
    (cutPrice == null ? 0 : cutPrice!.hashCode) +
    (url == null ? 0 : url!.hashCode) +
    (modelId.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (bid == null ? 0 : bid!.hashCode) +
    (cbid == null ? 0 : cbid!.hashCode) +
    (fee == null ? 0 : fee!.hashCode) +
    (blocked == null ? 0 : blocked!.hashCode);

  @override
  String toString() => 'OfferDTO[price=$price, feedId=$feedId, id=$id, shopCategoryId=$shopCategoryId, marketCategoryId=$marketCategoryId, preDiscountPrice=$preDiscountPrice, discount=$discount, cutPrice=$cutPrice, url=$url, modelId=$modelId, name=$name, currency=$currency, bid=$bid, cbid=$cbid, fee=$fee, blocked=$blocked]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.feedId != null) {
      json[r'feedId'] = this.feedId;
    } else {
      json[r'feedId'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.shopCategoryId != null) {
      json[r'shopCategoryId'] = this.shopCategoryId;
    } else {
      json[r'shopCategoryId'] = null;
    }
    if (this.marketCategoryId != null) {
      json[r'marketCategoryId'] = this.marketCategoryId;
    } else {
      json[r'marketCategoryId'] = null;
    }
    if (this.preDiscountPrice != null) {
      json[r'preDiscountPrice'] = this.preDiscountPrice;
    } else {
      json[r'preDiscountPrice'] = null;
    }
    if (this.discount != null) {
      json[r'discount'] = this.discount;
    } else {
      json[r'discount'] = null;
    }
    if (this.cutPrice != null) {
      json[r'cutPrice'] = this.cutPrice;
    } else {
      json[r'cutPrice'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
      json[r'modelId'] = this.modelId;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.bid != null) {
      json[r'bid'] = this.bid;
    } else {
      json[r'bid'] = null;
    }
    if (this.cbid != null) {
      json[r'cbid'] = this.cbid;
    } else {
      json[r'cbid'] = null;
    }
    if (this.fee != null) {
      json[r'fee'] = this.fee;
    } else {
      json[r'fee'] = null;
    }
    if (this.blocked != null) {
      json[r'blocked'] = this.blocked;
    } else {
      json[r'blocked'] = null;
    }
    return json;
  }

  /// Returns a new [OfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferDTO(
        price: num.parse('${json[r'price']}'),
        feedId: mapValueOfType<int>(json, r'feedId'),
        id: mapValueOfType<String>(json, r'id'),
        shopCategoryId: mapValueOfType<String>(json, r'shopCategoryId'),
        marketCategoryId: mapValueOfType<int>(json, r'marketCategoryId'),
        preDiscountPrice: num.parse('${json[r'preDiscountPrice']}'),
        discount: mapValueOfType<int>(json, r'discount'),
        cutPrice: mapValueOfType<bool>(json, r'cutPrice'),
        url: mapValueOfType<String>(json, r'url'),
        modelId: mapValueOfType<int>(json, r'modelId')!,
        name: mapValueOfType<String>(json, r'name'),
        currency: CurrencyType.fromJson(json[r'currency']),
        bid: num.parse('${json[r'bid']}'),
        cbid: num.parse('${json[r'cbid']}'),
        fee: num.parse('${json[r'fee']}'),
        blocked: mapValueOfType<bool>(json, r'blocked'),
      );
    }
    return null;
  }

  static List<OfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferDTO> mapFromJson(dynamic json) {
    final map = <String, OfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferDTO-objects as value to a dart map
  static Map<String, List<OfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'modelId',
  };
}

