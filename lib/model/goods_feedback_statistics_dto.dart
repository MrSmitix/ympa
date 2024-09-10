//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsFeedbackStatisticsDTO {
  /// Returns a new [GoodsFeedbackStatisticsDTO] instance.
  GoodsFeedbackStatisticsDTO({
    required this.rating,
    required this.commentsCount,
    this.recommended,
    this.paidAmount,
  });

  /// Оценка товара.
  ///
  /// Minimum value: 1
  /// Maximum value: 5
  int rating;

  /// Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
  int commentsCount;

  /// Рекомендуют ли этот товар.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? recommended;

  /// Количество баллов Плюса, которое автор получил за отзыв.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? paidAmount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsFeedbackStatisticsDTO &&
    other.rating == rating &&
    other.commentsCount == commentsCount &&
    other.recommended == recommended &&
    other.paidAmount == paidAmount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rating.hashCode) +
    (commentsCount.hashCode) +
    (recommended == null ? 0 : recommended!.hashCode) +
    (paidAmount == null ? 0 : paidAmount!.hashCode);

  @override
  String toString() => 'GoodsFeedbackStatisticsDTO[rating=$rating, commentsCount=$commentsCount, recommended=$recommended, paidAmount=$paidAmount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rating'] = this.rating;
      json[r'commentsCount'] = this.commentsCount;
    if (this.recommended != null) {
      json[r'recommended'] = this.recommended;
    } else {
      json[r'recommended'] = null;
    }
    if (this.paidAmount != null) {
      json[r'paidAmount'] = this.paidAmount;
    } else {
      json[r'paidAmount'] = null;
    }
    return json;
  }

  /// Returns a new [GoodsFeedbackStatisticsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsFeedbackStatisticsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsFeedbackStatisticsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsFeedbackStatisticsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsFeedbackStatisticsDTO(
        rating: mapValueOfType<int>(json, r'rating')!,
        commentsCount: mapValueOfType<int>(json, r'commentsCount')!,
        recommended: mapValueOfType<bool>(json, r'recommended'),
        paidAmount: mapValueOfType<int>(json, r'paidAmount'),
      );
    }
    return null;
  }

  static List<GoodsFeedbackStatisticsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackStatisticsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackStatisticsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsFeedbackStatisticsDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsFeedbackStatisticsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsFeedbackStatisticsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsFeedbackStatisticsDTO-objects as value to a dart map
  static Map<String, List<GoodsFeedbackStatisticsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsFeedbackStatisticsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsFeedbackStatisticsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'rating',
    'commentsCount',
  };
}

