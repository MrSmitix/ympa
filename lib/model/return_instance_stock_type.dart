//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип остатка на складе.
class ReturnInstanceStockType {
  /// Instantiate a new enum with the provided [value].
  const ReturnInstanceStockType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FIT = ReturnInstanceStockType._(r'FIT');
  static const DEFECT = ReturnInstanceStockType._(r'DEFECT');
  static const ANOMALY = ReturnInstanceStockType._(r'ANOMALY');
  static const SURPLUS = ReturnInstanceStockType._(r'SURPLUS');
  static const EXPIRED = ReturnInstanceStockType._(r'EXPIRED');
  static const MISGRADING = ReturnInstanceStockType._(r'MISGRADING');
  static const UNDEFINED = ReturnInstanceStockType._(r'UNDEFINED');
  static const INCORRECT_IMEI = ReturnInstanceStockType._(r'INCORRECT_IMEI');
  static const INCORRECT_SERIAL_NUMBER = ReturnInstanceStockType._(r'INCORRECT_SERIAL_NUMBER');
  static const INCORRECT_CIS = ReturnInstanceStockType._(r'INCORRECT_CIS');
  static const PART_MISSING = ReturnInstanceStockType._(r'PART_MISSING');
  static const NON_COMPLIENT = ReturnInstanceStockType._(r'NON_COMPLIENT');
  static const NOT_ACCEPTABLE = ReturnInstanceStockType._(r'NOT_ACCEPTABLE');
  static const SERVICE = ReturnInstanceStockType._(r'SERVICE');
  static const MARKDOWN = ReturnInstanceStockType._(r'MARKDOWN');
  static const DEMO = ReturnInstanceStockType._(r'DEMO');
  static const REPAIR = ReturnInstanceStockType._(r'REPAIR');
  static const FIRMWARE = ReturnInstanceStockType._(r'FIRMWARE');
  static const UNKNOWN = ReturnInstanceStockType._(r'UNKNOWN');

  /// List of all possible values in this [enum][ReturnInstanceStockType].
  static const values = <ReturnInstanceStockType>[
    FIT,
    DEFECT,
    ANOMALY,
    SURPLUS,
    EXPIRED,
    MISGRADING,
    UNDEFINED,
    INCORRECT_IMEI,
    INCORRECT_SERIAL_NUMBER,
    INCORRECT_CIS,
    PART_MISSING,
    NON_COMPLIENT,
    NOT_ACCEPTABLE,
    SERVICE,
    MARKDOWN,
    DEMO,
    REPAIR,
    FIRMWARE,
    UNKNOWN,
  ];

  static ReturnInstanceStockType? fromJson(dynamic value) => ReturnInstanceStockTypeTypeTransformer().decode(value);

  static List<ReturnInstanceStockType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnInstanceStockType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnInstanceStockType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReturnInstanceStockType] to String,
/// and [decode] dynamic data back to [ReturnInstanceStockType].
class ReturnInstanceStockTypeTypeTransformer {
  factory ReturnInstanceStockTypeTypeTransformer() => _instance ??= const ReturnInstanceStockTypeTypeTransformer._();

  const ReturnInstanceStockTypeTypeTransformer._();

  String encode(ReturnInstanceStockType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReturnInstanceStockType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReturnInstanceStockType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FIT': return ReturnInstanceStockType.FIT;
        case r'DEFECT': return ReturnInstanceStockType.DEFECT;
        case r'ANOMALY': return ReturnInstanceStockType.ANOMALY;
        case r'SURPLUS': return ReturnInstanceStockType.SURPLUS;
        case r'EXPIRED': return ReturnInstanceStockType.EXPIRED;
        case r'MISGRADING': return ReturnInstanceStockType.MISGRADING;
        case r'UNDEFINED': return ReturnInstanceStockType.UNDEFINED;
        case r'INCORRECT_IMEI': return ReturnInstanceStockType.INCORRECT_IMEI;
        case r'INCORRECT_SERIAL_NUMBER': return ReturnInstanceStockType.INCORRECT_SERIAL_NUMBER;
        case r'INCORRECT_CIS': return ReturnInstanceStockType.INCORRECT_CIS;
        case r'PART_MISSING': return ReturnInstanceStockType.PART_MISSING;
        case r'NON_COMPLIENT': return ReturnInstanceStockType.NON_COMPLIENT;
        case r'NOT_ACCEPTABLE': return ReturnInstanceStockType.NOT_ACCEPTABLE;
        case r'SERVICE': return ReturnInstanceStockType.SERVICE;
        case r'MARKDOWN': return ReturnInstanceStockType.MARKDOWN;
        case r'DEMO': return ReturnInstanceStockType.DEMO;
        case r'REPAIR': return ReturnInstanceStockType.REPAIR;
        case r'FIRMWARE': return ReturnInstanceStockType.FIRMWARE;
        case r'UNKNOWN': return ReturnInstanceStockType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReturnInstanceStockTypeTypeTransformer] instance.
  static ReturnInstanceStockTypeTypeTransformer? _instance;
}

