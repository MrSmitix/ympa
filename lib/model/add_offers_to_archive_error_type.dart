//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
class AddOffersToArchiveErrorType {
  /// Instantiate a new enum with the provided [value].
  const AddOffersToArchiveErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OFFER_HAS_STOCKS = AddOffersToArchiveErrorType._(r'OFFER_HAS_STOCKS');
  static const UNKNOWN = AddOffersToArchiveErrorType._(r'UNKNOWN');

  /// List of all possible values in this [enum][AddOffersToArchiveErrorType].
  static const values = <AddOffersToArchiveErrorType>[
    OFFER_HAS_STOCKS,
    UNKNOWN,
  ];

  static AddOffersToArchiveErrorType? fromJson(dynamic value) => AddOffersToArchiveErrorTypeTypeTransformer().decode(value);

  static List<AddOffersToArchiveErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AddOffersToArchiveErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AddOffersToArchiveErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AddOffersToArchiveErrorType] to String,
/// and [decode] dynamic data back to [AddOffersToArchiveErrorType].
class AddOffersToArchiveErrorTypeTypeTransformer {
  factory AddOffersToArchiveErrorTypeTypeTransformer() => _instance ??= const AddOffersToArchiveErrorTypeTypeTransformer._();

  const AddOffersToArchiveErrorTypeTypeTransformer._();

  String encode(AddOffersToArchiveErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a AddOffersToArchiveErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AddOffersToArchiveErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OFFER_HAS_STOCKS': return AddOffersToArchiveErrorType.OFFER_HAS_STOCKS;
        case r'UNKNOWN': return AddOffersToArchiveErrorType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AddOffersToArchiveErrorTypeTypeTransformer] instance.
  static AddOffersToArchiveErrorTypeTypeTransformer? _instance;
}

