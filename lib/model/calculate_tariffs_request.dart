//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CalculateTariffsRequest {
  /// Returns a new [CalculateTariffsRequest] instance.
  CalculateTariffsRequest({
    required this.parameters,
    this.offers = const [],
  });

  CalculateTariffsParametersDTO parameters;

  /// Товары, для которых нужно рассчитать стоимость услуг.
  List<CalculateTariffsOfferDTO> offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CalculateTariffsRequest &&
    other.parameters == parameters &&
    _deepEquality.equals(other.offers, offers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (parameters.hashCode) +
    (offers.hashCode);

  @override
  String toString() => 'CalculateTariffsRequest[parameters=$parameters, offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'parameters'] = this.parameters;
      json[r'offers'] = this.offers;
    return json;
  }

  /// Returns a new [CalculateTariffsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CalculateTariffsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CalculateTariffsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CalculateTariffsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CalculateTariffsRequest(
        parameters: CalculateTariffsParametersDTO.fromJson(json[r'parameters'])!,
        offers: CalculateTariffsOfferDTO.listFromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<CalculateTariffsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CalculateTariffsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CalculateTariffsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CalculateTariffsRequest> mapFromJson(dynamic json) {
    final map = <String, CalculateTariffsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CalculateTariffsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CalculateTariffsRequest-objects as value to a dart map
  static Map<String, List<CalculateTariffsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CalculateTariffsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CalculateTariffsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'parameters',
    'offers',
  };
}

