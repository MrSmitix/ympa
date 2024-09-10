//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignSettingsScheduleDTO {
  /// Returns a new [CampaignSettingsScheduleDTO] instance.
  CampaignSettingsScheduleDTO({
    this.availableOnHolidays,
    this.customHolidays = const [],
    this.customWorkingDays = const [],
    this.period,
    this.totalHolidays = const [],
    this.weeklyHolidays = const [],
  });

  /// Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? availableOnHolidays;

  /// Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
  List<String> customHolidays;

  /// Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
  List<String> customWorkingDays;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignSettingsTimePeriodDTO? period;

  /// Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
  List<String> totalHolidays;

  /// Список выходных дней недели и государственных праздников.
  List<int> weeklyHolidays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignSettingsScheduleDTO &&
    other.availableOnHolidays == availableOnHolidays &&
    _deepEquality.equals(other.customHolidays, customHolidays) &&
    _deepEquality.equals(other.customWorkingDays, customWorkingDays) &&
    other.period == period &&
    _deepEquality.equals(other.totalHolidays, totalHolidays) &&
    _deepEquality.equals(other.weeklyHolidays, weeklyHolidays);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (availableOnHolidays == null ? 0 : availableOnHolidays!.hashCode) +
    (customHolidays.hashCode) +
    (customWorkingDays.hashCode) +
    (period == null ? 0 : period!.hashCode) +
    (totalHolidays.hashCode) +
    (weeklyHolidays.hashCode);

  @override
  String toString() => 'CampaignSettingsScheduleDTO[availableOnHolidays=$availableOnHolidays, customHolidays=$customHolidays, customWorkingDays=$customWorkingDays, period=$period, totalHolidays=$totalHolidays, weeklyHolidays=$weeklyHolidays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.availableOnHolidays != null) {
      json[r'availableOnHolidays'] = this.availableOnHolidays;
    } else {
      json[r'availableOnHolidays'] = null;
    }
      json[r'customHolidays'] = this.customHolidays;
      json[r'customWorkingDays'] = this.customWorkingDays;
    if (this.period != null) {
      json[r'period'] = this.period;
    } else {
      json[r'period'] = null;
    }
      json[r'totalHolidays'] = this.totalHolidays;
      json[r'weeklyHolidays'] = this.weeklyHolidays;
    return json;
  }

  /// Returns a new [CampaignSettingsScheduleDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignSettingsScheduleDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignSettingsScheduleDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignSettingsScheduleDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignSettingsScheduleDTO(
        availableOnHolidays: mapValueOfType<bool>(json, r'availableOnHolidays'),
        customHolidays: json[r'customHolidays'] is Iterable
            ? (json[r'customHolidays'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customWorkingDays: json[r'customWorkingDays'] is Iterable
            ? (json[r'customWorkingDays'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        period: CampaignSettingsTimePeriodDTO.fromJson(json[r'period']),
        totalHolidays: json[r'totalHolidays'] is Iterable
            ? (json[r'totalHolidays'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        weeklyHolidays: json[r'weeklyHolidays'] is Iterable
            ? (json[r'weeklyHolidays'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CampaignSettingsScheduleDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignSettingsScheduleDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignSettingsScheduleDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignSettingsScheduleDTO> mapFromJson(dynamic json) {
    final map = <String, CampaignSettingsScheduleDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignSettingsScheduleDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignSettingsScheduleDTO-objects as value to a dart map
  static Map<String, List<CampaignSettingsScheduleDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignSettingsScheduleDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignSettingsScheduleDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'customHolidays',
    'customWorkingDays',
    'totalHolidays',
    'weeklyHolidays',
  };
}

