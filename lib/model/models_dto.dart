//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModelsDTO {
  /// Returns a new [ModelsDTO] instance.
  ModelsDTO({
    this.models = const [],
  });

  /// Список моделей товаров.
  List<ModelDTO> models;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModelsDTO &&
    _deepEquality.equals(other.models, models);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (models.hashCode);

  @override
  String toString() => 'ModelsDTO[models=$models]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'models'] = this.models;
    return json;
  }

  /// Returns a new [ModelsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModelsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModelsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModelsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModelsDTO(
        models: ModelDTO.listFromJson(json[r'models']),
      );
    }
    return null;
  }

  static List<ModelsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModelsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModelsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModelsDTO> mapFromJson(dynamic json) {
    final map = <String, ModelsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModelsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModelsDTO-objects as value to a dart map
  static Map<String, List<ModelsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModelsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModelsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'models',
  };
}

