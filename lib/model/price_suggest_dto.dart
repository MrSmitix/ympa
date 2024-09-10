//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PriceSuggestDTO {
  /// Returns a new [PriceSuggestDTO] instance.
  PriceSuggestDTO({
    this.type,
    this.price,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PriceSuggestType? type;

  /// Цена в рублях.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PriceSuggestDTO &&
    other.type == type &&
    other.price == price;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (price == null ? 0 : price!.hashCode);

  @override
  String toString() => 'PriceSuggestDTO[type=$type, price=$price]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    return json;
  }

  /// Returns a new [PriceSuggestDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PriceSuggestDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PriceSuggestDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PriceSuggestDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PriceSuggestDTO(
        type: PriceSuggestType.fromJson(json[r'type']),
        price: num.parse('${json[r'price']}'),
      );
    }
    return null;
  }

  static List<PriceSuggestDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceSuggestDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceSuggestDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PriceSuggestDTO> mapFromJson(dynamic json) {
    final map = <String, PriceSuggestDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PriceSuggestDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PriceSuggestDTO-objects as value to a dart map
  static Map<String, List<PriceSuggestDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PriceSuggestDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PriceSuggestDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

