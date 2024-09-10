//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderItemModificationDTO {
  /// Returns a new [OrderItemModificationDTO] instance.
  OrderItemModificationDTO({
    required this.id,
    required this.count,
    this.instances = const [],
  });

  /// Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
  int id;

  /// Новое количество товара.
  ///
  /// Minimum value: 0
  int count;

  /// Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
  List<BriefOrderItemInstanceDTO>? instances;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderItemModificationDTO &&
    other.id == id &&
    other.count == count &&
    _deepEquality.equals(other.instances, instances);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (count.hashCode) +
    (instances == null ? 0 : instances!.hashCode);

  @override
  String toString() => 'OrderItemModificationDTO[id=$id, count=$count, instances=$instances]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'count'] = this.count;
    if (this.instances != null) {
      json[r'instances'] = this.instances;
    } else {
      json[r'instances'] = null;
    }
    return json;
  }

  /// Returns a new [OrderItemModificationDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderItemModificationDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderItemModificationDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderItemModificationDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderItemModificationDTO(
        id: mapValueOfType<int>(json, r'id')!,
        count: mapValueOfType<int>(json, r'count')!,
        instances: BriefOrderItemInstanceDTO.listFromJson(json[r'instances']),
      );
    }
    return null;
  }

  static List<OrderItemModificationDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemModificationDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemModificationDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderItemModificationDTO> mapFromJson(dynamic json) {
    final map = <String, OrderItemModificationDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderItemModificationDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderItemModificationDTO-objects as value to a dart map
  static Map<String, List<OrderItemModificationDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderItemModificationDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderItemModificationDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'count',
  };
}

