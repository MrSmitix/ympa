//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarehouseDTO {
  /// Returns a new [WarehouseDTO] instance.
  WarehouseDTO({
    required this.id,
    required this.name,
    required this.campaignId,
    required this.express,
    this.address,
  });

  /// Идентификатор склада.
  int id;

  /// Название склада.
  String name;

  /// Идентификатор кампании в API и идентификатор магазина.
  int campaignId;

  /// Возможна ли доставка по модели Экспресс.
  bool express;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  WarehouseAddressDTO? address;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarehouseDTO &&
    other.id == id &&
    other.name == name &&
    other.campaignId == campaignId &&
    other.express == express &&
    other.address == address;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (campaignId.hashCode) +
    (express.hashCode) +
    (address == null ? 0 : address!.hashCode);

  @override
  String toString() => 'WarehouseDTO[id=$id, name=$name, campaignId=$campaignId, express=$express, address=$address]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'campaignId'] = this.campaignId;
      json[r'express'] = this.express;
    if (this.address != null) {
      json[r'address'] = this.address;
    } else {
      json[r'address'] = null;
    }
    return json;
  }

  /// Returns a new [WarehouseDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarehouseDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarehouseDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarehouseDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarehouseDTO(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        express: mapValueOfType<bool>(json, r'express')!,
        address: WarehouseAddressDTO.fromJson(json[r'address']),
      );
    }
    return null;
  }

  static List<WarehouseDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehouseDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehouseDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarehouseDTO> mapFromJson(dynamic json) {
    final map = <String, WarehouseDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarehouseDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarehouseDTO-objects as value to a dart map
  static Map<String, List<WarehouseDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarehouseDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarehouseDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'campaignId',
    'express',
  };
}

