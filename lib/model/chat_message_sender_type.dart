//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
class ChatMessageSenderType {
  /// Instantiate a new enum with the provided [value].
  const ChatMessageSenderType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PARTNER = ChatMessageSenderType._(r'PARTNER');
  static const CUSTOMER = ChatMessageSenderType._(r'CUSTOMER');
  static const MARKET = ChatMessageSenderType._(r'MARKET');
  static const SUPPORT = ChatMessageSenderType._(r'SUPPORT');

  /// List of all possible values in this [enum][ChatMessageSenderType].
  static const values = <ChatMessageSenderType>[
    PARTNER,
    CUSTOMER,
    MARKET,
    SUPPORT,
  ];

  static ChatMessageSenderType? fromJson(dynamic value) => ChatMessageSenderTypeTypeTransformer().decode(value);

  static List<ChatMessageSenderType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatMessageSenderType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatMessageSenderType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatMessageSenderType] to String,
/// and [decode] dynamic data back to [ChatMessageSenderType].
class ChatMessageSenderTypeTypeTransformer {
  factory ChatMessageSenderTypeTypeTransformer() => _instance ??= const ChatMessageSenderTypeTypeTransformer._();

  const ChatMessageSenderTypeTypeTransformer._();

  String encode(ChatMessageSenderType data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatMessageSenderType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatMessageSenderType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PARTNER': return ChatMessageSenderType.PARTNER;
        case r'CUSTOMER': return ChatMessageSenderType.CUSTOMER;
        case r'MARKET': return ChatMessageSenderType.MARKET;
        case r'SUPPORT': return ChatMessageSenderType.SUPPORT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatMessageSenderTypeTypeTransformer] instance.
  static ChatMessageSenderTypeTypeTransformer? _instance;
}

