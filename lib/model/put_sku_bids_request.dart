//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PutSkuBidsRequest {
  /// Returns a new [PutSkuBidsRequest] instance.
  PutSkuBidsRequest({
    this.bids = const [],
  });

  /// Список товаров и ставки для продвижения, которые на них нужно установить.
  List<SkuBidItemDTO> bids;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PutSkuBidsRequest &&
    _deepEquality.equals(other.bids, bids);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bids.hashCode);

  @override
  String toString() => 'PutSkuBidsRequest[bids=$bids]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bids'] = this.bids;
    return json;
  }

  /// Returns a new [PutSkuBidsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PutSkuBidsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PutSkuBidsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PutSkuBidsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PutSkuBidsRequest(
        bids: SkuBidItemDTO.listFromJson(json[r'bids']),
      );
    }
    return null;
  }

  static List<PutSkuBidsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PutSkuBidsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PutSkuBidsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PutSkuBidsRequest> mapFromJson(dynamic json) {
    final map = <String, PutSkuBidsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PutSkuBidsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PutSkuBidsRequest-objects as value to a dart map
  static Map<String, List<PutSkuBidsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PutSkuBidsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PutSkuBidsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'bids',
  };
}

