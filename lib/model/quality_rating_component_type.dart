//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки. 
class QualityRatingComponentType {
  /// Instantiate a new enum with the provided [value].
  const QualityRatingComponentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DBS_CANCELLATION_RATE = QualityRatingComponentType._(r'DBS_CANCELLATION_RATE');
  static const DBS_LATE_DELIVERY_RATE = QualityRatingComponentType._(r'DBS_LATE_DELIVERY_RATE');
  static const FBS_CANCELLATION_RATE = QualityRatingComponentType._(r'FBS_CANCELLATION_RATE');
  static const FBS_LATE_SHIP_RATE = QualityRatingComponentType._(r'FBS_LATE_SHIP_RATE');
  static const FBY_LATE_DELIVERY_RATE = QualityRatingComponentType._(r'FBY_LATE_DELIVERY_RATE');
  static const FBY_CANCELLATION_RATE = QualityRatingComponentType._(r'FBY_CANCELLATION_RATE');
  static const FBY_DELIVERY_DIFF_RATE = QualityRatingComponentType._(r'FBY_DELIVERY_DIFF_RATE');
  static const FBY_LATE_EDITING_RATE = QualityRatingComponentType._(r'FBY_LATE_EDITING_RATE');

  /// List of all possible values in this [enum][QualityRatingComponentType].
  static const values = <QualityRatingComponentType>[
    DBS_CANCELLATION_RATE,
    DBS_LATE_DELIVERY_RATE,
    FBS_CANCELLATION_RATE,
    FBS_LATE_SHIP_RATE,
    FBY_LATE_DELIVERY_RATE,
    FBY_CANCELLATION_RATE,
    FBY_DELIVERY_DIFF_RATE,
    FBY_LATE_EDITING_RATE,
  ];

  static QualityRatingComponentType? fromJson(dynamic value) => QualityRatingComponentTypeTypeTransformer().decode(value);

  static List<QualityRatingComponentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityRatingComponentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityRatingComponentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [QualityRatingComponentType] to String,
/// and [decode] dynamic data back to [QualityRatingComponentType].
class QualityRatingComponentTypeTypeTransformer {
  factory QualityRatingComponentTypeTypeTransformer() => _instance ??= const QualityRatingComponentTypeTypeTransformer._();

  const QualityRatingComponentTypeTypeTransformer._();

  String encode(QualityRatingComponentType data) => data.value;

  /// Decodes a [dynamic value][data] to a QualityRatingComponentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  QualityRatingComponentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DBS_CANCELLATION_RATE': return QualityRatingComponentType.DBS_CANCELLATION_RATE;
        case r'DBS_LATE_DELIVERY_RATE': return QualityRatingComponentType.DBS_LATE_DELIVERY_RATE;
        case r'FBS_CANCELLATION_RATE': return QualityRatingComponentType.FBS_CANCELLATION_RATE;
        case r'FBS_LATE_SHIP_RATE': return QualityRatingComponentType.FBS_LATE_SHIP_RATE;
        case r'FBY_LATE_DELIVERY_RATE': return QualityRatingComponentType.FBY_LATE_DELIVERY_RATE;
        case r'FBY_CANCELLATION_RATE': return QualityRatingComponentType.FBY_CANCELLATION_RATE;
        case r'FBY_DELIVERY_DIFF_RATE': return QualityRatingComponentType.FBY_DELIVERY_DIFF_RATE;
        case r'FBY_LATE_EDITING_RATE': return QualityRatingComponentType.FBY_LATE_EDITING_RATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [QualityRatingComponentTypeTypeTransformer] instance.
  static QualityRatingComponentTypeTypeTransformer? _instance;
}

