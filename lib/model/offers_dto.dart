//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OffersDTO {
  /// Returns a new [OffersDTO] instance.
  OffersDTO({
    this.offers = const [],
  });

  /// Список предложений магазина.
  List<OfferDTO> offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OffersDTO &&
    _deepEquality.equals(other.offers, offers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offers.hashCode);

  @override
  String toString() => 'OffersDTO[offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offers'] = this.offers;
    return json;
  }

  /// Returns a new [OffersDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OffersDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OffersDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OffersDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OffersDTO(
        offers: OfferDTO.listFromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<OffersDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OffersDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OffersDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OffersDTO> mapFromJson(dynamic json) {
    final map = <String, OffersDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OffersDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OffersDTO-objects as value to a dart map
  static Map<String, List<OffersDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OffersDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OffersDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offers',
  };
}

