//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetGoodsFeedbackCommentsRequest {
  /// Returns a new [GetGoodsFeedbackCommentsRequest] instance.
  GetGoodsFeedbackCommentsRequest({
    required this.feedbackId,
  });

  /// Идентификатор отзыва. 
  int feedbackId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetGoodsFeedbackCommentsRequest &&
    other.feedbackId == feedbackId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedbackId.hashCode);

  @override
  String toString() => 'GetGoodsFeedbackCommentsRequest[feedbackId=$feedbackId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'feedbackId'] = this.feedbackId;
    return json;
  }

  /// Returns a new [GetGoodsFeedbackCommentsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetGoodsFeedbackCommentsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetGoodsFeedbackCommentsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetGoodsFeedbackCommentsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetGoodsFeedbackCommentsRequest(
        feedbackId: mapValueOfType<int>(json, r'feedbackId')!,
      );
    }
    return null;
  }

  static List<GetGoodsFeedbackCommentsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetGoodsFeedbackCommentsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetGoodsFeedbackCommentsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetGoodsFeedbackCommentsRequest> mapFromJson(dynamic json) {
    final map = <String, GetGoodsFeedbackCommentsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetGoodsFeedbackCommentsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetGoodsFeedbackCommentsRequest-objects as value to a dart map
  static Map<String, List<GetGoodsFeedbackCommentsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetGoodsFeedbackCommentsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetGoodsFeedbackCommentsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feedbackId',
  };
}

