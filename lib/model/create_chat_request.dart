//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatRequest {
  /// Returns a new [CreateChatRequest] instance.
  CreateChatRequest({
    required this.orderId,
  });

  /// Идентификатор заказа на Маркете.
  int orderId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatRequest &&
    other.orderId == orderId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderId.hashCode);

  @override
  String toString() => 'CreateChatRequest[orderId=$orderId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderId'] = this.orderId;
    return json;
  }

  /// Returns a new [CreateChatRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateChatRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateChatRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateChatRequest(
        orderId: mapValueOfType<int>(json, r'orderId')!,
      );
    }
    return null;
  }

  static List<CreateChatRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatRequest> mapFromJson(dynamic json) {
    final map = <String, CreateChatRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatRequest-objects as value to a dart map
  static Map<String, List<CreateChatRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderId',
  };
}

