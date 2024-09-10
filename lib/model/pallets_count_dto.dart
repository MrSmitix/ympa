//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PalletsCountDTO {
  /// Returns a new [PalletsCountDTO] instance.
  PalletsCountDTO({
    this.planned,
    this.fact,
  });

  /// Количество палет, которое заявил продавец.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? planned;

  /// Количество палет, которое приняли в сортировочном центре.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? fact;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PalletsCountDTO &&
    other.planned == planned &&
    other.fact == fact;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (planned == null ? 0 : planned!.hashCode) +
    (fact == null ? 0 : fact!.hashCode);

  @override
  String toString() => 'PalletsCountDTO[planned=$planned, fact=$fact]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.planned != null) {
      json[r'planned'] = this.planned;
    } else {
      json[r'planned'] = null;
    }
    if (this.fact != null) {
      json[r'fact'] = this.fact;
    } else {
      json[r'fact'] = null;
    }
    return json;
  }

  /// Returns a new [PalletsCountDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PalletsCountDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PalletsCountDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PalletsCountDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PalletsCountDTO(
        planned: mapValueOfType<int>(json, r'planned'),
        fact: mapValueOfType<int>(json, r'fact'),
      );
    }
    return null;
  }

  static List<PalletsCountDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PalletsCountDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PalletsCountDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PalletsCountDTO> mapFromJson(dynamic json) {
    final map = <String, PalletsCountDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PalletsCountDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PalletsCountDTO-objects as value to a dart map
  static Map<String, List<PalletsCountDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PalletsCountDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PalletsCountDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

