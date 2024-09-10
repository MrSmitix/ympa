//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateReportDTO {
  /// Returns a new [GenerateReportDTO] instance.
  GenerateReportDTO({
    required this.reportId,
    required this.estimatedGenerationTime,
  });

  /// Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  String reportId;

  /// Ожидаемая продолжительность генерации в миллисекундах.
  int estimatedGenerationTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateReportDTO &&
    other.reportId == reportId &&
    other.estimatedGenerationTime == estimatedGenerationTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reportId.hashCode) +
    (estimatedGenerationTime.hashCode);

  @override
  String toString() => 'GenerateReportDTO[reportId=$reportId, estimatedGenerationTime=$estimatedGenerationTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'reportId'] = this.reportId;
      json[r'estimatedGenerationTime'] = this.estimatedGenerationTime;
    return json;
  }

  /// Returns a new [GenerateReportDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateReportDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateReportDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateReportDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateReportDTO(
        reportId: mapValueOfType<String>(json, r'reportId')!,
        estimatedGenerationTime: mapValueOfType<int>(json, r'estimatedGenerationTime')!,
      );
    }
    return null;
  }

  static List<GenerateReportDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateReportDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateReportDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateReportDTO> mapFromJson(dynamic json) {
    final map = <String, GenerateReportDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateReportDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateReportDTO-objects as value to a dart map
  static Map<String, List<GenerateReportDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateReportDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateReportDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'reportId',
    'estimatedGenerationTime',
  };
}

