//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. 
class WarehouseStockType {
  /// Instantiate a new enum with the provided [value].
  const WarehouseStockType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FIT = WarehouseStockType._(r'FIT');
  static const FREEZE = WarehouseStockType._(r'FREEZE');
  static const AVAILABLE = WarehouseStockType._(r'AVAILABLE');
  static const QUARANTINE = WarehouseStockType._(r'QUARANTINE');
  static const UTILIZATION = WarehouseStockType._(r'UTILIZATION');
  static const DEFECT = WarehouseStockType._(r'DEFECT');
  static const EXPIRED = WarehouseStockType._(r'EXPIRED');

  /// List of all possible values in this [enum][WarehouseStockType].
  static const values = <WarehouseStockType>[
    FIT,
    FREEZE,
    AVAILABLE,
    QUARANTINE,
    UTILIZATION,
    DEFECT,
    EXPIRED,
  ];

  static WarehouseStockType? fromJson(dynamic value) => WarehouseStockTypeTypeTransformer().decode(value);

  static List<WarehouseStockType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehouseStockType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehouseStockType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [WarehouseStockType] to String,
/// and [decode] dynamic data back to [WarehouseStockType].
class WarehouseStockTypeTypeTransformer {
  factory WarehouseStockTypeTypeTransformer() => _instance ??= const WarehouseStockTypeTypeTransformer._();

  const WarehouseStockTypeTypeTransformer._();

  String encode(WarehouseStockType data) => data.value;

  /// Decodes a [dynamic value][data] to a WarehouseStockType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  WarehouseStockType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FIT': return WarehouseStockType.FIT;
        case r'FREEZE': return WarehouseStockType.FREEZE;
        case r'AVAILABLE': return WarehouseStockType.AVAILABLE;
        case r'QUARANTINE': return WarehouseStockType.QUARANTINE;
        case r'UTILIZATION': return WarehouseStockType.UTILIZATION;
        case r'DEFECT': return WarehouseStockType.DEFECT;
        case r'EXPIRED': return WarehouseStockType.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [WarehouseStockTypeTypeTransformer] instance.
  static WarehouseStockTypeTypeTransformer? _instance;
}

