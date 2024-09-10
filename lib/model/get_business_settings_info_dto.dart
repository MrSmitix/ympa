//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetBusinessSettingsInfoDTO {
  /// Returns a new [GetBusinessSettingsInfoDTO] instance.
  GetBusinessSettingsInfoDTO({
    this.info,
    this.settings,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BusinessDTO? info;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BusinessSettingsDTO? settings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetBusinessSettingsInfoDTO &&
    other.info == info &&
    other.settings == settings;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (info == null ? 0 : info!.hashCode) +
    (settings == null ? 0 : settings!.hashCode);

  @override
  String toString() => 'GetBusinessSettingsInfoDTO[info=$info, settings=$settings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.info != null) {
      json[r'info'] = this.info;
    } else {
      json[r'info'] = null;
    }
    if (this.settings != null) {
      json[r'settings'] = this.settings;
    } else {
      json[r'settings'] = null;
    }
    return json;
  }

  /// Returns a new [GetBusinessSettingsInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetBusinessSettingsInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetBusinessSettingsInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetBusinessSettingsInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetBusinessSettingsInfoDTO(
        info: BusinessDTO.fromJson(json[r'info']),
        settings: BusinessSettingsDTO.fromJson(json[r'settings']),
      );
    }
    return null;
  }

  static List<GetBusinessSettingsInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetBusinessSettingsInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetBusinessSettingsInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetBusinessSettingsInfoDTO> mapFromJson(dynamic json) {
    final map = <String, GetBusinessSettingsInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetBusinessSettingsInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetBusinessSettingsInfoDTO-objects as value to a dart map
  static Map<String, List<GetBusinessSettingsInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetBusinessSettingsInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetBusinessSettingsInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

