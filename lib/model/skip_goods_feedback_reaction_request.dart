//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SkipGoodsFeedbackReactionRequest {
  /// Returns a new [SkipGoodsFeedbackReactionRequest] instance.
  SkipGoodsFeedbackReactionRequest({
    this.feedbackIds = const {},
  });

  /// Список идентификаторов отзывов, на которые магазин не будет отвечать.
  Set<int> feedbackIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SkipGoodsFeedbackReactionRequest &&
    _deepEquality.equals(other.feedbackIds, feedbackIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedbackIds.hashCode);

  @override
  String toString() => 'SkipGoodsFeedbackReactionRequest[feedbackIds=$feedbackIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'feedbackIds'] = this.feedbackIds.toList(growable: false);
    return json;
  }

  /// Returns a new [SkipGoodsFeedbackReactionRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SkipGoodsFeedbackReactionRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SkipGoodsFeedbackReactionRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SkipGoodsFeedbackReactionRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SkipGoodsFeedbackReactionRequest(
        feedbackIds: json[r'feedbackIds'] is Iterable
            ? (json[r'feedbackIds'] as Iterable).cast<int>().toSet()
            : const {},
      );
    }
    return null;
  }

  static List<SkipGoodsFeedbackReactionRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SkipGoodsFeedbackReactionRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SkipGoodsFeedbackReactionRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SkipGoodsFeedbackReactionRequest> mapFromJson(dynamic json) {
    final map = <String, SkipGoodsFeedbackReactionRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SkipGoodsFeedbackReactionRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SkipGoodsFeedbackReactionRequest-objects as value to a dart map
  static Map<String, List<SkipGoodsFeedbackReactionRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SkipGoodsFeedbackReactionRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SkipGoodsFeedbackReactionRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feedbackIds',
  };
}

