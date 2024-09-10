//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsStatsWeightDimensionsDTO {
  /// Returns a new [GoodsStatsWeightDimensionsDTO] instance.
  GoodsStatsWeightDimensionsDTO({
    this.length,
    this.width,
    this.height,
    this.weight,
  });

  /// Длина товара в сантиметрах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? length;

  /// Ширина товара в сантиметрах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? width;

  /// Высота товара в сантиметрах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? height;

  /// Вес товара в килограммах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? weight;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsStatsWeightDimensionsDTO &&
    other.length == length &&
    other.width == width &&
    other.height == height &&
    other.weight == weight;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (length == null ? 0 : length!.hashCode) +
    (width == null ? 0 : width!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (weight == null ? 0 : weight!.hashCode);

  @override
  String toString() => 'GoodsStatsWeightDimensionsDTO[length=$length, width=$width, height=$height, weight=$weight]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.length != null) {
      json[r'length'] = this.length;
    } else {
      json[r'length'] = null;
    }
    if (this.width != null) {
      json[r'width'] = this.width;
    } else {
      json[r'width'] = null;
    }
    if (this.height != null) {
      json[r'height'] = this.height;
    } else {
      json[r'height'] = null;
    }
    if (this.weight != null) {
      json[r'weight'] = this.weight;
    } else {
      json[r'weight'] = null;
    }
    return json;
  }

  /// Returns a new [GoodsStatsWeightDimensionsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsStatsWeightDimensionsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsStatsWeightDimensionsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsStatsWeightDimensionsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsStatsWeightDimensionsDTO(
        length: num.parse('${json[r'length']}'),
        width: num.parse('${json[r'width']}'),
        height: num.parse('${json[r'height']}'),
        weight: num.parse('${json[r'weight']}'),
      );
    }
    return null;
  }

  static List<GoodsStatsWeightDimensionsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsStatsWeightDimensionsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsStatsWeightDimensionsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsStatsWeightDimensionsDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsStatsWeightDimensionsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsStatsWeightDimensionsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsStatsWeightDimensionsDTO-objects as value to a dart map
  static Map<String, List<GoodsStatsWeightDimensionsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsStatsWeightDimensionsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsStatsWeightDimensionsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

