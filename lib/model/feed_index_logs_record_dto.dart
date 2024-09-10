//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedIndexLogsRecordDTO {
  /// Returns a new [FeedIndexLogsRecordDTO] instance.
  FeedIndexLogsRecordDTO({
    this.downloadTime,
    this.fileTime,
    this.generationId,
    this.indexType,
    this.publishedTime,
    this.status,
    this.error,
    this.offers,
  });

  /// Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? downloadTime;

  /// Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? fileTime;

  /// Идентификатор индексации.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? generationId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedIndexLogsIndexType? indexType;

  /// Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? publishedTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedIndexLogsStatusType? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedIndexLogsErrorDTO? error;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedIndexLogsOffersDTO? offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedIndexLogsRecordDTO &&
    other.downloadTime == downloadTime &&
    other.fileTime == fileTime &&
    other.generationId == generationId &&
    other.indexType == indexType &&
    other.publishedTime == publishedTime &&
    other.status == status &&
    other.error == error &&
    other.offers == offers;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (downloadTime == null ? 0 : downloadTime!.hashCode) +
    (fileTime == null ? 0 : fileTime!.hashCode) +
    (generationId == null ? 0 : generationId!.hashCode) +
    (indexType == null ? 0 : indexType!.hashCode) +
    (publishedTime == null ? 0 : publishedTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (error == null ? 0 : error!.hashCode) +
    (offers == null ? 0 : offers!.hashCode);

  @override
  String toString() => 'FeedIndexLogsRecordDTO[downloadTime=$downloadTime, fileTime=$fileTime, generationId=$generationId, indexType=$indexType, publishedTime=$publishedTime, status=$status, error=$error, offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.downloadTime != null) {
      json[r'downloadTime'] = this.downloadTime!.toUtc().toIso8601String();
    } else {
      json[r'downloadTime'] = null;
    }
    if (this.fileTime != null) {
      json[r'fileTime'] = this.fileTime!.toUtc().toIso8601String();
    } else {
      json[r'fileTime'] = null;
    }
    if (this.generationId != null) {
      json[r'generationId'] = this.generationId;
    } else {
      json[r'generationId'] = null;
    }
    if (this.indexType != null) {
      json[r'indexType'] = this.indexType;
    } else {
      json[r'indexType'] = null;
    }
    if (this.publishedTime != null) {
      json[r'publishedTime'] = this.publishedTime!.toUtc().toIso8601String();
    } else {
      json[r'publishedTime'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.error != null) {
      json[r'error'] = this.error;
    } else {
      json[r'error'] = null;
    }
    if (this.offers != null) {
      json[r'offers'] = this.offers;
    } else {
      json[r'offers'] = null;
    }
    return json;
  }

  /// Returns a new [FeedIndexLogsRecordDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedIndexLogsRecordDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedIndexLogsRecordDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedIndexLogsRecordDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedIndexLogsRecordDTO(
        downloadTime: mapDateTime(json, r'downloadTime', r''),
        fileTime: mapDateTime(json, r'fileTime', r''),
        generationId: mapValueOfType<int>(json, r'generationId'),
        indexType: FeedIndexLogsIndexType.fromJson(json[r'indexType']),
        publishedTime: mapDateTime(json, r'publishedTime', r''),
        status: FeedIndexLogsStatusType.fromJson(json[r'status']),
        error: FeedIndexLogsErrorDTO.fromJson(json[r'error']),
        offers: FeedIndexLogsOffersDTO.fromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<FeedIndexLogsRecordDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedIndexLogsRecordDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedIndexLogsRecordDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedIndexLogsRecordDTO> mapFromJson(dynamic json) {
    final map = <String, FeedIndexLogsRecordDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedIndexLogsRecordDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedIndexLogsRecordDTO-objects as value to a dart map
  static Map<String, List<FeedIndexLogsRecordDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedIndexLogsRecordDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedIndexLogsRecordDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

