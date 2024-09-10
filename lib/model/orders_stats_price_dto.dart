//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsPriceDTO {
  /// Returns a new [OrdersStatsPriceDTO] instance.
  OrdersStatsPriceDTO({
    this.type,
    this.costPerItem,
    this.total,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsPriceType? type;

  /// Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? costPerItem;

  /// Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? total;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsPriceDTO &&
    other.type == type &&
    other.costPerItem == costPerItem &&
    other.total == total;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (costPerItem == null ? 0 : costPerItem!.hashCode) +
    (total == null ? 0 : total!.hashCode);

  @override
  String toString() => 'OrdersStatsPriceDTO[type=$type, costPerItem=$costPerItem, total=$total]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.costPerItem != null) {
      json[r'costPerItem'] = this.costPerItem;
    } else {
      json[r'costPerItem'] = null;
    }
    if (this.total != null) {
      json[r'total'] = this.total;
    } else {
      json[r'total'] = null;
    }
    return json;
  }

  /// Returns a new [OrdersStatsPriceDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsPriceDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsPriceDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsPriceDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsPriceDTO(
        type: OrdersStatsPriceType.fromJson(json[r'type']),
        costPerItem: num.parse('${json[r'costPerItem']}'),
        total: num.parse('${json[r'total']}'),
      );
    }
    return null;
  }

  static List<OrdersStatsPriceDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsPriceDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsPriceDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsPriceDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsPriceDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsPriceDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsPriceDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsPriceDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsPriceDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsPriceDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

