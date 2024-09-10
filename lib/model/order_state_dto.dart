//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderStateDTO {
  /// Returns a new [OrderStateDTO] instance.
  OrderStateDTO({
    required this.id,
    required this.status,
    this.substatus,
  });

  /// Идентификатор заказа.
  int id;

  OrderStatusType status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderSubstatusType? substatus;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderStateDTO &&
    other.id == id &&
    other.status == status &&
    other.substatus == substatus;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (status.hashCode) +
    (substatus == null ? 0 : substatus!.hashCode);

  @override
  String toString() => 'OrderStateDTO[id=$id, status=$status, substatus=$substatus]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'status'] = this.status;
    if (this.substatus != null) {
      json[r'substatus'] = this.substatus;
    } else {
      json[r'substatus'] = null;
    }
    return json;
  }

  /// Returns a new [OrderStateDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderStateDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderStateDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderStateDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderStateDTO(
        id: mapValueOfType<int>(json, r'id')!,
        status: OrderStatusType.fromJson(json[r'status'])!,
        substatus: OrderSubstatusType.fromJson(json[r'substatus']),
      );
    }
    return null;
  }

  static List<OrderStateDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderStateDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderStateDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderStateDTO> mapFromJson(dynamic json) {
    final map = <String, OrderStateDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderStateDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderStateDTO-objects as value to a dart map
  static Map<String, List<OrderStateDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderStateDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderStateDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'status',
  };
}

