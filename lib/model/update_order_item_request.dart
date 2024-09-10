//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOrderItemRequest {
  /// Returns a new [UpdateOrderItemRequest] instance.
  UpdateOrderItemRequest({
    this.items = const [],
    this.reason,
  });

  /// Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
  List<OrderItemModificationDTO> items;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderItemsModificationRequestReasonType? reason;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOrderItemRequest &&
    _deepEquality.equals(other.items, items) &&
    other.reason == reason;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (items.hashCode) +
    (reason == null ? 0 : reason!.hashCode);

  @override
  String toString() => 'UpdateOrderItemRequest[items=$items, reason=$reason]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'items'] = this.items;
    if (this.reason != null) {
      json[r'reason'] = this.reason;
    } else {
      json[r'reason'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateOrderItemRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOrderItemRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOrderItemRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOrderItemRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOrderItemRequest(
        items: OrderItemModificationDTO.listFromJson(json[r'items']),
        reason: OrderItemsModificationRequestReasonType.fromJson(json[r'reason']),
      );
    }
    return null;
  }

  static List<UpdateOrderItemRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOrderItemRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOrderItemRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOrderItemRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateOrderItemRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOrderItemRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOrderItemRequest-objects as value to a dart map
  static Map<String, List<UpdateOrderItemRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOrderItemRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOrderItemRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
  };
}

