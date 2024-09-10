//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignDTO {
  /// Returns a new [CampaignDTO] instance.
  CampaignDTO({
    this.domain,
    this.id,
    this.clientId,
    this.business,
    this.placementType,
  });

  /// URL магазина.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? domain;

  /// Идентификатор кампании.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Идентификатор плательщика в Яндекс Балансе.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? clientId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BusinessDTO? business;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PlacementType? placementType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignDTO &&
    other.domain == domain &&
    other.id == id &&
    other.clientId == clientId &&
    other.business == business &&
    other.placementType == placementType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (domain == null ? 0 : domain!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (clientId == null ? 0 : clientId!.hashCode) +
    (business == null ? 0 : business!.hashCode) +
    (placementType == null ? 0 : placementType!.hashCode);

  @override
  String toString() => 'CampaignDTO[domain=$domain, id=$id, clientId=$clientId, business=$business, placementType=$placementType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.domain != null) {
      json[r'domain'] = this.domain;
    } else {
      json[r'domain'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.clientId != null) {
      json[r'clientId'] = this.clientId;
    } else {
      json[r'clientId'] = null;
    }
    if (this.business != null) {
      json[r'business'] = this.business;
    } else {
      json[r'business'] = null;
    }
    if (this.placementType != null) {
      json[r'placementType'] = this.placementType;
    } else {
      json[r'placementType'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignDTO(
        domain: mapValueOfType<String>(json, r'domain'),
        id: mapValueOfType<int>(json, r'id'),
        clientId: mapValueOfType<int>(json, r'clientId'),
        business: BusinessDTO.fromJson(json[r'business']),
        placementType: PlacementType.fromJson(json[r'placementType']),
      );
    }
    return null;
  }

  static List<CampaignDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignDTO> mapFromJson(dynamic json) {
    final map = <String, CampaignDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignDTO-objects as value to a dart map
  static Map<String, List<CampaignDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

