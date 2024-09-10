//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatMessagePayloadDTO {
  /// Returns a new [ChatMessagePayloadDTO] instance.
  ChatMessagePayloadDTO({
    required this.name,
    required this.url,
    required this.size,
  });

  /// Имя файла.
  String name;

  /// Ссылка для скачивания файла.
  String url;

  /// Размер файла в байтах.
  int size;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatMessagePayloadDTO &&
    other.name == name &&
    other.url == url &&
    other.size == size;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (url.hashCode) +
    (size.hashCode);

  @override
  String toString() => 'ChatMessagePayloadDTO[name=$name, url=$url, size=$size]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'url'] = this.url;
      json[r'size'] = this.size;
    return json;
  }

  /// Returns a new [ChatMessagePayloadDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatMessagePayloadDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatMessagePayloadDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatMessagePayloadDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatMessagePayloadDTO(
        name: mapValueOfType<String>(json, r'name')!,
        url: mapValueOfType<String>(json, r'url')!,
        size: mapValueOfType<int>(json, r'size')!,
      );
    }
    return null;
  }

  static List<ChatMessagePayloadDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatMessagePayloadDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatMessagePayloadDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatMessagePayloadDTO> mapFromJson(dynamic json) {
    final map = <String, ChatMessagePayloadDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatMessagePayloadDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatMessagePayloadDTO-objects as value to a dart map
  static Map<String, List<ChatMessagePayloadDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatMessagePayloadDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatMessagePayloadDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'url',
    'size',
  };
}

