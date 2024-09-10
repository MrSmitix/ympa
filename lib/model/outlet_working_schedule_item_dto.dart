//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OutletWorkingScheduleItemDTO {
  /// Returns a new [OutletWorkingScheduleItemDTO] instance.
  OutletWorkingScheduleItemDTO({
    required this.startDay,
    required this.endDay,
    required this.startTime,
    required this.endTime,
  });

  DayOfWeekType startDay;

  DayOfWeekType endDay;

  /// Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
  String startTime;

  /// Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
  String endTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OutletWorkingScheduleItemDTO &&
    other.startDay == startDay &&
    other.endDay == endDay &&
    other.startTime == startTime &&
    other.endTime == endTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (startDay.hashCode) +
    (endDay.hashCode) +
    (startTime.hashCode) +
    (endTime.hashCode);

  @override
  String toString() => 'OutletWorkingScheduleItemDTO[startDay=$startDay, endDay=$endDay, startTime=$startTime, endTime=$endTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'startDay'] = this.startDay;
      json[r'endDay'] = this.endDay;
      json[r'startTime'] = this.startTime;
      json[r'endTime'] = this.endTime;
    return json;
  }

  /// Returns a new [OutletWorkingScheduleItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OutletWorkingScheduleItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OutletWorkingScheduleItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OutletWorkingScheduleItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OutletWorkingScheduleItemDTO(
        startDay: DayOfWeekType.fromJson(json[r'startDay'])!,
        endDay: DayOfWeekType.fromJson(json[r'endDay'])!,
        startTime: mapValueOfType<String>(json, r'startTime')!,
        endTime: mapValueOfType<String>(json, r'endTime')!,
      );
    }
    return null;
  }

  static List<OutletWorkingScheduleItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletWorkingScheduleItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletWorkingScheduleItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OutletWorkingScheduleItemDTO> mapFromJson(dynamic json) {
    final map = <String, OutletWorkingScheduleItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OutletWorkingScheduleItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OutletWorkingScheduleItemDTO-objects as value to a dart map
  static Map<String, List<OutletWorkingScheduleItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OutletWorkingScheduleItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OutletWorkingScheduleItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'startDay',
    'endDay',
    'startTime',
    'endTime',
  };
}

