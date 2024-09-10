//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RegionDTO {
  /// Returns a new [RegionDTO] instance.
  RegionDTO({
    this.id,
    required this.name,
    required this.type,
    this.parent,
    this.children = const [],
  });

  /// Идентификатор региона.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Название региона.
  String name;

  RegionType type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RegionDTO? parent;

  /// Дочерние регионы.
  List<RegionDTO>? children;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RegionDTO &&
    other.id == id &&
    other.name == name &&
    other.type == type &&
    other.parent == parent &&
    _deepEquality.equals(other.children, children);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name.hashCode) +
    (type.hashCode) +
    (parent == null ? 0 : parent!.hashCode) +
    (children == null ? 0 : children!.hashCode);

  @override
  String toString() => 'RegionDTO[id=$id, name=$name, type=$type, parent=$parent, children=$children]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'name'] = this.name;
      json[r'type'] = this.type;
    if (this.parent != null) {
      json[r'parent'] = this.parent;
    } else {
      json[r'parent'] = null;
    }
    if (this.children != null) {
      json[r'children'] = this.children;
    } else {
      json[r'children'] = null;
    }
    return json;
  }

  /// Returns a new [RegionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RegionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RegionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RegionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RegionDTO(
        id: mapValueOfType<int>(json, r'id'),
        name: mapValueOfType<String>(json, r'name')!,
        type: RegionType.fromJson(json[r'type'])!,
        parent: RegionDTO.fromJson(json[r'parent']),
        children: RegionDTO.listFromJson(json[r'children']),
      );
    }
    return null;
  }

  static List<RegionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RegionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RegionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RegionDTO> mapFromJson(dynamic json) {
    final map = <String, RegionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RegionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RegionDTO-objects as value to a dart map
  static Map<String, List<RegionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RegionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RegionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'type',
  };
}

