//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferCardDTO {
  /// Returns a new [OfferCardDTO] instance.
  OfferCardDTO({
    required this.offerId,
    this.mapping,
    this.parameterValues = const [],
    this.cardStatus,
    this.contentRating,
    this.recommendations = const [],
    this.errors = const [],
    this.warnings = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GetMappingDTO? mapping;

  /// Список характеристик с их значениями. 
  List<ParameterValueDTO>? parameterValues;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferCardStatusType? cardStatus;

  /// Процент заполненности карточки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? contentRating;

  /// Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
  List<OfferCardRecommendationDTO>? recommendations;

  /// Ошибки в контенте, препятствующие размещению товара на витрине.
  List<OfferErrorDTO>? errors;

  /// Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
  List<OfferErrorDTO>? warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferCardDTO &&
    other.offerId == offerId &&
    other.mapping == mapping &&
    _deepEquality.equals(other.parameterValues, parameterValues) &&
    other.cardStatus == cardStatus &&
    other.contentRating == contentRating &&
    _deepEquality.equals(other.recommendations, recommendations) &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (mapping == null ? 0 : mapping!.hashCode) +
    (parameterValues == null ? 0 : parameterValues!.hashCode) +
    (cardStatus == null ? 0 : cardStatus!.hashCode) +
    (contentRating == null ? 0 : contentRating!.hashCode) +
    (recommendations == null ? 0 : recommendations!.hashCode) +
    (errors == null ? 0 : errors!.hashCode) +
    (warnings == null ? 0 : warnings!.hashCode);

  @override
  String toString() => 'OfferCardDTO[offerId=$offerId, mapping=$mapping, parameterValues=$parameterValues, cardStatus=$cardStatus, contentRating=$contentRating, recommendations=$recommendations, errors=$errors, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
    if (this.mapping != null) {
      json[r'mapping'] = this.mapping;
    } else {
      json[r'mapping'] = null;
    }
    if (this.parameterValues != null) {
      json[r'parameterValues'] = this.parameterValues;
    } else {
      json[r'parameterValues'] = null;
    }
    if (this.cardStatus != null) {
      json[r'cardStatus'] = this.cardStatus;
    } else {
      json[r'cardStatus'] = null;
    }
    if (this.contentRating != null) {
      json[r'contentRating'] = this.contentRating;
    } else {
      json[r'contentRating'] = null;
    }
    if (this.recommendations != null) {
      json[r'recommendations'] = this.recommendations;
    } else {
      json[r'recommendations'] = null;
    }
    if (this.errors != null) {
      json[r'errors'] = this.errors;
    } else {
      json[r'errors'] = null;
    }
    if (this.warnings != null) {
      json[r'warnings'] = this.warnings;
    } else {
      json[r'warnings'] = null;
    }
    return json;
  }

  /// Returns a new [OfferCardDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferCardDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferCardDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferCardDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferCardDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        mapping: GetMappingDTO.fromJson(json[r'mapping']),
        parameterValues: ParameterValueDTO.listFromJson(json[r'parameterValues']),
        cardStatus: OfferCardStatusType.fromJson(json[r'cardStatus']),
        contentRating: mapValueOfType<int>(json, r'contentRating'),
        recommendations: OfferCardRecommendationDTO.listFromJson(json[r'recommendations']),
        errors: OfferErrorDTO.listFromJson(json[r'errors']),
        warnings: OfferErrorDTO.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<OfferCardDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferCardDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferCardDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferCardDTO> mapFromJson(dynamic json) {
    final map = <String, OfferCardDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferCardDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferCardDTO-objects as value to a dart map
  static Map<String, List<OfferCardDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferCardDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferCardDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
  };
}

