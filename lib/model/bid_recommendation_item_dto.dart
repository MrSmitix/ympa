//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidRecommendationItemDTO {
  /// Returns a new [BidRecommendationItemDTO] instance.
  BidRecommendationItemDTO({
    required this.bid,
    required this.showPercent,
  });

  /// Значение ставки.
  ///
  /// Minimum value: 0
  /// Maximum value: 9999
  int bid;

  /// Доля показов. 
  ///
  /// Minimum value: 0
  /// Maximum value: 100
  int showPercent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidRecommendationItemDTO &&
    other.bid == bid &&
    other.showPercent == showPercent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bid.hashCode) +
    (showPercent.hashCode);

  @override
  String toString() => 'BidRecommendationItemDTO[bid=$bid, showPercent=$showPercent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bid'] = this.bid;
      json[r'showPercent'] = this.showPercent;
    return json;
  }

  /// Returns a new [BidRecommendationItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidRecommendationItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BidRecommendationItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BidRecommendationItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BidRecommendationItemDTO(
        bid: mapValueOfType<int>(json, r'bid')!,
        showPercent: mapValueOfType<int>(json, r'showPercent')!,
      );
    }
    return null;
  }

  static List<BidRecommendationItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidRecommendationItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidRecommendationItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidRecommendationItemDTO> mapFromJson(dynamic json) {
    final map = <String, BidRecommendationItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidRecommendationItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidRecommendationItemDTO-objects as value to a dart map
  static Map<String, List<BidRecommendationItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidRecommendationItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidRecommendationItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'bid',
    'showPercent',
  };
}

