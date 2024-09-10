//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedbackAuthorDTO {
  /// Returns a new [FeedbackAuthorDTO] instance.
  FeedbackAuthorDTO({
    this.name,
    this.region,
  });

  /// Имя автора отзыва.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RegionDTO? region;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedbackAuthorDTO &&
    other.name == name &&
    other.region == region;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (region == null ? 0 : region!.hashCode);

  @override
  String toString() => 'FeedbackAuthorDTO[name=$name, region=$region]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.region != null) {
      json[r'region'] = this.region;
    } else {
      json[r'region'] = null;
    }
    return json;
  }

  /// Returns a new [FeedbackAuthorDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedbackAuthorDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedbackAuthorDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedbackAuthorDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedbackAuthorDTO(
        name: mapValueOfType<String>(json, r'name'),
        region: RegionDTO.fromJson(json[r'region']),
      );
    }
    return null;
  }

  static List<FeedbackAuthorDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackAuthorDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackAuthorDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedbackAuthorDTO> mapFromJson(dynamic json) {
    final map = <String, FeedbackAuthorDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedbackAuthorDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedbackAuthorDTO-objects as value to a dart map
  static Map<String, List<FeedbackAuthorDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedbackAuthorDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedbackAuthorDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

