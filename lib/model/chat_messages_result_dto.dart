//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatMessagesResultDTO {
  /// Returns a new [ChatMessagesResultDTO] instance.
  ChatMessagesResultDTO({
    required this.orderId,
    this.messages = const [],
    this.paging,
  });

  /// Идентификатор заказа.
  int orderId;

  /// Информация о сообщениях.
  List<ChatMessageDTO> messages;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ForwardScrollingPagerDTO? paging;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatMessagesResultDTO &&
    other.orderId == orderId &&
    _deepEquality.equals(other.messages, messages) &&
    other.paging == paging;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderId.hashCode) +
    (messages.hashCode) +
    (paging == null ? 0 : paging!.hashCode);

  @override
  String toString() => 'ChatMessagesResultDTO[orderId=$orderId, messages=$messages, paging=$paging]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderId'] = this.orderId;
      json[r'messages'] = this.messages;
    if (this.paging != null) {
      json[r'paging'] = this.paging;
    } else {
      json[r'paging'] = null;
    }
    return json;
  }

  /// Returns a new [ChatMessagesResultDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatMessagesResultDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatMessagesResultDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatMessagesResultDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatMessagesResultDTO(
        orderId: mapValueOfType<int>(json, r'orderId')!,
        messages: ChatMessageDTO.listFromJson(json[r'messages']),
        paging: ForwardScrollingPagerDTO.fromJson(json[r'paging']),
      );
    }
    return null;
  }

  static List<ChatMessagesResultDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatMessagesResultDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatMessagesResultDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatMessagesResultDTO> mapFromJson(dynamic json) {
    final map = <String, ChatMessagesResultDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatMessagesResultDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatMessagesResultDTO-objects as value to a dart map
  static Map<String, List<ChatMessagesResultDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatMessagesResultDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatMessagesResultDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderId',
    'messages',
  };
}

