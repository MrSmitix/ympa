//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConfirmPricesRequest {
  /// Returns a new [ConfirmPricesRequest] instance.
  ConfirmPricesRequest({
    this.offerIds = const [],
  });

  /// Идентификаторы товаров, у которых подтверждается цена.
  List<String> offerIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConfirmPricesRequest &&
    _deepEquality.equals(other.offerIds, offerIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds.hashCode);

  @override
  String toString() => 'ConfirmPricesRequest[offerIds=$offerIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerIds'] = this.offerIds;
    return json;
  }

  /// Returns a new [ConfirmPricesRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConfirmPricesRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConfirmPricesRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConfirmPricesRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConfirmPricesRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ConfirmPricesRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConfirmPricesRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConfirmPricesRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConfirmPricesRequest> mapFromJson(dynamic json) {
    final map = <String, ConfirmPricesRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConfirmPricesRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConfirmPricesRequest-objects as value to a dart map
  static Map<String, List<ConfirmPricesRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConfirmPricesRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConfirmPricesRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerIds',
  };
}

