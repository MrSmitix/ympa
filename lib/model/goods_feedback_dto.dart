//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsFeedbackDTO {
  /// Returns a new [GoodsFeedbackDTO] instance.
  GoodsFeedbackDTO({
    required this.feedbackId,
    required this.createdAt,
    required this.needReaction,
    required this.identifiers,
    this.author,
    this.description,
    this.media,
    required this.statistics,
  });

  /// Идентификатор отзыва. 
  int feedbackId;

  /// Дата и время создания отзыва.
  DateTime createdAt;

  /// Нужен ли ответ на отзыв.
  bool needReaction;

  GoodsFeedbackIdentifiersDTO identifiers;

  /// Имя автора отзыва.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? author;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GoodsFeedbackDescriptionDTO? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GoodsFeedbackMediaDTO? media;

  GoodsFeedbackStatisticsDTO statistics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsFeedbackDTO &&
    other.feedbackId == feedbackId &&
    other.createdAt == createdAt &&
    other.needReaction == needReaction &&
    other.identifiers == identifiers &&
    other.author == author &&
    other.description == description &&
    other.media == media &&
    other.statistics == statistics;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedbackId.hashCode) +
    (createdAt.hashCode) +
    (needReaction.hashCode) +
    (identifiers.hashCode) +
    (author == null ? 0 : author!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (media == null ? 0 : media!.hashCode) +
    (statistics.hashCode);

  @override
  String toString() => 'GoodsFeedbackDTO[feedbackId=$feedbackId, createdAt=$createdAt, needReaction=$needReaction, identifiers=$identifiers, author=$author, description=$description, media=$media, statistics=$statistics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'feedbackId'] = this.feedbackId;
      json[r'createdAt'] = this.createdAt.toUtc().toIso8601String();
      json[r'needReaction'] = this.needReaction;
      json[r'identifiers'] = this.identifiers;
    if (this.author != null) {
      json[r'author'] = this.author;
    } else {
      json[r'author'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.media != null) {
      json[r'media'] = this.media;
    } else {
      json[r'media'] = null;
    }
      json[r'statistics'] = this.statistics;
    return json;
  }

  /// Returns a new [GoodsFeedbackDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsFeedbackDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsFeedbackDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsFeedbackDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsFeedbackDTO(
        feedbackId: mapValueOfType<int>(json, r'feedbackId')!,
        createdAt: mapDateTime(json, r'createdAt', r'')!,
        needReaction: mapValueOfType<bool>(json, r'needReaction')!,
        identifiers: GoodsFeedbackIdentifiersDTO.fromJson(json[r'identifiers'])!,
        author: mapValueOfType<String>(json, r'author'),
        description: GoodsFeedbackDescriptionDTO.fromJson(json[r'description']),
        media: GoodsFeedbackMediaDTO.fromJson(json[r'media']),
        statistics: GoodsFeedbackStatisticsDTO.fromJson(json[r'statistics'])!,
      );
    }
    return null;
  }

  static List<GoodsFeedbackDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsFeedbackDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsFeedbackDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsFeedbackDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsFeedbackDTO-objects as value to a dart map
  static Map<String, List<GoodsFeedbackDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsFeedbackDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsFeedbackDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feedbackId',
    'createdAt',
    'needReaction',
    'identifiers',
    'statistics',
  };
}

