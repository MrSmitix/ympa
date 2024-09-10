//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedPublicationFullDTO {
  /// Returns a new [FeedPublicationFullDTO] instance.
  FeedPublicationFullDTO({
    this.fileTime,
    this.publishedTime,
  });

  /// Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? fileTime;

  /// Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? publishedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedPublicationFullDTO &&
    other.fileTime == fileTime &&
    other.publishedTime == publishedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileTime == null ? 0 : fileTime!.hashCode) +
    (publishedTime == null ? 0 : publishedTime!.hashCode);

  @override
  String toString() => 'FeedPublicationFullDTO[fileTime=$fileTime, publishedTime=$publishedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fileTime != null) {
      json[r'fileTime'] = this.fileTime!.toUtc().toIso8601String();
    } else {
      json[r'fileTime'] = null;
    }
    if (this.publishedTime != null) {
      json[r'publishedTime'] = this.publishedTime!.toUtc().toIso8601String();
    } else {
      json[r'publishedTime'] = null;
    }
    return json;
  }

  /// Returns a new [FeedPublicationFullDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedPublicationFullDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedPublicationFullDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedPublicationFullDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedPublicationFullDTO(
        fileTime: mapDateTime(json, r'fileTime', r''),
        publishedTime: mapDateTime(json, r'publishedTime', r''),
      );
    }
    return null;
  }

  static List<FeedPublicationFullDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedPublicationFullDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedPublicationFullDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedPublicationFullDTO> mapFromJson(dynamic json) {
    final map = <String, FeedPublicationFullDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedPublicationFullDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedPublicationFullDTO-objects as value to a dart map
  static Map<String, List<FeedPublicationFullDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedPublicationFullDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedPublicationFullDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

