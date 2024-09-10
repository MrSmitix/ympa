//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderBoxLayoutItemDTO {
  /// Returns a new [OrderBoxLayoutItemDTO] instance.
  OrderBoxLayoutItemDTO({
    required this.id,
    this.fullCount,
    this.partialCount,
    this.instances = const [],
  });

  /// Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
  int id;

  /// Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
  ///
  /// Minimum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? fullCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderBoxLayoutPartialCountDTO? partialCount;

  /// Переданные вами коды маркировки.
  List<BriefOrderItemInstanceDTO>? instances;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderBoxLayoutItemDTO &&
    other.id == id &&
    other.fullCount == fullCount &&
    other.partialCount == partialCount &&
    _deepEquality.equals(other.instances, instances);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (fullCount == null ? 0 : fullCount!.hashCode) +
    (partialCount == null ? 0 : partialCount!.hashCode) +
    (instances == null ? 0 : instances!.hashCode);

  @override
  String toString() => 'OrderBoxLayoutItemDTO[id=$id, fullCount=$fullCount, partialCount=$partialCount, instances=$instances]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
    if (this.fullCount != null) {
      json[r'fullCount'] = this.fullCount;
    } else {
      json[r'fullCount'] = null;
    }
    if (this.partialCount != null) {
      json[r'partialCount'] = this.partialCount;
    } else {
      json[r'partialCount'] = null;
    }
    if (this.instances != null) {
      json[r'instances'] = this.instances;
    } else {
      json[r'instances'] = null;
    }
    return json;
  }

  /// Returns a new [OrderBoxLayoutItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderBoxLayoutItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderBoxLayoutItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderBoxLayoutItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderBoxLayoutItemDTO(
        id: mapValueOfType<int>(json, r'id')!,
        fullCount: mapValueOfType<int>(json, r'fullCount'),
        partialCount: OrderBoxLayoutPartialCountDTO.fromJson(json[r'partialCount']),
        instances: BriefOrderItemInstanceDTO.listFromJson(json[r'instances']),
      );
    }
    return null;
  }

  static List<OrderBoxLayoutItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderBoxLayoutItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderBoxLayoutItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderBoxLayoutItemDTO> mapFromJson(dynamic json) {
    final map = <String, OrderBoxLayoutItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderBoxLayoutItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderBoxLayoutItemDTO-objects as value to a dart map
  static Map<String, List<OrderBoxLayoutItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderBoxLayoutItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderBoxLayoutItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

