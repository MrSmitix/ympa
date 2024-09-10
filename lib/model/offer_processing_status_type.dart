//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
class OfferProcessingStatusType {
  /// Instantiate a new enum with the provided [value].
  const OfferProcessingStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN = OfferProcessingStatusType._(r'UNKNOWN');
  static const READY = OfferProcessingStatusType._(r'READY');
  static const IN_WORK = OfferProcessingStatusType._(r'IN_WORK');
  static const NEED_INFO = OfferProcessingStatusType._(r'NEED_INFO');
  static const NEED_MAPPING = OfferProcessingStatusType._(r'NEED_MAPPING');
  static const NEED_CONTENT = OfferProcessingStatusType._(r'NEED_CONTENT');
  static const CONTENT_PROCESSING = OfferProcessingStatusType._(r'CONTENT_PROCESSING');
  static const SUSPENDED = OfferProcessingStatusType._(r'SUSPENDED');
  static const REJECTED = OfferProcessingStatusType._(r'REJECTED');
  static const REVIEW = OfferProcessingStatusType._(r'REVIEW');
  static const CREATE_ERROR = OfferProcessingStatusType._(r'CREATE_ERROR');
  static const UPDATE_ERROR = OfferProcessingStatusType._(r'UPDATE_ERROR');

  /// List of all possible values in this [enum][OfferProcessingStatusType].
  static const values = <OfferProcessingStatusType>[
    UNKNOWN,
    READY,
    IN_WORK,
    NEED_INFO,
    NEED_MAPPING,
    NEED_CONTENT,
    CONTENT_PROCESSING,
    SUSPENDED,
    REJECTED,
    REVIEW,
    CREATE_ERROR,
    UPDATE_ERROR,
  ];

  static OfferProcessingStatusType? fromJson(dynamic value) => OfferProcessingStatusTypeTypeTransformer().decode(value);

  static List<OfferProcessingStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferProcessingStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferProcessingStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferProcessingStatusType] to String,
/// and [decode] dynamic data back to [OfferProcessingStatusType].
class OfferProcessingStatusTypeTypeTransformer {
  factory OfferProcessingStatusTypeTypeTransformer() => _instance ??= const OfferProcessingStatusTypeTypeTransformer._();

  const OfferProcessingStatusTypeTypeTransformer._();

  String encode(OfferProcessingStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferProcessingStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferProcessingStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return OfferProcessingStatusType.UNKNOWN;
        case r'READY': return OfferProcessingStatusType.READY;
        case r'IN_WORK': return OfferProcessingStatusType.IN_WORK;
        case r'NEED_INFO': return OfferProcessingStatusType.NEED_INFO;
        case r'NEED_MAPPING': return OfferProcessingStatusType.NEED_MAPPING;
        case r'NEED_CONTENT': return OfferProcessingStatusType.NEED_CONTENT;
        case r'CONTENT_PROCESSING': return OfferProcessingStatusType.CONTENT_PROCESSING;
        case r'SUSPENDED': return OfferProcessingStatusType.SUSPENDED;
        case r'REJECTED': return OfferProcessingStatusType.REJECTED;
        case r'REVIEW': return OfferProcessingStatusType.REVIEW;
        case r'CREATE_ERROR': return OfferProcessingStatusType.CREATE_ERROR;
        case r'UPDATE_ERROR': return OfferProcessingStatusType.UPDATE_ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferProcessingStatusTypeTypeTransformer] instance.
  static OfferProcessingStatusTypeTypeTransformer? _instance;
}

