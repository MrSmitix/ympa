//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarehousesDTO {
  /// Returns a new [WarehousesDTO] instance.
  WarehousesDTO({
    this.warehouses = const [],
    this.warehouseGroups = const [],
  });

  /// Список складов, не входящих в группы.
  List<WarehouseDTO> warehouses;

  /// Список групп складов.
  List<WarehouseGroupDTO> warehouseGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarehousesDTO &&
    _deepEquality.equals(other.warehouses, warehouses) &&
    _deepEquality.equals(other.warehouseGroups, warehouseGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (warehouses.hashCode) +
    (warehouseGroups.hashCode);

  @override
  String toString() => 'WarehousesDTO[warehouses=$warehouses, warehouseGroups=$warehouseGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'warehouses'] = this.warehouses;
      json[r'warehouseGroups'] = this.warehouseGroups;
    return json;
  }

  /// Returns a new [WarehousesDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarehousesDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarehousesDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarehousesDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarehousesDTO(
        warehouses: WarehouseDTO.listFromJson(json[r'warehouses']),
        warehouseGroups: WarehouseGroupDTO.listFromJson(json[r'warehouseGroups']),
      );
    }
    return null;
  }

  static List<WarehousesDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehousesDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehousesDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarehousesDTO> mapFromJson(dynamic json) {
    final map = <String, WarehousesDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarehousesDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarehousesDTO-objects as value to a dart map
  static Map<String, List<WarehousesDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarehousesDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarehousesDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'warehouses',
    'warehouseGroups',
  };
}

