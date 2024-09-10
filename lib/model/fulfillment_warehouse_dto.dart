//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FulfillmentWarehouseDTO {
  /// Returns a new [FulfillmentWarehouseDTO] instance.
  FulfillmentWarehouseDTO({
    required this.id,
    required this.name,
    this.address,
  });

  /// Идентификатор склада.
  int id;

  /// Название склада.
  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  WarehouseAddressDTO? address;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FulfillmentWarehouseDTO &&
    other.id == id &&
    other.name == name &&
    other.address == address;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (address == null ? 0 : address!.hashCode);

  @override
  String toString() => 'FulfillmentWarehouseDTO[id=$id, name=$name, address=$address]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.address != null) {
      json[r'address'] = this.address;
    } else {
      json[r'address'] = null;
    }
    return json;
  }

  /// Returns a new [FulfillmentWarehouseDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FulfillmentWarehouseDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FulfillmentWarehouseDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FulfillmentWarehouseDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FulfillmentWarehouseDTO(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        address: WarehouseAddressDTO.fromJson(json[r'address']),
      );
    }
    return null;
  }

  static List<FulfillmentWarehouseDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FulfillmentWarehouseDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FulfillmentWarehouseDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FulfillmentWarehouseDTO> mapFromJson(dynamic json) {
    final map = <String, FulfillmentWarehouseDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FulfillmentWarehouseDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FulfillmentWarehouseDTO-objects as value to a dart map
  static Map<String, List<FulfillmentWarehouseDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FulfillmentWarehouseDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FulfillmentWarehouseDTO.listFromJson(entry.value, growable: growable,);
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

