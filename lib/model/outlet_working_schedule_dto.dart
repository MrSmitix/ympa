//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OutletWorkingScheduleDTO {
  /// Returns a new [OutletWorkingScheduleDTO] instance.
  OutletWorkingScheduleDTO({
    this.workInHoliday,
    this.scheduleItems = const [],
  });

  /// Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? workInHoliday;

  /// Список расписаний работы точки продаж. 
  List<OutletWorkingScheduleItemDTO> scheduleItems;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OutletWorkingScheduleDTO &&
    other.workInHoliday == workInHoliday &&
    _deepEquality.equals(other.scheduleItems, scheduleItems);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (workInHoliday == null ? 0 : workInHoliday!.hashCode) +
    (scheduleItems.hashCode);

  @override
  String toString() => 'OutletWorkingScheduleDTO[workInHoliday=$workInHoliday, scheduleItems=$scheduleItems]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.workInHoliday != null) {
      json[r'workInHoliday'] = this.workInHoliday;
    } else {
      json[r'workInHoliday'] = null;
    }
      json[r'scheduleItems'] = this.scheduleItems;
    return json;
  }

  /// Returns a new [OutletWorkingScheduleDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OutletWorkingScheduleDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OutletWorkingScheduleDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OutletWorkingScheduleDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OutletWorkingScheduleDTO(
        workInHoliday: mapValueOfType<bool>(json, r'workInHoliday'),
        scheduleItems: OutletWorkingScheduleItemDTO.listFromJson(json[r'scheduleItems']),
      );
    }
    return null;
  }

  static List<OutletWorkingScheduleDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletWorkingScheduleDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletWorkingScheduleDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OutletWorkingScheduleDTO> mapFromJson(dynamic json) {
    final map = <String, OutletWorkingScheduleDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OutletWorkingScheduleDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OutletWorkingScheduleDTO-objects as value to a dart map
  static Map<String, List<OutletWorkingScheduleDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OutletWorkingScheduleDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OutletWorkingScheduleDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'scheduleItems',
  };
}

