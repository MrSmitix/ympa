//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetGoodsStatsRequest {
  /// Returns a new [GetGoodsStatsRequest] instance.
  GetGoodsStatsRequest({
    this.shopSkus = const {},
  });

  /// Список ваших идентификаторов SKU. 
  Set<String> shopSkus;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetGoodsStatsRequest &&
    _deepEquality.equals(other.shopSkus, shopSkus);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (shopSkus.hashCode);

  @override
  String toString() => 'GetGoodsStatsRequest[shopSkus=$shopSkus]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'shopSkus'] = this.shopSkus.toList(growable: false);
    return json;
  }

  /// Returns a new [GetGoodsStatsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetGoodsStatsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetGoodsStatsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetGoodsStatsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetGoodsStatsRequest(
        shopSkus: json[r'shopSkus'] is Iterable
            ? (json[r'shopSkus'] as Iterable).cast<String>().toSet()
            : const {},
      );
    }
    return null;
  }

  static List<GetGoodsStatsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetGoodsStatsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetGoodsStatsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetGoodsStatsRequest> mapFromJson(dynamic json) {
    final map = <String, GetGoodsStatsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetGoodsStatsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetGoodsStatsRequest-objects as value to a dart map
  static Map<String, List<GetGoodsStatsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetGoodsStatsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetGoodsStatsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'shopSkus',
  };
}

