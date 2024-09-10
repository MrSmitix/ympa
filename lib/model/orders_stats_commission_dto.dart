//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsCommissionDTO {
  /// Returns a new [OrdersStatsCommissionDTO] instance.
  OrdersStatsCommissionDTO({
    this.type,
    this.actual,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsCommissionType? type;

  /// Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? actual;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsCommissionDTO &&
    other.type == type &&
    other.actual == actual;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (actual == null ? 0 : actual!.hashCode);

  @override
  String toString() => 'OrdersStatsCommissionDTO[type=$type, actual=$actual]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.actual != null) {
      json[r'actual'] = this.actual;
    } else {
      json[r'actual'] = null;
    }
    return json;
  }

  /// Returns a new [OrdersStatsCommissionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsCommissionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsCommissionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsCommissionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsCommissionDTO(
        type: OrdersStatsCommissionType.fromJson(json[r'type']),
        actual: num.parse('${json[r'actual']}'),
      );
    }
    return null;
  }

  static List<OrdersStatsCommissionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsCommissionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsCommissionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsCommissionDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsCommissionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsCommissionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsCommissionDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsCommissionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsCommissionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsCommissionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

