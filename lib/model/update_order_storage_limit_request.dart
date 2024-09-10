//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOrderStorageLimitRequest {
  /// Returns a new [UpdateOrderStorageLimitRequest] instance.
  UpdateOrderStorageLimitRequest({
    required this.newDate,
  });

  /// Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
  DateTime newDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOrderStorageLimitRequest &&
    other.newDate == newDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (newDate.hashCode);

  @override
  String toString() => 'UpdateOrderStorageLimitRequest[newDate=$newDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'newDate'] = _dateFormatter.format(this.newDate.toUtc());
    return json;
  }

  /// Returns a new [UpdateOrderStorageLimitRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOrderStorageLimitRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOrderStorageLimitRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOrderStorageLimitRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOrderStorageLimitRequest(
        newDate: mapDateTime(json, r'newDate', r'')!,
      );
    }
    return null;
  }

  static List<UpdateOrderStorageLimitRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOrderStorageLimitRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOrderStorageLimitRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOrderStorageLimitRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateOrderStorageLimitRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOrderStorageLimitRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOrderStorageLimitRequest-objects as value to a dart map
  static Map<String, List<UpdateOrderStorageLimitRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOrderStorageLimitRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOrderStorageLimitRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'newDate',
  };
}

