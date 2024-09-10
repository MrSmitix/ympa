//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CategoryDTO {
  /// Returns a new [CategoryDTO] instance.
  CategoryDTO({
    required this.id,
    required this.name,
    this.children = const [],
  });

  /// Идентификатор категории.
  int id;

  /// Название категории.
  String name;

  /// Дочерние категории.
  List<CategoryDTO>? children;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CategoryDTO &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.children, children);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (children == null ? 0 : children!.hashCode);

  @override
  String toString() => 'CategoryDTO[id=$id, name=$name, children=$children]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.children != null) {
      json[r'children'] = this.children;
    } else {
      json[r'children'] = null;
    }
    return json;
  }

  /// Returns a new [CategoryDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CategoryDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CategoryDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CategoryDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CategoryDTO(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        children: CategoryDTO.listFromJson(json[r'children']),
      );
    }
    return null;
  }

  static List<CategoryDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CategoryDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CategoryDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CategoryDTO> mapFromJson(dynamic json) {
    final map = <String, CategoryDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CategoryDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CategoryDTO-objects as value to a dart map
  static Map<String, List<CategoryDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CategoryDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CategoryDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
  };
}

