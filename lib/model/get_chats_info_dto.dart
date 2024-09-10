//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetChatsInfoDTO {
  /// Returns a new [GetChatsInfoDTO] instance.
  GetChatsInfoDTO({
    this.chats = const [],
    this.paging,
  });

  /// Информация о чатах.
  List<GetChatInfoDTO> chats;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ForwardScrollingPagerDTO? paging;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetChatsInfoDTO &&
    _deepEquality.equals(other.chats, chats) &&
    other.paging == paging;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (chats.hashCode) +
    (paging == null ? 0 : paging!.hashCode);

  @override
  String toString() => 'GetChatsInfoDTO[chats=$chats, paging=$paging]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'chats'] = this.chats;
    if (this.paging != null) {
      json[r'paging'] = this.paging;
    } else {
      json[r'paging'] = null;
    }
    return json;
  }

  /// Returns a new [GetChatsInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetChatsInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetChatsInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetChatsInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetChatsInfoDTO(
        chats: GetChatInfoDTO.listFromJson(json[r'chats']),
        paging: ForwardScrollingPagerDTO.fromJson(json[r'paging']),
      );
    }
    return null;
  }

  static List<GetChatsInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetChatsInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetChatsInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetChatsInfoDTO> mapFromJson(dynamic json) {
    final map = <String, GetChatsInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetChatsInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetChatsInfoDTO-objects as value to a dart map
  static Map<String, List<GetChatsInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetChatsInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetChatsInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'chats',
  };
}

