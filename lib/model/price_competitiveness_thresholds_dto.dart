//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PriceCompetitivenessThresholdsDTO {
  /// Returns a new [PriceCompetitivenessThresholdsDTO] instance.
  PriceCompetitivenessThresholdsDTO({
    this.optimalPrice,
    this.averagePrice,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BasePriceDTO? optimalPrice;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BasePriceDTO? averagePrice;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PriceCompetitivenessThresholdsDTO &&
    other.optimalPrice == optimalPrice &&
    other.averagePrice == averagePrice;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (optimalPrice == null ? 0 : optimalPrice!.hashCode) +
    (averagePrice == null ? 0 : averagePrice!.hashCode);

  @override
  String toString() => 'PriceCompetitivenessThresholdsDTO[optimalPrice=$optimalPrice, averagePrice=$averagePrice]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.optimalPrice != null) {
      json[r'optimalPrice'] = this.optimalPrice;
    } else {
      json[r'optimalPrice'] = null;
    }
    if (this.averagePrice != null) {
      json[r'averagePrice'] = this.averagePrice;
    } else {
      json[r'averagePrice'] = null;
    }
    return json;
  }

  /// Returns a new [PriceCompetitivenessThresholdsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PriceCompetitivenessThresholdsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PriceCompetitivenessThresholdsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PriceCompetitivenessThresholdsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PriceCompetitivenessThresholdsDTO(
        optimalPrice: BasePriceDTO.fromJson(json[r'optimalPrice']),
        averagePrice: BasePriceDTO.fromJson(json[r'averagePrice']),
      );
    }
    return null;
  }

  static List<PriceCompetitivenessThresholdsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceCompetitivenessThresholdsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceCompetitivenessThresholdsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PriceCompetitivenessThresholdsDTO> mapFromJson(dynamic json) {
    final map = <String, PriceCompetitivenessThresholdsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PriceCompetitivenessThresholdsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PriceCompetitivenessThresholdsDTO-objects as value to a dart map
  static Map<String, List<PriceCompetitivenessThresholdsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PriceCompetitivenessThresholdsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PriceCompetitivenessThresholdsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

