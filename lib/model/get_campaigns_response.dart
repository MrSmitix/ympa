//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetCampaignsResponse {
  /// Returns a new [GetCampaignsResponse] instance.
  GetCampaignsResponse({
    this.campaigns = const [],
    this.pager,
  });

  /// Список с информацией по каждому магазину.
  List<CampaignDTO> campaigns;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FlippingPagerDTO? pager;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetCampaignsResponse &&
    _deepEquality.equals(other.campaigns, campaigns) &&
    other.pager == pager;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaigns.hashCode) +
    (pager == null ? 0 : pager!.hashCode);

  @override
  String toString() => 'GetCampaignsResponse[campaigns=$campaigns, pager=$pager]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaigns'] = this.campaigns;
    if (this.pager != null) {
      json[r'pager'] = this.pager;
    } else {
      json[r'pager'] = null;
    }
    return json;
  }

  /// Returns a new [GetCampaignsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetCampaignsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetCampaignsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetCampaignsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetCampaignsResponse(
        campaigns: CampaignDTO.listFromJson(json[r'campaigns']),
        pager: FlippingPagerDTO.fromJson(json[r'pager']),
      );
    }
    return null;
  }

  static List<GetCampaignsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetCampaignsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetCampaignsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetCampaignsResponse> mapFromJson(dynamic json) {
    final map = <String, GetCampaignsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetCampaignsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetCampaignsResponse-objects as value to a dart map
  static Map<String, List<GetCampaignsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetCampaignsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetCampaignsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaigns',
  };
}

