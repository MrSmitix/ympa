//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
class ChatStatusType {
  /// Instantiate a new enum with the provided [value].
  const ChatStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NEW = ChatStatusType._(r'NEW');
  static const WAITING_FOR_CUSTOMER = ChatStatusType._(r'WAITING_FOR_CUSTOMER');
  static const WAITING_FOR_PARTNER = ChatStatusType._(r'WAITING_FOR_PARTNER');
  static const WAITING_FOR_ARBITER = ChatStatusType._(r'WAITING_FOR_ARBITER');
  static const WAITING_FOR_MARKET = ChatStatusType._(r'WAITING_FOR_MARKET');
  static const FINISHED = ChatStatusType._(r'FINISHED');

  /// List of all possible values in this [enum][ChatStatusType].
  static const values = <ChatStatusType>[
    NEW,
    WAITING_FOR_CUSTOMER,
    WAITING_FOR_PARTNER,
    WAITING_FOR_ARBITER,
    WAITING_FOR_MARKET,
    FINISHED,
  ];

  static ChatStatusType? fromJson(dynamic value) => ChatStatusTypeTypeTransformer().decode(value);

  static List<ChatStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatStatusType] to String,
/// and [decode] dynamic data back to [ChatStatusType].
class ChatStatusTypeTypeTransformer {
  factory ChatStatusTypeTypeTransformer() => _instance ??= const ChatStatusTypeTypeTransformer._();

  const ChatStatusTypeTypeTransformer._();

  String encode(ChatStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NEW': return ChatStatusType.NEW;
        case r'WAITING_FOR_CUSTOMER': return ChatStatusType.WAITING_FOR_CUSTOMER;
        case r'WAITING_FOR_PARTNER': return ChatStatusType.WAITING_FOR_PARTNER;
        case r'WAITING_FOR_ARBITER': return ChatStatusType.WAITING_FOR_ARBITER;
        case r'WAITING_FOR_MARKET': return ChatStatusType.WAITING_FOR_MARKET;
        case r'FINISHED': return ChatStatusType.FINISHED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatStatusTypeTypeTransformer] instance.
  static ChatStatusTypeTypeTransformer? _instance;
}

