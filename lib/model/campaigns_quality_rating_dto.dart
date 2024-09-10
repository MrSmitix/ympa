//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignsQualityRatingDTO {
  /// Returns a new [CampaignsQualityRatingDTO] instance.
  CampaignsQualityRatingDTO({
    this.campaignRatings = const [],
  });

  /// Список магазинов c информацией об их индексе качества.
  List<CampaignQualityRatingDTO> campaignRatings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignsQualityRatingDTO &&
    _deepEquality.equals(other.campaignRatings, campaignRatings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignRatings.hashCode);

  @override
  String toString() => 'CampaignsQualityRatingDTO[campaignRatings=$campaignRatings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignRatings'] = this.campaignRatings;
    return json;
  }

  /// Returns a new [CampaignsQualityRatingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignsQualityRatingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignsQualityRatingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignsQualityRatingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignsQualityRatingDTO(
        campaignRatings: CampaignQualityRatingDTO.listFromJson(json[r'campaignRatings']),
      );
    }
    return null;
  }

  static List<CampaignsQualityRatingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignsQualityRatingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignsQualityRatingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignsQualityRatingDTO> mapFromJson(dynamic json) {
    final map = <String, CampaignsQualityRatingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignsQualityRatingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignsQualityRatingDTO-objects as value to a dart map
  static Map<String, List<CampaignsQualityRatingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignsQualityRatingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignsQualityRatingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignRatings',
  };
}

