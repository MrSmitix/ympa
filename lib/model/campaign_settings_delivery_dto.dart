//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignSettingsDeliveryDTO {
  /// Returns a new [CampaignSettingsDeliveryDTO] instance.
  CampaignSettingsDeliveryDTO({
    this.schedule,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignSettingsScheduleDTO? schedule;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignSettingsDeliveryDTO &&
    other.schedule == schedule;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedule == null ? 0 : schedule!.hashCode);

  @override
  String toString() => 'CampaignSettingsDeliveryDTO[schedule=$schedule]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedule != null) {
      json[r'schedule'] = this.schedule;
    } else {
      json[r'schedule'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignSettingsDeliveryDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignSettingsDeliveryDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignSettingsDeliveryDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignSettingsDeliveryDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignSettingsDeliveryDTO(
        schedule: CampaignSettingsScheduleDTO.fromJson(json[r'schedule']),
      );
    }
    return null;
  }

  static List<CampaignSettingsDeliveryDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignSettingsDeliveryDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignSettingsDeliveryDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignSettingsDeliveryDTO> mapFromJson(dynamic json) {
    final map = <String, CampaignSettingsDeliveryDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignSettingsDeliveryDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignSettingsDeliveryDTO-objects as value to a dart map
  static Map<String, List<CampaignSettingsDeliveryDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignSettingsDeliveryDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignSettingsDeliveryDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

