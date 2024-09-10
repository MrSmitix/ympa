//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ReportInfoDTO {
  /// Returns a new [ReportInfoDTO] instance.
  ReportInfoDTO({
    required this.status,
    this.subStatus,
    required this.generationRequestedAt,
    this.generationFinishedAt,
    this.file,
    this.estimatedGenerationTime,
  });

  ReportStatusType status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReportSubStatusType? subStatus;

  /// Дата и время запроса на генерацию.
  DateTime generationRequestedAt;

  /// Дата и время завершения генерации.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? generationFinishedAt;

  /// Ссылка на готовый отчет.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? file;

  /// Ожидаемая продолжительность генерации в миллисекундах.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? estimatedGenerationTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ReportInfoDTO &&
    other.status == status &&
    other.subStatus == subStatus &&
    other.generationRequestedAt == generationRequestedAt &&
    other.generationFinishedAt == generationFinishedAt &&
    other.file == file &&
    other.estimatedGenerationTime == estimatedGenerationTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status.hashCode) +
    (subStatus == null ? 0 : subStatus!.hashCode) +
    (generationRequestedAt.hashCode) +
    (generationFinishedAt == null ? 0 : generationFinishedAt!.hashCode) +
    (file == null ? 0 : file!.hashCode) +
    (estimatedGenerationTime == null ? 0 : estimatedGenerationTime!.hashCode);

  @override
  String toString() => 'ReportInfoDTO[status=$status, subStatus=$subStatus, generationRequestedAt=$generationRequestedAt, generationFinishedAt=$generationFinishedAt, file=$file, estimatedGenerationTime=$estimatedGenerationTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'status'] = this.status;
    if (this.subStatus != null) {
      json[r'subStatus'] = this.subStatus;
    } else {
      json[r'subStatus'] = null;
    }
      json[r'generationRequestedAt'] = this.generationRequestedAt.toUtc().toIso8601String();
    if (this.generationFinishedAt != null) {
      json[r'generationFinishedAt'] = this.generationFinishedAt!.toUtc().toIso8601String();
    } else {
      json[r'generationFinishedAt'] = null;
    }
    if (this.file != null) {
      json[r'file'] = this.file;
    } else {
      json[r'file'] = null;
    }
    if (this.estimatedGenerationTime != null) {
      json[r'estimatedGenerationTime'] = this.estimatedGenerationTime;
    } else {
      json[r'estimatedGenerationTime'] = null;
    }
    return json;
  }

  /// Returns a new [ReportInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ReportInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ReportInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ReportInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ReportInfoDTO(
        status: ReportStatusType.fromJson(json[r'status'])!,
        subStatus: ReportSubStatusType.fromJson(json[r'subStatus']),
        generationRequestedAt: mapDateTime(json, r'generationRequestedAt', r'')!,
        generationFinishedAt: mapDateTime(json, r'generationFinishedAt', r''),
        file: mapValueOfType<String>(json, r'file'),
        estimatedGenerationTime: mapValueOfType<int>(json, r'estimatedGenerationTime'),
      );
    }
    return null;
  }

  static List<ReportInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReportInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReportInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ReportInfoDTO> mapFromJson(dynamic json) {
    final map = <String, ReportInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ReportInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ReportInfoDTO-objects as value to a dart map
  static Map<String, List<ReportInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ReportInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ReportInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'status',
    'generationRequestedAt',
  };
}

