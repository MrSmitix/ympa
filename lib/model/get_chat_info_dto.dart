//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetChatInfoDTO {
  /// Returns a new [GetChatInfoDTO] instance.
  GetChatInfoDTO({
    required this.chatId,
    required this.orderId,
    required this.type,
    required this.status,
    required this.createdAt,
    required this.updatedAt,
  });

  /// Идентификатор чата.
  int chatId;

  /// Идентификатор заказа.
  int orderId;

  ChatType type;

  ChatStatusType status;

  /// Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  DateTime createdAt;

  /// Дата и время последнего сообщения в чате.
  DateTime updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetChatInfoDTO &&
    other.chatId == chatId &&
    other.orderId == orderId &&
    other.type == type &&
    other.status == status &&
    other.createdAt == createdAt &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (chatId.hashCode) +
    (orderId.hashCode) +
    (type.hashCode) +
    (status.hashCode) +
    (createdAt.hashCode) +
    (updatedAt.hashCode);

  @override
  String toString() => 'GetChatInfoDTO[chatId=$chatId, orderId=$orderId, type=$type, status=$status, createdAt=$createdAt, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'chatId'] = this.chatId;
      json[r'orderId'] = this.orderId;
      json[r'type'] = this.type;
      json[r'status'] = this.status;
      json[r'createdAt'] = this.createdAt.toUtc().toIso8601String();
      json[r'updatedAt'] = this.updatedAt.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [GetChatInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetChatInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetChatInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetChatInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetChatInfoDTO(
        chatId: mapValueOfType<int>(json, r'chatId')!,
        orderId: mapValueOfType<int>(json, r'orderId')!,
        type: ChatType.fromJson(json[r'type'])!,
        status: ChatStatusType.fromJson(json[r'status'])!,
        createdAt: mapDateTime(json, r'createdAt', r'')!,
        updatedAt: mapDateTime(json, r'updatedAt', r'')!,
      );
    }
    return null;
  }

  static List<GetChatInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetChatInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetChatInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetChatInfoDTO> mapFromJson(dynamic json) {
    final map = <String, GetChatInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetChatInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetChatInfoDTO-objects as value to a dart map
  static Map<String, List<GetChatInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetChatInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetChatInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'chatId',
    'orderId',
    'type',
    'status',
    'createdAt',
    'updatedAt',
  };
}

