//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersShipmentInfoDTO {
  /// Returns a new [OrdersShipmentInfoDTO] instance.
  OrdersShipmentInfoDTO({
    this.orderIdsWithLabels = const {},
    this.orderIdsWithoutLabels = const {},
  });

  /// Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
  Set<int> orderIdsWithLabels;

  /// Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
  Set<int> orderIdsWithoutLabels;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersShipmentInfoDTO &&
    _deepEquality.equals(other.orderIdsWithLabels, orderIdsWithLabels) &&
    _deepEquality.equals(other.orderIdsWithoutLabels, orderIdsWithoutLabels);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderIdsWithLabels.hashCode) +
    (orderIdsWithoutLabels.hashCode);

  @override
  String toString() => 'OrdersShipmentInfoDTO[orderIdsWithLabels=$orderIdsWithLabels, orderIdsWithoutLabels=$orderIdsWithoutLabels]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderIdsWithLabels'] = this.orderIdsWithLabels.toList(growable: false);
      json[r'orderIdsWithoutLabels'] = this.orderIdsWithoutLabels.toList(growable: false);
    return json;
  }

  /// Returns a new [OrdersShipmentInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersShipmentInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersShipmentInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersShipmentInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersShipmentInfoDTO(
        orderIdsWithLabels: json[r'orderIdsWithLabels'] is Iterable
            ? (json[r'orderIdsWithLabels'] as Iterable).cast<int>().toSet()
            : const {},
        orderIdsWithoutLabels: json[r'orderIdsWithoutLabels'] is Iterable
            ? (json[r'orderIdsWithoutLabels'] as Iterable).cast<int>().toSet()
            : const {},
      );
    }
    return null;
  }

  static List<OrdersShipmentInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersShipmentInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersShipmentInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersShipmentInfoDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersShipmentInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersShipmentInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersShipmentInfoDTO-objects as value to a dart map
  static Map<String, List<OrdersShipmentInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersShipmentInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersShipmentInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderIdsWithLabels',
    'orderIdsWithoutLabels',
  };
}

