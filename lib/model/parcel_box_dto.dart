//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ParcelBoxDTO {
  /// Returns a new [ParcelBoxDTO] instance.
  ParcelBoxDTO({
    this.id,
    this.fulfilmentId,
  });

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fulfilmentId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ParcelBoxDTO &&
    other.id == id &&
    other.fulfilmentId == fulfilmentId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (fulfilmentId == null ? 0 : fulfilmentId!.hashCode);

  @override
  String toString() => 'ParcelBoxDTO[id=$id, fulfilmentId=$fulfilmentId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.fulfilmentId != null) {
      json[r'fulfilmentId'] = this.fulfilmentId;
    } else {
      json[r'fulfilmentId'] = null;
    }
    return json;
  }

  /// Returns a new [ParcelBoxDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ParcelBoxDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ParcelBoxDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ParcelBoxDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ParcelBoxDTO(
        id: mapValueOfType<int>(json, r'id'),
        fulfilmentId: mapValueOfType<String>(json, r'fulfilmentId'),
      );
    }
    return null;
  }

  static List<ParcelBoxDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ParcelBoxDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ParcelBoxDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ParcelBoxDTO> mapFromJson(dynamic json) {
    final map = <String, ParcelBoxDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ParcelBoxDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ParcelBoxDTO-objects as value to a dart map
  static Map<String, List<ParcelBoxDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ParcelBoxDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ParcelBoxDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

