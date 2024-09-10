//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QualityRatingDTO {
  /// Returns a new [QualityRatingDTO] instance.
  QualityRatingDTO({
    required this.rating,
    required this.calculationDate,
    this.components = const [],
  });

  /// Значение индекса качества.
  ///
  /// Minimum value: 0
  /// Maximum value: 100
  int rating;

  /// Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  DateTime calculationDate;

  /// Составляющие индекса качества.
  List<QualityRatingComponentDTO> components;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QualityRatingDTO &&
    other.rating == rating &&
    other.calculationDate == calculationDate &&
    _deepEquality.equals(other.components, components);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rating.hashCode) +
    (calculationDate.hashCode) +
    (components.hashCode);

  @override
  String toString() => 'QualityRatingDTO[rating=$rating, calculationDate=$calculationDate, components=$components]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rating'] = this.rating;
      json[r'calculationDate'] = _dateFormatter.format(this.calculationDate.toUtc());
      json[r'components'] = this.components;
    return json;
  }

  /// Returns a new [QualityRatingDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QualityRatingDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QualityRatingDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QualityRatingDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QualityRatingDTO(
        rating: mapValueOfType<int>(json, r'rating')!,
        calculationDate: mapDateTime(json, r'calculationDate', r'')!,
        components: QualityRatingComponentDTO.listFromJson(json[r'components']),
      );
    }
    return null;
  }

  static List<QualityRatingDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityRatingDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityRatingDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QualityRatingDTO> mapFromJson(dynamic json) {
    final map = <String, QualityRatingDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QualityRatingDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QualityRatingDTO-objects as value to a dart map
  static Map<String, List<QualityRatingDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QualityRatingDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QualityRatingDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'rating',
    'calculationDate',
    'components',
  };
}

