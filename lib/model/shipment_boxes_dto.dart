//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ShipmentBoxesDTO {
  /// Returns a new [ShipmentBoxesDTO] instance.
  ShipmentBoxesDTO({
    this.boxes = const [],
  });

  /// Список грузовых мест. Маркет определил количество мест по длине этого списка. 
  List<ParcelBoxDTO> boxes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ShipmentBoxesDTO &&
    _deepEquality.equals(other.boxes, boxes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (boxes.hashCode);

  @override
  String toString() => 'ShipmentBoxesDTO[boxes=$boxes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'boxes'] = this.boxes;
    return json;
  }

  /// Returns a new [ShipmentBoxesDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ShipmentBoxesDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ShipmentBoxesDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ShipmentBoxesDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ShipmentBoxesDTO(
        boxes: ParcelBoxDTO.listFromJson(json[r'boxes']),
      );
    }
    return null;
  }

  static List<ShipmentBoxesDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentBoxesDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentBoxesDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ShipmentBoxesDTO> mapFromJson(dynamic json) {
    final map = <String, ShipmentBoxesDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ShipmentBoxesDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ShipmentBoxesDTO-objects as value to a dart map
  static Map<String, List<ShipmentBoxesDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ShipmentBoxesDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ShipmentBoxesDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'boxes',
  };
}

