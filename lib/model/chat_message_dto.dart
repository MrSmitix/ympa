//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatMessageDTO {
  /// Returns a new [ChatMessageDTO] instance.
  ChatMessageDTO({
    required this.messageId,
    required this.createdAt,
    required this.sender,
    this.message,
    this.payload = const [],
  });

  /// Идентификатор сообщения.
  int messageId;

  /// Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  DateTime createdAt;

  ChatMessageSenderType sender;

  /// Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  /// Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
  List<ChatMessagePayloadDTO>? payload;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatMessageDTO &&
    other.messageId == messageId &&
    other.createdAt == createdAt &&
    other.sender == sender &&
    other.message == message &&
    _deepEquality.equals(other.payload, payload);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (messageId.hashCode) +
    (createdAt.hashCode) +
    (sender.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (payload == null ? 0 : payload!.hashCode);

  @override
  String toString() => 'ChatMessageDTO[messageId=$messageId, createdAt=$createdAt, sender=$sender, message=$message, payload=$payload]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'messageId'] = this.messageId;
      json[r'createdAt'] = this.createdAt.toUtc().toIso8601String();
      json[r'sender'] = this.sender;
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.payload != null) {
      json[r'payload'] = this.payload;
    } else {
      json[r'payload'] = null;
    }
    return json;
  }

  /// Returns a new [ChatMessageDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatMessageDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatMessageDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatMessageDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatMessageDTO(
        messageId: mapValueOfType<int>(json, r'messageId')!,
        createdAt: mapDateTime(json, r'createdAt', r'')!,
        sender: ChatMessageSenderType.fromJson(json[r'sender'])!,
        message: mapValueOfType<String>(json, r'message'),
        payload: ChatMessagePayloadDTO.listFromJson(json[r'payload']),
      );
    }
    return null;
  }

  static List<ChatMessageDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatMessageDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatMessageDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatMessageDTO> mapFromJson(dynamic json) {
    final map = <String, ChatMessageDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatMessageDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatMessageDTO-objects as value to a dart map
  static Map<String, List<ChatMessageDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatMessageDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatMessageDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'messageId',
    'createdAt',
    'sender',
  };
}

