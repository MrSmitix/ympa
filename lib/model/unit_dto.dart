//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UnitDTO {
  /// Returns a new [UnitDTO] instance.
  UnitDTO({
    required this.id,
    required this.name,
    required this.fullName,
  });

  /// Идентификатор единицы измерения.
  int id;

  /// Сокращенное название единицы измерения.
  String name;

  /// Полное название единицы измерения.
  String fullName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UnitDTO &&
    other.id == id &&
    other.name == name &&
    other.fullName == fullName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (fullName.hashCode);

  @override
  String toString() => 'UnitDTO[id=$id, name=$name, fullName=$fullName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'fullName'] = this.fullName;
    return json;
  }

  /// Returns a new [UnitDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UnitDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UnitDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UnitDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UnitDTO(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        fullName: mapValueOfType<String>(json, r'fullName')!,
      );
    }
    return null;
  }

  static List<UnitDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UnitDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UnitDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UnitDTO> mapFromJson(dynamic json) {
    final map = <String, UnitDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UnitDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UnitDTO-objects as value to a dart map
  static Map<String, List<UnitDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UnitDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UnitDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'fullName',
  };
}

