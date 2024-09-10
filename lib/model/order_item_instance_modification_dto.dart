//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderItemInstanceModificationDTO {
  /// Returns a new [OrderItemInstanceModificationDTO] instance.
  OrderItemInstanceModificationDTO({
    required this.id,
    this.instances = const [],
  });

  /// Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  int id;

  /// Список кодов маркировки единиц товара. 
  List<BriefOrderItemInstanceDTO> instances;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderItemInstanceModificationDTO &&
    other.id == id &&
    _deepEquality.equals(other.instances, instances);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (instances.hashCode);

  @override
  String toString() => 'OrderItemInstanceModificationDTO[id=$id, instances=$instances]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'instances'] = this.instances;
    return json;
  }

  /// Returns a new [OrderItemInstanceModificationDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderItemInstanceModificationDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderItemInstanceModificationDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderItemInstanceModificationDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderItemInstanceModificationDTO(
        id: mapValueOfType<int>(json, r'id')!,
        instances: BriefOrderItemInstanceDTO.listFromJson(json[r'instances']),
      );
    }
    return null;
  }

  static List<OrderItemInstanceModificationDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemInstanceModificationDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemInstanceModificationDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderItemInstanceModificationDTO> mapFromJson(dynamic json) {
    final map = <String, OrderItemInstanceModificationDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderItemInstanceModificationDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderItemInstanceModificationDTO-objects as value to a dart map
  static Map<String, List<OrderItemInstanceModificationDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderItemInstanceModificationDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderItemInstanceModificationDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'instances',
  };
}

