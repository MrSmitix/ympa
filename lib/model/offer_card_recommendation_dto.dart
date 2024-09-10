//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferCardRecommendationDTO {
  /// Returns a new [OfferCardRecommendationDTO] instance.
  OfferCardRecommendationDTO({
    required this.type,
    this.percent,
  });

  OfferCardRecommendationType type;

  /// Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
  ///
  /// Minimum value: 0
  /// Maximum value: 100
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? percent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferCardRecommendationDTO &&
    other.type == type &&
    other.percent == percent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (percent == null ? 0 : percent!.hashCode);

  @override
  String toString() => 'OfferCardRecommendationDTO[type=$type, percent=$percent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.percent != null) {
      json[r'percent'] = this.percent;
    } else {
      json[r'percent'] = null;
    }
    return json;
  }

  /// Returns a new [OfferCardRecommendationDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferCardRecommendationDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferCardRecommendationDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferCardRecommendationDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferCardRecommendationDTO(
        type: OfferCardRecommendationType.fromJson(json[r'type'])!,
        percent: mapValueOfType<int>(json, r'percent'),
      );
    }
    return null;
  }

  static List<OfferCardRecommendationDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferCardRecommendationDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferCardRecommendationDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferCardRecommendationDTO> mapFromJson(dynamic json) {
    final map = <String, OfferCardRecommendationDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferCardRecommendationDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferCardRecommendationDTO-objects as value to a dart map
  static Map<String, List<OfferCardRecommendationDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferCardRecommendationDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferCardRecommendationDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

