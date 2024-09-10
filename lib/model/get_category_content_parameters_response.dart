//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetCategoryContentParametersResponse {
  /// Returns a new [GetCategoryContentParametersResponse] instance.
  GetCategoryContentParametersResponse({
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
  CategoryContentParametersDTO? result;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetCategoryContentParametersResponse &&
    other.status == status &&
    other.result == result;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (result == null ? 0 : result!.hashCode);

  @override
  String toString() => 'GetCategoryContentParametersResponse[status=$status, result=$result]';

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

  /// Returns a new [GetCategoryContentParametersResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetCategoryContentParametersResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetCategoryContentParametersResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetCategoryContentParametersResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetCategoryContentParametersResponse(
        status: ApiResponseStatusType.fromJson(json[r'status']),
        result: CategoryContentParametersDTO.fromJson(json[r'result']),
      );
    }
    return null;
  }

  static List<GetCategoryContentParametersResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetCategoryContentParametersResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetCategoryContentParametersResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetCategoryContentParametersResponse> mapFromJson(dynamic json) {
    final map = <String, GetCategoryContentParametersResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetCategoryContentParametersResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetCategoryContentParametersResponse-objects as value to a dart map
  static Map<String, List<GetCategoryContentParametersResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetCategoryContentParametersResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetCategoryContentParametersResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

