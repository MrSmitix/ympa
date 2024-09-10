//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VerifyOrderEacRequest {
  /// Returns a new [VerifyOrderEacRequest] instance.
  VerifyOrderEacRequest({
    this.code,
  });

  /// Код для подтверждения ЭАПП.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VerifyOrderEacRequest &&
    other.code == code;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code == null ? 0 : code!.hashCode);

  @override
  String toString() => 'VerifyOrderEacRequest[code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    return json;
  }

  /// Returns a new [VerifyOrderEacRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VerifyOrderEacRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VerifyOrderEacRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VerifyOrderEacRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VerifyOrderEacRequest(
        code: mapValueOfType<String>(json, r'code'),
      );
    }
    return null;
  }

  static List<VerifyOrderEacRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VerifyOrderEacRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VerifyOrderEacRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VerifyOrderEacRequest> mapFromJson(dynamic json) {
    final map = <String, VerifyOrderEacRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VerifyOrderEacRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VerifyOrderEacRequest-objects as value to a dart map
  static Map<String, List<VerifyOrderEacRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VerifyOrderEacRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VerifyOrderEacRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

