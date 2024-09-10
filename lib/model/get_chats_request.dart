//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetChatsRequest {
  /// Returns a new [GetChatsRequest] instance.
  GetChatsRequest({
    this.orderIds = const [],
    this.types = const [],
    this.statuses = const [],
  });

  /// Фильтр по идентификаторам заказов на Маркете.
  List<int>? orderIds;

  /// Фильтр по типам чатов.
  List<ChatType>? types;

  /// Фильтр по статусам чатов.
  List<ChatStatusType>? statuses;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetChatsRequest &&
    _deepEquality.equals(other.orderIds, orderIds) &&
    _deepEquality.equals(other.types, types) &&
    _deepEquality.equals(other.statuses, statuses);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderIds == null ? 0 : orderIds!.hashCode) +
    (types == null ? 0 : types!.hashCode) +
    (statuses == null ? 0 : statuses!.hashCode);

  @override
  String toString() => 'GetChatsRequest[orderIds=$orderIds, types=$types, statuses=$statuses]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orderIds != null) {
      json[r'orderIds'] = this.orderIds;
    } else {
      json[r'orderIds'] = null;
    }
    if (this.types != null) {
      json[r'types'] = this.types;
    } else {
      json[r'types'] = null;
    }
    if (this.statuses != null) {
      json[r'statuses'] = this.statuses;
    } else {
      json[r'statuses'] = null;
    }
    return json;
  }

  /// Returns a new [GetChatsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetChatsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetChatsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetChatsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetChatsRequest(
        orderIds: json[r'orderIds'] is Iterable
            ? (json[r'orderIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        types: ChatType.listFromJson(json[r'types']),
        statuses: ChatStatusType.listFromJson(json[r'statuses']),
      );
    }
    return null;
  }

  static List<GetChatsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetChatsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetChatsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetChatsRequest> mapFromJson(dynamic json) {
    final map = <String, GetChatsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetChatsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetChatsRequest-objects as value to a dart map
  static Map<String, List<GetChatsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetChatsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetChatsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

