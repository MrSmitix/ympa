//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateMappingDTO {
  /// Returns a new [UpdateMappingDTO] instance.
  UpdateMappingDTO({
    this.marketSku,
  });

  /// SKU на Маркете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketSku;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateMappingDTO &&
    other.marketSku == marketSku;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (marketSku == null ? 0 : marketSku!.hashCode);

  @override
  String toString() => 'UpdateMappingDTO[marketSku=$marketSku]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.marketSku != null) {
      json[r'marketSku'] = this.marketSku;
    } else {
      json[r'marketSku'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateMappingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateMappingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateMappingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateMappingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateMappingDTO(
        marketSku: mapValueOfType<int>(json, r'marketSku'),
      );
    }
    return null;
  }

  static List<UpdateMappingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMappingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMappingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateMappingDTO> mapFromJson(dynamic json) {
    final map = <String, UpdateMappingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateMappingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateMappingDTO-objects as value to a dart map
  static Map<String, List<UpdateMappingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateMappingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateMappingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

