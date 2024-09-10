//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeedDTO {
  /// Returns a new [FeedDTO] instance.
  FeedDTO({
    this.id,
    this.login,
    this.name,
    this.password,
    this.uploadDate,
    this.url,
    this.content,
    this.download,
    this.placement,
    this.publication,
  });

  /// Идентификатор прайс-листа.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? login;

  /// Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? password;

  /// Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? uploadDate;

  /// URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedContentDTO? content;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedDownloadDTO? download;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedPlacementDTO? placement;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedPublicationDTO? publication;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeedDTO &&
    other.id == id &&
    other.login == login &&
    other.name == name &&
    other.password == password &&
    other.uploadDate == uploadDate &&
    other.url == url &&
    other.content == content &&
    other.download == download &&
    other.placement == placement &&
    other.publication == publication;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (login == null ? 0 : login!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (password == null ? 0 : password!.hashCode) +
    (uploadDate == null ? 0 : uploadDate!.hashCode) +
    (url == null ? 0 : url!.hashCode) +
    (content == null ? 0 : content!.hashCode) +
    (download == null ? 0 : download!.hashCode) +
    (placement == null ? 0 : placement!.hashCode) +
    (publication == null ? 0 : publication!.hashCode);

  @override
  String toString() => 'FeedDTO[id=$id, login=$login, name=$name, password=$password, uploadDate=$uploadDate, url=$url, content=$content, download=$download, placement=$placement, publication=$publication]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.login != null) {
      json[r'login'] = this.login;
    } else {
      json[r'login'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.password != null) {
      json[r'password'] = this.password;
    } else {
      json[r'password'] = null;
    }
    if (this.uploadDate != null) {
      json[r'uploadDate'] = this.uploadDate!.toUtc().toIso8601String();
    } else {
      json[r'uploadDate'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
    if (this.content != null) {
      json[r'content'] = this.content;
    } else {
      json[r'content'] = null;
    }
    if (this.download != null) {
      json[r'download'] = this.download;
    } else {
      json[r'download'] = null;
    }
    if (this.placement != null) {
      json[r'placement'] = this.placement;
    } else {
      json[r'placement'] = null;
    }
    if (this.publication != null) {
      json[r'publication'] = this.publication;
    } else {
      json[r'publication'] = null;
    }
    return json;
  }

  /// Returns a new [FeedDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeedDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeedDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeedDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeedDTO(
        id: mapValueOfType<int>(json, r'id'),
        login: mapValueOfType<String>(json, r'login'),
        name: mapValueOfType<String>(json, r'name'),
        password: mapValueOfType<String>(json, r'password'),
        uploadDate: mapDateTime(json, r'uploadDate', r''),
        url: mapValueOfType<String>(json, r'url'),
        content: FeedContentDTO.fromJson(json[r'content']),
        download: FeedDownloadDTO.fromJson(json[r'download']),
        placement: FeedPlacementDTO.fromJson(json[r'placement']),
        publication: FeedPublicationDTO.fromJson(json[r'publication']),
      );
    }
    return null;
  }

  static List<FeedDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeedDTO> mapFromJson(dynamic json) {
    final map = <String, FeedDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeedDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeedDTO-objects as value to a dart map
  static Map<String, List<FeedDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeedDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeedDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

