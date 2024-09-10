//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateGoodsTurnoverRequest {
  /// Returns a new [GenerateGoodsTurnoverRequest] instance.
  GenerateGoodsTurnoverRequest({
    required this.campaignId,
    this.date,
  });

  /// Идентификатор кампании.
  int campaignId;

  /// Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? date;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateGoodsTurnoverRequest &&
    other.campaignId == campaignId &&
    other.date == date;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId.hashCode) +
    (date == null ? 0 : date!.hashCode);

  @override
  String toString() => 'GenerateGoodsTurnoverRequest[campaignId=$campaignId, date=$date]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignId'] = this.campaignId;
    if (this.date != null) {
      json[r'date'] = _dateFormatter.format(this.date!.toUtc());
    } else {
      json[r'date'] = null;
    }
    return json;
  }

  /// Returns a new [GenerateGoodsTurnoverRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateGoodsTurnoverRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateGoodsTurnoverRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateGoodsTurnoverRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateGoodsTurnoverRequest(
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        date: mapDateTime(json, r'date', r''),
      );
    }
    return null;
  }

  static List<GenerateGoodsTurnoverRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateGoodsTurnoverRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateGoodsTurnoverRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateGoodsTurnoverRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateGoodsTurnoverRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateGoodsTurnoverRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateGoodsTurnoverRequest-objects as value to a dart map
  static Map<String, List<GenerateGoodsTurnoverRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateGoodsTurnoverRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateGoodsTurnoverRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignId',
  };
}

