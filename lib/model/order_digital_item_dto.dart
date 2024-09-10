//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderDigitalItemDTO {
  /// Returns a new [OrderDigitalItemDTO] instance.
  OrderDigitalItemDTO({
    required this.id,
    required this.code,
    required this.slip,
    required this.activateTill,
  });

  /// Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  int id;

  /// Сам ключ.
  String code;

  /// Инструкция по активации.
  String slip;

  /// Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
  DateTime activateTill;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderDigitalItemDTO &&
    other.id == id &&
    other.code == code &&
    other.slip == slip &&
    other.activateTill == activateTill;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (code.hashCode) +
    (slip.hashCode) +
    (activateTill.hashCode);

  @override
  String toString() => 'OrderDigitalItemDTO[id=$id, code=$code, slip=$slip, activateTill=$activateTill]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'code'] = this.code;
      json[r'slip'] = this.slip;
      json[r'activate_till'] = _dateFormatter.format(this.activateTill.toUtc());
    return json;
  }

  /// Returns a new [OrderDigitalItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderDigitalItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderDigitalItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderDigitalItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderDigitalItemDTO(
        id: mapValueOfType<int>(json, r'id')!,
        code: mapValueOfType<String>(json, r'code')!,
        slip: mapValueOfType<String>(json, r'slip')!,
        activateTill: mapDateTime(json, r'activate_till', r'')!,
      );
    }
    return null;
  }

  static List<OrderDigitalItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDigitalItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDigitalItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderDigitalItemDTO> mapFromJson(dynamic json) {
    final map = <String, OrderDigitalItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderDigitalItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderDigitalItemDTO-objects as value to a dart map
  static Map<String, List<OrderDigitalItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderDigitalItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderDigitalItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'code',
    'slip',
    'activate_till',
  };
}

