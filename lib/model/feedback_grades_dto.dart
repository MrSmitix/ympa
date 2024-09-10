//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedbackGradesDTO {
  /// Returns a new [FeedbackGradesDTO] instance.
  FeedbackGradesDTO({
    this.average,
    this.agreeCount,
    this.rejectCount,
    this.factors = const [],
  });

  /// Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? average;

  /// Количество пользователей, считающих отзыв полезным.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? agreeCount;

  /// Количество пользователей, считающих отзыв бесполезным.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? rejectCount;

  /// Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
  List<FeedbackFactorDTO> factors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedbackGradesDTO &&
    other.average == average &&
    other.agreeCount == agreeCount &&
    other.rejectCount == rejectCount &&
    _deepEquality.equals(other.factors, factors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (average == null ? 0 : average!.hashCode) +
    (agreeCount == null ? 0 : agreeCount!.hashCode) +
    (rejectCount == null ? 0 : rejectCount!.hashCode) +
    (factors.hashCode);

  @override
  String toString() => 'FeedbackGradesDTO[average=$average, agreeCount=$agreeCount, rejectCount=$rejectCount, factors=$factors]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.average != null) {
      json[r'average'] = this.average;
    } else {
      json[r'average'] = null;
    }
    if (this.agreeCount != null) {
      json[r'agreeCount'] = this.agreeCount;
    } else {
      json[r'agreeCount'] = null;
    }
    if (this.rejectCount != null) {
      json[r'rejectCount'] = this.rejectCount;
    } else {
      json[r'rejectCount'] = null;
    }
      json[r'factors'] = this.factors;
    return json;
  }

  /// Returns a new [FeedbackGradesDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedbackGradesDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedbackGradesDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedbackGradesDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedbackGradesDTO(
        average: num.parse('${json[r'average']}'),
        agreeCount: mapValueOfType<int>(json, r'agreeCount'),
        rejectCount: mapValueOfType<int>(json, r'rejectCount'),
        factors: FeedbackFactorDTO.listFromJson(json[r'factors']),
      );
    }
    return null;
  }

  static List<FeedbackGradesDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackGradesDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackGradesDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedbackGradesDTO> mapFromJson(dynamic json) {
    final map = <String, FeedbackGradesDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedbackGradesDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedbackGradesDTO-objects as value to a dart map
  static Map<String, List<FeedbackGradesDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedbackGradesDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedbackGradesDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'factors',
  };
}

