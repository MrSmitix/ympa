//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetQualityRatingRequest {
  /// Returns a new [GetQualityRatingRequest] instance.
  GetQualityRatingRequest({
    this.dateFrom,
    this.dateTo,
    this.campaignIds = const {},
  });

  /// Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateFrom;

  /// Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTo;

  /// Список идентификаторов магазинов.
  Set<int> campaignIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetQualityRatingRequest &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    _deepEquality.equals(other.campaignIds, campaignIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateFrom == null ? 0 : dateFrom!.hashCode) +
    (dateTo == null ? 0 : dateTo!.hashCode) +
    (campaignIds.hashCode);

  @override
  String toString() => 'GetQualityRatingRequest[dateFrom=$dateFrom, dateTo=$dateTo, campaignIds=$campaignIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dateFrom != null) {
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom!.toUtc());
    } else {
      json[r'dateFrom'] = null;
    }
    if (this.dateTo != null) {
      json[r'dateTo'] = _dateFormatter.format(this.dateTo!.toUtc());
    } else {
      json[r'dateTo'] = null;
    }
      json[r'campaignIds'] = this.campaignIds.toList(growable: false);
    return json;
  }

  /// Returns a new [GetQualityRatingRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetQualityRatingRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetQualityRatingRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetQualityRatingRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetQualityRatingRequest(
        dateFrom: mapDateTime(json, r'dateFrom', r''),
        dateTo: mapDateTime(json, r'dateTo', r''),
        campaignIds: json[r'campaignIds'] is Iterable
            ? (json[r'campaignIds'] as Iterable).cast<int>().toSet()
            : const {},
      );
    }
    return null;
  }

  static List<GetQualityRatingRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetQualityRatingRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetQualityRatingRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetQualityRatingRequest> mapFromJson(dynamic json) {
    final map = <String, GetQualityRatingRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetQualityRatingRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetQualityRatingRequest-objects as value to a dart map
  static Map<String, List<GetQualityRatingRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetQualityRatingRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetQualityRatingRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignIds',
  };
}

