//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarehouseAddressDTO {
  /// Returns a new [WarehouseAddressDTO] instance.
  WarehouseAddressDTO({
    required this.city,
    this.street,
    this.number,
    this.building,
    this.block,
    required this.gps,
  });

  /// Город.
  String city;

  /// Улица.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? street;

  /// Номер дома.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? number;

  /// Номер строения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? building;

  /// Номер корпуса.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? block;

  GpsDTO gps;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarehouseAddressDTO &&
    other.city == city &&
    other.street == street &&
    other.number == number &&
    other.building == building &&
    other.block == block &&
    other.gps == gps;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (city.hashCode) +
    (street == null ? 0 : street!.hashCode) +
    (number == null ? 0 : number!.hashCode) +
    (building == null ? 0 : building!.hashCode) +
    (block == null ? 0 : block!.hashCode) +
    (gps.hashCode);

  @override
  String toString() => 'WarehouseAddressDTO[city=$city, street=$street, number=$number, building=$building, block=$block, gps=$gps]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'city'] = this.city;
    if (this.street != null) {
      json[r'street'] = this.street;
    } else {
      json[r'street'] = null;
    }
    if (this.number != null) {
      json[r'number'] = this.number;
    } else {
      json[r'number'] = null;
    }
    if (this.building != null) {
      json[r'building'] = this.building;
    } else {
      json[r'building'] = null;
    }
    if (this.block != null) {
      json[r'block'] = this.block;
    } else {
      json[r'block'] = null;
    }
      json[r'gps'] = this.gps;
    return json;
  }

  /// Returns a new [WarehouseAddressDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarehouseAddressDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarehouseAddressDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarehouseAddressDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarehouseAddressDTO(
        city: mapValueOfType<String>(json, r'city')!,
        street: mapValueOfType<String>(json, r'street'),
        number: mapValueOfType<String>(json, r'number'),
        building: mapValueOfType<String>(json, r'building'),
        block: mapValueOfType<String>(json, r'block'),
        gps: GpsDTO.fromJson(json[r'gps'])!,
      );
    }
    return null;
  }

  static List<WarehouseAddressDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehouseAddressDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehouseAddressDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarehouseAddressDTO> mapFromJson(dynamic json) {
    final map = <String, WarehouseAddressDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarehouseAddressDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarehouseAddressDTO-objects as value to a dart map
  static Map<String, List<WarehouseAddressDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarehouseAddressDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarehouseAddressDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'city',
    'gps',
  };
}

