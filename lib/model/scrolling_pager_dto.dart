//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ScrollingPagerDTO {
  /// Returns a new [ScrollingPagerDTO] instance.
  ScrollingPagerDTO({
    this.nextPageToken,
    this.prevPageToken,
  });

  /// Идентификатор следующей страницы результатов.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? nextPageToken;

  /// Идентификатор предыдущей страницы результатов.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? prevPageToken;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ScrollingPagerDTO &&
    other.nextPageToken == nextPageToken &&
    other.prevPageToken == prevPageToken;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (nextPageToken == null ? 0 : nextPageToken!.hashCode) +
    (prevPageToken == null ? 0 : prevPageToken!.hashCode);

  @override
  String toString() => 'ScrollingPagerDTO[nextPageToken=$nextPageToken, prevPageToken=$prevPageToken]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.nextPageToken != null) {
      json[r'nextPageToken'] = this.nextPageToken;
    } else {
      json[r'nextPageToken'] = null;
    }
    if (this.prevPageToken != null) {
      json[r'prevPageToken'] = this.prevPageToken;
    } else {
      json[r'prevPageToken'] = null;
    }
    return json;
  }

  /// Returns a new [ScrollingPagerDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ScrollingPagerDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ScrollingPagerDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ScrollingPagerDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ScrollingPagerDTO(
        nextPageToken: mapValueOfType<String>(json, r'nextPageToken'),
        prevPageToken: mapValueOfType<String>(json, r'prevPageToken'),
      );
    }
    return null;
  }

  static List<ScrollingPagerDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScrollingPagerDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScrollingPagerDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ScrollingPagerDTO> mapFromJson(dynamic json) {
    final map = <String, ScrollingPagerDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ScrollingPagerDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ScrollingPagerDTO-objects as value to a dart map
  static Map<String, List<ScrollingPagerDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ScrollingPagerDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ScrollingPagerDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

