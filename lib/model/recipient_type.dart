//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
class RecipientType {
  /// Instantiate a new enum with the provided [value].
  const RecipientType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOP = RecipientType._(r'SHOP');
  static const DELIVERY_SERVICE = RecipientType._(r'DELIVERY_SERVICE');
  static const POST = RecipientType._(r'POST');

  /// List of all possible values in this [enum][RecipientType].
  static const values = <RecipientType>[
    SHOP,
    DELIVERY_SERVICE,
    POST,
  ];

  static RecipientType? fromJson(dynamic value) => RecipientTypeTypeTransformer().decode(value);

  static List<RecipientType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RecipientType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RecipientType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RecipientType] to String,
/// and [decode] dynamic data back to [RecipientType].
class RecipientTypeTypeTransformer {
  factory RecipientTypeTypeTransformer() => _instance ??= const RecipientTypeTypeTransformer._();

  const RecipientTypeTypeTransformer._();

  String encode(RecipientType data) => data.value;

  /// Decodes a [dynamic value][data] to a RecipientType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RecipientType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOP': return RecipientType.SHOP;
        case r'DELIVERY_SERVICE': return RecipientType.DELIVERY_SERVICE;
        case r'POST': return RecipientType.POST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RecipientTypeTypeTransformer] instance.
  static RecipientTypeTypeTransformer? _instance;
}

