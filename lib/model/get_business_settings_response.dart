//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetBusinessSettingsResponse {
  /// Returns a new [GetBusinessSettingsResponse] instance.
  GetBusinessSettingsResponse({
    this.status,
    this.result,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ApiResponseStatusType? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GetBusinessSettingsInfoDTO? result;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetBusinessSettingsResponse &&
    other.status == status &&
    other.result == result;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (result == null ? 0 : result!.hashCode);

  @override
  String toString() => 'GetBusinessSettingsResponse[status=$status, result=$result]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.result != null) {
      json[r'result'] = this.result;
    } else {
      json[r'result'] = null;
    }
    return json;
  }

  /// Returns a new [GetBusinessSettingsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetBusinessSettingsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetBusinessSettingsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetBusinessSettingsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetBusinessSettingsResponse(
        status: ApiResponseStatusType.fromJson(json[r'status']),
        result: GetBusinessSettingsInfoDTO.fromJson(json[r'result']),
      );
    }
    return null;
  }

  static List<GetBusinessSettingsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetBusinessSettingsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetBusinessSettingsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetBusinessSettingsResponse> mapFromJson(dynamic json) {
    final map = <String, GetBusinessSettingsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetBusinessSettingsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetBusinessSettingsResponse-objects as value to a dart map
  static Map<String, List<GetBusinessSettingsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetBusinessSettingsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetBusinessSettingsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

