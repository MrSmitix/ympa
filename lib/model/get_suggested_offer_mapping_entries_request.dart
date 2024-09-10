//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetSuggestedOfferMappingEntriesRequest {
  /// Returns a new [GetSuggestedOfferMappingEntriesRequest] instance.
  GetSuggestedOfferMappingEntriesRequest({
    this.offers = const [],
  });

  /// Список товаров.
  List<MappingsOfferDTO> offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetSuggestedOfferMappingEntriesRequest &&
    _deepEquality.equals(other.offers, offers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offers.hashCode);

  @override
  String toString() => 'GetSuggestedOfferMappingEntriesRequest[offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offers'] = this.offers;
    return json;
  }

  /// Returns a new [GetSuggestedOfferMappingEntriesRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetSuggestedOfferMappingEntriesRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetSuggestedOfferMappingEntriesRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetSuggestedOfferMappingEntriesRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetSuggestedOfferMappingEntriesRequest(
        offers: MappingsOfferDTO.listFromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<GetSuggestedOfferMappingEntriesRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetSuggestedOfferMappingEntriesRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetSuggestedOfferMappingEntriesRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetSuggestedOfferMappingEntriesRequest> mapFromJson(dynamic json) {
    final map = <String, GetSuggestedOfferMappingEntriesRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetSuggestedOfferMappingEntriesRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetSuggestedOfferMappingEntriesRequest-objects as value to a dart map
  static Map<String, List<GetSuggestedOfferMappingEntriesRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetSuggestedOfferMappingEntriesRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetSuggestedOfferMappingEntriesRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offers',
  };
}

