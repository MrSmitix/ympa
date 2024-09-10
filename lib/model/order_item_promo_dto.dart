//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderItemPromoDTO {
  /// Returns a new [OrderItemPromoDTO] instance.
  OrderItemPromoDTO({
    required this.type,
    this.discount,
    this.subsidy,
    this.shopPromoId,
    this.marketPromoId,
  });

  OrderPromoType type;

  /// Размер пользовательской скидки в валюте покупателя. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? discount;

  /// Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? subsidy;

  /// Идентификатор акции поставщика. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopPromoId;

  /// Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? marketPromoId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderItemPromoDTO &&
    other.type == type &&
    other.discount == discount &&
    other.subsidy == subsidy &&
    other.shopPromoId == shopPromoId &&
    other.marketPromoId == marketPromoId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (discount == null ? 0 : discount!.hashCode) +
    (subsidy == null ? 0 : subsidy!.hashCode) +
    (shopPromoId == null ? 0 : shopPromoId!.hashCode) +
    (marketPromoId == null ? 0 : marketPromoId!.hashCode);

  @override
  String toString() => 'OrderItemPromoDTO[type=$type, discount=$discount, subsidy=$subsidy, shopPromoId=$shopPromoId, marketPromoId=$marketPromoId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.discount != null) {
      json[r'discount'] = this.discount;
    } else {
      json[r'discount'] = null;
    }
    if (this.subsidy != null) {
      json[r'subsidy'] = this.subsidy;
    } else {
      json[r'subsidy'] = null;
    }
    if (this.shopPromoId != null) {
      json[r'shopPromoId'] = this.shopPromoId;
    } else {
      json[r'shopPromoId'] = null;
    }
    if (this.marketPromoId != null) {
      json[r'marketPromoId'] = this.marketPromoId;
    } else {
      json[r'marketPromoId'] = null;
    }
    return json;
  }

  /// Returns a new [OrderItemPromoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderItemPromoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderItemPromoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderItemPromoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderItemPromoDTO(
        type: OrderPromoType.fromJson(json[r'type'])!,
        discount: num.parse('${json[r'discount']}'),
        subsidy: num.parse('${json[r'subsidy']}'),
        shopPromoId: mapValueOfType<String>(json, r'shopPromoId'),
        marketPromoId: mapValueOfType<String>(json, r'marketPromoId'),
      );
    }
    return null;
  }

  static List<OrderItemPromoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemPromoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemPromoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderItemPromoDTO> mapFromJson(dynamic json) {
    final map = <String, OrderItemPromoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderItemPromoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderItemPromoDTO-objects as value to a dart map
  static Map<String, List<OrderItemPromoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderItemPromoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderItemPromoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

