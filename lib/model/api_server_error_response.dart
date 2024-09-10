//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiServerErrorResponse {
  /// Returns a new [ApiServerErrorResponse] instance.
  ApiServerErrorResponse({
    this.status,
    this.errors = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ApiResponseStatusType? status;

  /// Список ошибок.
  List<ApiErrorDTO>? errors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ApiServerErrorResponse &&
    other.status == status &&
    _deepEquality.equals(other.errors, errors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (errors == null ? 0 : errors!.hashCode);

  @override
  String toString() => 'ApiServerErrorResponse[status=$status, errors=$errors]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.errors != null) {
      json[r'errors'] = this.errors;
    } else {
      json[r'errors'] = null;
    }
    return json;
  }

  /// Returns a new [ApiServerErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ApiServerErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ApiServerErrorResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ApiServerErrorResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ApiServerErrorResponse(
        status: ApiResponseStatusType.fromJson(json[r'status']),
        errors: ApiErrorDTO.listFromJson(json[r'errors']),
      );
    }
    return null;
  }

  static List<ApiServerErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ApiServerErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ApiServerErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ApiServerErrorResponse> mapFromJson(dynamic json) {
    final map = <String, ApiServerErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ApiServerErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ApiServerErrorResponse-objects as value to a dart map
  static Map<String, List<ApiServerErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ApiServerErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ApiServerErrorResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

