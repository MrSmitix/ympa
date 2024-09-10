//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOrderStatusRequest {
  /// Returns a new [UpdateOrderStatusRequest] instance.
  UpdateOrderStatusRequest({
    required this.order,
  });

  OrderStatusChangeDTO order;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOrderStatusRequest &&
    other.order == order;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (order.hashCode);

  @override
  String toString() => 'UpdateOrderStatusRequest[order=$order]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'order'] = this.order;
    return json;
  }

  /// Returns a new [UpdateOrderStatusRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOrderStatusRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOrderStatusRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOrderStatusRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOrderStatusRequest(
        order: OrderStatusChangeDTO.fromJson(json[r'order'])!,
      );
    }
    return null;
  }

  static List<UpdateOrderStatusRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOrderStatusRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOrderStatusRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOrderStatusRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateOrderStatusRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOrderStatusRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOrderStatusRequest-objects as value to a dart map
  static Map<String, List<UpdateOrderStatusRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOrderStatusRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOrderStatusRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'order',
  };
}

