//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOfferMappingEntryRequest {
  /// Returns a new [UpdateOfferMappingEntryRequest] instance.
  UpdateOfferMappingEntryRequest({
    this.offerMappingEntries = const [],
  });

  /// Информация о товарах в каталоге.
  List<UpdateOfferMappingEntryDTO> offerMappingEntries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOfferMappingEntryRequest &&
    _deepEquality.equals(other.offerMappingEntries, offerMappingEntries);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerMappingEntries.hashCode);

  @override
  String toString() => 'UpdateOfferMappingEntryRequest[offerMappingEntries=$offerMappingEntries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerMappingEntries'] = this.offerMappingEntries;
    return json;
  }

  /// Returns a new [UpdateOfferMappingEntryRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOfferMappingEntryRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOfferMappingEntryRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOfferMappingEntryRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOfferMappingEntryRequest(
        offerMappingEntries: UpdateOfferMappingEntryDTO.listFromJson(json[r'offerMappingEntries']),
      );
    }
    return null;
  }

  static List<UpdateOfferMappingEntryRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOfferMappingEntryRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOfferMappingEntryRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOfferMappingEntryRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateOfferMappingEntryRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOfferMappingEntryRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOfferMappingEntryRequest-objects as value to a dart map
  static Map<String, List<UpdateOfferMappingEntryRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOfferMappingEntryRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOfferMappingEntryRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerMappingEntries',
  };
}

