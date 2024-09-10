//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModelDTO {
  /// Returns a new [ModelDTO] instance.
  ModelDTO({
    this.id,
    this.name,
    this.prices,
  });

  /// Идентификатор модели товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Название модели товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ModelPriceDTO? prices;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModelDTO &&
    other.id == id &&
    other.name == name &&
    other.prices == prices;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (prices == null ? 0 : prices!.hashCode);

  @override
  String toString() => 'ModelDTO[id=$id, name=$name, prices=$prices]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.prices != null) {
      json[r'prices'] = this.prices;
    } else {
      json[r'prices'] = null;
    }
    return json;
  }

  /// Returns a new [ModelDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModelDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModelDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModelDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModelDTO(
        id: mapValueOfType<int>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        prices: ModelPriceDTO.fromJson(json[r'prices']),
      );
    }
    return null;
  }

  static List<ModelDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModelDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModelDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModelDTO> mapFromJson(dynamic json) {
    final map = <String, ModelDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModelDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModelDTO-objects as value to a dart map
  static Map<String, List<ModelDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModelDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModelDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

