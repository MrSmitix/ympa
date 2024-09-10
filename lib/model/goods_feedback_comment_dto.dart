//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsFeedbackCommentDTO {
  /// Returns a new [GoodsFeedbackCommentDTO] instance.
  GoodsFeedbackCommentDTO({
    required this.id,
    required this.text,
    this.canModify,
    this.parentId,
    required this.author,
    required this.status,
  });

  /// Идентификатор комментария к отзыву. 
  int id;

  /// Текст комментария.
  String text;

  /// Может ли продавец изменять комментарий или удалять его.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? canModify;

  /// Идентификатор комментария к отзыву. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? parentId;

  GoodsFeedbackCommentAuthorDTO author;

  GoodsFeedbackCommentStatusType status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsFeedbackCommentDTO &&
    other.id == id &&
    other.text == text &&
    other.canModify == canModify &&
    other.parentId == parentId &&
    other.author == author &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (text.hashCode) +
    (canModify == null ? 0 : canModify!.hashCode) +
    (parentId == null ? 0 : parentId!.hashCode) +
    (author.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'GoodsFeedbackCommentDTO[id=$id, text=$text, canModify=$canModify, parentId=$parentId, author=$author, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'text'] = this.text;
    if (this.canModify != null) {
      json[r'canModify'] = this.canModify;
    } else {
      json[r'canModify'] = null;
    }
    if (this.parentId != null) {
      json[r'parentId'] = this.parentId;
    } else {
      json[r'parentId'] = null;
    }
      json[r'author'] = this.author;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [GoodsFeedbackCommentDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsFeedbackCommentDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsFeedbackCommentDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsFeedbackCommentDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsFeedbackCommentDTO(
        id: mapValueOfType<int>(json, r'id')!,
        text: mapValueOfType<String>(json, r'text')!,
        canModify: mapValueOfType<bool>(json, r'canModify'),
        parentId: mapValueOfType<int>(json, r'parentId'),
        author: GoodsFeedbackCommentAuthorDTO.fromJson(json[r'author'])!,
        status: GoodsFeedbackCommentStatusType.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<GoodsFeedbackCommentDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsFeedbackCommentDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsFeedbackCommentDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsFeedbackCommentDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsFeedbackCommentDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsFeedbackCommentDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsFeedbackCommentDTO-objects as value to a dart map
  static Map<String, List<GoodsFeedbackCommentDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsFeedbackCommentDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsFeedbackCommentDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'text',
    'author',
    'status',
  };
}

