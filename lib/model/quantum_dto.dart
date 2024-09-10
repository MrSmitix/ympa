//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QuantumDTO {
  /// Returns a new [QuantumDTO] instance.
  QuantumDTO({
    this.minQuantity,
    this.stepQuantity,
  });

  /// Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
  ///
  /// Minimum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? minQuantity;

  /// На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
  ///
  /// Minimum value: 1
  /// Maximum value: 100
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? stepQuantity;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QuantumDTO &&
    other.minQuantity == minQuantity &&
    other.stepQuantity == stepQuantity;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minQuantity == null ? 0 : minQuantity!.hashCode) +
    (stepQuantity == null ? 0 : stepQuantity!.hashCode);

  @override
  String toString() => 'QuantumDTO[minQuantity=$minQuantity, stepQuantity=$stepQuantity]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.minQuantity != null) {
      json[r'minQuantity'] = this.minQuantity;
    } else {
      json[r'minQuantity'] = null;
    }
    if (this.stepQuantity != null) {
      json[r'stepQuantity'] = this.stepQuantity;
    } else {
      json[r'stepQuantity'] = null;
    }
    return json;
  }

  /// Returns a new [QuantumDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QuantumDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QuantumDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QuantumDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QuantumDTO(
        minQuantity: mapValueOfType<int>(json, r'minQuantity'),
        stepQuantity: mapValueOfType<int>(json, r'stepQuantity'),
      );
    }
    return null;
  }

  static List<QuantumDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuantumDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuantumDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QuantumDTO> mapFromJson(dynamic json) {
    final map = <String, QuantumDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QuantumDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QuantumDTO-objects as value to a dart map
  static Map<String, List<QuantumDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QuantumDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QuantumDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

