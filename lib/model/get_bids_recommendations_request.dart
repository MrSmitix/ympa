//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetBidsRecommendationsRequest {
  /// Returns a new [GetBidsRecommendationsRequest] instance.
  GetBidsRecommendationsRequest({
    this.skus = const [],
  });

  /// Список товаров, для которых нужно получить рекомендации по ставкам. 
  List<String> skus;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetBidsRecommendationsRequest &&
    _deepEquality.equals(other.skus, skus);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (skus.hashCode);

  @override
  String toString() => 'GetBidsRecommendationsRequest[skus=$skus]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'skus'] = this.skus;
    return json;
  }

  /// Returns a new [GetBidsRecommendationsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetBidsRecommendationsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetBidsRecommendationsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetBidsRecommendationsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetBidsRecommendationsRequest(
        skus: json[r'skus'] is Iterable
            ? (json[r'skus'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GetBidsRecommendationsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetBidsRecommendationsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetBidsRecommendationsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetBidsRecommendationsRequest> mapFromJson(dynamic json) {
    final map = <String, GetBidsRecommendationsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetBidsRecommendationsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetBidsRecommendationsRequest-objects as value to a dart map
  static Map<String, List<GetBidsRecommendationsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetBidsRecommendationsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetBidsRecommendationsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'skus',
  };
}

