//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetCampaignResponse {
  /// Returns a new [GetCampaignResponse] instance.
  GetCampaignResponse({
    this.campaign,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignDTO? campaign;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetCampaignResponse &&
    other.campaign == campaign;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaign == null ? 0 : campaign!.hashCode);

  @override
  String toString() => 'GetCampaignResponse[campaign=$campaign]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.campaign != null) {
      json[r'campaign'] = this.campaign;
    } else {
      json[r'campaign'] = null;
    }
    return json;
  }

  /// Returns a new [GetCampaignResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetCampaignResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetCampaignResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetCampaignResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetCampaignResponse(
        campaign: CampaignDTO.fromJson(json[r'campaign']),
      );
    }
    return null;
  }

  static List<GetCampaignResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetCampaignResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetCampaignResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetCampaignResponse> mapFromJson(dynamic json) {
    final map = <String, GetCampaignResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetCampaignResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetCampaignResponse-objects as value to a dart map
  static Map<String, List<GetCampaignResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetCampaignResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetCampaignResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

