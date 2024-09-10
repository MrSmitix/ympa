//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetCampaignRegionResponse {
  /// Returns a new [GetCampaignRegionResponse] instance.
  GetCampaignRegionResponse({
    this.region,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RegionDTO? region;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetCampaignRegionResponse &&
    other.region == region;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (region == null ? 0 : region!.hashCode);

  @override
  String toString() => 'GetCampaignRegionResponse[region=$region]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.region != null) {
      json[r'region'] = this.region;
    } else {
      json[r'region'] = null;
    }
    return json;
  }

  /// Returns a new [GetCampaignRegionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetCampaignRegionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetCampaignRegionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetCampaignRegionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetCampaignRegionResponse(
        region: RegionDTO.fromJson(json[r'region']),
      );
    }
    return null;
  }

  static List<GetCampaignRegionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetCampaignRegionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetCampaignRegionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetCampaignRegionResponse> mapFromJson(dynamic json) {
    final map = <String, GetCampaignRegionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetCampaignRegionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetCampaignRegionResponse-objects as value to a dart map
  static Map<String, List<GetCampaignRegionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetCampaignRegionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetCampaignRegionResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

