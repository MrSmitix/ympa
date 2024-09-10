//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetFeedResponse {
  /// Returns a new [GetFeedResponse] instance.
  GetFeedResponse({
    this.feed,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedDTO? feed;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetFeedResponse &&
    other.feed == feed;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feed == null ? 0 : feed!.hashCode);

  @override
  String toString() => 'GetFeedResponse[feed=$feed]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.feed != null) {
      json[r'feed'] = this.feed;
    } else {
      json[r'feed'] = null;
    }
    return json;
  }

  /// Returns a new [GetFeedResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetFeedResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetFeedResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetFeedResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetFeedResponse(
        feed: FeedDTO.fromJson(json[r'feed']),
      );
    }
    return null;
  }

  static List<GetFeedResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetFeedResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetFeedResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetFeedResponse> mapFromJson(dynamic json) {
    final map = <String, GetFeedResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetFeedResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetFeedResponse-objects as value to a dart map
  static Map<String, List<GetFeedResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetFeedResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetFeedResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

