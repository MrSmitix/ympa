//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOfferMappingDTO {
  /// Returns a new [UpdateOfferMappingDTO] instance.
  UpdateOfferMappingDTO({
    required this.offer,
    this.mapping,
  });

  UpdateOfferDTO offer;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  UpdateMappingDTO? mapping;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOfferMappingDTO &&
    other.offer == offer &&
    other.mapping == mapping;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offer.hashCode) +
    (mapping == null ? 0 : mapping!.hashCode);

  @override
  String toString() => 'UpdateOfferMappingDTO[offer=$offer, mapping=$mapping]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offer'] = this.offer;
    if (this.mapping != null) {
      json[r'mapping'] = this.mapping;
    } else {
      json[r'mapping'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateOfferMappingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOfferMappingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOfferMappingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOfferMappingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOfferMappingDTO(
        offer: UpdateOfferDTO.fromJson(json[r'offer'])!,
        mapping: UpdateMappingDTO.fromJson(json[r'mapping']),
      );
    }
    return null;
  }

  static List<UpdateOfferMappingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOfferMappingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOfferMappingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOfferMappingDTO> mapFromJson(dynamic json) {
    final map = <String, UpdateOfferMappingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOfferMappingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOfferMappingDTO-objects as value to a dart map
  static Map<String, List<UpdateOfferMappingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOfferMappingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOfferMappingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offer',
  };
}

