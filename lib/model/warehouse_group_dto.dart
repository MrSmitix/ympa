//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarehouseGroupDTO {
  /// Returns a new [WarehouseGroupDTO] instance.
  WarehouseGroupDTO({
    required this.name,
    required this.mainWarehouse,
    this.warehouses = const [],
  });

  /// Название группы складов.
  String name;

  WarehouseDTO mainWarehouse;

  /// Список складов, входящих в группу.
  List<WarehouseDTO> warehouses;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarehouseGroupDTO &&
    other.name == name &&
    other.mainWarehouse == mainWarehouse &&
    _deepEquality.equals(other.warehouses, warehouses);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (mainWarehouse.hashCode) +
    (warehouses.hashCode);

  @override
  String toString() => 'WarehouseGroupDTO[name=$name, mainWarehouse=$mainWarehouse, warehouses=$warehouses]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'mainWarehouse'] = this.mainWarehouse;
      json[r'warehouses'] = this.warehouses;
    return json;
  }

  /// Returns a new [WarehouseGroupDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarehouseGroupDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarehouseGroupDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarehouseGroupDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarehouseGroupDTO(
        name: mapValueOfType<String>(json, r'name')!,
        mainWarehouse: WarehouseDTO.fromJson(json[r'mainWarehouse'])!,
        warehouses: WarehouseDTO.listFromJson(json[r'warehouses']),
      );
    }
    return null;
  }

  static List<WarehouseGroupDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehouseGroupDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehouseGroupDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarehouseGroupDTO> mapFromJson(dynamic json) {
    final map = <String, WarehouseGroupDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarehouseGroupDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarehouseGroupDTO-objects as value to a dart map
  static Map<String, List<WarehouseGroupDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarehouseGroupDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarehouseGroupDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'mainWarehouse',
    'warehouses',
  };
}

