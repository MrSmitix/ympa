//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferMappingInfoDTO {
  /// Returns a new [OfferMappingInfoDTO] instance.
  OfferMappingInfoDTO({
    this.mapping,
    this.awaitingModerationMapping,
    this.rejectedMapping,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferMappingDTO? mapping;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferMappingDTO? awaitingModerationMapping;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferMappingDTO? rejectedMapping;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferMappingInfoDTO &&
    other.mapping == mapping &&
    other.awaitingModerationMapping == awaitingModerationMapping &&
    other.rejectedMapping == rejectedMapping;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mapping == null ? 0 : mapping!.hashCode) +
    (awaitingModerationMapping == null ? 0 : awaitingModerationMapping!.hashCode) +
    (rejectedMapping == null ? 0 : rejectedMapping!.hashCode);

  @override
  String toString() => 'OfferMappingInfoDTO[mapping=$mapping, awaitingModerationMapping=$awaitingModerationMapping, rejectedMapping=$rejectedMapping]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mapping != null) {
      json[r'mapping'] = this.mapping;
    } else {
      json[r'mapping'] = null;
    }
    if (this.awaitingModerationMapping != null) {
      json[r'awaitingModerationMapping'] = this.awaitingModerationMapping;
    } else {
      json[r'awaitingModerationMapping'] = null;
    }
    if (this.rejectedMapping != null) {
      json[r'rejectedMapping'] = this.rejectedMapping;
    } else {
      json[r'rejectedMapping'] = null;
    }
    return json;
  }

  /// Returns a new [OfferMappingInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferMappingInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferMappingInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferMappingInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferMappingInfoDTO(
        mapping: OfferMappingDTO.fromJson(json[r'mapping']),
        awaitingModerationMapping: OfferMappingDTO.fromJson(json[r'awaitingModerationMapping']),
        rejectedMapping: OfferMappingDTO.fromJson(json[r'rejectedMapping']),
      );
    }
    return null;
  }

  static List<OfferMappingInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferMappingInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferMappingInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferMappingInfoDTO> mapFromJson(dynamic json) {
    final map = <String, OfferMappingInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferMappingInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferMappingInfoDTO-objects as value to a dart map
  static Map<String, List<OfferMappingInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferMappingInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferMappingInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

