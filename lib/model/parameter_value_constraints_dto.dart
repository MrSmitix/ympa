//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ParameterValueConstraintsDTO {
  /// Returns a new [ParameterValueConstraintsDTO] instance.
  ParameterValueConstraintsDTO({
    this.minValue,
    this.maxValue,
    this.maxLength,
  });

  /// Минимальное число.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? minValue;

  /// Максимальное число.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? maxValue;

  /// Максимальная длина текста.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxLength;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ParameterValueConstraintsDTO &&
    other.minValue == minValue &&
    other.maxValue == maxValue &&
    other.maxLength == maxLength;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minValue == null ? 0 : minValue!.hashCode) +
    (maxValue == null ? 0 : maxValue!.hashCode) +
    (maxLength == null ? 0 : maxLength!.hashCode);

  @override
  String toString() => 'ParameterValueConstraintsDTO[minValue=$minValue, maxValue=$maxValue, maxLength=$maxLength]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.minValue != null) {
      json[r'minValue'] = this.minValue;
    } else {
      json[r'minValue'] = null;
    }
    if (this.maxValue != null) {
      json[r'maxValue'] = this.maxValue;
    } else {
      json[r'maxValue'] = null;
    }
    if (this.maxLength != null) {
      json[r'maxLength'] = this.maxLength;
    } else {
      json[r'maxLength'] = null;
    }
    return json;
  }

  /// Returns a new [ParameterValueConstraintsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ParameterValueConstraintsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ParameterValueConstraintsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ParameterValueConstraintsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ParameterValueConstraintsDTO(
        minValue: mapValueOfType<double>(json, r'minValue'),
        maxValue: mapValueOfType<double>(json, r'maxValue'),
        maxLength: mapValueOfType<int>(json, r'maxLength'),
      );
    }
    return null;
  }

  static List<ParameterValueConstraintsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ParameterValueConstraintsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ParameterValueConstraintsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ParameterValueConstraintsDTO> mapFromJson(dynamic json) {
    final map = <String, ParameterValueConstraintsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ParameterValueConstraintsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ParameterValueConstraintsDTO-objects as value to a dart map
  static Map<String, List<ParameterValueConstraintsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ParameterValueConstraintsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ParameterValueConstraintsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

