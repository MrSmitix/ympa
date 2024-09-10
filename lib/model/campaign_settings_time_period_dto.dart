//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignSettingsTimePeriodDTO {
  /// Returns a new [CampaignSettingsTimePeriodDTO] instance.
  CampaignSettingsTimePeriodDTO({
    this.fromDate,
    this.toDate,
  });

  /// Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fromDate;

  /// Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? toDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignSettingsTimePeriodDTO &&
    other.fromDate == fromDate &&
    other.toDate == toDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fromDate == null ? 0 : fromDate!.hashCode) +
    (toDate == null ? 0 : toDate!.hashCode);

  @override
  String toString() => 'CampaignSettingsTimePeriodDTO[fromDate=$fromDate, toDate=$toDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fromDate != null) {
      json[r'fromDate'] = this.fromDate;
    } else {
      json[r'fromDate'] = null;
    }
    if (this.toDate != null) {
      json[r'toDate'] = this.toDate;
    } else {
      json[r'toDate'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignSettingsTimePeriodDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignSettingsTimePeriodDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignSettingsTimePeriodDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignSettingsTimePeriodDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignSettingsTimePeriodDTO(
        fromDate: mapValueOfType<String>(json, r'fromDate'),
        toDate: mapValueOfType<String>(json, r'toDate'),
      );
    }
    return null;
  }

  static List<CampaignSettingsTimePeriodDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignSettingsTimePeriodDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignSettingsTimePeriodDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignSettingsTimePeriodDTO> mapFromJson(dynamic json) {
    final map = <String, CampaignSettingsTimePeriodDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignSettingsTimePeriodDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignSettingsTimePeriodDTO-objects as value to a dart map
  static Map<String, List<CampaignSettingsTimePeriodDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignSettingsTimePeriodDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignSettingsTimePeriodDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

