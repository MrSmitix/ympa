//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
class ChatType {
  /// Instantiate a new enum with the provided [value].
  const ChatType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CHAT = ChatType._(r'CHAT');
  static const ARBITRAGE = ChatType._(r'ARBITRAGE');

  /// List of all possible values in this [enum][ChatType].
  static const values = <ChatType>[
    CHAT,
    ARBITRAGE,
  ];

  static ChatType? fromJson(dynamic value) => ChatTypeTypeTransformer().decode(value);

  static List<ChatType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatType] to String,
/// and [decode] dynamic data back to [ChatType].
class ChatTypeTypeTransformer {
  factory ChatTypeTypeTransformer() => _instance ??= const ChatTypeTypeTransformer._();

  const ChatTypeTypeTransformer._();

  String encode(ChatType data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CHAT': return ChatType.CHAT;
        case r'ARBITRAGE': return ChatType.ARBITRAGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatTypeTypeTransformer] instance.
  static ChatTypeTypeTransformer? _instance;
}

