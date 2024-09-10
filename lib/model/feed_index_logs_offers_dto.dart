//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedIndexLogsOffersDTO {
  /// Returns a new [FeedIndexLogsOffersDTO] instance.
  FeedIndexLogsOffersDTO({
    this.rejectedCount,
    this.totalCount,
  });

  /// Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? rejectedCount;

  /// Количество предложений в прайс-листе.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedIndexLogsOffersDTO &&
    other.rejectedCount == rejectedCount &&
    other.totalCount == totalCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rejectedCount == null ? 0 : rejectedCount!.hashCode) +
    (totalCount == null ? 0 : totalCount!.hashCode);

  @override
  String toString() => 'FeedIndexLogsOffersDTO[rejectedCount=$rejectedCount, totalCount=$totalCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.rejectedCount != null) {
      json[r'rejectedCount'] = this.rejectedCount;
    } else {
      json[r'rejectedCount'] = null;
    }
    if (this.totalCount != null) {
      json[r'totalCount'] = this.totalCount;
    } else {
      json[r'totalCount'] = null;
    }
    return json;
  }

  /// Returns a new [FeedIndexLogsOffersDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedIndexLogsOffersDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedIndexLogsOffersDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedIndexLogsOffersDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedIndexLogsOffersDTO(
        rejectedCount: mapValueOfType<int>(json, r'rejectedCount'),
        totalCount: mapValueOfType<int>(json, r'totalCount'),
      );
    }
    return null;
  }

  static List<FeedIndexLogsOffersDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedIndexLogsOffersDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedIndexLogsOffersDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedIndexLogsOffersDTO> mapFromJson(dynamic json) {
    final map = <String, FeedIndexLogsOffersDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedIndexLogsOffersDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedIndexLogsOffersDTO-objects as value to a dart map
  static Map<String, List<FeedIndexLogsOffersDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedIndexLogsOffersDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedIndexLogsOffersDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

