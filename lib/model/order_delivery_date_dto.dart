//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderDeliveryDateDTO {
  /// Returns a new [OrderDeliveryDateDTO] instance.
  OrderDeliveryDateDTO({
    required this.toDate,
  });

  /// Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  DateTime toDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderDeliveryDateDTO &&
    other.toDate == toDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (toDate.hashCode);

  @override
  String toString() => 'OrderDeliveryDateDTO[toDate=$toDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'toDate'] = _dateFormatter.format(this.toDate.toUtc());
    return json;
  }

  /// Returns a new [OrderDeliveryDateDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderDeliveryDateDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderDeliveryDateDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderDeliveryDateDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderDeliveryDateDTO(
        toDate: mapDateTime(json, r'toDate', r'')!,
      );
    }
    return null;
  }

  static List<OrderDeliveryDateDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryDateDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryDateDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderDeliveryDateDTO> mapFromJson(dynamic json) {
    final map = <String, OrderDeliveryDateDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderDeliveryDateDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderDeliveryDateDTO-objects as value to a dart map
  static Map<String, List<OrderDeliveryDateDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderDeliveryDateDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderDeliveryDateDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'toDate',
  };
}

