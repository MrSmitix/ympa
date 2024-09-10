//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiForbiddenErrorResponse {
  /// Returns a new [ApiForbiddenErrorResponse] instance.
  ApiForbiddenErrorResponse({
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
  bool operator ==(Object other) => identical(this, other) || other is ApiForbiddenErrorResponse &&
    other.status == status &&
    _deepEquality.equals(other.errors, errors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (errors == null ? 0 : errors!.hashCode);

  @override
  String toString() => 'ApiForbiddenErrorResponse[status=$status, errors=$errors]';

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

  /// Returns a new [ApiForbiddenErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ApiForbiddenErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ApiForbiddenErrorResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ApiForbiddenErrorResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ApiForbiddenErrorResponse(
        status: ApiResponseStatusType.fromJson(json[r'status']),
        errors: ApiErrorDTO.listFromJson(json[r'errors']),
      );
    }
    return null;
  }

  static List<ApiForbiddenErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ApiForbiddenErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ApiForbiddenErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ApiForbiddenErrorResponse> mapFromJson(dynamic json) {
    final map = <String, ApiForbiddenErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ApiForbiddenErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ApiForbiddenErrorResponse-objects as value to a dart map
  static Map<String, List<ApiForbiddenErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ApiForbiddenErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ApiForbiddenErrorResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

