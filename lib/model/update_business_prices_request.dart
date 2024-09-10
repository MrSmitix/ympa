//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateBusinessPricesRequest {
  /// Returns a new [UpdateBusinessPricesRequest] instance.
  UpdateBusinessPricesRequest({
    this.offers = const [],
  });

  /// Список товаров с ценами.
  List<UpdateBusinessOfferPriceDTO> offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateBusinessPricesRequest &&
    _deepEquality.equals(other.offers, offers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offers.hashCode);

  @override
  String toString() => 'UpdateBusinessPricesRequest[offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offers'] = this.offers;
    return json;
  }

  /// Returns a new [UpdateBusinessPricesRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateBusinessPricesRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateBusinessPricesRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateBusinessPricesRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateBusinessPricesRequest(
        offers: UpdateBusinessOfferPriceDTO.listFromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<UpdateBusinessPricesRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateBusinessPricesRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateBusinessPricesRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateBusinessPricesRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateBusinessPricesRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateBusinessPricesRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateBusinessPricesRequest-objects as value to a dart map
  static Map<String, List<UpdateBusinessPricesRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateBusinessPricesRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateBusinessPricesRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offers',
  };
}

