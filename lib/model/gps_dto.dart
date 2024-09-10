//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GpsDTO {
  /// Returns a new [GpsDTO] instance.
  GpsDTO({
    required this.latitude,
    required this.longitude,
  });

  /// Широта.
  num latitude;

  /// Долгота.
  num longitude;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GpsDTO &&
    other.latitude == latitude &&
    other.longitude == longitude;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (latitude.hashCode) +
    (longitude.hashCode);

  @override
  String toString() => 'GpsDTO[latitude=$latitude, longitude=$longitude]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'latitude'] = this.latitude;
      json[r'longitude'] = this.longitude;
    return json;
  }

  /// Returns a new [GpsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GpsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GpsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GpsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GpsDTO(
        latitude: num.parse('${json[r'latitude']}'),
        longitude: num.parse('${json[r'longitude']}'),
      );
    }
    return null;
  }

  static List<GpsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GpsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GpsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GpsDTO> mapFromJson(dynamic json) {
    final map = <String, GpsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GpsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GpsDTO-objects as value to a dart map
  static Map<String, List<GpsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GpsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GpsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'latitude',
    'longitude',
  };
}

