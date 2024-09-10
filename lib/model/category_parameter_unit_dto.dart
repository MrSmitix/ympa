//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CategoryParameterUnitDTO {
  /// Returns a new [CategoryParameterUnitDTO] instance.
  CategoryParameterUnitDTO({
    required this.defaultUnitId,
    this.units = const [],
  });

  /// Единица измерения по умолчанию.
  int defaultUnitId;

  /// Допустимые единицы измерения.
  List<UnitDTO> units;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CategoryParameterUnitDTO &&
    other.defaultUnitId == defaultUnitId &&
    _deepEquality.equals(other.units, units);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (defaultUnitId.hashCode) +
    (units.hashCode);

  @override
  String toString() => 'CategoryParameterUnitDTO[defaultUnitId=$defaultUnitId, units=$units]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'defaultUnitId'] = this.defaultUnitId;
      json[r'units'] = this.units;
    return json;
  }

  /// Returns a new [CategoryParameterUnitDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CategoryParameterUnitDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CategoryParameterUnitDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CategoryParameterUnitDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CategoryParameterUnitDTO(
        defaultUnitId: mapValueOfType<int>(json, r'defaultUnitId')!,
        units: UnitDTO.listFromJson(json[r'units']),
      );
    }
    return null;
  }

  static List<CategoryParameterUnitDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CategoryParameterUnitDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CategoryParameterUnitDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CategoryParameterUnitDTO> mapFromJson(dynamic json) {
    final map = <String, CategoryParameterUnitDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CategoryParameterUnitDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CategoryParameterUnitDTO-objects as value to a dart map
  static Map<String, List<CategoryParameterUnitDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CategoryParameterUnitDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CategoryParameterUnitDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'defaultUnitId',
    'units',
  };
}

