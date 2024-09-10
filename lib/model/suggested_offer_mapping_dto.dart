//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SuggestedOfferMappingDTO {
  /// Returns a new [SuggestedOfferMappingDTO] instance.
  SuggestedOfferMappingDTO({
    this.offer,
    this.mapping,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  SuggestedOfferDTO? offer;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GetMappingDTO? mapping;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SuggestedOfferMappingDTO &&
    other.offer == offer &&
    other.mapping == mapping;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offer == null ? 0 : offer!.hashCode) +
    (mapping == null ? 0 : mapping!.hashCode);

  @override
  String toString() => 'SuggestedOfferMappingDTO[offer=$offer, mapping=$mapping]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offer != null) {
      json[r'offer'] = this.offer;
    } else {
      json[r'offer'] = null;
    }
    if (this.mapping != null) {
      json[r'mapping'] = this.mapping;
    } else {
      json[r'mapping'] = null;
    }
    return json;
  }

  /// Returns a new [SuggestedOfferMappingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SuggestedOfferMappingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SuggestedOfferMappingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SuggestedOfferMappingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SuggestedOfferMappingDTO(
        offer: SuggestedOfferDTO.fromJson(json[r'offer']),
        mapping: GetMappingDTO.fromJson(json[r'mapping']),
      );
    }
    return null;
  }

  static List<SuggestedOfferMappingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SuggestedOfferMappingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SuggestedOfferMappingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SuggestedOfferMappingDTO> mapFromJson(dynamic json) {
    final map = <String, SuggestedOfferMappingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SuggestedOfferMappingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SuggestedOfferMappingDTO-objects as value to a dart map
  static Map<String, List<SuggestedOfferMappingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SuggestedOfferMappingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SuggestedOfferMappingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

