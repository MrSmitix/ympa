//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BriefOrderItemDTO {
  /// Returns a new [BriefOrderItemDTO] instance.
  BriefOrderItemDTO({
    this.id,
    this.vat,
    this.count,
    this.price,
    this.offerName,
    this.offerId,
    this.instances = const [],
  });

  /// Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
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
  OrderVatType? vat;

  /// Количество единиц товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? count;

  /// Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  /// Название товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? offerName;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? offerId;

  /// Переданные вами коды маркировки.
  List<OrderItemInstanceDTO>? instances;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BriefOrderItemDTO &&
    other.id == id &&
    other.vat == vat &&
    other.count == count &&
    other.price == price &&
    other.offerName == offerName &&
    other.offerId == offerId &&
    _deepEquality.equals(other.instances, instances);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (vat == null ? 0 : vat!.hashCode) +
    (count == null ? 0 : count!.hashCode) +
    (price == null ? 0 : price!.hashCode) +
    (offerName == null ? 0 : offerName!.hashCode) +
    (offerId == null ? 0 : offerId!.hashCode) +
    (instances == null ? 0 : instances!.hashCode);

  @override
  String toString() => 'BriefOrderItemDTO[id=$id, vat=$vat, count=$count, price=$price, offerName=$offerName, offerId=$offerId, instances=$instances]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.vat != null) {
      json[r'vat'] = this.vat;
    } else {
      json[r'vat'] = null;
    }
    if (this.count != null) {
      json[r'count'] = this.count;
    } else {
      json[r'count'] = null;
    }
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.offerName != null) {
      json[r'offerName'] = this.offerName;
    } else {
      json[r'offerName'] = null;
    }
    if (this.offerId != null) {
      json[r'offerId'] = this.offerId;
    } else {
      json[r'offerId'] = null;
    }
    if (this.instances != null) {
      json[r'instances'] = this.instances;
    } else {
      json[r'instances'] = null;
    }
    return json;
  }

  /// Returns a new [BriefOrderItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BriefOrderItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BriefOrderItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BriefOrderItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BriefOrderItemDTO(
        id: mapValueOfType<int>(json, r'id'),
        vat: OrderVatType.fromJson(json[r'vat']),
        count: mapValueOfType<int>(json, r'count'),
        price: num.parse('${json[r'price']}'),
        offerName: mapValueOfType<String>(json, r'offerName'),
        offerId: mapValueOfType<String>(json, r'offerId'),
        instances: OrderItemInstanceDTO.listFromJson(json[r'instances']),
      );
    }
    return null;
  }

  static List<BriefOrderItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BriefOrderItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BriefOrderItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BriefOrderItemDTO> mapFromJson(dynamic json) {
    final map = <String, BriefOrderItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BriefOrderItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BriefOrderItemDTO-objects as value to a dart map
  static Map<String, List<BriefOrderItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BriefOrderItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BriefOrderItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

