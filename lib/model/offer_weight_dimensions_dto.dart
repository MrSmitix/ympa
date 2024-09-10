//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferWeightDimensionsDTO {
  /// Returns a new [OfferWeightDimensionsDTO] instance.
  OfferWeightDimensionsDTO({
    required this.length,
    required this.width,
    required this.height,
    required this.weight,
  });

  /// Длина упаковки в см. 
  num length;

  /// Ширина упаковки в см. 
  num width;

  /// Высота упаковки в см. 
  num height;

  /// Вес товара в кг с учетом упаковки (брутто). 
  num weight;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferWeightDimensionsDTO &&
    other.length == length &&
    other.width == width &&
    other.height == height &&
    other.weight == weight;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (length.hashCode) +
    (width.hashCode) +
    (height.hashCode) +
    (weight.hashCode);

  @override
  String toString() => 'OfferWeightDimensionsDTO[length=$length, width=$width, height=$height, weight=$weight]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'length'] = this.length;
      json[r'width'] = this.width;
      json[r'height'] = this.height;
      json[r'weight'] = this.weight;
    return json;
  }

  /// Returns a new [OfferWeightDimensionsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferWeightDimensionsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferWeightDimensionsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferWeightDimensionsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferWeightDimensionsDTO(
        length: num.parse('${json[r'length']}'),
        width: num.parse('${json[r'width']}'),
        height: num.parse('${json[r'height']}'),
        weight: num.parse('${json[r'weight']}'),
      );
    }
    return null;
  }

  static List<OfferWeightDimensionsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferWeightDimensionsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferWeightDimensionsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferWeightDimensionsDTO> mapFromJson(dynamic json) {
    final map = <String, OfferWeightDimensionsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferWeightDimensionsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferWeightDimensionsDTO-objects as value to a dart map
  static Map<String, List<OfferWeightDimensionsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferWeightDimensionsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferWeightDimensionsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'length',
    'width',
    'height',
    'weight',
  };
}

