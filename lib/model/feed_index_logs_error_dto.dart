//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedIndexLogsErrorDTO {
  /// Returns a new [FeedIndexLogsErrorDTO] instance.
  FeedIndexLogsErrorDTO({
    this.httpStatusCode,
    this.type,
    this.description,
  });

  /// HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? httpStatusCode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedIndexLogsErrorType? type;

  /// Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedIndexLogsErrorDTO &&
    other.httpStatusCode == httpStatusCode &&
    other.type == type &&
    other.description == description;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (httpStatusCode == null ? 0 : httpStatusCode!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (description == null ? 0 : description!.hashCode);

  @override
  String toString() => 'FeedIndexLogsErrorDTO[httpStatusCode=$httpStatusCode, type=$type, description=$description]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.httpStatusCode != null) {
      json[r'httpStatusCode'] = this.httpStatusCode;
    } else {
      json[r'httpStatusCode'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    return json;
  }

  /// Returns a new [FeedIndexLogsErrorDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedIndexLogsErrorDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedIndexLogsErrorDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedIndexLogsErrorDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedIndexLogsErrorDTO(
        httpStatusCode: mapValueOfType<int>(json, r'httpStatusCode'),
        type: FeedIndexLogsErrorType.fromJson(json[r'type']),
        description: mapValueOfType<String>(json, r'description'),
      );
    }
    return null;
  }

  static List<FeedIndexLogsErrorDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedIndexLogsErrorDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedIndexLogsErrorDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedIndexLogsErrorDTO> mapFromJson(dynamic json) {
    final map = <String, FeedIndexLogsErrorDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedIndexLogsErrorDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedIndexLogsErrorDTO-objects as value to a dart map
  static Map<String, List<FeedIndexLogsErrorDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedIndexLogsErrorDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedIndexLogsErrorDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

