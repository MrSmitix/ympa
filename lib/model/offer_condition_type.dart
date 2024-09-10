//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
class OfferConditionType {
  /// Instantiate a new enum with the provided [value].
  const OfferConditionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PREOWNED = OfferConditionType._(r'PREOWNED');
  static const SHOWCASESAMPLE = OfferConditionType._(r'SHOWCASESAMPLE');
  static const REFURBISHED = OfferConditionType._(r'REFURBISHED');
  static const REDUCTION = OfferConditionType._(r'REDUCTION');
  static const RENOVATED = OfferConditionType._(r'RENOVATED');
  static const NOT_SPECIFIED = OfferConditionType._(r'NOT_SPECIFIED');

  /// List of all possible values in this [enum][OfferConditionType].
  static const values = <OfferConditionType>[
    PREOWNED,
    SHOWCASESAMPLE,
    REFURBISHED,
    REDUCTION,
    RENOVATED,
    NOT_SPECIFIED,
  ];

  static OfferConditionType? fromJson(dynamic value) => OfferConditionTypeTypeTransformer().decode(value);

  static List<OfferConditionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferConditionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferConditionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferConditionType] to String,
/// and [decode] dynamic data back to [OfferConditionType].
class OfferConditionTypeTypeTransformer {
  factory OfferConditionTypeTypeTransformer() => _instance ??= const OfferConditionTypeTypeTransformer._();

  const OfferConditionTypeTypeTransformer._();

  String encode(OfferConditionType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferConditionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferConditionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PREOWNED': return OfferConditionType.PREOWNED;
        case r'SHOWCASESAMPLE': return OfferConditionType.SHOWCASESAMPLE;
        case r'REFURBISHED': return OfferConditionType.REFURBISHED;
        case r'REDUCTION': return OfferConditionType.REDUCTION;
        case r'RENOVATED': return OfferConditionType.RENOVATED;
        case r'NOT_SPECIFIED': return OfferConditionType.NOT_SPECIFIED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferConditionTypeTypeTransformer] instance.
  static OfferConditionTypeTypeTransformer? _instance;
}

