//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PickupAddressDTO {
  /// Returns a new [PickupAddressDTO] instance.
  PickupAddressDTO({
    this.country,
    this.city,
    this.street,
    this.house,
    this.postcode,
  });

  /// Страна.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? country;

  /// Город.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? city;

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
  String? house;

  /// Почтовый индекс.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? postcode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PickupAddressDTO &&
    other.country == country &&
    other.city == city &&
    other.street == street &&
    other.house == house &&
    other.postcode == postcode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country == null ? 0 : country!.hashCode) +
    (city == null ? 0 : city!.hashCode) +
    (street == null ? 0 : street!.hashCode) +
    (house == null ? 0 : house!.hashCode) +
    (postcode == null ? 0 : postcode!.hashCode);

  @override
  String toString() => 'PickupAddressDTO[country=$country, city=$city, street=$street, house=$house, postcode=$postcode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.city != null) {
      json[r'city'] = this.city;
    } else {
      json[r'city'] = null;
    }
    if (this.street != null) {
      json[r'street'] = this.street;
    } else {
      json[r'street'] = null;
    }
    if (this.house != null) {
      json[r'house'] = this.house;
    } else {
      json[r'house'] = null;
    }
    if (this.postcode != null) {
      json[r'postcode'] = this.postcode;
    } else {
      json[r'postcode'] = null;
    }
    return json;
  }

  /// Returns a new [PickupAddressDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PickupAddressDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PickupAddressDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PickupAddressDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PickupAddressDTO(
        country: mapValueOfType<String>(json, r'country'),
        city: mapValueOfType<String>(json, r'city'),
        street: mapValueOfType<String>(json, r'street'),
        house: mapValueOfType<String>(json, r'house'),
        postcode: mapValueOfType<String>(json, r'postcode'),
      );
    }
    return null;
  }

  static List<PickupAddressDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PickupAddressDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PickupAddressDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PickupAddressDTO> mapFromJson(dynamic json) {
    final map = <String, PickupAddressDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PickupAddressDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PickupAddressDTO-objects as value to a dart map
  static Map<String, List<PickupAddressDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PickupAddressDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PickupAddressDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

