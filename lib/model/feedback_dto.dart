//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedbackDTO {
  /// Returns a new [FeedbackDTO] instance.
  FeedbackDTO({
    this.id,
    this.createdAt,
    this.text,
    this.state,
    this.author,
    this.pro,
    this.contra,
    this.comments = const [],
    this.shop,
    this.resolved,
    this.verified,
    this.recommend,
    this.grades,
    this.order,
  });

  /// Идентификатор отзыва.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? createdAt;

  /// Комментарий автора отзыва.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? text;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackStateType? state;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackAuthorDTO? author;

  /// Достоинства магазина, описанные в отзыве.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pro;

  /// Недостатки магазина, описанные в отзыве.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? contra;

  /// Переписка автора отзыва с магазином.
  List<FeedbackCommentDTO> comments;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackShopDTO? shop;

  /// Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? resolved;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? verified;

  /// Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? recommend;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackGradesDTO? grades;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackOrderDTO? order;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedbackDTO &&
    other.id == id &&
    other.createdAt == createdAt &&
    other.text == text &&
    other.state == state &&
    other.author == author &&
    other.pro == pro &&
    other.contra == contra &&
    _deepEquality.equals(other.comments, comments) &&
    other.shop == shop &&
    other.resolved == resolved &&
    other.verified == verified &&
    other.recommend == recommend &&
    other.grades == grades &&
    other.order == order;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (createdAt == null ? 0 : createdAt!.hashCode) +
    (text == null ? 0 : text!.hashCode) +
    (state == null ? 0 : state!.hashCode) +
    (author == null ? 0 : author!.hashCode) +
    (pro == null ? 0 : pro!.hashCode) +
    (contra == null ? 0 : contra!.hashCode) +
    (comments.hashCode) +
    (shop == null ? 0 : shop!.hashCode) +
    (resolved == null ? 0 : resolved!.hashCode) +
    (verified == null ? 0 : verified!.hashCode) +
    (recommend == null ? 0 : recommend!.hashCode) +
    (grades == null ? 0 : grades!.hashCode) +
    (order == null ? 0 : order!.hashCode);

  @override
  String toString() => 'FeedbackDTO[id=$id, createdAt=$createdAt, text=$text, state=$state, author=$author, pro=$pro, contra=$contra, comments=$comments, shop=$shop, resolved=$resolved, verified=$verified, recommend=$recommend, grades=$grades, order=$order]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.createdAt != null) {
      json[r'createdAt'] = this.createdAt!.toUtc().toIso8601String();
    } else {
      json[r'createdAt'] = null;
    }
    if (this.text != null) {
      json[r'text'] = this.text;
    } else {
      json[r'text'] = null;
    }
    if (this.state != null) {
      json[r'state'] = this.state;
    } else {
      json[r'state'] = null;
    }
    if (this.author != null) {
      json[r'author'] = this.author;
    } else {
      json[r'author'] = null;
    }
    if (this.pro != null) {
      json[r'pro'] = this.pro;
    } else {
      json[r'pro'] = null;
    }
    if (this.contra != null) {
      json[r'contra'] = this.contra;
    } else {
      json[r'contra'] = null;
    }
      json[r'comments'] = this.comments;
    if (this.shop != null) {
      json[r'shop'] = this.shop;
    } else {
      json[r'shop'] = null;
    }
    if (this.resolved != null) {
      json[r'resolved'] = this.resolved;
    } else {
      json[r'resolved'] = null;
    }
    if (this.verified != null) {
      json[r'verified'] = this.verified;
    } else {
      json[r'verified'] = null;
    }
    if (this.recommend != null) {
      json[r'recommend'] = this.recommend;
    } else {
      json[r'recommend'] = null;
    }
    if (this.grades != null) {
      json[r'grades'] = this.grades;
    } else {
      json[r'grades'] = null;
    }
    if (this.order != null) {
      json[r'order'] = this.order;
    } else {
      json[r'order'] = null;
    }
    return json;
  }

  /// Returns a new [FeedbackDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedbackDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedbackDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedbackDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedbackDTO(
        id: mapValueOfType<int>(json, r'id'),
        createdAt: mapDateTime(json, r'createdAt', r''),
        text: mapValueOfType<String>(json, r'text'),
        state: FeedbackStateType.fromJson(json[r'state']),
        author: FeedbackAuthorDTO.fromJson(json[r'author']),
        pro: mapValueOfType<String>(json, r'pro'),
        contra: mapValueOfType<String>(json, r'contra'),
        comments: FeedbackCommentDTO.listFromJson(json[r'comments']),
        shop: FeedbackShopDTO.fromJson(json[r'shop']),
        resolved: mapValueOfType<bool>(json, r'resolved'),
        verified: mapValueOfType<bool>(json, r'verified'),
        recommend: mapValueOfType<bool>(json, r'recommend'),
        grades: FeedbackGradesDTO.fromJson(json[r'grades']),
        order: FeedbackOrderDTO.fromJson(json[r'order']),
      );
    }
    return null;
  }

  static List<FeedbackDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedbackDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedbackDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedbackDTO> mapFromJson(dynamic json) {
    final map = <String, FeedbackDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedbackDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedbackDTO-objects as value to a dart map
  static Map<String, List<FeedbackDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedbackDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedbackDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'comments',
  };
}

